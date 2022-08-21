package Day34_ınheritance;

public class Isci extends Personel{
    /*
    Normal hayatımızda parent cocuk sahibi olmaya karar verebilir.
    Java'da ise chıld class'lar ozelliklerını Inherıt etmek istedikleri classı kendilerine
    parent edinirler.
    mesela işçi clasının oluşturunca nelere ihtiyacı var diye düşünsek
    personel clasında kı tum varıable ve methodlara ıhtıyacı oldugunu
    görebilriz.
    bu durumda yenıden o varıable ve methodları oluşturmak yerine personel clasını kendımıze parent
    ediniriz.
    Bir classı parent edınmek ıçın extans keyord kullanmalıyız.
    Bir class başak bir classı paretn edindiğinde
    1- parent class dakı tum ozelliklere sahıp olur
    2- paretn clasdakı ozeliklerden bazılarını kendıne uyarlayabılır
    3-parent clasda olmayan bazı yenı ozelikler oluşturabılır.
    not: parent class dakı ozeliklerden hiçbirini reddetemez ama değiştirebilir.


     */

    int persNo=1001;
    public static void main(String[] args) {

        Isci isci1=new Isci();
        System.out.println(isci1.isim);//
        //kendi clasımızda isim varıable yok onun  için parent gidiyoruz

        isci1.isim="selim";
        System.out.println(isci1.persNo);

        isci1.maas();//ısciler minumum 15 euro saat ucreti alirlar


    }
    public void maas(){
        System.out.println("ısciler minumum 15 euro saat ucreti alirlar");

    }
    public  void  ozelsigorta(){
        System.out.println("ıscilerden isteyene %50 indirim  ozel sigorta yapilir");
    }


}
