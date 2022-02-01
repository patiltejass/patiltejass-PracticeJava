package pattern;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //no. of rows
        int b = sc.nextInt(); //no. of columns
        sc.close();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
