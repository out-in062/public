public class Main {
    public static void main(String[] args) {

        double height = 175.0;
        double weight = 80.0;

        System.out.println("height     :" + height + " cm ");
        System.out.println("body weight: " + weight + " kg ");

        double bmi = weight / ((height / 100) * (height / 100));

        System.out.printf("BMI        : %.2f%n", + bmi);
    }
}
