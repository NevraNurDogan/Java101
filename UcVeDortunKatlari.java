import java.util.Scanner;

public class UcVeDortunKatlari {
    public static void main(String[] args){
        int sayi,j=0;
        float toplam=0,ort;
        Scanner input =new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        sayi= input.nextInt();
        for(int i=0;i<=sayi;i++){
            if (i % 3==0  &&   i % 4==0) {
                System.out.print(i+" ");
                toplam+=i;
                j++;
            }
        }
        ort=toplam/j;
        System.out.println();
        System.out.println("Ortalama:"+ort);
    }




}


