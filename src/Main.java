import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı Giriniz : ");
        int a,n,b,c;
        n = girdi.nextInt();

        for ( a = 1; a < n; a++) {
            for ( b = 1; b <= a; b++) {
                System.out.print(" ");

            }
            for ( c = 1; c <= ( 2 * n - (2 * a + 1) ); c++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}
