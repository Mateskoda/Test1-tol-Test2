package progmatic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReservationResponse {
    double price;
    long daysBetween;
public ReservationResponse(){

}
    public void setPrice(LocalDate start,LocalDate end, int nrOfHosts,String meals) {
        daysBetween = ChronoUnit.DAYS.between(start,end);
        long foodPrice = 0;
        if (meals.equals("csak reggeli")){
            foodPrice = daysBetween*1500;
        }
        if (meals.equals("teljes")){
            foodPrice = daysBetween*(1500+3000+2000);}
            long roomPriceBasic = (daysBetween)*(int)(Math.ceil(nrOfHosts/4))*15000;
long roomPriceExtra = 0;
LocalDate september1= LocalDate.parse("2020-09-01");
        LocalDate jun1= LocalDate.parse("2020-09-01");
        LocalDate april1= LocalDate.parse("2020-09-01");
if (start.isAfter(september1)){
    price =foodPrice+roomPriceBasic;
}else
{if (start.isAfter(jun1)){
    long daysBetween2 = ChronoUnit.DAYS.between(start,september1);
    roomPriceExtra= daysBetween2*6000;}
//if (start.isAfter(april1)){
//    if (end.isBefore(jun1))
//   long daysBetween3 = ChronoUnit.DAYS.between(start,jun1);
//   long daysBetween4 = ChronoUnit.DAYS.between(jun1,end);


//}
}
    }

    public double getPrice() {
        return price;
    }

//    public int countPriceOfFood(){
//        if return daysBetween*
//    }
}
