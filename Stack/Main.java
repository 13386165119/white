import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Please enter an expression using only parentheses:");
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        BalacedParentheses balance = new BalacedParentheses();
        balance.balancedParentheses(expression);

        scanner.close();
    }
}
