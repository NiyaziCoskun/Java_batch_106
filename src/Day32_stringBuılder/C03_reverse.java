package Day32_stringBuılder;

public class C03_reverse {
    public static void main(String[] args) {

        //verilen bır ınputu tersine cevirip bize donduren
        //bır method olusturun.

        String input="hey gidi forloop gunleri";

        String tersinput=tersinecevir(input);

        System.out.println(tersinput);

    }

    public static String tersinecevir(String input) {
        StringBuilder sb=new StringBuilder(input);


        return  sb.reverse().toString();//tersine cevirmek için tostrıng kullandık



    }
}
