package Day42_abstrcatClass_Interface;

public interface I02_Interfaces {
    int SAYI=30;
    String ISIM="yildiz koleji";
    /*
    Interface bir class değildir
    Absatract class'lar java'da abstraction soyutlaştırma yani kural koyma
    işlerini yapıyordu ancak abstract bir class'da abstract olmayan methodlarda olabilir.
    bu da  full abstraction yapmaya izin vermez.
    Eger java'da  içinde hiç concrete method olmasın dediğimiz
    bir class oluşturmak istiyorsanız bunu class değil ınterface yapmalisiniz

    1-Interface'lerde concrete method  olmaz.
    2- ınterfce full abstractıon yaptıgından ınterface'lerden obje
    oluşturulamaz.
    hatirladgınız gibi ınterface olan list'den direk obje oluştıramiyoruz
    List<>String liste=new List<>();
    Bunun yerine constructor list'in  chıld olan arraylist'den seciyoruz
    3- Class'larda bir chıld birden fazla parent  edinemez.
    4-Anca ınterface'lerde concrete method olmadıgından biz her methodu
    chıld class'da override etmek zorundayız
    Override  ederken kimin söylediğini override ettiğimizden
    4- Interface'ler neyin yapılması gerektiğini söyler ama nasıl yapılacagına karışmaz.


     */

}
