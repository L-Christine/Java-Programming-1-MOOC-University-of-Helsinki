
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        
        String longName = this.elements.get(0);
        
        for (String element: elements) {
            if (longName.length() < element.length()) {
                longName = element;
            }
        }
        
        return longName;
    }

}
