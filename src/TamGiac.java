public class TamGiac {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7-i; j >=1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + "*");
            }
            System.out.println(" ");
        }
    }
}
