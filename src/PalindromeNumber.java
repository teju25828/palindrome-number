import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number, reverse = 0, remainder, n;
        System.out.println("Enter the number --> ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        n = number;
        for (; number != 0; ) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (n == reverse)
            System.out.println("The entered number is palindrome number");
        else
            System.out.println("The entered number is not a palindrome number");

    }
}
