
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int longest = 0;
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] array = input.split(",");
            sum += Integer.valueOf(array[1]);
            count++;
            int length = array[0].length();
            
            if (length > longest) {
                longest = length;
                name = array[0];
            }
            
            
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years; " + 1.0 * sum / count);


    }
}
