package Day10_stringmanipulation;

import java.util.Locale;

public class C02_tolowercase {
    public static void main(String[] args) {


        String str="benı psıkopata baglamayın";

        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }//eger buyuk kucuk harf dönüşümünde local bir dil kullanılır

}
