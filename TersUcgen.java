import java.util.Scanner;
//hatalı
public class TersUcgen {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Bir Sayı Giriniz :");
            int n = input.nextInt();
            for (int i = 10; n-i >0; i--) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print("-");
                }
                for (int k = 0; k <= n; k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
}


