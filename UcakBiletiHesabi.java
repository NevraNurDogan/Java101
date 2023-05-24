import java.util.Scanner;
    public class UcakBiletiHesabi {
        public static void main(String[] args){
            int mesafe,yas,tip;
            double normalTutar;
            double yasindirimi=0;
            double indirimlitutar;
            double total;
            Scanner input = new Scanner(System.in);
            System.out.print("Mesafeyi km cinsinden giriniz:");
            mesafe= input.nextInt();
            normalTutar=mesafe*(0.10);
            System.out.print("Yaşınızı giriniz:");
            yas= input.nextInt();
            System.out.print("Yolculuk tipinizi seçin giriniz: 1=> Tek Yön , 2 => Gidiş Dönüş");
            tip= input.nextInt();
            if(tip!=1 && tip!=2 ){
                System.out.println("Geçersiz tip.");
            }
            if(yas<12){
                yasindirimi=normalTutar*(0.5);
            }
            else if(yas>=12 && yas<24){
                yasindirimi=normalTutar*(0.1);
            }
            else if(yas>65){
                yasindirimi=normalTutar*(0.3);
            }
            indirimlitutar=normalTutar-yasindirimi;

            if(tip==2){
                total=(indirimlitutar-indirimlitutar*(0.2))*2;
            }
            else{
                total=indirimlitutar;
            }

            System.out.println("Normal tutar:"+normalTutar);
            System.out.println("İndirimli tutar:"+indirimlitutar);
            System.out.println("Borcunuz:"+total);

    }
}
