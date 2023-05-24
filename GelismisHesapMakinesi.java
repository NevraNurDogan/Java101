import java.util.Scanner;
        public class GelismisHesapMakinesi {
            static float toplama(float a,float b){
                float result=a+b;
                System.out.println("Toplam:"+result);
                return result;
            }
            static float cikarma(float a,float b){
                float result=a-b;
                System.out.println("Fark:"+result);
                return result;
            }
            static float carpma(float a,float b){
                float result=a*b;
                System.out.println("Çarpım:"+result);
                return result;
            }
            static float bolme(float a,float b){
                if (b==0){
                    System.out.println("İkinci sayi sıfırdan büyük olmalı!!");
                    return 0;

                }
                float result=a/b;
                System.out.println("Bölüm:"+result);
                return result;
            }
            static float usluhesabi(float a,float b){
                float sonuc=1;
                for (int i=1;i<=b;i++){
                    sonuc*=a;
                }
                System.out.println("Üslü ifade:"+sonuc);
                return sonuc;
            }
             static float mod(float a,float b){
               return a % b;
             }
             static float alan(float a,float b){
               float result =a*b;
               System.out.println("Alan:"+result);
               return result;
             }
             static float cevre(float a,float b){
                float result=(a+b)*2;
                 System.out.println("Çevre:"+result);
                 return result;
             }

            public static void main (String[] args) {
                Scanner input = new Scanner(System.in);
                int select;
                String menu = "1- Toplama İşlemi\n"
                        + "2- Çıkarma İşlemi\n"
                        + "3- Çarpma İşlemi\n"
                        + "4- Bölme işlemi\n"
                        + "5- Üslü Sayı Hesaplama\n"
                        + "6- Mod Alma\n"
                        + "7- Dikdörtgen Alan ve Çevre Hesabı\n";
                        System.out.println(menu);
                while(true){

                    System.out.print("Bir işlem seçiniz:");
                    select = input.nextInt();
                    if (select==0){
                        break;
                    }
                    System.out.print("Birinci sayıyı giriniz:");
                    float a = input.nextFloat();
                    System.out.print("İkinci sayıyı giriniz:");
                    float b = input.nextFloat();
                   switch (select) {
                        case 1:
                            toplama(a, b);
                            break;
                        case 2:
                            cikarma(a, b);
                            break;
                        case 3:
                            carpma(a, b);
                            break;
                        case 4:
                            bolme(a, b);
                            break;
                        case 5:
                            usluhesabi(a,b);
                            break;
                        case 6:
                            System.out.println("Mod:"+mod(a,b));
                            break;
                         case 7:
                             alan(a,b);
                             cevre(a,b);
                       default:
                           System.out.println("Geçersiz bir işlem girdiniz!");

                    }
                }

        }
    }
