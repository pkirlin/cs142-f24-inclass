package functions;

public class FunctionPractice {
    public static void main(String[] args) {
        double answer = distance(1, 2, 3, -4);
        System.out.println(Math.round(answer));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

}
