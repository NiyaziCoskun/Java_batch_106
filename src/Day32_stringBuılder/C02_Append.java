package Day32_stringBuılder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        sb.append("?");//sona ekliyor
        System.out.println(sb);//

        //append istediğimiz stringi  en sona ekler
        sb.insert(4," her seyi dusunmus daha ne yapsin");
        System.out.println(sb);//Java her seyi dusunmus daha ne yapsin daha ne yapsin?
        //araya ekleme yapmak istediğimiz zaman ınsert kullanırız

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);//Java her seyi dusunmus valla daha ne yapsin daha ne yapsin?


    }
}
