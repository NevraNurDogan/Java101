import java.sql.SQLOutput;
import java.util.Scanner;
public class notHesabi {
    public static void main (String[] args){
        float matematik , turkce , fizik , tarih, kimya , biyoloji;
        float ort=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        matematik= input.nextFloat();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce= input.nextFloat();

        System.out.print("Fizik notunuzu giriniz:");
        fizik= input.nextFloat();

        System.out.print("Tarih notunuzu giriniz:");
        tarih= input.nextFloat();

        System.out.print("Kimay notunuzu giriniz:");
        kimya= input.nextFloat();

        System.out.print("Biyoloji notunuzu giriniz:");
        biyoloji= input.nextFloat();

        ort=(matematik+turkce+fizik+tarih+kimya+biyoloji)/6;
        System.out.println("Ortalamanız;"+ort);
        String  gectimi =( ort >= 60 ) ? "Geçti" : "Kaldi" ;
        System.out.print ( "Durumunuz:" + gectimi );
    }
}
