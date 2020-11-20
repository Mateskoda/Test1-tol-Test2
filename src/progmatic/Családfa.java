package progmatic;

import java.util.Scanner;

public class Családfa {}

//    public static void main(String[] args) {
//        String a;
//        Integer a;
////    Ábrahám
////        CsaládfaPerson person1 = new CsaládfaPerson("József","Ráchel","Jákob" );
////        CsaládfaPerson person2 = new CsaládfaPerson("  Jákob","Rebeka", "Izsák" );
////        CsaládfaPerson person3 = new CsaládfaPerson(" Izsák ","Sára", "Ábrahám");
////    person1.setFather(person2);
////    person2.setFather(person3);
//
//        System.out.println("Add meg a családfa gyökerét,legfiatalabb tagját");
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i <3 ; i++) {
//            String name = sc.nextLine();
//            System.out.println("Add meg "+ name + " anyját ");
//            String mother = sc.nextLine();
//            System.out.println("Add meg "+ name + " apját ");
//            String father = sc.nextLine();
//            CsaládfaPerson person1 = new CsaládfaPerson("József","Ráchel","Jákob" );
//
//        }
//    }
////    Egyszerű családfa
////    Írjunk programot, ami bekér majd kiír egy "egyszerű családfát"!
////    Az egyszerű családfa csak egy személy felmenőit tartalmazza testvér és egyéb viszonyokat nem.
////    A program először kérje be a családfa gyökerének (vagyis legfiatalabb tagjának) a nevét.
////    Ezután rendeljen egy azonosító számot ehhez a személyhez és azt írja is ki.
////    Ezután ciklikusan kérje be, hogy kinek az anyját és apját akarjuk megadni
////    (a személyeket az azonosító számukkal jelöljük), s miután ezt megadtuk kérje be az illető személy
////    anyja és apja nevét. Az anyához és apához is generáljon egyedi azonosító számot és ezeket is írja
////    ki. Így kérje be újabb személyek anyját és apját.
////    Minden egyes ilyen kör végén a program kérdezze meg, hogy akarunk-e még újabb személyeket megadni.
////    A program ezen része futtatva valahogy így néz majd ki ($ jellel az inputok):
////    Adja meg a Családfa gyökerét!
////    $ József
////    József létrehozva 1-es azonosítóval. Kinek az apját és anyját adjuk meg?
////    $ 1
////    Add meg József apját!
////    $ Jákob
////    Jákob létrehozva 2-es azonosítóval.
////    Add meg József anyját!
////    $ Ráchel
////    Ráchel létrehozva hármas azonosítóval. Kinek az apját és anyját adjuk meg?
////    $ 3
////    Add meg Réchel apját!
////    $ Lábán
////    Lábán létrehozva 4-es azonosítóval
////
////    stb...
////    Ha befejeztük a személyek megadását a program printelje ki a családfát ilyesmi formátumban:
////
////    József
////            Ráchel
////    Ráchel anyja????
////    Lábán
////            Jákob
////    Rebeka
////            Izsák
////    Sára
////            Ábrahám
////
////
////    Megj: József anyja Ráchel, apja Jákob, Jákob anyja Rebeka, apja Izsák, Izsák anyja Sára, apja
////    Ábrahám
////    Tippek: Egy ember anyja és apja is ember. Objektumstruktúrád tükrözze ezt a viszonyt! A
////    családfát legkönnyebben egy rekurzív algoritmussal fogod tudni kiírni. Kiírod az elsőnek megadott
////    embert, majd rekurzívan kiírod az anyját (ha meg van adva) és az apját (ha meg van adva).
////    A kiírás előtt kiírsz valahány tab karaktert ("\t"), attól függően, hogy milyen mélyen vagy a
////    rekurzióban. Egy hasonló rekurzív algoritmussal keresni is tudsz az emberek között azonosítóra.
//
//}
