package Day18_WhıleDowhıle;

public class C01_whıleloop {
    public static void main(String[] args) {

        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        char ilkharf='f';
        char sonharf='t';

        char temp=ilkharf;
        String buyult="";


        while (temp<=sonharf) {

            buyult=(temp+"").toUpperCase();
            System.out.println(buyult + " ");
            temp+=1;

        }
    }
}
