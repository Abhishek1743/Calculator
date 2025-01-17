import java.util.Scanner;

public class Largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        System.out.println("Enter third number ");
        int c = sc.nextInt();
        int smallest = Math.max(c, (Math.max(a, b)));
        System.out.println("The Largest number is " +smallest);
    }
}