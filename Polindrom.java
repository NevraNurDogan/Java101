import java.util.Scanner;

public class Polindrom {
    static boolean isPolindrom(int sayi){
        int gecici=sayi,yenisayi=0,sonhane;
        while(gecici!=0){
            sonhane=gecici % 10;
            yenisayi=(yenisayi*10)+sonhane;
            System.out.println(yenisayi);
            gecici/=10;
        }
        if (yenisayi==sayi){
            System.out.println("Sayı polindromdur.");
        }
        else{
            System.out.println("Sayı polindrom değildir.");
        }
        return true;
    }
    public static void main (String[] args) {
        isPolindrom(242);

    }
}
