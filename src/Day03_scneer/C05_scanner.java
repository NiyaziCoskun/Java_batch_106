package Day03_scneer;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        // kullanıcıdan iki sayı alıp bu sayıların çarpımını yazdıralım
        // 1 adım
        Scanner scan=new Scanner(System.in);

        // adım 2
        System.out.println("lutfen ilk sayiyi girin");

        double sayi1=scan.nextDouble();
        //2. sayi icin 2 ve 3 adımları tekrarlıyoruz

        System.out.println("lutfen ikinci sayiyi girin");

        double sayi2=scan.nextDouble();

        System.out.println(sayi1*sayi2);
    }
}
