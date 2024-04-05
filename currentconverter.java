import java.util.Scanner;

public class currentconverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose one from the following options:");
        System.out.println("1) USD to Euro");
        System.out.println("2) Euro to USD");
        System.out.println("3) Pound to USD");

        int exchange = scanner.nextInt();

        switch (exchange) {
            case 1: {
                System.out.println("Enter the amount in USD:");
                double usd = scanner.nextDouble();
                if (usd >= 0) {
                    System.out.println(usd + " USD is " + usd * 0.908 + " Euro.");
                } else {
                    System.out.println("Please enter a positive number of USD.");
                }
            }
            break;
            case 2: {
                System.out.println("Enter the amount in Euro:");
                double euro = scanner.nextDouble();
                if (euro >= 0) {
                    System.out.println(euro + " Euro is " + euro * 1.101 + " USD.");
                } else {
                    System.out.println("Please enter a positive number of Euro.");
                }
            }
            break;
            case 3: {
                System.out.println("Enter the amount in Pound:");
                double pound = scanner.nextDouble();
                if (pound >= 0) {
                    System.out.println(pound + " Pound is " + pound * 1.28 + " USD.");
                } else {
                    System.out.println("Please enter a positive number of Pound.");
                }
            }
            break;
            default:
                System.out.println("Invalid option.");
        }
        scanner.close();
    }
}
