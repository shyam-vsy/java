import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = 1;
        // while (num <= 200000){
        //     System.out.println(num);
        //     num = num * 2;
        // }

        // int count = 500;
        // while (count >= 1){
        //     System.out.println(count);
        //     count = count - 1;
        // }

        int i = 0;
        while (i < 5){
            int inp = input.nextInt();
            System.out.println("number is: " + inp);
            i++;
        }
    }
    
}
