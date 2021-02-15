package Soru3;

/*
Pair adında bir sınıf oluşturunuz ve bu sınıf, parametre olarak iki tane jenerik tür alsın.
Amacımız iki değere sahip bir obje tanımlarken değerlerin sahip olabileceği türleri dinamik hale getirmek,
böylelikle farklı türlerde değer çiftleri tanımlayabiliyor olacağız. Sınıf içerisinde, değer çiftindeki
ilk değer için T1 tipinde first özelliği, ikinci değer için ise T2 tipinde second özelliği tanımlayınız.
Ve bu iki özellik için getter oluşturunuz. Ana programda ise oluşturduğunuz bu jenerik sınıftan iki adet örnek nesne
üretiniz ve örnek nesnenizdeki değerlerin türleri birbirinden farklı olsun. (Örneğin; ilk değer Integer,
ikincisi String türünde v.b.) Son olarak ana programda ürettiğiniz iki örnek nesneye ait ilk ve
ikinci değerleri ekrana yazdırınız.
 */

public class Main {

    public static void main(String[] args){
        Pair<String, Integer> obje1 = new Pair<>();
        Pair<Boolean, Double> obje2 = new Pair<>();

        obje1.setDeger1("Ben Ayşenur BURAK");
        obje1.setDeger2(206);

        obje2.setDeger1(true);
        obje2.setDeger2(15.7);

        System.out.println("Birinci Nesne İlk Değer   : "+obje1.getDeger1());
        System.out.println("Birinci Nesne İkinci Değer: "+obje1.getDeger2());
        System.out.println("İkinci Nesne İlk Değer    : "+obje2.getDeger1());
        System.out.println("İkinci Nesne İkinci Değer : "+obje2.getDeger2());
    }
}
