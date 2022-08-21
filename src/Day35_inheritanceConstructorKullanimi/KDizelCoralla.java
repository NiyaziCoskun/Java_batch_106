package Day35_inheritanceConstructorKullanimi;

public class KDizelCoralla extends HCorolla {

    KDizelCoralla (){
        System.out.println("kdizel parametresiz cons");

    }
    KDizelCoralla (String isim){
        super(isim);
        System.out.println("kdizel parametreli cons");
    }

    public static void main(String[] args) {

        KDizelCoralla obj1=new KDizelCoralla("hasan");
    }
}
