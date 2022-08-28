package Javapratice.javapraticeday10.Odev;

public class yayinyilirunner {
    public static void main(String[] args) {

        yayinyili yy=new yayinyili();
        System.out.println(yy.toString());

        yayinyili y1=new yayinyili("gulun adi","umberto eco",2000);
        System.out.println(y1);
        yazdir(y1);



    }

    private static void yazdir(yayinyili y1) {
        yayinyili y2=new yayinyili("satranc","stefan zweig",2015);
        System.out.println(y2);


    }
}
