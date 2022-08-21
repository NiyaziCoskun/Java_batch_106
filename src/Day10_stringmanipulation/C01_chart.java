package Day10_stringmanipulation;

public class C01_chart {
    public static void main(String[] args) {

        String str="java ögrenmek ne guzel";
        System.out.println(str.charAt(0));//ilk harfi verir


        System.out.println(str.toUpperCase().charAt(7));

        System.out.println(str.charAt(21));//l


       // System.out.println(str.charAt(22));//senin verdiğin index sınırların dışında

        //son harfi bulmak icin str uzunlugunun 1 eksiğini gireriz
    }     //chart metodu kullandığımızda sonuc char olacagı icin manipulatıon yapamayız

}