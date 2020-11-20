package Intelligent;

public class LazyTherapist extends DullTherapist {
    @Override
    public void response(String input, IntelligentBeing i) {
        if (((input.toCharArray())[input.toCharArray().length - 1]) == '?') {
            super.response(input, i);

        } else if (((input.toCharArray())[input.toCharArray().length - 1]) == '!') {
//            Készíts egy LazyTherapist, aki megnézi, hogy a kapott mondat végén kérdőjel, felikáltójel, vagy egyéb karakter van-e. Kérdőjel esetén az alábbi mondatokból válogat: “Biztos ön ebben?”, “Miért gondolja ezt?”, “El tudja képzelni ennek az ellenkezőjét is?” “Nem tudom. Talán így van. Ön mit gondol erről?”.
            System.out.println("Most dühös lett?");
            System.out.println("Mit érez miközben ezt mondja?");
            System.out.println("Feszült lett attól, amiről beszélünk?");
        } else {

            System.out.println("Kérem, folytassa");
            System.out.println("Biztos ebben?");
            System.out.println("Csakugyan?");
            System.out.println("Hmm. Ez érdekes. Kérem fejtse ki bővebben!");

        }


    }
}
