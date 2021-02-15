package Soru1;

public class BasicCalculator implements Calculator{
    @Override
    public double toplama(double sayi1, double sayi2){

        return sayi1+sayi2;
    }

    @Override
    public double cikarma(double sayi1, double sayi2){

        return sayi1-sayi2;
    }

    @Override
    public double carpma(double sayi1, double sayi2){

        return sayi1*sayi2;
    }

    @Override
    public double bolme(double sayi1, double sayi2){
        double sonuc = 0;

        try {
            sonuc = sayi1/sayi2;
        }catch (Exception e){
            System.out.println("Lütfen ikinci sayıyı 0 girmeyiniz. Sıfıra bölme hatası.");
        }

        return sonuc;
    }
}
