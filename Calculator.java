import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operator, n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n");
        System.out.println("Choose operator:");
        operator = sc.nextInt();

        System.out.println("Enter first number:");
        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();

        int result = 0;
        switch(operator) {
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                if (n2 != 0)
                    result = n1 / n2;
                else
                    System.out.println("Cannot divide by zero!");
                break;

            default:
                System.out.println("Entered operator is not valid");
        }
        System.out.println("Result is: " + result);

        sc.close(); // Closing scanner to prevent resource leak
    }
}
