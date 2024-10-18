package prebreak;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises2 {

    public static void main(String[] args) {
        ArrayList<String> dictionary = readWords();
        System.out.println("The dictionary has " + dictionary.size() + " words.");
        //System.out.println(linearSearch(dictionary, "CAT"));
        ArrayList<String> everyVowelWords = wordsContainingEveryVowel(dictionary);
        System.out.println(everyVowelWords);
    }

    public static void reverseArrayList(ArrayList<Integer> list) {
        int j = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {
            // algorithm
            int num = list.get(i);
            int newnum = list.get(j);
            list.set(j, num);
            list.set(i, newnum);
            j--;
        }
    }

    public static String reverseString(String str) {
        return "";
    }

    public static ArrayList<String> readWords() {
        InputStream is = Exercises2.class.getResourceAsStream("words.txt");
        if (is == null) {
            System.err.println("Could not open file: words.txt");
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        ArrayList<String> words = new ArrayList<String>();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
            words.add(line);
        }
        return words;
    }

    /**
     * Return the index a word is at, or -1 if the word isn't found.
     */
    public static int linearSearch(ArrayList<String> list, String lookingFor) {
        for (int i = 0; i < list.size(); i++) {
            String currentString = list.get(i);
            if (lookingFor.equals(currentString)) {
                return i;
            }
        }
        return -1;  // now we are guaranteed the loop is done
    }

    public static ArrayList<String> wordsContainingEveryVowel(ArrayList<String> list) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String currentString = list.get(i);

            if (currentString.contains("a") && currentString.contains("e") &&
            currentString.contains("i") && currentString.contains("o") &&
            currentString.contains("u")) {
                //System.out.println("This is a string that has every vowel: " + currentString);
                answer.add(currentString);
            }
        }
        return answer;
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