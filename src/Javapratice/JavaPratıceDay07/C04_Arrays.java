package Javapratice.JavaPratıceDay07;

public class C04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {

        String str="Verilen bir cumledeki bosluklar haric character sayisini bulunuz";
        str=str.replace(" ", "");
        System.out.println("str = " + str);

        System.out.println("str.length:" +str.length());

        String harf []=str.split("");
        System.out.println(harf.length);

         String str1="Verilen bir cumledeki bosluklar haric character sayisini bulunuz";
        String kelime[]=str.split(" ");
        int bosluksayisi= kelime.length-1;
        System.out.println("bosluksayisi = " + bosluksayisi);

        String charcter []=str.split("");
        System.out.println("charcter = " + (charcter.length-bosluksayisi));
    }
}
