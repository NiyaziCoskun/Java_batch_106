package Day10_stringmanipulation;

public class C05_length {
    public static void main(String[] args) {

        String str1="java ogren, isi kap";

        System.out.println(str1.length());//str'nin karakter sayisini verir

        System.out.println(str1.charAt(str1.length()-1));//son karakteri yazdirin

        System.out.println(str1.charAt(str1.length()-3));


        /*java da null pointer(işaretleyici) bir deger değil,
        karsisina yazildiği veraiable nin hiçbir deger
        almadıgının işaretçisidir


         */

        String str2="";// str2 br deger atanmısmıdır  EVET bu deger hiçlik

        System.out.println(str2.length());//0


      //  String str3= null;//str3 bir  deger atanmıs mıdır HAYIR null bu deger atamamayı işaret eder.

       // System.out.println(str3.length());//bir deger atanmamıs ki hata verir


    }
}
