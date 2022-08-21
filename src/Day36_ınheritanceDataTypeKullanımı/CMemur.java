package Day36_ınheritanceDataTypeKullanımı;

public class CMemur extends  BMuhasebee {

    int saatucreti=12;
    int gunlukmesai=9;

    protected void maas(){
        System.out.println("memurlar : "+ (30*saatucreti*gunlukmesai)+ " maas alir");
    }

    protected void ozelsigorta(){
        System.out.println("memurlar %60 indirimli ozel sigorta yaptirabilir");

    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukmesai);//9
        System.out.println(mmr1.saatucreti);//12
        mmr1.maas();
        mmr1.ozelsigorta();
        mmr1.sigorta();//personel
        System.out.println(mmr1.isim);//personel
        System.out.println(mmr1.soyisim);//personel
        System.out.println(mmr1.departman);//personel

        BMuhasebee mhsb1=new BMuhasebee();

        System.out.println(mhsb1.gunlukmesai);//8
        System.out.println(mhsb1.saatucreti);//10
        mhsb1.maas();//muhasebe
        mhsb1.ozelsigorta();//muhasebe
        mhsb1.sigorta();//personel
        System.out.println(mhsb1.isim);//personel
        System.out.println(mhsb1.soyisim);//personel
        System.out.println(mhsb1.departman);//personel


        /*
        her ne kadar memur clasının içinde olsam da
        oluşturduğum obje muhasebe clasından
        çünkü data türü ve constructor muhasebe.

          String str="Murat";
        ArrayList<Integer>list=new ArrayList<>();
        Integer sayi=20;
        Bmuhasebe clasıda obje oluşturabılen bir class ve aynı zamnada
        bir data türüdür.




         */








    }


}
