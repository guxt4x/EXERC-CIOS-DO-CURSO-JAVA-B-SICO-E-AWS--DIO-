import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator<Object> calc = new Calculator<>();

        int choice = 0;

        System.out.println("Choice the operation: ");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Exit");
        int choice = sc.nextInt();

        while (choice != 3) {
            System.out.println("\n=== CALCULATOR ===");
            System.out.println("Choose the operation:");
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch (choice) -> {
                case 1 -> {
                    System.out.println("Enter two numbers separated by comma (e.g., 10,5): ");
                    String input = sc.next();
                    String[] numbers = input.split(",");
                    int num1 = Integer.parseInt(numbers[0].trim());
                    int num2 = Integer.parseInt(numbers[1].trim());
                    calc.calculate(new Sum(num1, num2));
                }
                case 2 -> {
                    System.out.println("Enter two numbers separated by comma (e.g., 10,5): ");
                    String input = sc.next();
                    String[] numbers = input.split(",");
                    int num1 = Integer.parseInt(numbers[0].trim());
                    int num2 = Integer.parseInt(numbers[1].trim());
                    calc.calculate(new Subtraction(num1, num2));
                }

                case 3 -> {
                    System.out.println("\\n=== RESULTS ===");
                    if (calc.getOperation().isEmpty()) {
                        System.out.println("No operations were performed.");
                    } else {
                        for (Object op : calc.getOperation()) {
                            System.out.println(op);
                    }
                    System.out.println("Exiting the program. Goodbye!");
                }
                default -> {
                    System.out.println("Invalid option. Try again.");
            }
                    while (choice != 3);
        }
        sc.close();
    }
}