package ch3_loops.pattern;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
