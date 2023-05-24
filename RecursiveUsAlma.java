import java.util.Scanner;

public class RecursiveUsAlma {
    static double us(double a,double b){
        return Math.pow(a,b-1)*a;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban giriniz:");
        int a= input.nextInt();
        System.out.print("Üs giriniz:");
        int b= input.nextInt();
        System.out.print("Sonuc:" +us(a,b));

    }
}
