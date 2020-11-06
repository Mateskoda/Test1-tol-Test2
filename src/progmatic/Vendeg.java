package progmatic;

public class Vendeg {
    static int punchCnt;
    static int howManyGoingHome;
    static int hostUnServed;
    boolean goingHome;
    int patience = 0;
    int alcoholInBlood = 0;
    String name;
    int cntOfMaxDrinks;
    String bestDrink;
    boolean secondBestOrNot;
    String secondBestDrink;
    String drink = null;
    int outCnt = 0;
    int makeOrderCnt = 0;

    public Vendeg(Kocsma kocsma) {
        patience = (int) (Math.random() * 100) + 1;
        cntOfMaxDrinks = (int) (Math.random() * 40);
        double randomNum = Math.random();
        if (randomNum < 0.2) {
            bestDrink = "víz";
        } else if (randomNum < 0.5) {
            bestDrink = "sör";
        } else if (randomNum < 0.7) {
            bestDrink = "bor";
        } else {
            bestDrink = "pálinka";
        }
        secondBestOrNot = Math.random() > 0.5 ? true : false;
        if (randomNum < 0.2) {
            secondBestDrink = "sör";
        } else if (Math.random() < 0.5) {
            secondBestDrink = "bor";
        } else if (Math.random() < 0.7) {
            secondBestDrink = "pálinka";
        } else {
            secondBestDrink = "víz";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name.toString();
    }

    public void makeOrder(Kocsma kocsma) {
        if (!goingHome) {
            if (outCnt == 0) {
                drink = "1 " + bestDrink + " 1";
                KocsmaOrder order = new KocsmaOrder(kocsma, drink);
                if (order.drinkIsOrNot) {
                    alcoholInBlood += order.alcPercentage;
                }
                if (!order.drinkIsOrNot) {
                    outCnt = 1;
                    hostUnServed++;
                    patience -= 10 - alcoholInBlood;
                }
            } else if (outCnt == 1) {
                if (secondBestOrNot && outCnt == 1) {
                    drink = "1 " + secondBestDrink + " 1";
                    KocsmaOrder order2 = new KocsmaOrder(kocsma, drink);
                    if (order2.drinkIsOrNot) {
                        alcoholInBlood += order2.alcPercentage;
                    }
                    if (!order2.drinkIsOrNot) {
                        hostUnServed++;
                        patience -= 10 - alcoholInBlood;
                    }
                }

            }
            if (patience <= 0) {
                System.out.println();
                System.out.println("FIGHT");
                System.out.println();
                KocsmaOrder.punchUp();
                punchCnt++;
            }
            makeOrderCnt++;
            if (makeOrderCnt >= 3+cntOfMaxDrinks) {
                goingHome = true;
                howManyGoingHome++;
            }
            ;
        }
    }
}

