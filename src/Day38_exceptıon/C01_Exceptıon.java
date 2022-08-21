package Day38_exceptıon;

public class C01_Exceptıon {
    public static void main(String[] args) {
        /*
        bir sorun ile karşılaşmayı beklediğiniz noktalarda
        if else ile sorunu yakalayıp onunla ilgili çözüm üretebilirsiniz
         Ama java sorunu her zaman ıf-else çözemeyecegimizden
         java  try-catch blokları olşturmuşdur

         */
       int a=1000;
       int b=50;

       int sayac=1;
      while (sayac<100){
          if (b==0){
              System.out.println("islem yapilirkeb payda 0 oldu  dikkat etmelisiniz");
          }else
              System.out.println(a/b);
          b--;
          sayac++;
      }





    }
}
