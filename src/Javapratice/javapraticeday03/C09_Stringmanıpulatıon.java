package Javapratice.javapraticeday03;

import java.util.Scanner;

public class C09_Stringmanıpulatıon {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soy isminizi girini:\n isim");
        String isim=scan.next();
        System.out.println("soy isim");
        String soyisim=scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden uzundur");

        } else if (isim.length()==soyisim.length()) {
            System.out.println("isminiz soy isminiz ile aynı uzunlukta");


        }else System.out.println("soyisminiz isminizden uzun");
    }
}
