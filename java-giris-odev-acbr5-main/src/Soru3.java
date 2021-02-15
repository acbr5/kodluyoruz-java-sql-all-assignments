/*
Kullanıcı tarafından girilen yazıları ters şekilde ekrana yazdıran programı yazınız.
Örnek; kullanıcı girdisi "hello world" ise, program çıktısı "dlrow olleh" şeklinde olmalıdır.

 Not: Programı StringBuilder sınıfındaki reverse() metodunu kullanmadan yazınız.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Soru3 {
    private ArrayList letters;

    private Soru3(){
        letters = new ArrayList();
    }

    private ArrayList reverse(String text){
        for(int i=text.length()-1; i>=0; i--){
            letters.add(text.charAt(i));
        }

        return letters;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Soru3 nesne = new Soru3();

        System.out.print("Bir Metin Giriniz: ");
        String text = scanner.nextLine();

        System.out.println();
        ArrayList a=nesne.reverse(text);
        for(Object b:a){
            System.out.print(b);
        }
    }
}
