import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner dr = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = dr.nextInt();
        System.out.println("Enter the second number");
        int b = dr.nextInt();
        int sum = a+b;
        System.out.println("THe required number is:");
        System.out.println(sum);
    }
}
