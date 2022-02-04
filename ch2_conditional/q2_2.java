package ch2_conditional;
import java.util.Scanner;

public class q2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income = ");
        int income = sc.nextInt();
        sc.close();
        if(income<250000){
            System.out.println("Total Tax = " + (income-250000));
        }
        else if(income<500000){
            System.out.println("Total Tax = " + ((income-250000)*0.05));
        }
        else if(income<1000000){
            System.out.println("Total Tax = " + (12500+(income-500000)*0.2));
        }
        else{
            System.out.println("Total Tax = " + (112500+(income-1000000)*0.3));
        }
    }
}
