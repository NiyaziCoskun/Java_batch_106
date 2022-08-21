package Day40_finaly;

 final  public class B  extends  A{
    public static void main(String[] args) {

        B obj=new B();
        obj.isim="alp";
        System.out.println(A.okul);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        /*
        Bir  class final olarak belirlenırse o  class ınherit edilemez.
        kimse bu class'dan istifade  edemez.
         */

    }

}
