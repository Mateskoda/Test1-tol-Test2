package edu.progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TravelByBus  {
    public static void main(String[] args) throws FileNotFoundException {
        int cnt = 0;
        Scanner sc = new Scanner(new File("Textedu/eladott.txt"));
        for (int i = 0; sc.hasNextLine(); i++) {
            cnt++;
            sc.nextLine();

        }
        Scanner sc2 = new Scanner(new File("Textedu/eladott.txt"));

        int[][] tickets = new int[cnt][3];
        for (int i = 0; sc2.hasNextLine(); i++) {
            String data = sc2.nextLine();
            String[] parts = data.split(" ");
            tickets[i][0] = Integer.parseInt(parts[0]);
            tickets[i][1] = Integer.parseInt(parts[1]);
            tickets[i][2] = Integer.parseInt(parts[2]);


        }

        System.out.print(Arrays.deepToString(tickets) + " ");
        System.out.println();
        lastPersonDetails(tickets);
        passangersFromBeginningToTheEnd(tickets);
        System.out.println(moneyPaidForTickets(tickets));
        beforeLastStop(tickets);
        System.out.println(cntOfStops(tickets));
        passengersAtTheMoment(tickets,170);
    }


    public static void lastPersonDetails(int[][] tickets) {
        int lastPerson = tickets[tickets.length - 1][0];
        int lastPersonDistance = tickets[tickets.length - 1][2] - tickets[tickets.length - 1][1];
        System.out.println("1. feladat:Adja meg a legutolsó jegyvásárló ülésének sorszámát és az általa beutazott távolságot!");
        System.out.println(" az utolsó utas adatai :" + lastPerson + ". ülés, " + lastPersonDistance
                + " utazott km.");

    }

    public static void passangersFromBeginningToTheEnd(int[][] tickets) {
        System.out.println("3. Listázza ki, kik utazták végig a teljes utat! Az utasok sorszámát egy-egy szóközzel\n" +
                "elválasztva írja a képernyőre!");
        int cnt = 0;
        for (int i = 1; i < tickets.length; i++) {
            if (tickets[i][1] == 0 && tickets[i][2] == tickets[0][2]) {
                cnt++;
            }}

            int[] passangersBToEnd = new int[cnt];
            for (int i = 1, j = 0; i < tickets.length; i++) {
                if (tickets[i][1] == 0 && tickets[i][2] == tickets[0][2]) {
                    passangersBToEnd[j] = tickets[i][0];
                    j++;
                }
            }






        }
public static int moneyPaidForTickets (int [][] tickets) {
    System.out.println("Határozza meg, hogy a jegyekből mennyi bevétele származott a társaságnak!");
    int sum = 0;
    for (int i = 1; i <tickets.length ; i++) {
        double sum1= (Math.ceil((tickets[i][2] - tickets[i][1])/10d));
       double kerekites= (int)((Math.ceil((tickets[i][2] - tickets[i][1])/10d)*tickets[0][2]) %5)  ;
       if (kerekites==1 || kerekites == 2){
           sum+= (Math.ceil((tickets[i][2] - tickets[i][1])/10d)*tickets[0][2])-kerekites;
       }
        else if (kerekites==3 || kerekites == 4){
            sum+= (Math.ceil((tickets[i][2] - tickets[i][1])/10d)*tickets[0][2])+(5-kerekites);
        }
        else
        {
            sum+=(Math.ceil((tickets[i][2] - tickets[i][1])/10d)*tickets[0][2]);
        }
//        System.out.println(sum);
    }return sum;
    }
    public static void beforeLastStop(int [][]tickets){
        System.out.println("5.Írja a képernyőre, hogy a busz végállomást megelőző utolsó megállásánál" +
                        " hányan szálltak fel és le!");
        int cntUp= 0;
        int cntDown=0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][1]==kmOfBeforeLastStop(tickets))
            {
                cntUp++;
            }
            if (tickets[i][2]==kmOfBeforeLastStop(tickets))
            {
                cntDown++;
            }
        }
        System.out.println(cntUp+ " ember szállt le és " + cntDown + " ember szállt le");
    }
    public static int kmOfBeforeLastStop ( int [][] tickets){
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < tickets.length; i++) {
            if ( tickets[i][1] != tickets[0][1] && tickets[i][1]>max  )
            {
                max = tickets[i][1];
            }
                else if (tickets[i][2] != tickets[0][1] && tickets[i][2]>max){
                    max = tickets[i][2];
            }

        }return max;
    }
    public static int cntOfStops(int [][] tickets){
//        Arrays.sort(tickets[1]);
        System.out.println("Adja meg, hogy hány helyen állt meg a busz a kiinduló állomás és a célállomás között");
        int [] column2 = new int[(tickets.length)*2];

//        System.out.println(Arrays.deepToString(tickets));
        for (int i = 1; i <tickets.length ; i++) {
                column2[i]= tickets[i][1];

        }
        for (int i = tickets.length,j = 0; i <tickets.length*2 ; i++) {
            column2[i]= tickets[j][2];
            j++;

        }
        Arrays.sort(column2);
        int cnt = 0;
        for (int i = 1; i <tickets.length*2 ; i++) {
            if ( column2 [i]!=0 && column2[i] != tickets[0][1] && column2[i]!=column2[i-1] ){
                cnt++;
            }
        }return cnt;
    }
    public static void passengersAtTheMoment( int [][] tickets,int kmAtTheMoment){
        String [] seats = new String[49];
        for (int i = 0; i <seats.length ; i++) {
            seats[i] = "üres";
        }
        System.out.println(Arrays.deepToString(seats));
        for (int i = 1; i <tickets.length ; i++) {
            if (tickets[i][2]>kmAtTheMoment && tickets[i][1]<=kmAtTheMoment){
                    seats[tickets[i][0]]=Integer.toString(i);
            }
        }
        System.out.println(Arrays.deepToString(seats));

    }
    }
