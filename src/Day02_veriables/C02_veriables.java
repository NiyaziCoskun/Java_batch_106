package Day02_veriables;

public class C02_veriables {
    public static void main(String[] args) {
//kısım 1
        int  sayi=10;
        boolean güzelmi=true;
        char sayim='3';
        System.out.println(sayi);  // 10
        System.out.println("sayi"); // sayi
        System.out.println("sayi  :" + sayi  ); // sayi: 10
//kısım 2
        String isim= "yahya";
        String soyisim= "yazıcı";
        System.out.println("isim   +  soyisim");
        //kısım 3

        int gelir=1000;
        short gider=550;
        long toplam=(gelir-gider);
        System.out.println(toplam);
        //kısım 4
        short formasayısı =50;
        double formafiyatı=80;
        System.out.println(formasayısı+formafiyatı);
        //kısım 5
        char stadkapasitesi=5000;
        char stadgelenkisi=4500;
        System.out.println(stadkapasitesi+stadgelenkisi);
        //kısım 6
        long okulgünü=7;
        char okulagelmediğigün=3;
        System.out.println(okulgünü+okulagelmediğigün);
    }
}
