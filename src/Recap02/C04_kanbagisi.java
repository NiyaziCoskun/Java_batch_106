package Recap02;

import java.util.Scanner;

public class C04_kanbagisi {
    public static void main(String[] args) {


        /*
     Problem tanimi :
       Kullanicidan  yasini ve kilosunu alaliniz
         18 yasindan kucuk ise kan bagisi yapamaz
       18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("kilonuzu giriniz");
        int kilo=scan.nextInt();

        if (yas<0 && yas<18){
            System.out.println("kan bagisi yapamaz");

        } else if (yas>=18) {
            if ( kilo<50){
                System.out.println("kilonuz 50 den kucuk kan bagisi yapamazsiniz");

            } else if (kilo>=50) {
                System.out.println("kan bagisi yapabilirsiniz");


            }else System.out.println("yanlis deger girdiniz");


        }
    }
}
