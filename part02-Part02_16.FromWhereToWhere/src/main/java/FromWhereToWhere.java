
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int number2 = Integer.valueOf(scanner.nextLine());
        
        while (number2 <= number1) {
            System.out.println(number2);
            number2++;
        }
        
    }
}
