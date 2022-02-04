package ch2_conditional;
import java.util.Scanner;

public class q1_2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Marks of Subject 1");
       float a = sc.nextFloat();
       System.out.println("Enter Marks of Subject 1");
       float b  = sc.nextFloat();
       System.out.println("Enter Marks of Subject 1");
       float c = sc.nextFloat();
       sc.close();
       float percentage = ((a+b+c)/3);
       if(a<33 && b<33 && c<33 && percentage<40){
           System.out.println("You are Fail");
       }
       else{
           System.out.println("You are Passed");
       }
    } 
}
