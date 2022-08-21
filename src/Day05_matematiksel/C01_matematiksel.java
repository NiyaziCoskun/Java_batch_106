package Day05_matematiksel;

public class C01_matematiksel {
    public static void main(String[] args) {

        int sayi1=10;

        int sayi2=sayi1+1;
        sayi2=+5;


        // pre veya post icrement sadece artı ve eksi eksi islemi icin gecerlidir
        // bu iki islem sayidan sonra veya önce yazilmasina göre iki isleyis olur
//eger ++ veya -- veriabledan önce ise buna pre increment denir
        // budurumda o satırdan yapılan iki işlemden öncelikli olan artirmaveya eksiltme
        //++ veya -- veriabledan sonra ise post incerement denir bu durumda o satırda yapılan iki işlemden artıirma veya azaltma sonuncudur



        int sayi3= sayi2++;// sayi 2 bir artiririlacak
        // sayi2 degeri sayi3 atanacak

        System.out.println("sayi3:" + sayi3);//17
        System.out.println("sayi2:" + sayi2);//17

        int sayi4= ++sayi1;

        System.out.println("sayi4:" + sayi4);//11
        System.out.println("sayi1:" + sayi1);//11


    }
}
