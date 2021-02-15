package Soru1;

public class AdvancedCalculator extends BasicCalculator implements Scientific{
    @Override
    public double kare(double sayi){

        return Math.pow(sayi,2);
    }

    @Override
    public double kup(double sayi){

        return Math.pow(sayi,3);
    }
}
