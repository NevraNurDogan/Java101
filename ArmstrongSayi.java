import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
        int sayi;
        int basno=0;
        int basdegeri;
        int total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        sayi=input.nextInt();
        int gecici=sayi;
        while(gecici!=0){
            gecici /=10;
            basno++;
        }
        gecici=sayi;
        while(gecici !=0){
            basdegeri=gecici%10;
            System.out.println(basdegeri);
            total+=Math.pow(basdegeri,basno);
            gecici/=10;
        }
        if (total== sayi){
            System.out.print("Sayi armstrongdur.");
        }
        else{
            System.out.print("Sayi armstrong değildir.");
        }
    }
}

