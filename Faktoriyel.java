import java.util.Scanner;
//Java ile factoriyel hesaplayan programı yazıyoruz.
public class Faktoriyel {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n=1,sayi;
        System.out.println("hesaplanacak faktoriyeli giriniz:");
        sayi= input.nextInt();
        for ( int i=1;i<=sayi;i++){
            n*=i;
        }
        System.out.println("Faktor:" + n);
    }
}
