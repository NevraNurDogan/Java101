import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        n= input.nextInt();
        float toplam=0;
        for(float i=1;i<=n;i++){
            toplam+=(1/i);
        }
        System.out.print("Sonuç:"+toplam);
    }
}
