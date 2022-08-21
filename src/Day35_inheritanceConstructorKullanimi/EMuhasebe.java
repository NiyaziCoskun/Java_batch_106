package Day35_inheritanceConstructorKullanimi;

public class EMuhasebe extends  DPersonel {

    EMuhasebe (){
        System.out.println("muhasebe parametresiz cons");

    }

    EMuhasebe (String isim){
        System.out.println("muhasebe parametreli cons");
    }
}
