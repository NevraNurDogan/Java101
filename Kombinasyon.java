import java.util.Scanner;
public class Kombinasyon {
    public static void main (String[] args){
        int n,r;
        int nFaktor=1;
        int rFaktor=1;
        int nrFaktor=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon:(n!)/r!(n-r)!");
        System.out.print("n değerini giriniz:");
        n= input.nextInt();
        System.out.print("r değerini giriniz:");
        r= input.nextInt();
        for(int i =1;i<=n;i++){
            nFaktor*=i;
        }
        for(int j =1;j<=r;j++){
            rFaktor*=j;
        }
        for(int k =1;k<=(n-r);k++){
            nrFaktor*=k;
        }

        System.out.print("C("+n+","+r+") :");
        int c;
        c=nFaktor/(rFaktor*nrFaktor);
        System.out.print(c);

    }
}
