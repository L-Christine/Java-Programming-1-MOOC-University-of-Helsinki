import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
 
public class RecipeSearch {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Recipe> recipes = new ArrayList<>();
        System.out.println("File to read:");
        String file = scanner.nextLine();
        
        //read file
        try (Scanner readFile = new Scanner(new File(file))) {
            while (readFile.hasNextLine()) {
                //first line = name, second line = time
                String name = readFile.nextLine();
                int time = Integer.valueOf(readFile.nextLine());
                //store name, time in constructor format, then add to arraylist recipes
                Recipe recipe = new Recipe(name, time);
                recipes.add(recipe);
                
                //add ingredients to recipe by using addIngredient method and arraylist ingredients
                while (readFile.hasNextLine()) {
                    String ingredient = readFile.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //commands
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    System.out.println(recipe);
                }
            }
            
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String search = scanner.nextLine();
                for (Recipe recipe: recipes) {
                    if (recipe.findName(search)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time");
                int max = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe: recipes) {
                    if (recipe.maxTime(max)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                
                for (Recipe recipe: recipes) {
                    if (recipe.findIngredient(ingredient)) {
                        System.out.println(recipe);
                    }
                }
                
            }
        }
 
        
    }
 
}