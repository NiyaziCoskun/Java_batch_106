package Day11_stringmanıpulıtaıon;

public class C01_indexof {
    public static void main(String[] args) {
        //verilen bir string de herhangi bir string veya
        //char ın ilk kullanıldıgı indeksi döndürür

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));//7
        System.out.println(str.indexOf("j"));//-1
        System.out.println(str.indexOf("mek"));//10

        //eger iteiğimiz index den sonrasını kontrol etmek
        //istersek aynımethodu iki parametreli olarak kullanırız

        System.out.println(str.indexOf("g",(6+1)));//yazılan index den baslar
        //yukaraıdaki str 2, ve 3 e nin indexlerini bulun
        //2, ci e yi bulabilmel için 1, e nin index sine ihtiyac var
        //int ilk e

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e", ilke+1);

        //eger 2, e varsa 3, e nin olup olmadıgını varsa indexi yazdıralım

        if (ikincie==-1){
            System.out.println("verilen str da ikinci e yok");

        }else {
            int ucuncue=str.indexOf("e", ikincie+1);

            if (ucuncue==-1){
                System.out.println("verilen str ucuncu e yok");

            }else {
                System.out.println("verilen str daki 3, e nin index : " + ucuncue);
            }
        }

    }


}
