import java.util.Scanner;
public class Yeni {
    public static int basamakAl(int sayi) { //geriye değer döndüren fonksiyonumuz
        ;
        if (sayi < 10) { //eğer sayı ondan küçük ise bir artırıp main'e gönderecek.

            return 1;
        }

        return 1 + basamakAl(sayi / 10); //sayı ondan küçük olana kadar bölecek ve basamakAl fonksiyonu ile kendini çağıracak.Her böldüğünde bir artıracak.

    }

//Özyineleme kullanarak basamak sayısı bulma

        public static void main(String[] args) {
            Scanner oku = new Scanner(System.in);

            int sayi; //tanımlı değişkenimiz
            System.out.println("Basamak sayısı bulunacak sayıyı giriniz:");
            sayi=oku.nextInt();

            System.out.println(basamakAl(sayi));
        }





}
