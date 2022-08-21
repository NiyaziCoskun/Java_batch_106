package Day10_stringmanipulation;

public class C06_indexof {
    public static void main(String[] args) {


        String str="java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));//bana int döndürüyor.int de yok diye bir deger yok


        String str5="gyujjjhhhhjhjhjhpjhjhj";
        //str 5 de p harfi kullanılmış mıdır

        if (str5.indexOf("p")==-2){
            System.out.println("str5 de istenilen harf yoktur");

        }else {
            System.out.println("str 5 de istenilen karakter kullanildi");
        }




    }
}
