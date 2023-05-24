import java.util.Scanner;

public class MatrisleAYazma {
    public  static void main (String[] args ){
        int n=5;
        String[][] arry= new String [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||i==2){
                    arry [i][j] ="*";
                }
                else if(j==0||j==3){
                    arry [i][j] ="*";
                }
                else {
                    arry [i][j] ="  ";
                }
                System.out.print(arry[i][j]+" ");
            }
            System.out.println();
        }
    }
}
