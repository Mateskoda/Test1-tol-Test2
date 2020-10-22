package progmatic;

public class LoanResponse {

    boolean isGranted ;
    boolean needsSuccessor;
    boolean needsCoverage;
    int coverageAmount;
    int montlyFee;
    int money;
    int month;
    int vipCode;
    LoanCalculator loan1;
    public LoanResponse(int money, int month, int vipCode) {
        LoanCalculator loan1 = new LoanCalculator(money, month, vipCode);
        this.loan1 = loan1;
        this.money = money;
        this.month = month;
        this.vipCode = vipCode;
        setGranted();
        setNeedsSuccessor();
        setNeedsCoverage();
        setCoverageAmount();
        setMontlyFee();
    }
        public void setGranted() {
        isGranted = loan1.grantedOrNot();
    }

    public void setNeedsSuccessor() {
        this.needsSuccessor = loan1.neeedsSuccessorOrNot();
    }

    public void setNeedsCoverage() {
        this.needsCoverage = loan1.neeedsCoverageOrNot();
    }

    public void setCoverageAmount() {
        this.coverageAmount = loan1.coverageAmount;
    }

    public void setMontlyFee() {
        this.montlyFee = loan1.monthlyFeeCalculator();
    }


    public void response(){
        if (!isGranted) {
            System.out.println("a megadott összeg túl magas,ekkora összeget nem vehetsz fel");
        } else {
            if (month < 12) {
                System.out.println("túl rövid a futamidő");
            } else if (month > 60) {
                System.out.println("túl hosszú a futamidő");
            } else {
                if (needsCoverage) {
                    System.out.println("A kölcsön felvételéhez " + coverageAmount + " forint fedezet szükséges. ");
                }
                else{
                    System.out.println("A kölcsön felvételéhez fedezet nem szükséges. ");
                }
                if (needsSuccessor) {
                    System.out.println("A kölcsön felvételéhez szükség lesz egy kezesre. ");
                }
                else{
                    System.out.println("A kölcsön felvételéhez nem lesz szükség kezesre.");
                }
                System.out.println("A havi törlesztőrészlet "+montlyFee +" forint lesz");
            }
        }

    }

   /* public boolean vipOrnot() {
        if (vipCode % 1000 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void grantedOrNot() {
        if (vipOrnot() && money <= 50E5 ) {
            isGranted = true;
        } else if (!vipOrnot() && money <= 20E5) {
            isGranted = true;
        } else {
            isGranted = false;
        }
    }

    public void neeedsSuccessorOrNot() {
        if (isGranted && vipOrnot() && money > 20E5) {
            needsSuccessor = true;
        } else if (isGranted && !vipOrnot() && money > 3E5) {
            needsSuccessor = true;
        } else {
            needsSuccessor = false;
        }
    }

    public void neeedsCoverageOrNot() {
        if (isGranted && vipOrnot() && money > 3E5) {
            needsCoverage = true;
            coverageAmount = (int) (money * 0.7);
        } else if (isGranted && !vipOrnot() && money > 5E4) {
            needsCoverage = true;
            coverageAmount = (int) (money * 0.8);
        } else {
            needsCoverage = false;
        }
    }
    public void loanCalculator (){
        int percentage=0;
        int sum;
        if (isGranted && vipOrnot() ) {
             percentage= 40+(month-12)*2;
        }
        if (isGranted && !vipOrnot() ) {
            percentage = 50+(month-12)*3;
        }
        sum = money+money*percentage/100;
        montlyFee= (int) Math.ceil(sum/(double)month);
    }*/

    }
