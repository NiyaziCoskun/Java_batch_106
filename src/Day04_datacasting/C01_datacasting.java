package Day04_datacasting;

public class C01_datacasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf= (char)(harf+1);
        //kod bu durumda önce sağdaki islemi yapar
        // CHAR YENİHARF = 97+1  =98
        //char bir veriable 98 olamayacagı icin hata verir
        System.out.println(yeniHarf);

        //java eger bu deger atamasında sorun olusacagini datakayiplarin olabilecegi veya datanin baskalacabilecegi gorurse bu durumda otomatik olarak bu atamayi kabul etmez sizden bu sorumlulugu almanizi bekler


        int sayi1=(int)7;
        System.out.println("sayi1: "+ sayi1);//7
        double sayi2=10;
        System.out.println("sayi2 :"+ sayi2); //10.0
        int sayi3='c';
        System.out.println("sayi3:" + sayi3);// 99
        char harf2=98;
        System.out.println("harf2"+ harf2);// b

    }
}
