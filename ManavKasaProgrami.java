import java.util.Scanner;
/*Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
public class ManavKasaProgrami {
    public static void main(String[] args) {
        float armut , elma , domates , muz , patlican ;
        float  tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız:");
        armut = input.nextFloat();

        System.out.print("Kaç kilo elma aldınız:");
        elma= input.nextFloat();

        System.out.print("Kaç kilo domates aldınız:");
        domates = input.nextFloat();

        System.out.print("Kaç kilo muz aldınız:");
        muz = input.nextFloat();

        System.out.print("Kaç kilo patlıcan aldınız:");
        patlican = input.nextFloat();
        armut *= 2.14 ;
        elma *=3.67;
        domates *= 1.11;
        muz *=0.95;
        patlican *= 5.00;
        tutar=armut + elma + domates + muz + patlican;
        System.out.print("toplam tutar:"+tutar);

    }
}
