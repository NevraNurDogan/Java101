import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year,mod;
        System.out.print("Doğum yılınızı giriniz:");
        year= input.nextInt();
        if( year%4==0){
            if(year%100==0 && year%400!=0){
                System.out.print(year+" bir artık yıl değildir.");
            }
            else{
                System.out.print(year+" bir artık yıldır.");
            }
        }
        else{
            System.out.print(year+" bir artık yıl değildir.");
        }


    }
}
