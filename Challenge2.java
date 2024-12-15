import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd/even number definer");
        System.out.print("\n Please enter your number here: ");
        double num = input.nextDouble();

        if(num %2 == 0){
            System.out.println("\n entered number is odd");
        } else {
            System.out.println("\n entered number is even");
        }
    }
}
