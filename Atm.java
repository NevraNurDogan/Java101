import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String password;
        int select=1;
        int right = 3;
        int balance=15000;

        while (right > 0) {
            System.out.println("\nKullanıcı adını giriniz:");
            name = input.nextLine();
            System.out.println("Kart şifrenizi giriniz:");
            password = input.nextLine();
            if (name.equals("nevra nur doğan") && password.equals("1907")) {
                System.out.println("Merhaba, DoğanBank'a Hoşgeldiniz!");
                while(select!=4){
                    System.out.println("\n1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("İşlem seçiniz.");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak para miktarı : ");
                            int deposit = input.nextInt();
                            balance += deposit;

                            break;
                        case 2:
                            System.out.print("Çekilecek para miktarı : ");
                            int price = input.nextInt();
                            balance -= price;
                            break;
                        case 3:
                            System.out.print("Hesap bakiyeniz:" +balance);
                            break;
                        case 4:
                            System.out.println("Başarıyla çıkış yapılmıştır.");
                            break;
                        default:
                            System.out.println("Geçerli bir işlem seçiniz!");
                            break;
                    }
                }
            if (!name.equals("nevra nur doğan") || !password.equals("1907")) {
                    right--;
                    System.out.println("Hatalı giriş tekrar deneyiniz!");
                }

            if(right==0){
                System.out.println("Hesabının bloke olmuştur bankanız ile iletişime geçin!");
            }
            else {
                System.out.println(right+"  deneme hakkınız kaldı!");
            }
           }
        }
    }
}
