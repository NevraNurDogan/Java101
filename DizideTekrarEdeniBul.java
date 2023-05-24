import java.util.Scanner;

public class DizideTekrarEdeniBul {
    public  static void main (String[] args ){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz:");
        n= input.nextInt();
        int[] arry= new int [n];
        int[] again = new int [32];
        for(int i=0;i<n;i++){
            System.out.print(" Değer giriniz:");
            arry[i]= input.nextInt();
        }
        System.out.println("Dizi elemanlari:");
        for(int i=0;i<n;i++){
            System.out.print(arry[i]+",");
        }
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arry[i]==arry[j]){
                    again[a]=arry[i];
                    a++;
                }
            }
        }
        System.out.println();
        System.out.print("Tekrar eden sayılar:");
        for(int i=0;i<a;i++){
            System.out.print(again[i]+" ");
        }
    }
}
