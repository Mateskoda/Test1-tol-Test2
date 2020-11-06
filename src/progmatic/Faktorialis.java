package progmatic;

public class Faktorialis {
    public static void main(String[] args) {
        System.out.println(countFaktorial(5));
    }
    public static int countFaktorial (int n){
        if (n <= 1){ // base case
                return 1;}
            else{
                return n*countFaktorial(n-1);
        }}

    }

