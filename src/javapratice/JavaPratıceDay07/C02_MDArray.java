package javapratice.JavaPratıceDay07;

public class C02_MDArray {
    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String [][] arr={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
           double toplam=0;
        for (int i = 0; i <3 ; i++) {//outer for
            for (int j = 0; j <3 ; j++) {
                if (arr[i][j].contains("$")){
                    toplam+=Double.parseDouble(arr[i][j].replace("$", " "))*3.2;
                       //parantez içindeki replace all methodu ıle $ kurtulduk sonra elimizde
                    //strıng 12 var double toplam verıable ıle işleme katmak için data castıng yapmak gerekır
                    //bu yuzden double parse methodunu kullandık
                    //kullandık bu asama 12 degeri data type double oldu eklerken de 3,2 ile carptık

                }else {
                    toplam+=Double.parseDouble(arr[i][j].replace("€", " "))*4.2;
                }
            }

        }

        System.out.println("toplam = " + toplam);

    }
}
