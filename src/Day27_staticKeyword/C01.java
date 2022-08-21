package Day27_staticKeyword;

public class C01 {


    static  int sayi=10;

    int rakam=5;

    public static void main(String[] args) {

        /*
        clas level da 2 tür variable oluşturabiliriz

        static variable (class)
        instance (obje variable)
        static variablelar tum class dan kullanılabılırken
        ınstance olanlar statıc olmayan methodlardan kullanılabilir
        ınstance varıable lara statıc method tan ulaşmak ıstersek
        obje oluşturmamız gerekir.

        İnstance varıable obje varıable oldugu için herhangı bır satırda instance varıablenın
        degerının ne oldugunu bulmak ıcın obje oluştrulan saturdan ıtıbaren kod ıncelenmelidir
        Statıc varıable class varıable oldugu ıcın herhangı bır satırda statıc varıable nın degerını bulmak ıcın
        clasın basından ıtıbaren kod ıncelenmelidir



         */
       // System.out.println(sayi);
        C01 obj1=new C01();
        System.out.println("obj1 in rakam degeri:" +obj1.rakam);
        System.out.println("obj1 nin sayi degeri :" +sayi);

        obj1.rakam+=1;
        sayi+=1;
        System.out.println("1 artirdiktan sonra rakam degeri:" +obj1.rakam);
        System.out.println("1 artirdiktan sonra sayi degeri :" +sayi);

        C01 obj2=new C01();

        System.out.println("obj2 in rakam degeri :" +obj2.rakam);
        System.out.println("obj2 in rakam degeri :" +obj2.sayi);

        obj2.rakam++;//5 + 1 =6
        obj2.sayi++; // 11 + 1 =12



        System.out.println(" 1 artirdiktan sonra obj2 in rakam degeri :" +obj2.rakam);
        System.out.println(" 1 artirdiktan sonra obj2 in rakam degeri :" +obj2.sayi);



    }

}
