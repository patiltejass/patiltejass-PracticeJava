package ch4_functions;
import java.util.Scanner;

public class func_average{

    int average(int a, int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("Average = "+ average(int,int,int));

    
    }
   
    
}