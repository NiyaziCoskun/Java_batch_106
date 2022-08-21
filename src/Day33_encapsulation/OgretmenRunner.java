package Day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("tulay");
        System.out.println(ogr1.getIsim());
        /*
        Bu YÖNTEM DE DATA HİDİNG DEĞİL DAHA ANLAŞILIR
        BİR KOD AMACLANMIS OLUR
         */
    }
}
