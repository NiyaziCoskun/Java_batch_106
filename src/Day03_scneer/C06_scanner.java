package Day03_scneer;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {

        /* kullanıcıdan ismini soyismini ve yaşını alıp girilen bilgiler =seyfi capar 34 şeklinde yazdırın

         */
       Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");

        String isim= scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");

        String soyisim=scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");

        int yas=scan.nextInt();


        System.out.println("girilen bilgiler =" + isim + soyisim + yas );



    }
}
