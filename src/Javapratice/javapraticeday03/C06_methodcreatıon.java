package Javapratice.javapraticeday03;

import java.util.Scanner;

public class C06_methodcreatıon {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine().toLowerCase();

        System.out.println(xyzvarmi(str));
    }

    private static boolean xyzvarmi(String str) {
     if (str.contains("xyz")){
         return true;
     }else
         return false;

    }
}
