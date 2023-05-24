import java.util.Scanner;

public class DizideMaxMinBul {
    public static void main (String[] args ){
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz:");
        n= input.nextInt();
        int[] arry= new int [n];
        for(int i=0;i<n;i++){
            System.out.print(" Değer giriniz:");
            arry[i]= input.nextInt();

        }
        for(int j=0;j<n;j++){
            System.out.print(arry[j]+" ");
        }
        System.out.println();

        int max=arry[0];
        int min=arry[0];
        for(int i=0;i<n;i++){
            if(arry[i]>=max)
                max=arry[i];
            if(arry[i]<=min)
                min=arry[i];
        }
        System.out.println("Max:"+max);
        System.out.print("Min:"+min);

    }
}
