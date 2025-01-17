import java.util.Scanner;

public class Smallest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        System.out.println("Enter third number ");
        int c = sc.nextInt();
        int smallest = Math.min(c, (Math.min(a, b)));
        System.out.println("The smallest number is " +smallest);
    }
}
