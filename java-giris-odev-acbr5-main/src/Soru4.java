/*
Elemanları rastgele sayılardan oluşan bir dizideki maksimum ve minimum elemanı bulacak bir metot yazınız.
Yazdığınız metodu, elemanları rastgele sayılardan oluşan minimum 3, maksimum 8 elemanlı 4 tane örnek dizi oluşturarak kullanınız.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Soru4 {
    private ArrayList<Integer> ornek1;
    private ArrayList<Integer> ornek2;
    private ArrayList<Integer> ornek3;
    private ArrayList<Integer> ornek4;
    private ArrayList<Integer> temp;

    private Soru4(){
        ornek1 = new ArrayList();
        ornek2 = new ArrayList();
        ornek3 = new ArrayList();
        ornek4 = new ArrayList();
        temp = new ArrayList();
    }

    private void set(){
        Random rand = new Random();
        int n = (int) (Math.random() * (8 - 3 + 1) + 3);
        for(int i=0; i < n; i++){
            ornek1.add(rand.nextInt(100));
        }

        n = (int) (Math.random() * (8 - 3 + 1) + 3);
        for(int i=0; i < n; i++){
            ornek2.add(rand.nextInt(100));
        }

        n = (int) (Math.random() * (8 - 3 + 1) + 3);
        for(int i=0; i < n; i++){
            ornek3.add(rand.nextInt(100));
        }

        n = (int) (Math.random() * (8 - 3 + 1) + 3);
        for(int i=0; i < n; i++){
            ornek4.add(rand.nextInt(100));
        }

        System.out.print("Ornek1: ");
        for(Object a:ornek1){
            System.out.print(" "+a);
        }
        System.out.println();

        System.out.print("Ornek2: ");
        for(Object a:ornek2){
            System.out.print(" "+a);
        }
        System.out.println();

        System.out.print("Ornek3: ");
        for(Object a:ornek3){
            System.out.print(" "+a);
        }
        System.out.println();

        System.out.print("Ornek4: ");
        for(Object a:ornek4){
            System.out.print(" "+a);
        }
        System.out.println();
    }

    private void max_min (int ornek){
        int max=0;
        int min=0;
        switch (ornek){
            case 1:
                temp = ornek1;
                break;
            case 2:
                temp = ornek2;
                break;
            case 3:
                temp = ornek3;
                break;
            case 4:
                temp = ornek4;
                break;
        }


        ArrayList<Integer> b = new ArrayList();
        b=temp;
        for(int i=0; i < temp.size(); i++) {
            if ((i + 1) < temp.size() && temp.get(i) >= temp.get(i + 1)) {
                max = temp.get(i);
                temp.set(i, temp.get(i + 1));
                temp.set(i + 1, max);
            }
        }

        for(int i=0; i < b.size(); i++){
            if(( i + 1 ) < b.size() && b.get(i) <= b.get(i+1)){
                min = b.get(i);
                b.set(i, b.get(i+1));
                b.set(i+1, min);
            }
        }

        System.out.println();
        System.out.println("Minimum sayı: "+min);
        System.out.println("Maximum sayı: "+max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Soru4 nesne = new Soru4();
        int number;
        String ornek;

        do{
            System.out.print("1, 2, 3 ya da 4 rakamlarından birine basınız: ");
            number = scanner.nextInt();
            if(number!=1 && number!=2 && number!=3 && number!=4){
                System.out.println("Lütfen sadece 1, 2, 3 ya da 4 rakamlarından birine basınız!");
            }
            else break;
        }while (true);

        System.out.println();

        nesne.set();
        nesne.max_min(number);
    }


}
