package AfterTest2;

public class Test {



        public static void main(String[] args) {

//        int[] arrayTest1 = {0, 1, 2, 3, 4};
//        int[] arraytest2 = {5, 6, 5, 4, 4, 4, 3};
//        System.out.println(countSameNumbers(arrayTest1, arraytest2));
//        stairs(6);
////        int x1 = 0,v1 = 3, x2 = 4, v2 = 2;
//        int x1 = 0,v1 = 2, x2 = 5, v2 = 3;
//        System.out.println(kangaroosMeet(x1,v1,x2,v2));
//        System.out.println(kangaroosMeet2(x1,v1,x2,v2));

        }

        //    Valósítsd meg az alábbi getLastNumber metódust! A metódus adja vissza a paraméterként
//    kapott tömb utolsó elemét! (2p)
        public static int getLastNumber(int[] numbers) {
            return numbers[numbers.length - 1];
        }

        //    Valósítsd meg az alábbi countEvenNumbers metódust! A metódus adja vissza, hogy a
//    paraméterként kapott tömbben hány páros szám szerepel! (2p)
        public static int countEvenNumbers(int[] numbers) {
            int cnt = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    cnt++;
                }
            }
            return cnt;
        }

        //    Szerepel-e a 101-es szám a tömbben? Valósítsd meg az alábbi findNumber101 metódust!
//    A metódus visszatérési értéke legyen az az index, ahol a tömbben először szerepel a
//    101-es szám! Ha a tömbben ez a szám nem szerepel, akkor a visszatérési érték legyen -1.
//    (2p)
        public static int findNumber101(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 101) {
                    return i;
                }
            }
            return -1;
        }


        //    Valósítsd meg a countSameNumbers metódust! A metódus két egészeket tartalmazó tömb
//    paramétert kap, és azt kell megszámolnia, hogy hány elem szerepel az első tömbből
//    a második tömbben! (Ügyelj arra, hogy ha egy szám többször szerepel a második tömbben,
//    akkor azt csak egynek számold! Feltételezheted, hogy az első tömbben minden szám csak
//    egyszer fordul elő.) (3p)
        public static int countSameNumbers(int[] numbers, int[] otherNumbers) {
            int cntSameNrInArrays = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < otherNumbers.length; j++) {
                    if (numbers[i] == otherNumbers[j]) {
                        cntSameNrInArrays++;
                        break;
                    }
                }
            }
            return cntSameNrInArrays;
        }

        //    Valósítsd meg a matrixTopLeftNumber metódust! A metódus egy kétdimenziós tömböt
//    kap paraméterül, és adja vissza ennek a mátrixnak a bal felső (első) elemét! (2p)
        public static int matrixTopLeftNumber(int[][] numbers) {
            return numbers[0][0];
        }

        //    Mennyi a különbség a mátrix két átlójában szereplő elemek összege között?
//    Valósítsd meg a matrixDiagonalDifference metódust!
//    A metódus egy kétdimenziós tömböt kap paraméterül, és visszatérési értéke a
//    mátrix átlóiban szereplő számok összegei közötti eltérés.
//    (Ügyelj arra, hogy a metódusod visszatérési értéke a kérdésnek megfelelően
//    mindig nemnegatív szám legyen! Feltételezheted, hogy a bemenetül kapott kétdimenziós
//    tömb négyzetes mátrix, azaz a sorainak és oszlopainak száma egyenlő.) (3p)
//    Írd meg a metódus szignatúráját saját magad!
        public static int matrixDiagonalDifference(int[][] matrix) {
            int sumDiagonal1 = 0;
            int sumDiagonal2 = 0;
            for (int i = 0; i < matrix.length; i++) {
                sumDiagonal1 += matrix[i][i];
            }
            for (int i = 0; i < matrix.length; i++) {
                sumDiagonal2 += matrix[i][matrix.length - 1 - i];
            }
            return Math.abs(sumDiagonal1 - sumDiagonal2);
        }

        //    Valósítsd meg a stairs metódust! A metódus egy egész számot vár bemenetként,
//    és rajzoljon ki a kimenetre az alább látható módon egy ilyen magas lépcsőt # és
//    szóköz karakterekből! (A metódusnak a bemenetet nem kell ellenőriznie.) (3p)
        public static void stairs(int height) {
            for (int i = 0; i < height; i++) {
                for (int j = i + 1; j < height; j++) {
                    System.out.print(" ");
                }
                for (int j = height; j > height - (i + 1); j--) {
                    System.out.print("#");

                }
                System.out.println("");

            }

        }
//    Adott két kenguru, akik a számegyenesen ugrálnak. Döntsük el, hogy a két kenguru fog-e egy időben
//    egy helyen tartózkodni a számegyenesen!


        public static boolean kangaroosMeet(int x1, int v1, int x2, int v2) {
            if (x1 == x2) {
                return true;
            }
            if (x1 < x2) {
                if (v1 <= v2) {
                    return false;
                }
                while (x1 <= x2) {
                    if (x1 == x2) {
                        return true;
                    }
                    x1 += v1;
                    x2 += v2;

                }
            }
            if (x2 < x1) {
                if (v2 <= v1) {
                    return false;
                }
                while (x2 <= x1) {
                    if (x1 == x2) {
                        return true;
                    }
                    x1 += v1;
                    x2 += v2;
                }
            }
            return false;
        }

        //    Bónusz kérdés (+2 pont): Megvalósítható-e ez a kangaroosMeet metódus O(1) futásidővel?
//    Ha igen, akkor implementáld le, ha nem, akkor indokold, hogy miért nem!
//    igen :)
        public static boolean kangaroosMeet2(int x1, int v1, int x2, int v2) {
            if (x1 == x2) {
                return true;
            }
            if (x1 < x2) {
                if (v1 <= v2) {
                    return false;
                }
                if ((x2 - x1) % (v1 - v2) == 0) {
                    return true;
                }
            }
            if (x2 < x1) {
                if (v2 <= v1) {
                    return false;
                }
                if ((x1 - x2) % (v2 - v1) == 0) {
                    return true;
                }
            }
            return false;
        }

    }
