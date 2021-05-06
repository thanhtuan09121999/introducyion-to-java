import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double money,interestRate;
        int month;
        double sum=0;
        System.out.println("nhập số tiền gửi :");
        money=sc.nextDouble();
        System.out.println("nhập số tháng gửi");
        month=sc.nextInt();
        System.out.println("nhập tỉ lệ phần trăm lãi" );
        interestRate= sc.nextDouble();
        for(int i=0;i<month;i++){
            sum=(money*interestRate)/(12*month);
        }
        System.out.println("tổng số tiền lãi là :"+sum);
    }
}
