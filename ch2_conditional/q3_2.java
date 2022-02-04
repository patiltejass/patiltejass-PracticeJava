package ch2_conditional;
import java.util.Scanner;

public class q3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        sc.close();
        if(website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else if(website.endsWith(".gov")){
            System.out.println("Government Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organisational Website");
        }
    }
}
