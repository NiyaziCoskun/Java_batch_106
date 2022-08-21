package Day38_exceptıon;

public class C02_Exception {
    public static void main(String[] args) {

        int a=1000;
        int b=50;

        int sayac=1;
        while (sayac<100){
            /*
            try blogu yapmaya çalıştıgımız ama risk oldugnu
            düşündğümüz işlemleri yazmak için kullanılır

            catch'den sonra ki parentez karşılaşmayı beklediğimiz
            exceptıon  türünü java'ya söylemek için kullanılır.
            catch blogu : Java'ya söylediğimiz exceptıon (istisna) gerçekleşirse
            java'nın yapmasını istediğimiz işlem

            CATCH : blogu 'nun öünnde ki parenteze karşılaşmayı belediğimiz exceptıon yazabilir
            veya her türlü exceptıon'da devreye girmesini istiyorsak
            tüm exceptıon'ların parent'i olan exceptıon yazabiliriz.


             */


            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu dikkatli ol");

            }



            b--;
            sayac++;
        }
    }

}
