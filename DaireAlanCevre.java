import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi= 3.14,r;
        double alan,cevre;

        System.out.print("r değerini giriniz:");
        r = input.nextDouble();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Alan:"+alan);
        System.out.println("Cevre:" + cevre);

    }
}

