import java.util.Scanner;
/*Java döngüleri ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
    tek elemanları toplayıp ekrana basan programı yazıyoruz.*/
public class TekSayilarinTop {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int sayi,toplam=0;
      do{
          System.out.println("Sayı giriniz:");
          sayi= input.nextInt();
          if(sayi % 2 !=0){
              toplam += sayi;
          }
      }
      while(sayi>0);
      System.out.println("Toplam:"+toplam);
 }
}
