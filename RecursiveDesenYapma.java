import java.util.Scanner;

public class RecursiveDesenYapma {
    static int desen(int a){
        System.out.println(desen(a-5));
        return (a-5);

    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a= input.nextInt();
        desen(a);


    }
 }
