import java.util.Scanner;
//Java döngüleri ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class Ikininkuvvetleri {
    public static void main(String[] args){
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayi= input.nextInt();
        for (int i=1;Math.pow(2,i)<=sayi;i++){
            System.out.println(Math.pow(2,i));
        }
    }
}
