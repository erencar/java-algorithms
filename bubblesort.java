// BubbleSort Algoritması - Eren Çar

public class bubblesort {

  public static void main(String[] args) {

           int dizi[] = { 5, 8, 3, 6, 7, 9 };            int n = dizi.length – 1;
           int deger = 0;

                     for (int i = 0; i < n; i++) {

                           for (int j = 0; j < n – i; j++) {
                                         if (dizi[j] > dizi[j + 1]) {
                                                deger = dizi[j];
                                                dizi[j] = dizi[j + 1];
                                                dizi[j + 1] = deger;   } 

}  }

                   for (int i = 0; i < dizi.length; i++) {
                                 System.out.println(dizi[i]);    } 

}  }
