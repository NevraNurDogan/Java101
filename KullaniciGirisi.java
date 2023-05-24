import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String ad ;
        String sifre;
        Scanner input= new Scanner(System.in);
        System.out.println("Kullanıcı adını giriniz:");
        ad = input.nextLine();
        System.out.println("Şifrenizi giriniz:");
        sifre = input.nextLine();
        if (ad.equals("nevranur")){
            System.out.println("Kullanıcı adı doğru.");
        }
        else {
            System.out.println("Kullanıcı adı yanlış.");
        }
        if (sifre.equals("2509")){
            System.out.println("Şifre doğru.");
        }
        else {
            System.out.println("Şifre yanlış.");
        }
        if(ad.equals("nevranur") && sifre.equals("2509") ){
            System.out.println("Hoşgeldiniz :) ");
        }
        else{
            System.out.println("Giriş yapılamadı :( ");
        }
    }
}

