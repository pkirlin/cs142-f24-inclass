package functions;

public class FunctionPractice {
    public static void main(String[] args) {
        double answer = distance(1, 2, 3, -4);
        System.out.println(Math.round(answer));
        System.out.println(sumRange(1, 9));
        System.out.println(totalDistance(new int[] {1,2,3,-4,-3,0}));
    }

    public static double totalDistance(int[] points) {
        double sum = 0;
        for (int i = 0; i < points.length-2; i+=2) {
            System.out.println(points[i] + " " + points[i+1] + " " + points[i+2] + " " + points[i+3]);
            double dist = distance(points[i], points[i+1], points[i+2], points[i+3]);
            System.out.println("the distance is " + dist);
            sum += dist;
        }
        return sum;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    public static int sumRange(int lower, int upper) {
        int sum = 0;
        for (int ctr = lower; ctr <= upper; ctr++) {
            sum += ctr;
        }
        return sum;
    }


}
