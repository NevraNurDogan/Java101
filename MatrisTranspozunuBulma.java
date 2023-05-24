import java.util.Scanner;

public class MatrisTranspozunuBulma {
    public  static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("n değerini giriniz:");
        n= input.nextInt();
        int m;
        System.out.print("m değerini giriniz:");
        m= input.nextInt();
        int[][] arry= new int [10][10];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Matris"+"["+i+"]"+"["+j+"]:");
                arry[i][j]= input.nextInt();
            }
        }
        System.out.println("Matris:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arry[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpoz:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arry[j][i]+" ");
            }
            System.out.println();
        }
    }
}
