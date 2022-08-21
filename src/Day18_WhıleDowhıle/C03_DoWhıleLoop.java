package Day18_WhıleDowhıle;

public class C03_DoWhıleLoop {
    public static void main(String[] args) {

        /*
        whıle loop da önce kontrol edıp sonra islem
        yaptıgımız için işlem bittikten sonra
        loop un kırılması için bir kez daha basa dönmemmiz gerekiyor
        bu durumda fazladan bir işlem yapılıyor
         */
        int sayi=7;

        while (sayi<10){
            System.out.println(sayi);
            sayi++;
            //do whıle ıle calışırsak  bu dezavantaj ortadan kalkar

        }
        sayi=7;
        do {

            System.out.println(sayi);
            sayi++;
        }while (sayi<10);
    }
}
