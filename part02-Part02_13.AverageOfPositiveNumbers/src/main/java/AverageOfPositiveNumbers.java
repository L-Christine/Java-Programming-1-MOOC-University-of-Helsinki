
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                positive = positive + number;
                count = count + 1;
            }

        }
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }
        
        System.out.println(1.0 * positive / count);

    }
}
