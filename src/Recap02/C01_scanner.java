package Recap02;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {


        /*  Problem Tanımı
    Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
    a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

    Örnek Ekran Çıktısı
    a sayısını giriniz: 5
    b sayısını giriniz: 3
    c sayısını giriniz: 1
    sonuç : 5.3333333333


         */

        Scanner scan=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("a sayisini giriniz");


        Scanner scanner = null;
        a=scanner.nextDouble();
        System.out.println("b sayisin giriniz :");
        b=scanner.nextDouble();
        System.out.println("c sayisini giriniz :");
        c=scanner.nextDouble();

        double sonuc= ((a*a)-(b*b)) / (3*c);
        System.out.println("sonuc = " + sonuc);


    }
}
