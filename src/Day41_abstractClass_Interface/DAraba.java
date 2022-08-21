package Day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        //abstract class'da maın method  opsiyonel'dir.
        //Eger abstract class sadece chıld class'ların taşımak zorunda oldugu
        //özeliklleri belirlemek için oluşturulduysa maın methoda ihtiyaç olmaz
        //sadece abstract methodlar olur.
        //ama bir abstrcat meyhod'da  standart belirlemek dışında method'lar çalışabilir
        //bu durumda ihtiyaç olursa maın method oluşturulabilir


    }
    protected  abstract  void  yakit();
    protected  abstract void  kaporta();
   protected   abstract void  motor();
    /*
    Sadece chıld class'ların mecburi taşıyacakları özellikleri belirleyen
    method'lar abstract methodolur ve abstract method'ların body'si olmaz.
     */
    public void klima(){
        System.out.println("bazi arabalarda klima olabilir");
        /*
        Abstract olmayan method'lara concrete method denir.
        abstract bir methodu abstract keyword ile belirtmek zorunludur.
        concrete method'larda bunun  deklare edilmesine gerek yoktur
        biz sadece abstracıon ile ilgili  konuştugumuzda abstract olmayan
        method'lardan bahsetmek için concrete tabirini kullanırız
         */
    }



}
