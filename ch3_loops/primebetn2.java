package ch3_loops;
import java.util.Scanner;

public class primebetn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i,j;
        System.out.print("The Prime Numbers Between " + a + " and "+ b + " are :- " );
        for(i=a;i<=b;i++){
            for(j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.print(i + " ");
            }
        }
    }
}
