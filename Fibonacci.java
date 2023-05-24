import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=1,b=1,c;
        Scanner input = new Scanner(System.in);
        System.out.print(a+","+b+",");
       for(int i=1;i<=10;i++){
           c=a+b;
           a=b;
           b=c;
           System.out.print(c+",");
       }
    }
}
