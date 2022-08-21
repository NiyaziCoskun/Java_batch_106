package Day40_finaly;

   public class A {
   protected String isim="cuneyt";
      final  static  String okul="yildiz koleji";
      /*
      Bir variable final olarak tanımlandiysa başka class'lardan
      veya içinde oldugumuz class'lardan bu varıable'a başka variable
      atanması umumkun değildir.
      Madem ki degeri değişirelemiyor genelde
      statıc de yaparak bu varıable'a erişim kolaylaştırılabilir.
       ve genelde statıc fınal olarak belirlenen Variable isimleri
       buyuk harfle yazılir
       */
   final  void finalmethod(){
      System.out.println("final methodlar override edilemez");
      /*
      bir methodu finalolarak işaretlersenız bu method değişitirelemez  demektir.
      override edilemez yani
       */
   }

}
