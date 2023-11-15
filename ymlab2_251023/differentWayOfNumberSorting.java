import java.util.Scanner;

public class differentWayOfNumberSorting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Bir sayı girin veya çıkmak için 'q' tuşuna basın:");
            if (keyboard.hasNextInt()) {
                int num = keyboard.nextInt();
                System.out.println("Girdiğiniz sayı: " + num);
            } else if (keyboard.hasNext("q")) {
                System.out.println("Programdan çıkılıyor.");
                break; // Döngüyü sonlandır
            } else {
                System.out.println("Geçersiz giriş. Bir sayı veya 'q' girin.");
                keyboard.next(); // Hatalı girişi atla
            }
        }

        keyboard.close();
    }
}

