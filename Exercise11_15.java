import java.util.Scanner;

public class Exercise11_15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numPoints = in.nextInt();
        double[] x = new double[numPoints];
        double[] y = new double[numPoints];
        System.out.println("Enter the coordinates of the points:");
        for (int i = 0; i < numPoints; i++) {
            x[i] = in.nextDouble();
            y[i] = in.nextDouble();
        }

        double area = 0;
        for (int i = 0; i < numPoints; i++) {
            area += x[i] * y[(i + 1) % numPoints] - y[i] * x[(i + 1) % numPoints];
        }
        area = Math.abs(area / 2);
        System.out.printf("The total area is %.3f\n", area);
    }
}