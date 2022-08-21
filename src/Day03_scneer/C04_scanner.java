package Day03_scneer;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {

//      kullanıcıdan ismnini isteyin girilen ismi isminiz; ismail şeklinde yazdırın
        //insanların dünyasında kodlarımızın bulunduğu clasa değer almak icin scanner clasını
        //kullanırız
        // adım 1 scanner objesi yapalım

        Scanner scan=new Scanner(System.in);
         // adım 2 kullanıcıya ne istediğimizi söyleyelim

        System.out.println("lutfen isminizi giriniz");

        // adım 3 oluşturduğumuz scan objesi ile kullanıcın girdiği değeri alıp uygun bır veriable atayalım

        String kullanıcıismi=scan.next();
        System.out.println("isminiz:"+kullanıcıismi);


    }
}
