package Day30_ımmutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih);

        System.out.println(tarih.getDayOfYear());//204

        System.out.println(tarih.getDayOfWeek());//SATURDAY

        System.out.println(tarih.getMonthValue());//7

        System.out.println(tarih.isLeapYear());//false

        LocalDate tarih2=LocalDate.of(2001,5,15);
        System.out.println(tarih2);//2001-05-15

        LocalDate tarih3=LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));

        System.out.println(tarih.minusWeeks(20));

        System.out.println(tarih.minusDays(100).minusMonths(5));

        System.out.println(tarih.isAfter(tarih2));

        //iki farklı doğum günü girildiğinde hangısının daha buyuk
        //olduguunu bulunuz


        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + "tarihinde doğan daha buyuk");



        } else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else{
            System.out.println("iki tarih birbiri ile ayni");
        }







    }
}
