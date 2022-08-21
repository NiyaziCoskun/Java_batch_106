package Day09_ternaryopertor;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {

        /*kullanıcıdan bir sayi isteyin sayi pozitif ise sayiyi yazdirin
        sayi negatif ise bir sayi daha isteyin ve ikisinin çarpımını yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
        }else {

            System.out.println("Lütfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);
        }


        //eger if else içerinde yeni kodlar varsa ternaryile yazmamız mumkun değil

    }
}
