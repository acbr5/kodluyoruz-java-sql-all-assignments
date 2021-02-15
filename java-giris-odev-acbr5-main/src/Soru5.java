/*
Yarıçap ve renk özelliklerine sahip bir çember sınıfı oluştup çemberin alanını ve yarıçapını değerini çağırabileceğiniz
ve değiştirebileceğiniz bir yapı oluşturun.
Bu sınıftan bir nesne yaratarak oluşturduğunuz çemberin yarıçapını ve alanını hesaplayıp ekrana yazdıran programı yazınız.
 */

import java.util.Scanner;

public class Soru5 {
    private double yaricap;
    private String renk;
    private double alan;

    private Soru5(){
        this.yaricap = 0;
        this.renk = "";
        this.alan = 0;
    }

    private void setYaricap(double yaricap){
        this.yaricap = yaricap;
    }
    private double getYaricap(){

        return this.yaricap;
    }

    private double getAlan(){
        return Math.round(Math.PI*Math.pow(getYaricap(), 2));
    }

    private void setRenk(String renk){
        this.renk = renk;
    }
    private String getRenk(){

        return this.renk;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Soru5 nesne = new Soru5();

        System.out.print("Çemberin Rengini Giriniz   : ");
        String renk = scanner.nextLine();

        System.out.print("Çemberin Yarıçapını Giriniz: ");
        double yaricap = scanner.nextDouble();

        nesne.setRenk(renk);
        nesne.setYaricap(yaricap);

        System.out.println("Çemberinizin Rengi   : " + nesne.getRenk());
        System.out.println("Çemberinizin Yarıçapı: " + nesne.getYaricap());
        System.out.println("Çemberinizin Alanı   : " + nesne.getAlan());
    }
}
