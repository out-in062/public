public class Bmi {
    public static void main(String[] args) {

        double[] heights = {175.0, 171.0};
        double[] weights = {80.0, 78.0};

        for (int i = 0; i < heights.length; i++) {
            double height = heights[i];
            double weight = weights[i];

            System.out.println("Person " + (i + 1));
            System.out.println("height     : " + height + " cm ");
            System.out.println("body weight: " + weight + " kg ");

            double bmi = weight / ((height / 100) * (height / 100));

            System.out.printf("BMI        : %.2f%n", bmi);
        }
    }
}