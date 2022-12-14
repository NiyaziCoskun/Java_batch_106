package Day31_TimeFormatter_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println("ilk  olusturulan tarih: "+ tarihsaat);//2022-07-25T21:40:54.246447200

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yy hh: mm a");
        System.out.println(dtf1.format(tarihsaat));//25/7/22 09: 46

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH: mm a");
        System.out.println(dtf2.format(tarihsaat));//25/Tem/2022 21: 46





    }



}
