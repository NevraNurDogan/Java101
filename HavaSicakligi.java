import java.util.Scanner;
public class HavaSicakligi {
    /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
      Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
      Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
      Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float derece;
        System.out.print("Hava sıcaklığını giriniz:");
        derece = input.nextFloat();
        if(derece <= 5 ){
            System.out.print("Kayak yapmak için harika bir gün:)");
        }
        else if(derece > 5 && derece <15 ){
            System.out.print("Vizyonda yeni bir film var diye duydum izlemeye ne dersin ??");
        }
        else if(derece >= 15 && derece < 25){
            System.out.print("Çimlerin üzerine uzanıp göğe bakmak ve doğada piknik yapmak sana iyi gelecek ");
        }
        else {
            System.out.print("Bu sıcak havada serinlemek için yüzmeye ne dersin ??");
        }


    }
}
