package Day09_ternaryopertor;

import java.util.Scanner;

public class C02_ternary {

    public static void main(String[] args) {

       /* Soru4 ) Kullanicidan bir sayi alin.
        Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();
         //eger ternary içindeki sonuçlar farklı data türlerinde ise atama yapamayız
        //sadece yazdırabiliriz
        System.out.println(sayi>0 ? "sayi pozitif": (sayi*sayi));
    }
}
