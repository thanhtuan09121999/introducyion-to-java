import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int number;
        number =sc.nextInt();

        if(number<2){
            System.out.println(number+"không phải số nguyên tố");
        }else{

            boolean check=true;
            for(int i =2;i<=Math.sqrt(number);i++){
                if (number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(number+"là số nguyên tố");
            }else{
                System.out.println(number+"không là số nguyên tố");
            }
        }
    }
}
