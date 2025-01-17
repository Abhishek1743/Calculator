import java.util.Scanner;

public class Division {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for division");
        int a = sc.nextInt();
        System.out.println("Enter second number for division");
        int b = sc.nextInt();
        System.out.println("The division is " + (a/b));
    }
}