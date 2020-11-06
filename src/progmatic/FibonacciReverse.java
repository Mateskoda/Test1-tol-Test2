package progmatic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class FibonacciReverse {
    public static void main(String[] args) {
//        System.out.println(arrayFOfFibonacci(100));
        System.out.println(arrayFOfFibonacci2(100));
        System.out.println(arrayFOfFibonacci3(100));
    }

    public static long arrayFOfFibonacci(long num) {
        if (num == 0) {
            return 0;
        }

        if (num == 1 || num == 2) {
            return 1;
        } else {
            return arrayFOfFibonacci((int) (num - 1)) + arrayFOfFibonacci((int) (num - 2));
        }
    }

    public static long arrayFOfFibonacci2(long num) {

        int num1 = 1;
        int num2 = 1;
        int temp = 0;

        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        } else {
            for (int i = 3; i < num; i++) {
                temp = num1;
                num1 = num2;
                num2 += temp;
            }
        }
        return num2;
    }

    public static int arrayFOfFibonacci3(int num) {

        int numNext = 0;
        int temp = 0;
        Stack<Integer> stack = new Stack<>();
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        } else {
            stack.push(0);
            stack.push(1);
            stack.push(1);
            for (int i = 3; i < num; i++) {
                temp = stack.pop();
                numNext = stack.peek() + temp;
                stack.push(temp);
                stack.push(numNext);
            }
        }
        return stack.pop();
    }

    public static long arrayFOfFibonacci4(long num) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int temp;
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        } else {
            stack.push((int) num);

            while (!stack.empty()) {
                if (stack.peek() == 0) {
                    stack.pop();
                } else if (stack.peek() == 1) {
                    sum++;
                } else {
                    temp = stack.pop();
                    stack.push(temp - 1);
                    stack.push(temp - 2);
                }
            }
        }
        return sum;
    }
}


