package recursion;

public class Recursion2 {

    public static void main(String[] args) {
        //System.out.println(reverseRec(""));
        weird(5);

        for (int i = 1; i <= 10; i++) {
            long factAnswer = fact(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
        for (int i = 1; i <= 10; i++) {
            long factAnswer = factRec(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
    }

    /**
     * Factorial, iterative version
     */
    public static long fact(int num) {
        long product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }

    /**
     * Factorial, recursive version.
     * Recursive formulation:
     * BASE CASE: If n == 1, fact(1) = 1
     * RECURSIVE CASE: If n >= 2, fact(n) = fact(n-1) * n
     */
    public static long factRec(int num) {
        if (num == 1) {  // base case
            return 1;
        } else {  // recursive case
            long smallerAnswer = factRec(num - 1);
            return smallerAnswer * num;
            // two lines above often combined: return factRec(num-1) * num;
        }
    }

    /**
     * Reverse a string, iterative version
     */
    public static String reverse(String str) {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            answer = answer + str.charAt(i);
        }
        return answer;
    }

    /**
     * Reverse a string, recursive version.
     * Recursive formulation:
     * BASE CASE:
     * RECURSIVE CASE:
     */
    public static String reverseRec(String str) {
        if (str.length() <= 1) {  // base case
            return str;
        }
        else {
            String s2 = str.substring(1);
            String s3 = reverseRec(s2);
            String s4 = s3 + str.charAt(0);
            return s4;
        }


    }

    /**
     * What does this function do?
     */
    public static void weird(int n) {
        if (n == 0) {
            return;
        } else {
            weird(n - 1);
            System.out.println(n);
        }
    }

    /**
     * Fibonacci sequence.
     */
    public static int fib(int n) {
        return 0; // remove this
    }
}