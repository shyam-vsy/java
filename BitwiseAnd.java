import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd/even finder");
        System.out.print("\n enter your number here: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("your number is even");
        }
    }
    
}
