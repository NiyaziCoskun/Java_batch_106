package Recap02;

public class C05_nestedternary {
    public static void main(String[] args) {

        /*
        Final notu tanimlayin, Nested Ternary ile cozunuz
         'A'  ->  "Gayet Basarili"
       'B'  ->  "Basarili"
      'C'  ->   "Ha gayret"
     bu notlar disindakilere de Digerleri.. yazdiriniz
      */
     char finalnotu='B';

     String result= finalnotu=='A' ? "gayet basarili" : finalnotu=='B' ?
            "basarili" : finalnotu=='C'? "HA GAYRET": "DİĞERLERİ..";
        System.out.println("result =" + result);
    }
}
