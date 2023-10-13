import java.util.*;

public class UserInterface {

    private Scanner scan;
    private BirdDB database;

    public UserInterface(Scanner scan, BirdDB database) {
        this.scan = scan;
        this.database = database;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("One")) {
                one();
            } else if (command.equals("All")) {
                all();
            }
        }
    }
    
    public String scanNextLine(String line) {
        System.out.print(line + " ");
        return scan.nextLine();
    }

    public void add() {
        String name = scanNextLine("Name:");
        String latinName = scanNextLine("Name in Latin:");
        database.add(name, latinName);
    }
    
    public void observation() {
        String name = scanNextLine("Name:");
        
        boolean match = database.observation(name);
        if (!match) {
            System.out.println("Not a bird!");
        }
    }
    
    public void one() {
        String name = scanNextLine("Name:");
        System.out.println(database.one(name));
    }
    
    public void all() {
        System.out.println(database.all());
    }
}
