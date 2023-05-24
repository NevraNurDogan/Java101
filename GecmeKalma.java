import java.util.Scanner;
public class GecmeKalma {
    public static void main (String[] args){
        float matematik , turkce , fizik , tarih, kimya , biyoloji;
        float ort=0,toplam=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matematik= input.nextFloat();
        if(matematik>=0 && matematik <=100){
            toplam+=matematik;
        }
        else {
            System.out.print("Geçerli bir not giriniz:");
            matematik= input.nextFloat();
            toplam+=matematik;
        }

        System.out.print("Türkçe notunuzu giriniz:");
        turkce= input.nextFloat();
        if(turkce>=0 && turkce<=100){
            toplam+=turkce;
        }
        else {
            System.out.print("Geçerli bir not giriniz:");
            turkce= input.nextFloat();
            toplam+=turkce;
        }

        System.out.print("Fizik notunuzu giriniz:");
        fizik= input.nextFloat();
        if(fizik>=0 && fizik <=100){
            toplam+=fizik;
        }
        else {
            System.out.print("Geçerli bir not giriniz:");
            fizik= input.nextFloat();
            toplam+=fizik;
        }

        System.out.print("Tarih notunuzu giriniz:");
        tarih= input.nextFloat();
        if(tarih>=0 && tarih <=100){
            toplam+=tarih;
        }
        else {
            System.out.print("Geçerli bir not giriniz:");
            tarih= input.nextFloat();
            toplam+=tarih;
        }

        System.out.print("Kimya notunuzu giriniz:");
        kimya= input.nextFloat();
        if(kimya>=0 && kimya <=100){
            toplam+=kimya;
        }
        else {
            System.out.print("Geçerli bir not giriniz:");
            kimya= input.nextFloat();
            toplam+=kimya;
        }
        System.out.print("Biyoloji notunuzu giriniz:");
        biyoloji= input.nextFloat();
        if(biyoloji>=0 && biyoloji<=100){
            toplam+=biyoloji;
        }
        else {
            System.out.print("Geçerli bir not giriniz:");
            biyoloji= input.nextFloat();
            toplam+=biyoloji;
        }

        ort=toplam/6;

        if(ort >0 && ort<=55){
            System.out.println ( "Kaldınız :(" );
        }
        if(ort>55){
            System.out.println ( "Geçtiniz :)" );
        }
          System.out.print ( "Ortalamanız:" +ort);

    }
}
