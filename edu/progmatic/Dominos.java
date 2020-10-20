package edu.progmatic;

public class Dominos {

    private static final Domino a = new Domino(4, 6);
    private static final Domino b = new Domino(1, 5);
    private static final Domino c = new Domino(6, 7);
    private static final Domino d = new Domino(2, 4);
    private static final Domino e = new Domino(7, 1);
    private static final Domino f = new Domino(5, 2);

    private static final Domino[] arrayOfDominos = {a, b, c, d, e,f};
    private static final Domino[] arrayOfDominos2 = new Domino[6];

    public static void main(String[] args) {
        System.out.println(firstElement());
        arrayOfDominos2[0] = arrayOfDominos[firstElement()];


        for (int j = 1; j < arrayOfDominos2.length; j++) {
            for (int i = 1; i < arrayOfDominos.length; i++) {
                if (arrayOfDominos[i].returnLeft() == arrayOfDominos2[j - 1].returnRight()) {
                    arrayOfDominos2[j] = arrayOfDominos[i];
                    break;
                }
            }

        }
        for (int i = 0; i <arrayOfDominos2.length ; i++) {

        System.out.println((arrayOfDominos2)[i]);

        }
        System.out.println(arrayOfDominos[1].left);
    }

        public static int firstElement () {
            int cnt = 0;
            int cntI = 0;

            for (int i = 0; i < arrayOfDominos.length; i++) {
                for (int j = 0; j < arrayOfDominos.length; j++) {
                    if (i != j) {
                        if (arrayOfDominos[i].left == arrayOfDominos[j].right) {
                            cnt++;
                        }
                    }
                }
                if (cnt == 0) {
                    cntI = i;
                    return cntI;
                }
                cnt = 0;
            }
            return cntI;
        }

    }
