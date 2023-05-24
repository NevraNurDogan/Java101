import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int n,m;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? :");
        n=input.nextInt();
        System.out.print("1.sayıyı giriniz:");
        m=input.nextInt();
        int min=m;
        int max=m;
        for (int i=2;i<=n;i++){
            System.out.print(i+". sayıyı giriniz:");
            m=input.nextInt();
            if (n==1) {
                max = m;
                min = m;
            }
            if(m>=max)
                max=m;

            if (m<=min) {
                min=m;
            }
        }
        System.out.println("Min:"+min);
        System.out.println("Max:"+max);
    }
}
