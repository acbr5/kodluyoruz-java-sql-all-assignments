package Soru2;

/*
    Television adında bir sınıf oluşturun ve width, height, screenSize, maxVolume, volume, power özelliklerine sahip olsun.
    Televizyon nesnesi en, boy ve ekran boyutu özelliklerini parametre alacak şekilde oluşturulabilsin.
    Television sınıfında açma/kapama, ses arttırma ve ses azaltma işlevlerini gerçekleştiren metotlar olsun.
       - Açma/kapama özelliği için power özelliğini true/false olarak değiştiren bir metot tanımlayabilirsiniz.
       - Ses azaltma özelliği için volume değerini 0'dan küçük olmamak koşuluyla azaltacak bir metot oluşturabilirsiniz.
       - Ses arttırma özelliği için volume değerini maksimum ses düzeyini geçmeyecek şekilde arttıran
        bir metot oluşturabilirsiniz. Kurduğunuz bu yapı ile bir televizyon nesnesi oluşturup sesini arttırma,
        azaltma ve açma/kapama özelliklerini kullanarak örnek yapınız.

    Not: Nesnenizi Kapsülleme kurallarına uyacak şekilde oluşturunuz.
    Oluşturduğunuz televizyon nesnesinin ekran boyutuna television.screenSize diyerek direkt ulaşmaya
    çalıştığınızda hata almalısınız.

 */

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Television television = new Television(1280,1020, 140);

        if(television.getPower())
            System.out.print("Televizyonunuz açık. Kapatmak için 2 tuşuna basınız: ");
        else
            System.out.print("Televizyonunuzu açmak için 1 tuşuna basınız: ");

        int power = scanner.nextInt();
        if(power == 1){
            television.acma_kapama(true);
            System.out.println("Televizyonunuz Açık :) ");
        }
        else{
            television.acma_kapama(false);
            System.out.println("Televizyonunuz Kapalı :) ");
        }

        System.out.println("------------------------------------------------------------------");

        System.out.println("Televizyonunuzun ses seviyesi: "+television.getVolume());
        System.out.print("Televizyonunuzun sesini artırmak için 2 tuşuna basınız: ");
        int ses_artir = scanner.nextInt();
        television.ses_arttirma();
        System.out.println("Yeni ses seviyesi: "+television.getVolume());

        System.out.print("Televizyonunuzun sesini kısmak için 3 tuşuna basınız: ");
        int ses_azalt = scanner.nextInt();
        television.ses_azaltma();
        System.out.println("Yeni ses seviyesi: "+television.getVolume());
    }
}
