import java.util.Scanner;

public class Subtraction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for addition");
        int a = sc.nextInt();
        System.out.println("Enter second number for addition");
        int b = sc.nextInt();
        System.out.println("Enter third number for addition");
        int c = sc.nextInt();
        System.out.println("The subtraction is " + (a - b - c));
    }
}