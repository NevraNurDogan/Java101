import java.util.Scanner;
public class VucutKitleIndex {
    //Kilo (kg) / Boy(m) * Boy(m)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, index;
        System.out.print("kiloyu kg cinsinde giriniz:");
        kilo = input.nextDouble();
        System.out.print("boyu m cinsinden  giriniz:");
        boy = input.nextDouble();
        index = kilo / Math.pow(boy, 2);
        System.out.println("Vucut kitle index:" + index);


    }
}
