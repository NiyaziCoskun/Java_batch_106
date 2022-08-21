package Day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        //reper class: javan hazır metodları kullanabilmemmiz için
        //primtev data turlerinin her biri için actıgı class

        String str="java ıle hayat ne guzel";

        System.out.println(str.toUpperCase());




        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrno="25687";

        //kullanıcıdan bir şifre isteyin
        //eger şifre sadece rakamlardan oluşuyorsa kabul etmeyelim

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamakli şifre girin");

        String sifre=scan.nextLine();

        Integer sifresayi=Integer.parseInt(sifre);

        System.out.println("girilen sifre:" + sifre);
        System.out.println("ınteger sifre:" + sifresayi);

        //repar claslar ileride kullanabilecegimizfaydalı hazır metod içerir




    }
}
