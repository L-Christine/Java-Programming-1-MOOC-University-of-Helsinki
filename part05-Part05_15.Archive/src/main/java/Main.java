
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> lists = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Archive list = new Archive(identifier, name);
            
            if (!lists.contains(list)) {
                lists.add(list);
            }
            
        }
        
        System.out.println("==Items==");
        for (Archive list : lists) {
            System.out.println(list);
        }

    }
}
