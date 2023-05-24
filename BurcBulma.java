
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum ayını giriniz:");
        month = input.nextInt();
        System.out.print("Doğum gününü giriniz:");
        day = input.nextInt();
        if (month == 1) {
            if (day < 22) {
                System.out.print("Burcunuz Oğlak");
            }
            else if (day >= 22 && day <= 31) {
                System.out.print("Burcunuz Kova");
            }
        }
        if (month == 2) {
            if (day < 20) {
                System.out.print("Burcunuz Kova");
            }
            if (day >= 20  && day <= 28) {
                System.out.print("Burcunuz Balık");
            }
        }
        if (month == 3) {
            if (day < 21) {
                System.out.print("Burcunuz Balık");
            }
            if (day >= 21  && day <= 31) {
                System.out.print("Burcunuz Koç");
            }
        }
        if (month == 4) {
            if (day < 21) {
                System.out.print("Burcunuz Koc");
            }
            if (day >= 21  && day <= 30) {
                System.out.print("Burcunuz Boğa");
            }
        }
        if (month == 5) {
            if (day < 22) {
                System.out.print("Burcunuz Boğa");
            }
            if (day >= 22  && day <= 31) {
                System.out.print("Burcunuz İkizler");
            }
        }
        if (month == 6) {
            if (day < 23) {
                System.out.print("Burcunuz İkizler");
            }
            if (day >= 22  && day <= 30) {
                System.out.print("Burcunuz Yengeç");
            }
        }
        if (month == 7) {
            if (day < 23) {
                System.out.print("Burcunuz Yengeç");
            }
            if (day >= 23  && day <= 31) {
                System.out.print("Burcunuz Aslan");
            }
        }
        if (month == 8) {
            if (day < 23) {
                System.out.print("Burcunuz Aslan");
            }
            if (day >= 23  && day <= 31) {
                System.out.print("Burcunuz Başak");
            }
        }
        if (month == 9) {
            if (day < 23) {
                System.out.print("Burcunuz Başak");
            }
            if (day >= 23  && day <= 30) {
                System.out.print("Burcunuz Terazi");
            }
        }
        if (month == 10) {
            if (day < 23) {
                System.out.print("Burcunuz Terazi");
            }
            if (day >= 23  && day <= 31) {
                System.out.print("Burcunuz Akrep");
            }
        }
        if (month == 11) {
            if (day < 22) {
                System.out.print("Burcunuz Akrep");
            }
            if (day >= 23  && day <= 30) {
                System.out.print("Burcunuz Yay");
            }
        }
        if (month == 12) {
            if (day < 22) {
                System.out.print("Burcunuz Yay");
            }
            if (day >= 22  && day <= 31) {
                System.out.print("Burcunuz Oğlak");
            }
        }
    }
}

   /* Koç Burcu : 21 Mart - 20 Nisan

        Boğa Burcu : 21 Nisan - 21 Mayıs

        İkizler Burcu : 22 Mayıs - 22 Haziran

        Yengeç Burcu : 23 Haziran - 22 Temmuz

        Aslan Burcu : 23 Temmuz - 22 Ağustos

        Başak Burcu : 23 Ağustos - 22 Eylül

        Terazi Burcu : 23 Eylül - 22 Ekim

        Akrep Burcu : 23 Ekim - 21 Kasım

        Yay Burcu : 22 Kasım - 21 Aralık

        Oğlak Burcu : 22 Aralık - 21 Ocak

        Kova Burcu : 22 Ocak - 19 Şubat

        Balık Burcu : 20 Şubat - 20 Mart*/