import java.util.Scanner;
//Bir sayının kendisi hariç pozitif tam sayı çarpanları
// toplam ona eşit olan sayıya mükemmel sayı denir.
public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi;
        int toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        sayi=input.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi % i == 0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            System.out.print("Mükemmel sayıdır.");
        }
        else{
            System.out.print("Mükemmel sayı değildir.");
        }
    }
}
