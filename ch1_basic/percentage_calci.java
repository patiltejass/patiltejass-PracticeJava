package ch1_basic;
import java.util.Scanner;

public class percentage_calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1");
        float sub1 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 2");
        float sub2 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 3");
        float sub3 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 4");
        float sub4 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 5");
        float sub5 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 6");
        float sub6 = sc.nextFloat();
        sc.close();
        float percentage = ((sub1+sub2+sub3+sub4+sub5+sub6)/6);

        System.out.println("Percentage = " + (percentage));
    }
}
