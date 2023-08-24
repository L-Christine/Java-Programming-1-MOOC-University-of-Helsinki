
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        int max = 0;
        while (max < number) {
            System.out.print("*");
            max++;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int space = 0;
        while (space < number) {
            System.out.print(" ");
            space++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int star = 1;
        while (star <= size) {
            printSpaces(size - star);
            printStars(star);
            star++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int line = 1;
        while (line <= height) {
            printSpaces(height - line);
            printStars(line + (line - 1));
            line++;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
