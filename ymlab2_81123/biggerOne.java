import java.util.Scanner; 

public class biggerOne {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Sayı girişi yapınız;");
   double num2 = keyboard.nextInt();

   if(num2< 18.5){
      System.out.println("weak");
   }
   else if (18.5<num2 && num2<24.9){
      System.out.println("ideal");
   }
      else if (25.0<num2 && num2<30.0){
      System.out.println("over weight");
   }
      else if (30<num2){
      System.out.println("obez");
   }
   }
}
