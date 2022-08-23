package Lambda_functional_programming01;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(get7den100eToplam());
        System.out.println(" get7den100eToplam02  :" +  get7den100eToplam02());
        System.out.println("get2den11eCarpim : "+ get2den11eCarpım());
        System.out.println(faktoryelHesapla(4));
        System.out.println(verilenİkiSayiArsCiftSayiToplami(11,5));
        System.out.println(ikiSayiArsTumSayilarinRakamlarToplami(13,32));

    }
    //1) 7'den 100'e kadar integer
    // değerlerinin toplamını bulan bir method oluşturun.
    //1.Yol

    public static int get7den100eToplam(){

       return  IntStream.range(7,101).reduce(Math::addExact).getAsInt();
    }
    //2.Yol
    public static int get7den100eToplam02(){

        return  IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }
    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int get2den11eCarpım(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();

    }
    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun.
    // (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)

    public static int faktoryelHesapla(int x){
        if (x>=0){
            return  IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println(" 0 dan buyuk deger giriniz:");
     return 0;

    }
    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static int verilenİkiSayiArsCiftSayiToplami(int x , int y){
        int z =0;
        if (x>y){
            z=x;
            x=y;
            y=z;

        }

        return IntStream.rangeClosed(x,y).filter(Utils::ciftElemaniSec).sum();

    }
    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +
    //  2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int ikiSayiArsTumSayilarinRakamlarToplami(int x, int y){


        int z =0;
        if (x>y){
            z=x;
            x=y;
            y=z;

        }
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplamiAl).sum();

    }


}