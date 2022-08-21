package Recap01;

import java.util.Scanner;

public class C06_modulus {

    public static void main(String[] args) {


        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamakli sayi giriniz");

       int num=scan.nextInt();

       int ilkiki=num/1000;
       int soniki=num%100;//10 bolumden kalanını ver

        int ilkikitoplam=(ilkiki/10)+ (ilkiki%10);
        int sonikitoplam=(soniki/10)+  (soniki%10);

        System.out.println("sayilarin toplami  :"  + (ilkikitoplam+sonikitoplam) );
    }
}
