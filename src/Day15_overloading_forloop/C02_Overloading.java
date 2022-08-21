package Day15_overloading_forloop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        java da oluşturduğumuz methodlarının isminin yaptıgı islev ile uyumlu olmasını isteriz
        mesala bir stringin bir bölümünü almak icin 2 adet substring
        methodunu veya
        verilen string de bazi parcalari yenileri ile degistirmek icin
       2 adet  replace  methodu var
       java aynı isimde birden fazla method varsa hangisinin  kullanılacagına parametre sayisi ve parametrelerin
       data turune göre karar verir.
         */
        String str="bu java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);
        str.replace('c','v');
        str.replace("j","h");
        //aynı isimde ama farkli methodları olusturmak icin
        //degistirebilecegimiz seyler
        //1 - parametre sayisi
        //2- aynı sayida parametreye sahip olsa bile, parametrelerin data türlerini değistirebiliriz
        //3- aynı sayıda ve data türlerinde  parametreleri olan methodları parametrelerin
        //sıralanısı
    }
}
