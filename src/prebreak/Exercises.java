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
        System.out.println(lst.get(0));
        System.out.println(lst);
        reverseArrayList(lst);
        System.out.println(lst);
        readWords();
    }

    public static void reverseArrayList(ArrayList<Integer> list) {
        int count = list.size() - 1;
        for (int i = 0; i < list.size()/2; i++) {
            // exchange the two items at list[i] and list[count]
            int temp = list.get(i);
            list.set(i, list.get(count));  //list[i] = list[count];
            list.set(count, temp);
            count--;
        }
    }

    public static String reverseString(String str) {
        return "";
    }

    public static ArrayList<String> readWords() {
        InputStream is = Exercises.class.getResourceAsStream("words.txt");
        if (is == null) {
            System.err.println("can't open file!");
            System.exit(1);
        }
        Scanner scanner = new Scanner(is);

        ArrayList<String> words = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //System.out.println(line);
            words.add(line);
        }
        return words;
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