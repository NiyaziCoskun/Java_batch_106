package Recap01;

public class C03_ıfStatement {
    public static void main(String[] args) {

        /*
       not hesaplayici
        A => 90 ~100
        B => 80 ~ 89
         C => 70 ~ 79
         D => 60 ~ 69
          F =>  0 ~ 59
       */

        int not=65;

        if (not>=90 && not<=100){
            System.out.println("A");
        } else if (not>=80 && not<=89) {
            System.out.println("B");


        } else if (not>=70 && not<=79) {
            System.out.println("C");


        } else if (not>=60 && not<=69) {
            System.out.println("D");


        } else if (not>=0 && not<=59) {
            System.out.println("F");


        }else {
            System.out.println("LUTFEN GECERLİ NOT GİRİNİZ");

        }
    }
}
