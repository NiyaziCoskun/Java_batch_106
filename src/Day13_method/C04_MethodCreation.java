package Day13_method;

public class C04_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen iki int toplayıp sonucunu yazdiran method olustur

        int input1=10;
        int input2=20;
        
        //method 4 adımda oluturulur
        //1. adım method call
        //2. adım argüment eklenmesi gerekiyorsa ekleyelim 
        //eger methodun returntyp voıd farklı olacaksa bir veriable oluşturup method call assign edelim
        
        topla(input1,input2);

    }

    public static void topla(int input1, int input2) {
        //3 adım method deklarasyonunda değişmesi gereken bölümleri değistir
        //4. adım eger return type voıd disindabir seyse return kenor ve dönecek değeri hesapla

        System.out.println("girilen iki sayinin toplami:" +(input1+input2));
    }

}
