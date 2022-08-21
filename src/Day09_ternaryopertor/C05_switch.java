package Day09_ternaryopertor;

import java.util.Scanner;

public class C05_switch {

    public static void main(String[] args) {
        /*kullanıcıdan gün numarasını alıp 1 ise pazartesi..
        7 ise pazar yazdiralım
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunno=scan.nextInt();

        switch (gunno){
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case  7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli gun numarasi giriniz");


                //swıtch yanına yazılan parantez neye göre
                //case atayacagımızı gösterir
                //java girilen degere göre case bulur ve o satırdan çalıştırma  baslar
                //break yazısı görünce veya swıtch parantezine kadar devam eder
            //if else yapısında oldugu gibi hiçbir şarta uymayanları
            //default kullanılır

        }
    }
}
