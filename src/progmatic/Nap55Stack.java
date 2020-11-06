package progmatic;

import java.util.*;

public class Nap55Stack {
    public static void main(String[] args) {
//        System.out.println( Arrays.toString(changeOrder(new int[] {1,2})));
//        System.out.println( Arrays.toString(changeOrderWithQueue(new int[] {1,2})));
       System.out.println( Arrays.toString( changeOrderWithStack(new int[] {1,2})));
//        Stack, queue
//
//        Írj metódust, ami megfordít egy számokat tartalmazó tömböt
//        egy verem segítségével! Nem kell, hogy a megoldásod hatékony legyen!
//                Írj sor adatszerkezetet, ami úgy működik, hogy a belsejében
//                két verem van. Nem kell, hogy a megoldsáod hatékony legyen.
//        https://app.codility.com/programmers/lessons/7-stacks_and_queues/

    }
    public static int [] changeOrder(int [] array){
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i <array.length ; i++) {
            stack.addFirst(array[i]);
        }
        int i=0;
        for (Integer integer : stack) {
            array[i]=integer;
            i++;
        }return array;
        }
    public static int [] changeOrderWithStack(int [] array){
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i <array.length ; i++) {
                stack.push(array[i]);
            }
            System.out.println(stack);
            int i=0;
        for (int j = 0; j <array.length ; j++) {
            array[j]=stack.pop();
        }
//            for (Integer integer : stack) {
//                array[i]=integer;
//                i++;
            return array;
        }

    public static int [] changeOrderWithQueue(int [] array){
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i <array.length ; i++) {
            queue.add(array[i]);
        }
        System.out.println(queue);
        int i=array.length-1;
        for (Integer integer : queue) {
            array[i]=integer;
            i--;
        }return array;
    }
    }

