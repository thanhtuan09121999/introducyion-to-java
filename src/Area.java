import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int width;
        int height;
//        System.out.println("nhập chiều dài ");
//        System.out.println("nhập chiều rộng ");
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập chiều rộng");
        width=sc.nextInt();
        System.out.println("nhập chiều dài");
        height=sc.nextInt();
        int area=width*height;
        System.out.println("diện tích =" +area);

    }
}
