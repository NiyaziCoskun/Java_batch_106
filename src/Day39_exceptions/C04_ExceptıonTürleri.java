package Day39_exceptions;

public class C04_ExceptıonTürleri {
    public static void main(String[] args) throws InterruptedException {

        String str;

        /*
        System.out.println(str); deger ataması yapmadan bır varıable kullanmaya
        çalışırsanız java  comple time bunu  farkeder ve size izin vermez


         */
        str=null;
        //System.out.println(str.length());

        Object obj="Java Java Java";
        Integer  sayi= (Integer) obj;//classcastexceptıon
        Thread.sleep(5000);

    }
}
