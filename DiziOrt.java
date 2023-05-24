import java.util.Scanner;
public class DiziOrt {
    public  static void main (String[] args ){
        int n;
        int total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz:");
        n= input.nextInt();
        int[] arry= new int [n];
        for(int i=0;i<n;i++){
            System.out.print(" Değer giriniz:");
            arry[i]= input.nextInt();
            total+=arry[i];
        }
        System.out.println("Total:"+total);
        System.out.print("Ortalama:"+total/n);

    }
}