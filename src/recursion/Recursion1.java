package recursion;

public class Recursion1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long factAnswer = fact(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
    }

    public static long fact(int num) {
        return 0; // remove this when you start coding
    }

    public static long factRec(int num) {
        return 0; // remove this when you start coding
    }

    public static String reverse(String str) {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            answer = answer + str.charAt(i);
        }
        return answer;
    }

    public static String reverseRec(String str) {
        return ""; // remove this when you start coding
    }
}