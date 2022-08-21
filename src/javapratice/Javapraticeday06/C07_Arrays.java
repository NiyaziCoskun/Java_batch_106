package javapratice.Javapraticeday06;

public class C07_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */
        int [] arr={5,7,-6,4,2,15,3,8,1};
        int toplam=9;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] +arr[j]==9){
                    System.out.println(arr[i]+ "ve "+arr[j] +  " toplam:" +toplam);
                    //i=i+15ve 4 toplam:9
                    //7ve 2 toplam:9
                    //-6ve 15 toplam:9
                    //8ve 1 toplam:9
                }
            }
        }
    }
}
