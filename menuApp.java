import java.util.Scanner;

public class menuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOps = new MathOperations();
        int choice;

        do {
            System.out.println(" Math Menu ");
            System.out.println("1. Print Multiplication Table");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int number;

            switch (choice) {
                case 1:
                    System.out.print("Enter a number for multiplication table: ");
                    number = scanner.nextInt();
                    mathOps.printTable(number);
                    break;

                case 2:
                    System.out.print("Enter a number to calculate factorial: ");
                    number = scanner.nextInt();
                    mathOps.calculateFactorial(number);
                    break;

                case 3:
                    System.out.print("Enter a number to check if it's prime: ");
                    number = scanner.nextInt();
                    mathOps.checkPrime(number);
                    break;

                case 4:
                    System.out.print("Enter number of terms for Fibonacci series: ");
                    number = scanner.nextInt();
                    mathOps.printFibonacci(number);
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}

class MathOperations {

    public void printTable(int number) {
        System.out.println("Enter the number");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public void calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public void checkPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("Not a prime");
        }
    }

    public void printFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}