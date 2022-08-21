package Day31_TimeFormatter_Varargs;

public class C04_VarargsİleEnUzunKelımeYazdirma{
    public static void main(String[] args) {

        enuzunkelımeyazdir("ali" , " ayse", "ismail"," ahmet","babayigit");

    }

   public static void enuzunkelımeyazdir(String... kelime) {
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
