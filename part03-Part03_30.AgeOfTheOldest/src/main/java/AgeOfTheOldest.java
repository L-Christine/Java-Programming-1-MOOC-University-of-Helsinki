
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int each = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] array = input.split(",");
            each = Integer.valueOf(array[1]);
            
            if (each > age) {
                age = each;
            }
            
        }
    
        System.out.println("Age of the oldest: " + age);


    }
}
