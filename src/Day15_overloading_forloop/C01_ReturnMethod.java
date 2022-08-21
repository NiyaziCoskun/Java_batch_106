package Day15_overloading_forloop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        
        //verilen iki sayiyi carpip sonucu bize dondüren method yapin
        
        
        int sayi1=10;
        int sayi2=5;
        int sonuc=carpgetir(sayi1,sayi2);
        System.out.println("illa da sonucu goreyimdiyenlere:"+sonuc);
    }

    public static int carpgetir(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;
        return sonuc;
    }
}
