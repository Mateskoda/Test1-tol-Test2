package progmatic;

import java.util.ArrayList;
import java.util.HashMap;

public class Nap63Stringek {
    public static void main(String[] args) {
        String alma = "alma";
        String alma1 = "alma1";
        String alma2 = "alma.";
        String alma3 = "alma0k ...,";
//        char chr = 'Z';
//        System.out.println("The ASCII value of Z is :"+chr);
        System.out.println(howManyLetters(alma3));
        System.out.println(howManyCharacter(alma3, "1"));
        System.out.println(sameChars("alma", "alma"));
        intToUnicode(1000);
        System.out.println(intToChar(120));
        System.out.println(intToChar(-90));
        char chr = 97;
        System.out.println(chr);
        System.out.println(charIsAlfanum('a'));


    }

    //    Karakterek stringben
//    Írj programot, ami megszámolja, hogy egy string-ben hány betű,
//    hány szám, hány space és hány egyéb karakter van!
    public static HashMap<String, Integer> howManyLetters(String word) {
        char[] letters = word.toCharArray();
        int[] letters2 = new int[letters.length];
        for (int i = 0; i < letters.length; i++) {
            letters2[i] = letters[i];
        }
        HashMap<String, Integer> typeOfLetters = new HashMap<>();
        int cntnums = 0;
        int cntLetters = 0;
        int cntSpace = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters2[i] >= 48 && letters2[i] <= 57) {
                typeOfLetters.putIfAbsent("számok", 0);
                cntnums++;
                typeOfLetters.put("számok", cntnums);
            } else if ((letters2[i] >= 65 && letters2[i] <= 90) || (letters2[i] >= 97 && letters2[i] <= 122)) {
                typeOfLetters.putIfAbsent("betűk", 0);
                cntLetters++;
                typeOfLetters.put("betűk", cntLetters);
            } else if (letters2[i] == 32) {
                typeOfLetters.putIfAbsent("space", 0);
                cntSpace++;
                typeOfLetters.put("space", cntSpace);
            } else {
                typeOfLetters.putIfAbsent(String.valueOf(Character.toChars(letters2[i])), 0);
                int cnt = typeOfLetters.get(String.valueOf(Character.toChars(letters2[i])));
                cnt++;
                typeOfLetters.put(String.valueOf(Character.toChars(letters2[i])), cnt);
            }
        }
//        String[] letters = word.split(String)
        return typeOfLetters;
    }

    //    Írj programot, ami megszámolja, hogy egy string-ben
//    hányszor fordul elő egy adott karakter!
    public static int howManyCharacter(String word, String chr) {
        char[] letters = word.toCharArray();
        int chrCopy = chr.toCharArray()[0];
        int cnt = 0;
        for (int i = 0; i < letters.length; i++) {
            if (chrCopy == letters[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    //    Írj egy függvényt, mely két sztringet
//    kap paraméterként és visszaadja hány karakterük
//    egyezik meg (ugyanazon a poziíción ugyanaz a karakter van)!
//    (például: „alma" és „ álmatlan” -> 3; „sátortábor” és „bátorság”
//    -> 5; „ágy”, „vágy” -> 0)
    public static int sameChars(String s1, String s2) {
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1Chars[i] == s2Chars[i]) {
                cnt++;
            }
        }
        return cnt;
    }
//    Karakter, int
//    Írj programot, ami kiírja, hogy az első 1000 számnak 0 és 1000 között a Unicode kódolásban
//    mi a karakter értéke!

    public static void intToUnicode(Integer num) {
//        System.out.println(intToUnicode(num));
        String numStr = num + "";
        char[] numsOfNum = numStr.toCharArray();
        int[] numsOfChar = new int[numsOfNum.length];
        for (int i = 0; i < numsOfNum.length; i++) {
            numsOfChar[i] = numsOfNum[i];
        }
        double copy = num;

        int lenght = 1;
        for (int i = 0; ; i++) {
            copy = copy / 10d;
            if (copy < 1) {
                break;
            }
            lenght++;
        }
        String numBinary = "";
        for (int i = 0; i < lenght; i++) {
             numBinary = numBinary+Integer.toBinaryString(numsOfChar[i]);

        }
        System.out.println(numBinary);
//        String numStr =num+"";
//        double copy =num;
//int lenght = 1;
//        for (int i = 0; ; i++) {
//            copy= copy/10d;
//            if (copy<1){
//                break;
//            }
//            lenght ++;
//        }
//        for (int i = 0; i <lenght ; i++) {
//            Integer numOfChar =num.
//        }
//
//    }
//    public static int numToBinar(int num){
//        for (int i = 0; i < ; i++) {
//
//        }
    }
//    Írj programot, ami megadja, hogy egy tetszőleges számnak milyen karakter felel meg! 
    public static char intToChar (int num){
//       HashMap<Integer,Character> ascii = new HashMap<>();
//        for (int i = 0; i <128 ; i++) {
            char chr = (char) num;
//            ascii.putIfAbsent(i,chr);
//        }

        return (char) num;

    }
//        
//        
//    }
//    Mi történik, ha negatív számot adunk a programnak?
//    Írj programot, ami egy karakterről megállapítja, hogy az alfanumerikus karakter-e
//    (az angol abc kis és nagy betűje-e vagy szám)!
public static boolean charIsAlfanum (char chr){
//       HashMap<Integer,Character> ascii = new HashMap<>();
//        for (int i = 0; i <128 ; i++) {
    if ((int)chr>=48 && (int)chr<=57){
        return true;
    }
    return false;
}
//    Ceasar rejtjelező
//    Írj Ceasar-rejtjelezőt! A Ceasar rejtjelező azt jelenti hogy minden egyes betűt az ábécében
//    egy tőle meghatározott távolságra lévő betűvel kell helyettesíteni.
//    A program bemenete legyen egy szöveg, egy szám
//    (ezt a "titkos kulcs", azt adja meg, hogy hány távolságra lévő betűkkel kell helyettesíteni),
//    és egy ‘E’ vagy ‘D’ karakter, attól függően hogy rejtjelezni (‘E’=encoding),
//    vagy visszafejteni (‘D’=decoding) akarunk. Ellenőrizd, hogy a program helyesen működik,
//    vagyis, hogy D(E(s)) = s tetszőleges s-re.
//            Helyettesítő rejtjezelő
//    Írj Helyettesítő rejtjezelőt!
//    A helyettesítő rejtjelező egy olyan rejtjelező, ami egy helyettesítő-tábla alapján működik. A helyettesítő-tábla egyszerűen megadja, hogy mely karaktert mely másikkal kell lecserélni.
//    Első lépésben írj helyettesítő-tábla generátort! A generátor nem kap inputot, csak viszaad egy ilyen jellegű Stringet: a=c , b=f , c=j , d=l… Elegendő, ha rejtjeleződ az
//public static boolean ceasar (String text,int keyOfCeasar){
//        String [] magyarAbc = {""""""""""""""""""""""""""""""""A", "a", "Á"," á", "B" ,"b", "C ","c", "Cs", "cs", "D" "d", "Dz" "dz", "Dzs" dzs", "E" "e","" É" "é"," F""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""z" "sz", "T" "t", "Ty" "ty", "U" "u", "Ú" "ú", "Ü ü, Ű ű, V v, W w, X x, Y y, Z z, Zs zs}
//
//        String [] textArray = text.split( " ");
//
//
//       HashMap<Integer,Character> ascii = new HashMap<>();
//        for (int i = 0; i <128 ; i++) {
//    if ((int)chr>=48 && (int)chr<=57){
//        return true;
//    }
//    return false;
//}
}
