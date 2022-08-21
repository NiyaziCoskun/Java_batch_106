package Day03_scneer;

import java.util.Scanner;

public class C08_scannerilkHarf {

    public static void main(String[] args) {

        //kullanıcıdan ismini alip, ilk harf büyük olarak yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");

        /* Java scanner clasında next char methodu yoktur bunun yerinde string olarak ilk kelimeyi alıp onunda ilk harfini alırız

         */
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        System.out.println("ismin ilk harfi :" + ilkHarf);
    }

    }


