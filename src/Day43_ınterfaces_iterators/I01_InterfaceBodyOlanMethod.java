package Day43_ınterfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {
    void  motor ();
    public  void  yakit ();
    public  abstract String aku();
    /*
    Normal bir class da oldugumuzu düşünürsek
    2 tane acces modifier kullanma ihtimali OLAMAZ.

     asagıda ki method'da göreceginiz  gibi interface'de istisnai
     olarak body'si olan methodlar oluşurulabilir.
     Bu özellik java 8 'den sonra bır ınterface yeni bir method eklememiz
     gerektiğinde eskiden beri bu ınterface implement eden tum class'lara
     gidip yeni eklenen method'u override etmemiz gerekirdi.

     Bu özellik sayesinde başına veya default veya static keyword ekleyerek
     ınterface'de yenı ve body'si olan bir method oluşturursak bu method'un chıld clas'lar tarafından
     override edilme MCBIRIYETI OLMAZ.
     Ve eskiden implement etmiş class'ları değiştirmemiz gerekmez.
     Bu istisnaı durumdur ve ınterface için oluşturulan
     genel kuralları bozmaz.
     Bu  method'ların body'si olsa da bunlara concrete method denmez
     ama override edilme mecburiyetleri yoktur.
     Burada ki default kelimesi acces modifier değil istisnai durumun belirtilmesi içindir.

     O zaman niçin 2 keyword (static ve deault) tanımlanmıştır.
     Bu ıkı farklı kelimenın amaci chıld class'lardan bu method'a nasıl erişilebilicegıni
     belirlemek içindir.
     Static keyword kullanılırsa, chıld class'lardan bu method'a erişmek için
     ınterfaceadi. method adı yeterli olur.
     Deault keyword kullanılırsa method'a erişmek için obje oluştulmalıdır.




     */

    public  default void teker (){
        System.out.println(" default tum arabalarin tekeri vardir");


    }
    public  static  void  direksiyon(){
        System.out.println(" static tum arabalarin direksiyonu vardir");

    }
}
