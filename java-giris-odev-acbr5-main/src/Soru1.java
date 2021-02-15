//Kullanıcı tarafından girilen sayının palindrom bir sayı olup olmadığını kontrol eden ve ekrana yazdıran programı yazınız.

import java.util.ArrayList;
import java.util.Scanner;

public class Soru1 {
    private int count;
    private int mode;
    private int n;
    private ArrayList digits;
    private int palindromic;

    private Soru1(){
        count = 0;
        mode = 0;
        n = 0;
        digits = new ArrayList();
        palindromic  = 0;
    }

    private boolean is_Palindromic(int number){

        do{
            n = (int) (number / Math.pow(10, count));
            count++;
        }while( (int) (number / Math.pow(10, count)) > 0 );

        for(int i=count; i>0; i--){
            int a = (int) (number / Math.pow(10, i-1));
            mode = (int) (number % Math.pow(10, i-1));
            number = mode;
            digits.add(a);
        }

        /*for (Object digit:digits) {
            System.out.println(digit);
        }*/

        number = 0;
        int j = digits.size()-1;

        for(int i=0; i<digits.size(); i++){
            palindromic += (int) Math.pow(10,i)* (int) digits.get(i);
            number += (int) Math.pow(10, j)* (int) digits.get(i);
            j--;
        }

        if(number == palindromic)
            return true;
        else
            return false;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Soru1 nesne = new Soru1();

        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();

        System.out.println();

        if(nesne.is_Palindromic(number))
            System.out.println("Palindromik.");
        else
            System.out.println("Palindromik değil.");
    }


}
