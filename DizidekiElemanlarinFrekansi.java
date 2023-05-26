import java.util.Scanner;

/*Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.*/
public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz:");
        n= input.nextInt();
        int[] arry= new int [n];
        for(int i=0;i<n;i++){
            System.out.print(" Değer giriniz:");
            arry[i]= input.nextInt();
        }
        int a;
        for(int i=0;i<n;i++){
            a=0;
            for(int j=0;j<n;j++){
                if( arry[i]== arry[j]){
                    a++;
                }
            }
            System.out.println(arry[i]+" sayısı "+a+" kere tekrar edildi.");
        }


    }
}
