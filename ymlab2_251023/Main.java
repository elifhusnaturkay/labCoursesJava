import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("İlk sayı eğerini giriniz:");
        Scanner keyboard1 = new Scanner(System.in);
        int num1 = keyboard1.nextInt();

        System.out.println("İkinci sayı eğerini giriniz:");
        Scanner keyboard2 = new Scanner(System.in);
        int num2 = keyboard2.nextInt();

        if (num1 < num2) {
            System.out.println("Son girilen sayı büyüktür.");
        } else if (num1 == num2) {
            System.out.println("Girilen sayılar birbirine eşittir.");
        } else {
            System.out.println("İlk girilen sayı büyüktür.");
        }
    }
}