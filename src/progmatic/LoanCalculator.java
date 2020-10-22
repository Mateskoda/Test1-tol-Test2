package progmatic;

public class LoanCalculator {

    int money;
    int month;
    int vipCode;
    int coverageAmount;
    //private LoanResponse loan= new LoanResponse(money,month,vipCode);

    public LoanCalculator(int money, int month, int vipCode) {
        this.money = money;
        this.month = month;
        this.vipCode = vipCode;

    }

    public boolean vipOrnot() {
        if (vipCode % 1000 == 0 &&vipCode!= 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean grantedOrNot() {
        if (vipOrnot() && money <= 50E6) {
            return true;
        } else if (!vipOrnot() && money <= 20E6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean neeedsSuccessorOrNot() {
        if (grantedOrNot() && vipOrnot() && money > 20E6) {
            return true;
        } else if (grantedOrNot() && !vipOrnot() && money > 3E6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean neeedsCoverageOrNot() {
        if (grantedOrNot() && vipOrnot() && money > 3E6) {
            coverageAmount = (int) (money * 0.7);
            return true;
        } else if (grantedOrNot() && !vipOrnot() && money > 5E5) {
            coverageAmount = (int) (money * 0.8);
            return true;

        } else {
            return false;
        }
    }
    public int monthlyFeeCalculator(){
        int percentage=0;
        int sum;
        if (grantedOrNot() && vipOrnot() ) {
            percentage= 40+(month-12)*2;
        }
        if (grantedOrNot() && !vipOrnot() ) {
            percentage = 50+(month-12)*3;
        }
        sum = money+money*percentage/100;
        return (int) Math.ceil(sum/(double)month);
    }
}
