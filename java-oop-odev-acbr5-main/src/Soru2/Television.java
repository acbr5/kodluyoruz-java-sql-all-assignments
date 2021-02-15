package Soru2;

public class Television {
    private double width;
    private double height;
    private double screenSize;
    private double maxVolume;
    private double volume;
    private boolean power;

    protected Television(double en, double boy, double ekranBoyutu){
        this.maxVolume = 100;
        this.width = en;
        this.height = boy;
        this.screenSize = ekranBoyutu;
        this.volume = 50;
        this.power = false;
    }

    protected double getWidth(){
        return this.width;
    }

    protected double getHeight(){
        return this.height;
    }

    protected double getScreenSize(){
        return this.screenSize;
    }

    protected double getMaxVolume(){
        return this.maxVolume;
    }

    protected double getVolume(){
        return this.volume;
    }

    protected boolean getPower(){
        return this.power;
    }

    protected void acma_kapama(boolean deger){
        if(deger == true)
            this.power = true;
        else
            this.power = false;
    }

    protected void ses_arttirma(){
        if(this.volume < maxVolume-5)
            this.volume += 5;
        else
            System.out.println("Ses daha fazla artırılamaz! Ses seviyesi: "+this.volume);
    }

    protected void ses_azaltma(){
        if(this.volume < 5)
            this.volume -= 5;
        else
            System.out.println("Ses daha fazla kısılamaz! Ses seviyesi: "+this.volume);
    }
}
