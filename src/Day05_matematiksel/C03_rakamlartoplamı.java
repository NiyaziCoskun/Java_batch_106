package Day05_matematiksel;

import java.util.Scanner;

public class C03_rakamlartoplamı {
    public static void main(String[] args) {

        //kullanıcıdan 4 basamaklı bir sayi alin ve rakamlar toplamını yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 4 basamakli pozitif bir tam sayi giriniz");

        int sayi= scan.nextInt();//5267

        int birlerbasamagi=0;

        int rakamlartoplami=0;

        //suanda saymimiz 5267 birler basamagi 0 rakamlar tolami 0

        birlerbasamagi=sayi%10;//7
        rakamlartoplami+=birlerbasamagi;
        sayi/=10;

        birlerbasamagi= sayi %10;//6

        rakamlartoplami+= birlerbasamagi;//7+6=13

        sayi/=10;
         birlerbasamagi=sayi%10;
         rakamlartoplami+= birlerbasamagi;//13+2=15

        sayi/=10;//5

        birlerbasamagi=sayi%10;//5
        rakamlartoplami+=birlerbasamagi;//15+5=20

        sayi/=10;//0

        System.out.println("sayinin rakamlar toplami:" + rakamlartoplami);

    }
}
