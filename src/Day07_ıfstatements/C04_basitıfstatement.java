package Day07_ıfstatements;

import java.util.Scanner;

public class C04_basitıfstatement {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String girilengun = scan.next().toLowerCase();

        if (girilengun.equals("pazar") || girilengun.equals("cumartesi")) {

            System.out.println("girilen gün HAFTASONU");
        }

        if (girilengun.equals("pazartesi") || girilengun.equals("sali")
                || girilengun.equals("carsamba") || girilengun.equals("persembe")
                || girilengun.equals("cuma")) {

            System.out.println("girilen gün HAFTAİCİ");
        }

        if (!(girilengun.equals("pazartesi") || girilengun.equals("sali")
                || girilengun.equals("carsamba") || girilengun.equals("persembe")
                || girilengun.equals("cuma") || girilengun.equals("cumartesi")||
                girilengun.equals("pazar"))){


            System.out.println("lutfen gecerli bir gün ismi giriniz");
        }

    }
}


























