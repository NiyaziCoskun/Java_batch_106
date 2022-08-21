package Day33_encapsulation;

public class Araba {

     String marka="marka belirtilmedi";//marka'nın acces modifer default acces modifier'dir.bu yuzden pakcage içinde kullanılır

     private String model="model belirtilmedi";
     private String yakit="elektirikli";//tum arabalar elektrıklı ise bu varıablenın değiştirilmemesi lazım

     //prıvate yaptıgımız model ve yakıt varıable'larına erişimi yetkilendirriz
     //model'e deger atanabılsın ama görulmesin(setter)
     //yakıt ıse gorulsun ama yenı  deger atanamasın isteniyor(getter)


     public void setModel(String model) {
          this.model = model;
     }

     public String getYakit() {
          return yakit;
     }
}
