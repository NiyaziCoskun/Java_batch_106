package Day30_ımmutable_date;

import java.time.LocalTime;

public class C04_LocalTıme {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time=LocalTime.now();
        System.out.println(time);//19:12:35.632373600

        Thread.sleep(3000);
        time=LocalTime.now();
        System.out.println(time);

        System.out.println(time);//19:13:56.607433
        System.out.println(time.getSecond());//49
        System.out.println(time.plusSeconds(10000));//22:18:29.352679100
        System.out.println(time.minusMinutes(200));//16:13:54.245466600
        System.out.println(time.withHour(3));//saati 3 yaparak yazdirdi




        /*
        bizim olusturdugumuz date ve tıme canlı saat veya tarih
        değildir
        localtıme.now  kullandıgımız satırda o ankı  tarih veya saatı alıp
        bizim variable mıza store eder
        tıme varıable'nın değeri sabittirrr


         */


    }
}
