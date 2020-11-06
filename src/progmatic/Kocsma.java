package progmatic;

import java.util.HashMap;

public class Kocsma {
    static int money = 100000;
    double palinka;
    int sor;
    int bor;
    int viz;
    int palinkaPrice = 500;
    int sorPrice = 200;
    int borPrice = 300;
    int vizPrice = 100;
    double moneyTurnover = 0;
    double palinkaAlcPerc = 0.020;
    double sorAlcPerc = 0.020;
    double borAlcPerc = 0.016;
    double vizAlcPerc = 0;
    int pricestotal = KocsmaOrder.getPricestotal();
    double palinkaPorcion = 0.5;
    int sorPorcion = 5;
    int borPorcion = 2;
    HashMap<String, Double> remainingDrinks = new HashMap<>();
    public Kocsma(double palinka, int sor, int bor, int viz) {
        this.palinka = palinka;
        this.sor = sor;
        this.bor = bor;
        this.viz = viz;

        remainingDrinks.put("pálinka", palinka);
        remainingDrinks.put("sör", (double) sor);
        remainingDrinks.put("bor", (double) bor);
        remainingDrinks.put("víz", (double) viz);
    }

    public static void setMoney(int money) {
        Kocsma.money = money;
    }

    public int getPricestotal() {
        return pricestotal;
    }

    public int getPalinkaPrice() {
        return palinkaPrice;
    }

    public void setPalinkaPrice(int palinkaPrice) {
        this.palinkaPrice = palinkaPrice;
    }

    public int getSorPrice() {
        return sorPrice;
    }
    ;

    public void setSorPrice(int sorPrice) {
        this.sorPrice = sorPrice;
    }

    public int getBorPrice() {
        return borPrice;
    }

    public void setBorPrice(int borPrice) {
        this.borPrice = borPrice;
    }

    public int getVizPrice() {
        return vizPrice;
    }

    public void setVizPrice(int vizPrice) {
        this.vizPrice = vizPrice;
    }

    public double getPalinkaAlcPerc() {
        return palinkaAlcPerc;
    }

    public double getSorAlcPerc() {
        return sorAlcPerc;
    }

    public double getBorAlcPerc() {
        return borAlcPerc;
    }

    public double getMoneyTurnover() {
        return moneyTurnover;
    }

    public void setMoneyTurnover(double moneyTurnover) {
        this.moneyTurnover = moneyTurnover;
    }

    public double getPalinka() {
        return palinka;
    }

    public void setPalinka(double palinka) {
        this.palinka = palinka;
    }

    public int getSor() {
        return sor;
    }

    public void setSor(double sor) {
        this.sor = (int)sor;
    }

    public int getBor() {
        return bor;
    }

    public void setBor(double bor) {
        this.bor = (int)bor;
    }

    public int getViz() {
        return viz;
    }

    public void setViz(double viz) {
        this.viz = (int)viz;
    }

    public HashMap<String, Double> getRemainingDrinks() {
        return remainingDrinks;
    }
}
