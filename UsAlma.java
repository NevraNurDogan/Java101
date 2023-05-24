import java.util.Scanner;
public class UsAlma {
    public static void main  (String[] args){
        Scanner input = new Scanner(System.in);
        int t ,u;
        int total=1;
        System.out.print("Tabanı giriniz:");
        t= input.nextInt();
        System.out.print("Üssü giriniz:");
        u= input.nextInt();
        for(int i=1;i<=u;i++){
            total *=t;
        }
        System.out.print(t+" üssü "+u+": ");
        System.out.print(total);

    }
}
