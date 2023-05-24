import java.util.Scanner;
class Hipotenusbulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.print("a değerini giriniz:");
        a = input.nextDouble();
        System.out.print("b değerini giriniz:");
        b = input.nextDouble();
        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs:" + c);

    }
}
