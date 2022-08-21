package Day32_stringBuılder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("java");
        StringBuilder sb2=new StringBuilder("java");
        String str="java";

        System.out.println(sb1.equals(sb2));//false

        System.out.println(sb1.equals(sb1));
        //strıngbuılder da equals  methodu ancak aynı obje olursa true döner
        //strıng deki gibi düşünmemek lazım
        System.out.println(sb1.equals(str));//false

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("jave");
        System.out.println(sb1.compareTo(sb3));//-4
        /*
        comporto iki strıngbuılder  baştan başlayarak harf harf
        karşılaştırır ilk harfler aynı ise ikinciler ikincler aynı ise üçüncülere
        ilk farklı harfe kadar gider farklı olanı buldugu anda aralarında ascıı kodları
        arasındakı farkı verır.
        eger hiç farklı harf yoksa sonuc 0 döndürür.

         */



    }
}
