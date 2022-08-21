package Day19_Scoop;

public class C01_InstanceVariables {

    static int instSayi=20;//static olmayıp class level da oldugu için instance veriabledir

    public static void main(String[] args) {
        /*
        class içerisinde her yerden kullanmak istediğiniz
        veriable ları class level da class içinde ama methodun dışında
        genelikle class level veriablenin clasının başında oluşur(sart değil)
        class  level daki varieble için 2 scop vardir
        1 static veriables class veriable
        2 instance static olmayan veriables (obje veriable de denir)

         */
        int sayi=10;
        //System.out.println(instSayi);
        /*
        instance veriables static olmadığı için static kulube
        üye main method dan direkt kullanmayız
        instance veriable diğer adi object veriables
        dolayısıyla obje oluşturusanız instance veriableri her
        yerden kullanabilirsiniz

         */
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println( "obje 1 degismeden önce:"+ obje1.instSayi);//20
        obje1.instSayi=30;
        System.out.println(  "obje1 degistikten sonra:"+ obje1.instSayi);//30

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 degismeden once:" +obje2.instSayi);//20
        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonra: "+obje2.instSayi);
        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 degismeden once:" +obje3.instSayi);

        //her obje olustugunda instance veriable nin ilk atanan
        //degerini alır


    }



    public  static  void staticMethod(){

        //System.out.println(sayi);
        //bir methodun içerisinde oluşturulan veriable
        //sadce o methodun içinden kullanilabilir local veriables

       // instSayi=30;
        //instance veriable lara main method disindaki static methodlara
        //direkt ulasamyız obje oluşturusak ulasabiliriz
        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println(obje4.instSayi);

    }


    public  void staticolmayanmethod(){
        System.out.println(instSayi);


    }

}

