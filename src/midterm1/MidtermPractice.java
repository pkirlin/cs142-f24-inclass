package midterm1;

import java.util.Arrays;

public class MidtermPractice {
    public static void main(String[] args) {
        // do problem 1 here:
        for (int i = 6; i < 61; i += 6) {
            //if (i % 3 == 0 && i % 2 == 0) {
                System.out.println(i);
            //}
        }


        // test problems 2 and 3 here:

        int[] array = new int[] {2, 4, 6, 8};
        System.out.println(Arrays.toString(reverseArray(array)));

        int[][] board = new int[][]
                    {{1, 1, 1, 1},
                    {1, 0, 0, 1},
                    {1, 1, 0, 1},
                    {0, 0, 0, 1}};


    }

    public static int[] reverseArray(int[] array) {

        int[] copy = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            copy[j] = array[i];
            j--;
        }
        return copy;
    }

    public static int countZeroRows(int[][] grid) {

        return 0;  // remove this line when you start coding
    }
}
