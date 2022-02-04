package ch1_basic.practice_set;
import java.util.*;

public class q3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("choose an option \n1. Kilometer to Miles \n2. Miles to Kilometer");
       int choice = sc.nextInt();
       if(choice == 1){
            Double km = sc.nextDouble();
            System.out.println("Miles = "+ (0.6213*km));
       }
       else if(choice==2){
           double mile = sc.nextDouble();
           System.out.println("Kilometer = " + (1.6093*mile));
       }
       else{
           System.out.println("Invalid Choice");
       }
       sc.close();
   } 
}
