import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
        double a,b;
        int islem;
        Scanner input=new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz:");
        a=input.nextDouble();
        System.out.print("ikinci sayıyı giriniz:");
        b=input.nextDouble();
        System.out.println(" 1.)Toplama\n 2.)Çıkarma\n 3.)Çarpma \n 4.)Bölme");
        System.out.print("işlem seçiniz:");
        islem=input.nextInt();
        if(islem==1) {
            System.out.print(a + b);
        }
        else if (islem==2){
            System.out.print(a - b);
        }
        else if (islem==3){
            System.out.print(a * b);
        }
        else {
            System.out.print(a/b);
        }
    }
}
