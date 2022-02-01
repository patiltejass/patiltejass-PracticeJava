import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int a = sc.nextInt();
        int sum = 0;
        sc.close();
        for(int i = 0 ; i<=a ; i++){
            sum += i;
        }
        System.out.println("The Sum of Numbers till " + a + " is = "+ sum);
    }
}
