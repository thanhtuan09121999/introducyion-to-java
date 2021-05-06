import java.util.Scanner;

public class sntNhoHon100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số");
        int num= sc.nextInt();
        boolean check=false;
        for(int i=2;i<=num;i++){
            check=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    check=false;
                }
            }
            if(check==true){
                System.out.println(i+"  ");
            }
        }
    }
}
