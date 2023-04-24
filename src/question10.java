import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = input.nextInt();

        System.out.print("Input second number: ");
        int num2 = input.nextInt();

        int product = num1 * num2;

        System.out.println(num1 + " x " + num2 + " = " + product);
    }
}