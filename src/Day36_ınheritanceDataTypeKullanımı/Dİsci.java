package Day36_ınheritanceDataTypeKullanımı;


public class Dİsci  extends BMuhasebee {


      protected   int saatucreti=11;
      protected   int gunlukmesai=7;

        protected void maasisci(){
            System.out.println("isciler : "+ (30*saatucreti*gunlukmesai)+ " maas alir");
        }

        protected void ozelsigortaisci(){
            System.out.println("isciler %60 indirimli ozel sigorta yaptirabilir");

        }

    public static void main(String[] args) {
            /*
            bır obje oluşturulurken data turu ve cons.
            aynı class'dan ıse direk o classa gidiyoruz

            Eger data türü ve constructor farklı ise öncelikle
            data türünün oldugu clasa gideriz.
            Obje constructor oldugu clasın objesidir
            ancak  bızden istenen isçi clasında ki spesifik
            özelilikler değil bir işçinin muhasebe clasındaki tum
            çalışanlarla beraber sahip oldugu genel özeliklerini
            yazdirir.


             */
       BMuhasebee isc1=new Dİsci();
        System.out.println(isc1.gunlukmesai);// M 8
        System.out.println(isc1.saatucreti);// M  10
        isc1.maas();//MUHASEBE
        isc1.ozelsigorta();//MUHASEBE
        isc1.sigorta();//PERSONEL
        System.out.println(isc1.isim);//PERSONEL
        System.out.println(isc1.soyisim);//PERSONEL
        System.out.println(isc1.departman);//PERSONEL


        APersonelll isc2=new Dİsci();
       // System.out.println(isc2.gunlukmesai);// M 8
      //  System.out.println(isc2.saatucreti);// M  10
        isc2.maas();//MUHASEBE
     //   isc2.ozelsigorta();//MUHASEBE
        isc2.sigorta();//PERSONEL
        System.out.println(isc2.isim);//PERSONEL
        System.out.println(isc2.soyisim);//PERSONEL
        System.out.println(isc2.departman);//PERSONEL
        /*
        eger data türü olan class'da aradığımız özellik yoksa
        varsa onun  parent'na gidebilir ama chıld'e dönüş olmaz
        aradığı özelliği bulamazsa cte verir
         */

        /*
        List<String> list1=new LinkList<>();
        Deque<String> list2=new LinkList<>();
        Queue<String> list3=new LinkList<>();

        hepsi linklist olsa da list1 list gibi davranırır
        list2 deque gibi davranir
        list3 queue gibi davranir
         */


    }

    }
