import java.util.ArrayList;
 
public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipe (String name, int time) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }
    
    //check if time is <= to cooking time
    public boolean maxTime (int max) {
        return time <= max;
    }
    
    //check if recipe name matches search name
    public boolean findName (String searchName) {
        return name.contains(searchName);
    }
    
    //check if recipe contains ingredient
    public boolean findIngredient (String ingredient) {
        return ingredients.contains(ingredient);
    }
    
    //add ingredient to ingredients arraylist of recipe
    public void addIngredient (String ingredient) {
        ingredients.add(ingredient);
    }
    
    @Override
    public String toString() {
        return name + ", cooking time: " + time;
    }

}