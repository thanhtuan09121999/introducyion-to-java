import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tháng bạn cần tìm");
        int month = sc.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29 day";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = " 31 day";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30 day ";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth!=""){
            System.out.printf( "tháng" + month + "có"+daysInMonth);
        }else {
            System.out.print(" sorry you false");
       }
    }
}
//        switch (month){
//            case 1:
//                System.out.println("tháng "+month+"có 31 ngày");
//                break;
//                case 2:
//                System.out.println("tháng "+month+"có 28 or 29 ngày");
//                break;
//                case 3:
//                System.out.println("tháng "+month+"có 31 ngày");
//                break;
//                case 4:
//                System.out.println("tháng "+month+"có 30 ngày");
//                break;
//                case 5:
//                System.out.println("tháng "+month+"có 31 ngày");
//                break;
//                case 6:
//                System.out.println("tháng "+month+"có 30 ngày");
//                break;
//                case 7:
//                System.out.println("tháng "+month+"có 31 ngày");
//                break;
//                case 8:
//                System.out.println("tháng "+month+"có 31 ngày");
//                break;
//                case 9:
//                System.out.println("tháng "+month+"có 30 ngày");
//                break;
//                case 10:
//                System.out.println("tháng "+month+"có 31 ngày");
//                break;
//                case 11:
//                System.out.println("tháng "+month+"có 30 ngày");
//                break;
//                case 12:
//                System.out.println("tháng "+month+"có 31 ngày");
//                break;
//            default:
//                System.out.print("không hợp lệ");
//                break;
//
//        }
//    }
//}