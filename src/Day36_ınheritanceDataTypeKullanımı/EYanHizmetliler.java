package Day36_ınheritanceDataTypeKullanımı;

public class EYanHizmetliler extends  BMuhasebee{
    protected int saatucreti = 9;
    protected int gunlukmesai = 8;

    protected void maas() {
        System.out.println("yan hizmetliler : " + (30 * saatucreti * gunlukmesai) + " maas alir");
    }

    protected void issizliksigorta() {
        System.out.println("yan hizmetliler %30 indirimli issizlik sigorta yaptirabilir");

    }

    public static void main(String[] args) {
        /*
     overriding chıld class'daki bir method'un parent class'daki
     aynı isimde ki methodu etkisiz hale getirerek kendisinin
     spesifik özelliğini ortaya çıkarmasıdır.

     overriding'i  nerede dikkate aliyoruz?
    - bir obje oluşturulurken data turu vee cons. farkli ise
     -eger bir obje oluşturulurken data turu ve cons. farklı ise
     obje nın özelliklerini belirlerken 3 konuya dikkat çekmeliyiz
     1) obje constructor'un oldugu class'da oluşur
     2)obje'nın özelliklerini aramaya nereden başlarız data turunun oldugu class'dan
     başlarız bu class da aranan özellik bukunumazsa parent classlara bakılır orada
     bulamazsak  cte verir
     eger  aranan özellik varıable ise buldugumuz ilk degeri yazdirir

     3) aranan özellik method ise değeri yazdirmadan önce
     overriding edilmiş diye kontrol etmemız gerekir.
     eger overriding edilmiş ise en güncel değeri yazdiririz.

         */
        BMuhasebee yh1=new EYanHizmetliler();
        System.out.println(yh1.gunlukmesai);//muhasebe 8
        System.out.println(yh1.saatucreti);//muhasebe 10
        yh1.maas();// yan hizmetliler
        yh1.ozelsigorta();// muhasebe
        yh1.sigorta();//personel
        System.out.println(yh1.isim);//PERSONEL
        System.out.println(yh1.soyisim);//PERSONEL
        System.out.println(yh1.departman);//PERSONEL
        //System.out.println(yh1.issililsigortasi);
        // aramaya muhasebe'den başladiğimizdan işşizlik sigortasi bulamadık CTE









    }
}