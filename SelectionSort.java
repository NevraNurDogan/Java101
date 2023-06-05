public class SelectionSort {
/*[22,27,16,2,18,6] -> Insertion Sort
Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.
[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.*/
    public static void main(String[] args){
        int[] arr = {22, 27, 16, 2, 18, 6};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n ; i++){
            System.out.println(arr[i]);
        }
       /* Verilen dizinin Insertion Sort algoritmasıyla sıralanma aşamaları:

        Adım 1: [22, 27, 16, 2, 18, 6]
        Adım 2: [22, 27, 16, 2, 18, 6]
        Adım 3: [16, 22, 27, 2, 18, 6]
        Adım 4: [2, 16, 22, 27, 18, 6]
        Adım 5: [2, 16, 18, 22, 27, 6]
        Adım 6: [2, 6, 16, 18, 22, 27]

        Verilen dizi, Insertion Sort algoritmasıyla yukarıda gösterilen adımlarla sıralanmıştır.

        Big-O gösterimi:
        Insertion Sort algoritmasının Big-O gösterimi O(n^2)'dir.
         Bu, ortalama ve en kötü durumlarda algoritmanın n^2 adımda çalışacağı anlamına gelir, burada n dizinin eleman sayısıdır.


        Time Complexity: 18 sayısı Insertion Sort algoritmasıyla sıralama yapıldığında, 2, 6, 16, 18, 22, 27 sıralı hale gelecektir.
         18 sayısı 4. indiste yer alır. Bu durumda, 18 sayısı O(1) time complexity kapsamına girer.
    */
        /*[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.
        * Adım 1:
            [2, 3, 5, 8, 7, 9, 4, 15, 6]

          Adım 2:
            [2, 3, 5, 8, 7, 9, 4, 15, 6]

          Adım 3:
            [2, 3, 4, 8, 7, 9, 5, 15, 6]

          Adım 4:
            [2, 3, 4, 5, 7, 9, 8, 15, 6]*/
     }
}
