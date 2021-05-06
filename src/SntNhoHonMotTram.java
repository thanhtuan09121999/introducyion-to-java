 import java.util.Scanner;
 public class SntNhoHonMotTram {
        boolean checkNguyenTo(int n){
            if(n<=2){
                return true;
            }else {
                for(int i =2;i<=Math.sqrt(n);i++){
                    if(n % i == 0)
                        return false;
                }
            }
            return true;
        }
        void inputNguyenTo(int n){
            for(int i = 2 ;i<n;i++){
                if(checkNguyenTo(i)){
                    System.out.print(" " +i);
                }
            }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            SntNhoHonMotTram lk = new SntNhoHonMotTram();
            int n =28;
            System.out.println("Nhap n = \n");
            n = sc.nextInt();
            lk.inputNguyenTo(n);
        }
    }

