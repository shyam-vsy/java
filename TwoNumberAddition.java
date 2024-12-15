import java.util.Scanner;

public class TwoNumberAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n Enter your first number here: ");
        double firstNum = input.nextDouble();

        System.out.print("\n Enter your second number here: ");
        double secondNum = input.nextDouble();

        double sum = firstNum + secondNum;
        System.out.println("your answer is: " + sum);
    }
}
