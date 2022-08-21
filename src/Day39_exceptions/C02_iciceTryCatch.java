package Day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_iciceTryCatch {
    public static void main(String[] args) {
        int k;

        try {
            FileInputStream fis=new FileInputStream("src/Day39_exception/Test.txt");

            while ((k=fis.read()) !=-1){
                System.out.println((char) k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamdi veya bozuk");
        } catch (IOException e) {

            System.out.println("dosyadan bilgiler okunamdi");
        }

    }
}



