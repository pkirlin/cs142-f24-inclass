package prebreak;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        System.out.println(lst);
        reverseArrayList(lst);
        System.out.println(lst);
        readWords();
    }

    public static void reverseArrayList(ArrayList<Integer> list) {
        int R = list.size() - 1;
        for (int L = 0; L < list.size()/2; L++) {
            int temp = list.get(L);
            list.set(L, list.get(R));    // list[L] = list[R]
            list.set(R, temp);
            R--;
        }
    }

    public static String reverseString(String str) {
        return "";
    }

    public static ArrayList<String> readWords() {
        InputStream is = Exercises.class.getResourceAsStream("words.txt");
        if (is == null) {
            System.out.println("Wrong file name!");
        }
        Scanner scanner = new Scanner(is);
        ArrayList<String> list = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            list.add(line);
        }
        return list;
    }

    public static int linearSearch(ArrayList<String> list, String lookingFor) {
        return 0;
    }

    public static ArrayList<String> wordsContainingEveryVowel(ArrayList<String> list) {
        return null;
    }

    public static ArrayList<String> wordsContainingEveryVowelExactlyOnce(ArrayList<String> list) {
        return null;
    }

    public static ArrayList<String> lettersInAlphaOrder(ArrayList<String> list) {
        return null;
    }

    public static ArrayList<String> findPalindromes(ArrayList<String> list) {
        return null;
    }

    public static ArrayList<String> simpleAutocorrect(ArrayList<String> list, String word) {
        return null;
    }
}