package practice_set;
import java.util.Scanner;

public class q1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int sub1 = sc.nextInt();
       int sub2 = sc.nextInt();
       int sub3 = sc.nextInt();
       int sub4 = sc.nextInt();
       int sub5 = sc.nextInt();
       sc.close();
       double percentage = ((sub1+sub2+sub3+sub4+sub5)/6);
       System.out.println("CGPA = " + ((percentage-11)/7.1));
   } 
}

