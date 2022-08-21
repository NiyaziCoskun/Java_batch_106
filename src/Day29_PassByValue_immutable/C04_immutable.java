package Day29_PassByValue_immutable;

public class C04_immutable {
    public static void main(String[] args) {

        /*
        ımmutable : değiştirelemez
        mutable   : degiştirilebilir

        en meshur ımmutable class : Strıng

        java da string gibi metın ifadelerde kullanabilecegimiz
        mutable strıngbuılder classı da vardır


         */

        String str="yildiz bank";
        System.out.println(str.toUpperCase());
        str.toLowerCase();
        System.out.println(str);

        str.substring(3,5);
        System.out.println(str);
        // Java'da String gibi metin ifadelerde kullanabilecegimiz
       // mutable StringBuilder class'i da vardir


        StringBuilder SB=new StringBuilder("java bank");
        System.out.println(SB);//java bank

        SB.reverse();
        System.out.println(SB);

        SB.append(".");
        System.out.println(SB);




    }
}
