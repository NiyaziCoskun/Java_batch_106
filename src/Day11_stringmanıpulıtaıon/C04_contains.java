package Day11_stringmanıpulıtaıon;

public class C04_contains {
    public static void main(String[] args) {

        /*Soru 2) Kullanicidan bir cumle isteyin.
         Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
          “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
           iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */

        String cumle="Java buyuk, dunya kucuk";
        //requremens de buyuk kucuk harf hassasiyeti hakkında birsey söylenmdei
        //ikinci olarak her iki kelimeyi içerme durumu acıklanmamıs
        //bu durumda görevi bize kim verdiyse ona sormak lazım
        //ek requırements ikisinide içeriyorsa  karar ver buyk mu kucuk mu yazdirsin
        //case sensitive olmasın
        cumle=cumle.toLowerCase();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());


        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        } else if (cumle.contains("kucuk")&& cumle.contains("buyuk")) {
            System.out.println("karar ver buyuk mu kucuk mu");


        }else {
            System.out.println("cumle kucuk yada buyuk  kelimesi icermiyor");
        }


    }
}
