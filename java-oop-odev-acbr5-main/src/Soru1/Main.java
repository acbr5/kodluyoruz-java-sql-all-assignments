package Soru1;

/*
İki sayı için; toplama, çıkartma, çarpma ve bölme işlemlerini içeren bir Calculator interface'i oluşturunuz.
Bir de Calculator interface'ini miras alacak olan, Scientific adında bir interface oluşturunuz,
oluşturduğunuz bu alt interface'e bir sayının karesini ve bir sayının küpünü hesaplayan metot tanımlarını ekleyiniz.
BasicCalculator isminde bir sınıf oluşturunuz ve bu sınıfa Calculator interface'ini uygulayınız.
AdvancedCalculator isminde bir sınıf daha oluşturunuz, oluşturduğunuz bu sınıf BasicCalculator'ı miras alsın.
Aynı zamanda AdvancedCalculator sınıfımızın bir bilimsel hesap makinesi olmasını istediğimiz için bilimsel hesaplama
özelliklerini sağlayacak olan interface'i sınıfa uygulayınız. Son olarak oluşturduğunuz bu yapıyı kullanarak
ana programda gelişmiş hesap makinemiz için bir nesne oluşturup;

   - İki sayı ile çarpma ve bölme işlemi için örnek yapınız.
   - Bir sayının karesi ve bir sayının küpü için örnek yapınız.
 */

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        System.out.print("Lütfen temel hesaplamalar için 1. sayıyı giriniz  : ");
        double sayi1 = scanner.nextDouble();

        System.out.print("Lütfen temel hesaplamalar için 2. sayıyı giriniz  : ");
        double sayi2 = scanner.nextDouble();

        System.out.print("Lütfen gelişmiş hesaplamalar için bir sayı giriniz: ");
        double sayi = scanner.nextDouble();

        System.out.println("-------------Temel İşlemler------------");
        System.out.println("Sayıların Toplamı: "+advancedCalculator.toplama(sayi1, sayi2));
        System.out.println("Sayıların Farkı  : "+advancedCalculator.cikarma(sayi1, sayi2));
        System.out.println("Sayıların Çarpımı: "+advancedCalculator.carpma(sayi1, sayi2));
        System.out.println("Sayıların Bölümü : "+advancedCalculator.bolme(sayi1, sayi2));

        System.out.println("-----------Gelişmiş İşlemler----------");
        System.out.println("Sayının Karesi   : "+advancedCalculator.kare(sayi));
        System.out.println("Sayının Küpü     : "+advancedCalculator.kup(sayi));

    }
}
