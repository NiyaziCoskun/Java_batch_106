package Javapratice.day02_pratice;

public class C06_averge {
    public static void main(String[] args) {


          /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
        bu double sayilarin ortalamasini bulunuz
     */

            double num1 = 23.4;
            double num2 = 24.0;
            double num3 = 12;
            double num4 = 450.3;
            double num5 = 23000;
            double toplam = num1 + num2 + num3 + num4 + num5;
            double ortalama = toplam/5;
            System.out.println("ortalama = " + ortalama);
    }

    public static class Q05_EscapeSequences {
        public static void main(String[] args) {


            System.out.println("\"Hello\", \"Word \\   //\""  );

            //pazartesi kelimesini her harfini ayrı bir satıra gelecek sekilde yazın

            System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");

            //java ile hayat cok afilli yazdirın

            System.out.println("\"JAVA\" ile hayat cok\'afilli\'" );

            //zaruret insani kasif yapar yazdiriniz
            //sonraki Techproed ıle java cok kolay ifadesi
            //3 satir sonra ve satir basına
            System.out.println("\"zaruret\" insani \n\'kasif\' yapar\n\n\n\t\"Techproed ıle java cok kolay...\"");


        }
    }
}
