package ch3_loops;
import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        sc.close();
        for(i=2;i<a;i++){
            if(a%i==0){
                System.out.println("Not Prime");
                break;
            }
        }
        if(a==i){
            System.out.println("Prime");
        }
    }
}
