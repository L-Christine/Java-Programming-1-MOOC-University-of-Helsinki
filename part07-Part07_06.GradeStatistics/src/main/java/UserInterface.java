
import java.util.*;

public class UserInterface {

    private Scanner scanner;
    private Points points;

    public UserInterface(Scanner scanner, Points points) {
        this.scanner = scanner;
        this.points = points;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int entry = Integer.valueOf(scanner.nextLine());
            if (entry == -1) {
                break;
            }

            if (entry < 0 || entry > 100) {
                continue;
            }
            points.add(entry);
        }
        printAverage();
        printPassAverage();
        printPassPercentage();
        printGrade();
    }

    public void printAverage() {
        System.out.println("Point average (all): " + points.average());
    }

    public void printPassAverage() {
        if (points.passingAverage() == -1) {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Point average (passing): " + points.passingAverage());
    }

    public void printPassPercentage() {
        System.out.println("Pass percentage: " + points.passPercentage());
    }
   
    public void printGrade() {
        System.out.println("Grade distribution:");
        points.gradeStar();
    }

}
