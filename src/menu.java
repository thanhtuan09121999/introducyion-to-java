import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String menu;
//        String drawTheTriangle;
//        String drawTheSquare;
//        String drawTheRectangle;
//        String exit;
//        String YourChoice;
        int choice;
        System.out.println("Menu");
        System.out.println("draw The Triangle");
        System.out.println(" draw The Square");
        System.out.println("draw The Rectangle");
        System.out.println("Exit");
        System.out.println("your choice");
        while (true){
        choice=sc.nextInt();

        switch (choice){
            case 1:
                for(int i=1;i<6;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
                case 2:
                System.out.println("draw the square");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                break;
                case 3:
                System.out.println("draw the retangle");
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                break;
                case 4:
               System.exit(4);
                break;
            default:
                System.out.println("không còn");
        }
    }
}
    }
