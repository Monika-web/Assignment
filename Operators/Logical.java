import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 100: ");
        int number = scanner.nextInt();

        boolean isInRange = (number >= 1) && (number <= 100);
        boolean isEven = (number % 2 == 0);

        System.out.println("Is the number in the range 1-100? " + isInRange);
        System.out.println("Is the number even? " + isEven);

        // Negating the conditions
        System.out.println("Is the number NOT in the range 1-100? " + !isInRange);
        System.out.println("Is the number NOT even? " + !isEven);
    }
}
