import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double BMI, weight, height;
        System.out.print("nhập cân nặng (in kilogram)");
        weight = sc.nextDouble();
        System.out.print("nhập chiều cao (in meter)");
        height = sc.nextDouble();
        BMI = weight / Math.pow(height,2);
        if (BMI < 18) {
            System.out.println( BMI+"Underweight");
        } else if (BMI < 25.0) {
            System.out.println( BMI+"normal");

        } else if (BMI < 30.0) {
            System.out.println(BMI+"overweight");
        } else {
            System.out.println(BMI+"obese");

        }
    }
}
