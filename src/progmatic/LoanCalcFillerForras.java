package progmatic;

public class  LoanCalcFillerForras extends LoanCalculator{
    public LoanCalcFillerForras(int money, int month, int vipCode) {
        super(money, month, vipCode);
    }

    @Override
    public int monthlyFeeCalculator() {
//            változtatások
        month=month-3;

        int percentage=0;
            int sum;
            if (grantedOrNot() && vipOrnot() ) {
                percentage= 40+(month-12)*2;
            }
            if (grantedOrNot() && !vipOrnot() ) {
                percentage = 50+(month-12)*3;
            }
            sum = money+money*percentage/100;
            if ((int) Math.ceil(sum/(double)month)<15000){
                return (int) Math.ceil(sum/(double)month);
        }else{
                int monthlyFeeOriginal = (int) Math.ceil(sum/(double)month);
                sum += (monthlyFeeOriginal-15000)*3;
                return (int) Math.ceil(sum/(double)month);

            }
    }
}
