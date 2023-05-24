import java. util.Scanner;
public class CiftSayilar {
    //Java çevrimleri ile kullanıcıların girdiği sayıya kadar çift olan bileşenleri bulan programı yazıyoruz.
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}