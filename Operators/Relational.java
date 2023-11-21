import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 + " is equal to " + num2 + ": " + (num1 == num2));
        System.out.println(num1 + " is not equal to " + num2 + ": " + (num1 != num2));
        System.out.println(num1 + " is greater than " + num2 + ": " + (num1 > num2));
        System.out.println(num1 + " is less than " + num2 + ": " + (num1 < num2));
        System.out.println(num1 + " is greater than or equal to " + num2 + ": " + (num1 >= num2));
        System.out.println(num1 + " is less than or equal to " + num2 + ": " + (num1 <= num2));
    }
}
