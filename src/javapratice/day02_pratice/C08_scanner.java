package javapratice.day02_pratice;

import java.util.Scanner;

public class C08_scanner {
    public static void main(String[] args) {

        //kullanıcıdan iki tam sayi alın bunların toplmanı yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1=scan.nextInt();

        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        System.out.println(sayi1+sayi2 );
    }
}
