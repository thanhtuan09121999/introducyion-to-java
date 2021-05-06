import java.util.Scanner;

public class Snt {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số  ");
      int  numbers = sc.nextInt();
        while (count < numbers) {
            boolean check =true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
                if (check) {
                    System.out.print(number + " ");
                    count++;
                }
                number++;
            }
        }
    }

