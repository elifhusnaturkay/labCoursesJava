import java.util.Scanner;

public class oddOrEven {
   public static void main(String[] args) {
   Scanner keyboard3 = new Scanner(System.in);
   boolean onOff = true;

   while(onOff == true){
   System.out.println("Sayı girişi yapınız:");
   
   int sayi1 = keyboard3.nextInt(); 
   double bolum = sayi1 % 2; 

      if(bolum!=0){
         System.out.println("Sayı tektir.");
      }
      else{
         System.out.println("Sayı çifttir.");
      }
   }
   
   System.out.println("Devam etmek istiyorsanız 1'e, istemiyorsanız 0'a basın.");
   int onOffNumber = keyboard3.nextInt();
   if(onOffNumber == 1){
      System.out.println("aa");
   }
}


}