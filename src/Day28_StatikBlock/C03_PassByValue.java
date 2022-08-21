package Day28_StatikBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indirimli fiyatı  hesaplayıp bize döndüren bır  method
        oluşturun

         */

        double satisfiyati=100;

        double indirmlifiyat=indirimlifiyathesapla(satisfiyati);
        System.out.println("indirmli fiyat:" +indirmlifiyat);
    }

    public static double indirimlifiyathesapla(double satisfiyati) {

        double indirimlifiyat=satisfiyati*0.75;

        return indirimlifiyat;
    }
}
