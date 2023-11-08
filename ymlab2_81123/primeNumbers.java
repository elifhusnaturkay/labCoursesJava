import java.util.Scanner;
public class primeNumbers {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);

   System.out.println("Sayı giriniz:");
   int num1 = keyboard.nextInt();
   
    for(int i=2; i<num1 ;i++){
      if(num1%i==0){
         System.out.println("Girilen sayı asal değildir.");
         break;
      }
      else{
         System.out.println("Girdiğiniz sayı asaldır.");
         break;
      }
    }
 }
}
