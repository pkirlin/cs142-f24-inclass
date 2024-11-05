package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion3 {
    public static void main(String[] args) {
        // test sum of arraylist:
        ArrayList<Integer> mylist = new ArrayList<>(List.of(7, 9, 8));
        System.out.println("Sum is " + sumOfArrayList(mylist));

        // test max of arraylist:
        ArrayList<Integer> mylist2 = new ArrayList<>(List.of(12,3,6,7,5));
        System.out.println("max is " + maxOfArrayList(mylist2));
    }

    // Calculate the sum of all the elements in an arraylist.
    public static int sumOfArrayList(ArrayList<Integer> list) {
        return sumOfArrayList(list, 0);
    }

    // Helper function for above.
    private static int sumOfArrayList(ArrayList<Integer> list, int leftIdx) {
        if (leftIdx == list.size() - 1) {  // if there's only one element in our "sub-list"
            return list.get(leftIdx);
        } else {
            int smallerSum = sumOfArrayList(list, leftIdx + 1);
            //leftIdx++;
            //int smallerSum = sumOfArrayList(list, leftIdx);
            //leftIdx--;
            return list.get(leftIdx) + smallerSum;
        }
    }

    // Calculate the largest element in an arraylist.
    public static int maxOfArrayList(ArrayList<Integer> list) {
        return maxOfArrayList(list, 0);
    }

    // Helper function for above.
    private static int maxOfArrayList(ArrayList<Integer> list, int leftIdx) {
        if (leftIdx == list.size() - 1) {  // if there's only one element in our "sub-list"
            return list.get(leftIdx);
        } else {
            int maxOfSmallerList = maxOfArrayList(list, leftIdx + 1);

            if (list.get(leftIdx) < maxOfSmallerList) {
                return maxOfSmallerList;
            }
            else {
                return list.get(leftIdx);
            }
        }
    }

}