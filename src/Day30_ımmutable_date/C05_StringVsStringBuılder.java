package Day30_ımmutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuılder {
    public static void main(String[] args) {

        /*
        string mi yoksa strıngbuılder mı daha hızlıdir
        bunun ıcın bır strıng oluşturup
        1000 kere sonunda ekleyelım
        oncesıne ve sonrasına zamanı alıp aradakı farkı bulalım

        aynı  işlemı strıng buılder içinde yapalım


         */
        LocalTime baslangic=LocalTime.now();
        String str="Ahhhh Java";
        for (int i = 0; i <1000 ; i++) {
            str+=".";

        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println( "string zaman :"+ (bitis.getNano()-baslangic.getNano()));

    }
}
