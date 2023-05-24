import java.util.Scanner;

public class DiziElemanlariniSirala {
    public  static void main (String[] args ){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz:");
        n= input.nextInt();
        int[] arry= new int [n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". elemanı giriniz:");
            arry[i]= input.nextInt();
        }
        System.out.print("Dizi elemanlari:");
        for(int i=0;i<n;i++){
            System.out.print(arry[i]+",");
        }
        int enk =arry[0];
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arry[j]<=arry[i]){
                    temp= arry[i];
                    arry[i] =arry[j];
                    arry[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Dizi elemanlari küçükten büyüğe sıralı hali:");
        for(int i=0;i<n;i++){
            System.out.print(arry[i]+",");
        }
    }
}
