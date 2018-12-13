// Binary Search (İkili Arama) Algoritması  - Eren Çar
 
import java.util.Scanner;

public class binarysearch {

public static void main(String[] args) {
Scanner k = new Scanner(System.in);
int dizi[] = { 1, 2, 4, 9, 11, 25 };
int bas,sayac = 0;
int son = dizi.length – 1;
int aranan = k.nextInt();

                 while (bas <= son) {
                           int orta = (bas + son) / 2;

                               if (dizi[orta] == aranan) {
                                   System.out.println(“Aradığınız sayı ” + orta + “. dizinde bulunmuştur.”);
                                          sayac++;
                                          break;     }
			       else if (aranan > dizi[orta]){
                                          bas = orta + 1;   }
			       else
                                          son = orta – 1;   
}

                if (sayac == 0) {
                    System.out.println(“Aradığınız sayı bulunamamıştır”);   }
}
}
