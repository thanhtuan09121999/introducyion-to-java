import java.util.Scanner;

public class ToWish {
    public static void main(String[] args) {
        int num1 , num2;
        int gcd=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a");
       num1 = sc.nextInt();
        System.out.println("nhập b");
        num2= sc.nextInt();
        if(num1==0||num2==0){
            System.out.println("không có ước chung");
        }
        for(int i = 1; i <= num1 && i <= num2; i++) {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
        System.out.printf("Ước chung lớn nhất  là:"+ gcd);
    }
}

//        int a;
//        int b;
//        int c=1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập a");
//        a = sc.nextInt();
//        System.out.println("nhập b");
//        b = sc.nextInt();

////        System.out.println("nhập c");
////        c=sc.nextInt();
//        if (a == 0 || b == 0) {
//            System.out.println("không có ước chung");
//        }
//        while (a != b) {
//
////            if (a% c==0  ){
//////                System.out.println(c +"là ước của a và b" );
//////                break;
////            }if(a%c==0){
////                System.out.println(c+"là ước của a và b");
////                break;
////            }else{
////                System.out.println(c+"không phải là ước a và b");
////                break;
//            if (a > b) {
//                a = a - b;
//            } else {
//                b = b - a;
//            }
//
//        }
//
//        System.out.println("ước chung lớn nhất là " +b);
   // }
//}

