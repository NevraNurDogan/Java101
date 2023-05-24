import java.util.Scanner;

public class Taksimetre {
 /*   Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarlarını ekranı yazdıran programı yazın.
    Taksimetre KM başına 2,20 TL tutmaktadır.
    Asgari ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.*/
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double km, a=10,t=2.2,total;
            System.out.print("km'yi giriniz:");
            km = input.nextDouble();
            total=a+(km * t);
            total=(total<20)? 20:total;
            System.out.print("Toplam tutar:"+total);


        }
    }

