package Day33_encapsulation;

public class Tasit {

     private String tasitturu;
     private boolean muayenesivarmi;
      private  int yil;

    public String getTasitturu() {
        return tasitturu;
        //getter methodu da tek bir satırlık işlem yapıyor
        //başka clasların private oldugu ıcın erişemediği
        //tasit turu bilgisini class  içinden
        //istenen farkli classlar return ediyor.

    }

    public void setTasitturu(String tasitturu) {
        this.tasitturu = tasitturu;
    }

    //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir satırlık islemde bizim gönderdiğimiz
    // parametreyi instence variable a atıyor.

    public boolean isMuayenesivarmi() {
        return muayenesivarmi;
    }
    //boolean varıable için oluşturulan getter methodların ismi
    //isVarıable ismi şeklinde olur.

    public void setMuayenesivarmi(boolean muayenesivarmi) {
        this.muayenesivarmi = muayenesivarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
