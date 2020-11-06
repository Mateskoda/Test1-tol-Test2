package progmatic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Nap51 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            nums.add((int)(Math.random()*50));
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(nums.get(i));
        }
        deleteEvenNums2(nums);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }


    public static void deleteEvenNums(List<Integer> nums) {
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            Integer nr = iterator.next();
            if (nr % 2 == 0) {
                iterator.remove();
            }
        }
    }
    public static void deleteEvenNums2(List <Integer> nums){
        int size = nums.size();
        int x=0;
        for (int i = 0; i <size-x; ) {
            if (nums.get(i)%2==0){
                nums.remove(i);
                x++;

            }else {
                i++;
            }
        }

    }
}
//    Write the deleteEvenNums(List<Integer> nums) method with a
//    fori loop for
//        (int i=0; i<nums.size(); i++) and see what happens!
//        Write it in the ways described above
//        (with for each and with iterators) and see what happens!
