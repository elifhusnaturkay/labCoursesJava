import java.util.Scanner;

public class starsLoop {
   public static void main(String[] args){
   Scanner keyboard = new Scanner(System.in);
      System.out.println("kaç sıra yıldız girilsin:");
      int a = keyboard.nextInt();

      for(int i = 1; i<=a; i++){

         for(int j = 1; j<=i; j++){
         System.out.print("*");
         }
         System.out.println(" ");
      }

      
      for(int i = 1; i<=a; i++){

         for(int j = a; i<=j; j=j-1){
         System.out.print("*");
         }
         System.out.println(" ");
      }


       for(int i = 1; i<=a; i++){

         for(int j = a - i; j > 0; j--){
         System.out.print(" ");
         }
         for (int k = 0; k < 2 * i - 1; k++) {
            System.out.print("*"); 
         }
         System.out.println(" ");
      }
   }
}