package Day35_inheritanceConstructorKullanimi;

public class Child extends BParent {

    String isim="Child isim belirtilmedi";
    protected   String Chıldkulupadi="Chıld kulubu";

    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

        AGrandParent gp1=new AGrandParent();
        //bu objeyi oluşturmak ıcın granpa cons çalışır.
        //parent veya chıld cons calışmaz

        Child chld1=new Child();
        chld1.grandpakulupadi="child";
        chld1.parentkulubu="chid2";
        /*
        chlid objesi için chıld constructor çalıştı

         /*
        Java'da bir class'i kullanabilmek icin o class'dan obje olusturur, dolayisiyla o class'in constructor'ini
        kullanirdik.

        Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin o class'larin constructorlarini otomatik
        calistiran bir yapi kurmustur.

        Ornegin biz child class'inda Child class'indan bir obje olusturmak istedigimizde Child constructor'ini kullaniriz.

        Java Child(){} gordugunde once parent'in constructor'ini calistirmam lazim der. Buradan parent constructor'a gider.
        Parent class'inda Parent(){} gorunce once bunun parent'inin yani Grandparent constructor'inin calismasi gerekir der.
        Boylece extends keyword olmayan class'a kadar gider ve oradan baslayarak tum constructor'lari asagi dogru calistirir.
         */


    }
}
