package Day17_nestedforloop;

public class C10_whıleFoorloop {
    public static void main(String[] args) {

        boolean dogruMu=false;
        int sayi =10;
        while(!dogruMu){
            if (sayi>20){ // sart saglandiginda while loop'un condition'i false olmali
                System.out.println("Bu islem tamam");
                dogruMu=true;
            }else { // sart saglanmadigi muddetce while loop'un kontrol ettigi degisken degismeli
                System.out.println("istenen sart saglanamadi" + sayi);
                sayi++;
            }
        }

        int sum =0;

        for(int i=1; i<6; i++) {

            sum = sum + i;

        }

        System.out.println("Toplam: " + sum);


    }

}

