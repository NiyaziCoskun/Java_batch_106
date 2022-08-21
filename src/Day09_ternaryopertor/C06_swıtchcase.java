package Day09_ternaryopertor;


public class C06_swıtchcase {
    public static void main(String[] args) {

          /*
        Kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin
         */
        String input= "Pazar";
        input=input.toLowerCase();


        switch (input){

            case "pazartesi":
            case "sali" :
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;

            default:
                System.out.println("lutfen gecerli bir gun giriniz");
        }
    }
}


