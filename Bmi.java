import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("・身長(m)を入力してください：");
        double height = stdIn.nextDouble();
        System.out.print("・体重(Kg)を入力してください：");
        double weight = stdIn.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        
        String formattedBmi = String.format("%.2f", bmi);

        System.out.println("------------------------------");
        System.out.println("BMIは" + formattedBmi + "です。");
    }
}