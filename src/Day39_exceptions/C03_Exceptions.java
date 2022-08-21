package Day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str="123a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("yazdiginiz deger sadece rakamlardan olusmalidir");
        }
         catch (Exception e) {
             System.out.println("ongurelemeyen bir hata olustu");
         }


        System.out.println("sayinin karesi :" +sayi*sayi);
        /*
        kullanıcıdan strıng olarak bır deger alıyor ve bunu
        int ceviriyorsak numberformatexceptıon ile karşılacabilecegimizi
        öngörürürz.
        nfe aldıgımızda kodun durmamamsını istiyorsak try-catch cevreleyebiliriz
        Eger bilmediğim bir exceptıon daha oluşursa kodum durmasın istiyorsak bi kere daha catch cümlesi
        ekleyip ona en geniş exceptıon yazabiliriz.

         */
    }
}
