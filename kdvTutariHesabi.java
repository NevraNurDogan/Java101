import java.util.Scanner;

public class kdvTutariHesabi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double fiyat ;
        double kdvOran=0.18;
        System.out.print("Tutarı giriniz:");
        fiyat= input.nextDouble();
        double kdvtutari=fiyat*kdvOran;
        double kdvliFiyat=fiyat+kdvtutari;
        System.out.println("Fiyat:"+fiyat);
        System.out.println("KDV tutarı:"+kdvtutari);
        System.out.print("KDV'li fiyat:"+kdvliFiyat);

    }


}
