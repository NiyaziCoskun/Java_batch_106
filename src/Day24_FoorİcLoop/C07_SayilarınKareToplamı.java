package Day24_FoorİcLoop;

public class C07_SayilarınKareToplamı {
    public static void main(String[] args) {

        /*
        Soru 2:
Bir integer list olusturunuz ve bu
 list’deki tum sayilarin karesinin toplamini For-each loop kullanarak bulunuz.
 Sonucu ekrana yazdiriniz.
         */
        int [] sayilar={3,5,5,6,5,8,7,9,1,5,2};
        
        int toplam=0;

        for (int each: sayilar

             ) {
            toplam+=each*each;

        }
        System.out.println("kareler toplami: "+toplam);
    }
}
