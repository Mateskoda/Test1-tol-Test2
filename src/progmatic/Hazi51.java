package progmatic;

import java.util.*;

public class Hazi51 {
    public static void main(String[] args) {
//        Person p;
        List<Integer> nums1To20= new ArrayList<Integer>();
        fillArray(nums1To20);
        printArray(nums1To20);
//        HashSet<Integer> hash1 = (HashSet<Integer>) nums1To20;
        HashSet<Integer> copy = new HashSet<Integer>(nums1To20);
//        printArray( copy);
        System.out.println();
            System.out.println(copy);
        System.out.println(copy.size());
        System.out.println(findMin(10,copy));
        System.out.println(cntMinIdx((findMin(10,copy)),nums1To20));


        List <Person> people = new ArrayList<Person>();
        Person a = new Person("A",12,60,100);
        Person b = new Person("B",12,60,120);
        Person c = new Person("C",12,60,120);
        Person d = new Person("E",12,60,120);
        Person e = new Person("E",12,60,110);
        Person f = new Person("A",15,50,100);
        Person g = new Person("A",14,70,110);
        Person h = new Person("A",13,80,130);
        Person i = new Person("A",11,90,140);
        people.add(a);
        people.add(b);
        people.add(c);
        people.add(d);
        people.add(e);
        people.add(f);
        people.add(g);
        people.add(h);
        people.add(i);
//        Iterator<Person> iterator =.iterator();
//        while (iterator.hasNext()) {
//            Integer nr = iterator.next();
//            if (nr % 2 == 0) {
//                iterator.remove();
//            }
//        }

        HashSet<Person> peopleset=new HashSet<Person>(people);
        int x =120;

        Iterator<Person> it = peopleset.iterator();
        while (it.hasNext()){
            Person person= it.next();
            if (person.height<x){
                it.remove();
            }
        }
        for (Person p:peopleset
             ) {
            System.out.print(p.name + " ");
        }
    }






    public static void removeInd (HashSet<Person>peopleset ){
//        Iterator<Map.Entry<String, Integer>> it = map1.entrySet().iterator();
//
//        while (it.hasNext()) {
//            Map.Entry<String, Integer> pair = it.next();
//            if (pair.getValue() > max) {
//                max = pair.getValue();
//                maxClan = pair.getKey();
//            }
//        }

//        Iterator<Person> iterator = peopleset.iterator();
//        int x =0;
//        while (iterator.hasNext())
//            Person person=iterator.next();
//        if (.)
//        }

    }
    public static void fillArray(List array){
        for (int i = 0; i <2 ; i++) {
            array.add((int)(Math.random()*20+1));
        }
    }
    public static void printArray(List array){
        for (int i = 0; i <array.size() ; i++) {
            System.out.print(array.get(i)+ " ");
        }
    }
    public static int findMin(int num,HashSet<Integer> copy){
        int min =Integer.MAX_VALUE;
        for (Integer number:copy) {
//            (int i = 0; i < copy.size(); i++) {
        if (number>10 && number <min ){
            min = number;
        }

    }return min;}

    public static int cntMinIdx(int min,List<Integer> array){
        int cnt = 0;
        for (Integer num:array) {
            if (num == min){
                cnt++;
            }
        }return cnt;
    }
//    Írj programot, ami feltölt egy 1000 méretű Integereket tartalmazó ArrayList-et 1 és 20
//    közötti véletlen számokkal. A későbbiek során használd ezt a listát!
//    Másold át a különböző lista számait egy HashSet-be!
//    Hány különböző szám volt az eredeti listában?
//    Keresd meg a Set legkisebb olyan elemét, ami 10-nél nagyobb!
//    Hányszor fordul elő ez az elem az eredeti listában?
//
//
//    A Person osztályt felhasználva hozz létre egy listát 10 személlyel.
//    A 10-ben Legyenek olyan személyek, akiknek azonos a nevük (de különböző objektumok legyenek).
//    Tekintsünk két személyt azonosnak, ha a nevűk megegyezik!
//    Írd meg a Person osztály megfelelő equals metódusát!
//    Rakd át a listából a Personokat egy HashSet-be. Mekkora lett a Set mérete?
//    Írj metódust, amit törli a Set-ből mindazokat, akik magassága kisebb mint egy megadott érték!

}
