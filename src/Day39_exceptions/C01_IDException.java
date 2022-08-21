package Day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IDException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java'da bilgisayarımızda ki bir dosyaya erişmek
        istiyorsak
        FıleInputStream Clasın'dan yardım alarız.
        Aynı şekilde Java'dan bilgisayarımızda ki bir dosya'ya
        FıleOutoutStream Clasından yardım aliriz
         */
        FileInputStream fis=new FileInputStream("src/Day39_exception/Test.txt");
        /*
        Görüldüğü gibi complie time'da altını kırmızı  çizen her durum
        complie time error değildir.
        Java'da bazi exceptıon'larda complie tıme exceptıon'dir
        Özellikle dosya okuma ve yazma ile ilgili exceptıon'lar
        complie time exceptıon'dur

        Complie time exceptıon oluştugunda java çözüm için iki ihtimal önerir.
        1- try-catch ile çevrelemek
        2-method signatiure'na throws keyword ile beklenen
        exceptıon turunu yazmak

        throws exceptıon, sadece olayın farkında oldugumuzun deklarasyonudur.
        exception'nın handle edilmesinde hiçbir rolü yoktur
        Yani try-catch handle kontrol altına aldıgımız excptın'larda kod çalışmaya
        devam ediyordu
        Ancak throws exceptıon yazdiğimizda java bir exceptıon ile karşılaşirsa
        hiçbir şey yapmamısız gibi hata mesajı yayınlayıp çalışmayı durdurur.
         */

    }
}
