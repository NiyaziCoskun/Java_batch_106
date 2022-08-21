package Day11_stringmanıpulıtaıon;

public class C02_lastındexof {

    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok kolay kolay  guzel";
        String kelime="kolay";

        //verilen kelimenın asagıdaki sartlardan uygun olanı yazan birprogram yazınız
        // verieln kelime cumlede kullanılmamıs
        // verilen kelime cümlede 1 kere kullanılmıs
        //verilen kelime 1 den fazla kullanılmıs

        int kelimeilkindex=cumle.indexOf(kelime);
        int kelimesonindex=cumle.lastIndexOf(kelime);

        if (kelimeilkindex==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");


        } else if (kelimeilkindex==kelimesonindex) {
            System.out.println("verieln kelime bir kere kullanilmis");


        }else {
            System.out.println("verilen kelime 1 den fazla kullanilmis");

        }
    }
}
