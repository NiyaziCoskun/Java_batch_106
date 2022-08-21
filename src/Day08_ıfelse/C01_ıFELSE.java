package Day08_ıfelse;

import java.util.Scanner;

public class C01_ıFELSE {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır gun ismi giriniz");
        String gun= scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")){
            System.out.println("paz");

        } else if (gun.equals("sali")) {
            System.out.println("sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("car");


        } else if (gun.equals("persembe")) {
            System.out.println("per");


        } else if (gun.equals("cuma")) {
            System.out.println("cum");


        } else if (gun.equals("cumartesi")) {
            System.out.println("cmt");


        } else if (gun.equals("pazar")) {
            System.out.println("pzr");




        }else
            System.out.println("lutfen gecerli bir gun giriniz");

    }
}
