package Day38_exceptıon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {
    public static void main(String[] args) {

        /*
        marketteki tüm ürünleri bir array'da tuttugumuzu varsayalım.
        kullanıcıya index sorup o index'deki ürünü yazdiran bir program
        hazirlayalım
        kullancı ürün saysından büyük bit index girerse exceptıon vermesinin
        önüne gecelim.


         */
        String  []urunler={"nutella","cokokrem","sut"," cay","findik"};


        Scanner scan;

         int istenensira=0;
         boolean kontrol=true;

       while (kontrol){
           try {
              scan =new Scanner(System.in);
               System.out.println("istediginiz urunun sira nosubu giriniz");
               istenensira= scan.nextInt();
               kontrol=false;

           } catch (InputMismatchException deneme) {

               System.out.println( " urun indexi icin bir tam sayi girmeniz gerekli: ");


           }
       }

        /*
        catc blogunun önündeki parantez de exceptıon clasının ismi ve yanında yakalanan
        exceptıon atadıgımız varıable'ın ismi olur (e)
        eger yakalanan exceptıon ile ilgili bilgileri kullancıya vermek isteserseniz
        bu objeyı kullanablilrsiniz
        eger exceptıon ile ilgili kullanıciya bilgi verme ihtiyacı yoksa
        e kullanılmasa kod calisir.
         */

        try {
            System.out.println("aradiginiz urun  : " + urunler[istenensira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("girdiginiz sira listemizde bulunmuyor " +
                    "\n sira numarasi en fazla  :" + urunler.length + " olabilir");

        }
    }
}
