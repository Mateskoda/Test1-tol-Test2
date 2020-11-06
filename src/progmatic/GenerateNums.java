package progmatic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class GenerateNums {
    int [] temp ;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        int [] temp = new int [r] ;
        int [] number = new int[r];
        printCombination(arr, n, r);
        printCombination2(arr,temp,number, n, r);


    }

    public static void printCombination(int[] arr, int n, int r) {
        int[] temp = new int[r];
        combinationUtil(arr, temp, 0, n - 1, 0, r);
    }

    public static void combinationUtil(int arr[], int[] data, int start, int end,int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++){
                System.out.print(data[j] + " ");}
            System.out.println();
            return;
        }
        for (int i = 0; i <= end;i++
//                &&
//                end - i + 1 >= r - index; i++
        ) {

            data[index] = arr[i];
            if (index == 0) {
                combinationUtil(arr, data, i + 1, end, index + 1, r);
            } else if (index ==1 && data[index - 1] == arr[i]) {
            } else if (index ==2 && ((data[index - 2] == arr[i])||data[index - 1] == arr[i])) {

            } else {
                combinationUtil(arr, data, i + 1, end, index + 1, r);

            }
        } }
//    Írd át a fenti algoritmust egy nem rekurzív, vermet használó algoritmussá!


    public static void printCombination2(int[] arr,int[] temp,int [] number, int n, int r) {
//        int [] temp = new int [r] ;
        int [] temp2 = new int [r] ;
        Stack<int[]> stack = new Stack<>();


        for (int i = 0; i < n; i++) {
            number[0] = arr[i];

            stack.push(number);
        }
        System.out.println(stack);
        int cntIndex = 1;
        while (!stack.empty())
        {
            temp = stack.pop();
        for (int j = 0; j < n; j++) {
            String [] copy = new String[r];
//            copy= ;
            temp[cntIndex]= arr[j];

            stack.push(temp);
            System.out.println(Arrays.toString(temp));

        }
        if (cntIndex==r-1)
        {break;}
        cntIndex++;}

            while (!stack.empty()) {
              if (!(stack.peek()[r-1] ==0)) {
                  temp2=stack.pop();
                  System.out.println(Arrays.toString(stack.pop()));
                  stack.pop();
            }
            else {break;}
            }
        }
//
    public static void combinationUtil2(int arr[], int data[], int start, int end,int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++){
                System.out.print(data[j] + " ");}
            System.out.println();
            return;
        }
//
        for (int i = start; i <= end &&
                end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1,
                    end, index + 1, r);
        }
    }
//
//
}
