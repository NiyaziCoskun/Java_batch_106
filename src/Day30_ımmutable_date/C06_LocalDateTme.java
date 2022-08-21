package Day30_ımmutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTme {
    public static void main(String[] args) {

        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println(tarihsaat);//2022-07-23T19:40:09.528137600

        System.out.println(tarihsaat.plusMonths(3).plusHours(100));//2022-10-27T23:42:17.038640600

        System.out.println(tarihsaat.minusDays(100).plusHours(100));//2022-04-18T23:43:20.084675800

        System.out.println(tarihsaat.toLocalDate());//2022-07-23




    }

}
