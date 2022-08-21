package Day08_ıfelse;

import java.util.Scanner;

public class C02_ıfelseIFSTATEMENTS {
    public static void main(String[] args) {

        //kullanıcıdan 100 uzerinden notunu ısteyın.notu harf sistemine
        //cevirip yazdirin.50 den kucukse "d" 50-60 arası "c" 60-80 arası "b "
        //80 nın uzeri A
        //GEÇERSİZ NOT GİRİLDİĞİNDE UYARI VERELİM

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 0'dan 100 e kadar bir not degeri girini");
        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("lutfen gecerli bir not giriniz");
            //bu satıra geldiysek 0 ile 100 arasındadır
        } else if (not<50) {
            System.out.println("notumuz : d");

        } else if (not<60) {
            System.out.println("notumuz: c");


        } else if (not<80) {
            System.out.println("notumuz: b");


        }else {
            System.out.println("notumuz: a");

        }


    }
}
