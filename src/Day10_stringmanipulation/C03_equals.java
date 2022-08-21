package Day10_stringmanipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1= "Ali Can";
        String str2= "Ali CAN";
        String str3="Ali Can" + "";
        String str4="Ali Can";
        String str5= new String(   "Ali Can");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));

        System.out.println(str1.equals(str4));
        System.out.println(str3==str5);
        //stringlerde == her zaman aynı string olsa bile ==her zaman çalısmaz
        //emin olmak icin equlas kullnmalısınız
        //equals dikkat etmemiz gereken şey 1'e bir aynı olamalı

    }
}
