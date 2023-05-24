import java.util.Scanner;
//HATALI
public class EbobEkok {
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        sayi1= input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        sayi2= input.nextInt();
        int enb=sayi1;
        if (sayi2>sayi1){
            enb=sayi2;
        }
        for (int i=enb;i>=1;i--){
            if(sayi1 % i==0 && sayi2 % i==0){
                System.out.println(i);
                break;
            }
            //EKOK = (n1*n2) / EBOB
          for (int j=1;j<=(sayi1*sayi2);j++){
              if ( j % sayi1  == 0 &&  j%sayi2 == 0){
                  System.out.print(j);
                  break;
              }

          }
        }
    }
}
