import java.util.Scanner;
public class BasSayilariTop {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        sayi=input.nextInt();
        int gecici=sayi;
        int basdegeri;
        int toplam=0;
        while(gecici !=0){
            basdegeri=gecici %10;
            toplam+=basdegeri;
            gecici/=10;
        }
        System.out.print("Basamakları toplamı:"+toplam);


    }
}
