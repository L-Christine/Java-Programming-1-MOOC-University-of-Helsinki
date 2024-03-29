
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner newScan = new Scanner(Paths.get(file))) {
            while (newScan.hasNextLine()) {
                String line = newScan.nextLine();
                
                String[] input = line.split(",");
                String name = input[0];
                int age = Integer.valueOf(input[1]);
                
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
