package Day04_datacasting;

public class C03_autovading {
    public static void main(String[] args) {
// dar veri türünde ki bir degeri genis veri turundeki veriable olarak otamatik assign eder


       byte sayi1=23;
       short sayi2=55;

       int sayi3= sayi1+sayi2; //78

        double sayi4=sayi1*sayi2;// 1265.0

        sayi4= (double)sayi2/  sayi1;//53.0 / 23 = 2.391
        System.out.println(sayi4);

    }
}
