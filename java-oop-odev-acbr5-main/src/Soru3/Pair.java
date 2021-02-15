package Soru3;

public class Pair<T1,T2> {

    private T1 first;

    private T2 second;

    public void setDeger1(T1 value){
        this.first = value;
    }

    public T1 getDeger1(){
        return first;
    }

    public void setDeger2(T2 value){
        this.second = value;
    }

    public T2 getDeger2(){
        return second;
    }

}
