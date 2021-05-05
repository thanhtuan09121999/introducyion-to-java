import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year;
        System.out.println("nhập năm cần kiểm tra");
         year = sc.nextInt();
         if(year%4==0){
             if(year%100==0){
                 if(year%400==0){
                     System.out.println(year+" là năm nhuận");
                 }else {
                     System.out.println(year + "không phải là năm nhận");
                 }
             }else {
                 System.out.println(year +"là năm nhuận");
             }
         }else {
             System.out.println(year + "không phải là năm nhuận");
         }
    }
}
