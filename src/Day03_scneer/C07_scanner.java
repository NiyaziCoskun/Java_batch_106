package Day03_scneer;

import java.util.Scanner;

public class C07_scanner {
    public static void main(String[] args) {
        //bir önceki soruyu tek seferde kullanıcıdan tüm bilgileri alarak yapınız

       Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminzi, soyismnizi ve yasinizi giriniz  \naralarda Enter tusuna basiniz");

        String isim=scan.nextLine();

        String soyisim=scan.nextLine();

        int yas=scan.nextInt();

        //girilen bilgiler =seyfi capar 34

        System.out.println("girilen bilgiler=" +isim+", "+soyisim+", "+yas);
    }
}
