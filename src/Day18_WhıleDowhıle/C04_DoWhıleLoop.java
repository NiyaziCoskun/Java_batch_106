package Day18_WhıleDowhıle;

import java.util.Scanner;

public class C04_DoWhıleLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan tam sayılar alın
        kullancı çift sayi girdiği müddetce
        sayıları yazdirin
        tek sayi girerse işlemi bitirin

         */
        // whıle ile
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        while (sayi%2==0){
            //loop larda kullanacagımız veriable yi loop tan once oluşturmaliyız
            //whıle loop  loop dan önce oluşturdugumuz bu veriableya atayacagımız değeri iyi düşünmemiz gerekiyor
            System.out.println("lutfen bir sayi giriniz");
            sayi =scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi cift:" + sayi);
            }else {
                System.out.println("girilen sayi tek benden bu kadar");
            }
        }

        //do whıle ıle yapalım;
        //do whıle loop da önceden oluştırulan veriable hangi değer atandığının hıc bır  önemi yok kod herturlu calışır


        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi =scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi cift:" + sayi);
            }else {
                System.out.println("girilen sayi tek benden bu kadar");
            }

            //do whıle dezavatajı :
            //lk calısma kontrol yapılmadan olduguiçin
            //loopun body sine yanlış bir işlem yapılmamasına dikkat etmek gerekir



        }while (sayi%2==0);
    }
}
