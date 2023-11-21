import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int value = scanner.nextInt();

            if (value <= 0) {
                throw new IllegalArgumentException("Please enter a positive integer.");
            }

            System.out.println("Entered positive integer: " + value);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
