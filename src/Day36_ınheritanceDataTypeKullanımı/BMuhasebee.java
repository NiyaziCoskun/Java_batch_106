package Day36_ınheritanceDataTypeKullanımı;

public class BMuhasebee  extends  APersonelll{

    protected  int saatucreti=10;
    protected  int gunlukmesai=8;


    protected  void  maas(){
        System.out.println("personel minumum :" +(30*gunlukmesai*saatucreti) + " maas alir" );
    }

    protected  void ozelsigorta(){
        System.out.println("isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }

}
