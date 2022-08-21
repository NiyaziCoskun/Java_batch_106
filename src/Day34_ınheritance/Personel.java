package Day34_ınheritance;

public class Personel {
    /*
    Eger  parent class olacak şekilde tasarladıgıız
    bir class varsa veya ileride bu class'i parent yapmak isteyenler
    olabiliro zaman varıable ve methodların acces modifier'ını protected
     */

     protected int persNo;
     protected String isim="isim belirtilmedi";
     protected String departman="depertman belirtilmedi";

    protected void maas(){
        System.out.println("tum personelin maasi vardir");

    }
    protected void mesai(){
        System.out.println("tum personel statusune gore mesai yapar");

    }
    protected void fazlamesaiucretı(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");

    }


}
