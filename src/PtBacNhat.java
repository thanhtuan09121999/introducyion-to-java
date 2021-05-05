import java.util.Scanner;

public class PtBacNhat {
    public static void main(String[] args) {
//        System.out.println(" giải phương trình bậc nhất");
//        System.out.println(" nhập hằng số cho phương trình a*x+b=0");
        Scanner sc= new Scanner(System.in);
        System.out.println(" a :");
        float  a= sc.nextFloat();
        System.out.println(" b :");
        float b= sc.nextFloat();
        if (a==0){
            if(b==0){
                System.out.println("phương trình vô số nghiệm");
            }else{
                System.out.println("phương trình vô nghiệm");
            }
        }else {
            System.out.println("phương trình có nghiệm x ="+ (-b/a));
        }
    }
}
