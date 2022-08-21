package Day31_TimeFormatter_Varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {
        //argüment ve parametre uyumu kontrol eder
        /*
        Varargs teorık olarak sonsuz sayida element alabilir bir method da
        parametre olarak varargs varsa ,
        varargs 'ın sınırlarını bilebilmesı ıcın parametrelerin
        sonuncusu olmalidir  öncesinde farklı parametreler olabilir ama
        varargs'dan sonra parametre olamaz.
        Bu kuraldan ötürü bir method da sadece 1 tane varargs olabilir

         */


        enuzunkelımeyazdir(5 , " ayse", "ismail"," ahmet","akin");

    }

    public static void enuzunkelımeyazdir( int kelimesayisi, String... kelime) {
        //varargs bır arraydir onu istediğimiz gibi değiştirebiliriz
        String enuzunkelime=kelime[0];//en uzun kelımeyı bulmak için array oluşturduk


        for (String each:kelime

        ) {
            if (each.length()>enuzunkelime.length()){
                enuzunkelime=each;
            }

        }
        System.out.println("girilen kelimelerden en uzunu :" +enuzunkelime);



    }

}

