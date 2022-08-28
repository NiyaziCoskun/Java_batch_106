package Javapratice.javapraticeday03;

import java.util.Scanner;

public class C04_Stringmanıpulatıon {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
       //yukardaki ornekte verilen ilk ve ikinci
      // degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine();

        if (str.length()>=3){
            System.out.println(str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2) );
        }else System.out.println(str);
        }



    }

