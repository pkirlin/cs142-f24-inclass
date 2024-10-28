package recursion;

public class Recursion1 {

    public static void main(String[] args) {
        factRec(3);
        for (int i = 1; i <= 10; i++) {
            long factAnswer = factRec(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
    }

    public static long fact(int num) {
        long answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }

    public static long factRec(int num) {
        if (num <= 1) {
            return 1;  // base case
        }
        else {
            // recursive case
            return factRec(num - 1) * num;
        }
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