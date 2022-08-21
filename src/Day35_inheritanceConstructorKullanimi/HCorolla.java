package Day35_inheritanceConstructorKullanimi;

public class HCorolla extends  GToyota {

    HCorolla  (){
        System.out.println("hcorlla parametresiz cons");

    }
    HCorolla (String isim){
        super(isim);
        System.out.println("hcorolla parameretl cons");

    }
}
