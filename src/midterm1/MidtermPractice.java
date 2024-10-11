package midterm1;

import java.util.Arrays;

public class MidtermPractice {
    public static void main(String[] args) {
        // do problem 1 here:
        for (int i = 3; i < 61; i += 3) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // test problems 2 and 3 here:
        int[] array = new int[] {2,4,6,8};
        int[] solution = reverseArray(array);
        System.out.println(Arrays.toString(solution));


    }

    public static int[] reverseArray(int[] array) {
        int j = array.length-1;
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            //copy[array.length-1-i] = array[i];
            copy[j] = array[i];
            j--;
        }
        return copy;
    }

    public static int countZeroRows(int[][] grid) {

        return 0;  // remove this line when you start coding
    }
}
