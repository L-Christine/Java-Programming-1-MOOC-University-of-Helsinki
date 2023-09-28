import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (this.maxWeight >= this.totalWeight() + item.getWeight()) {
            items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight() {
        int totalWt = 0;
        for (Item item: items) {
            totalWt += item.getWeight();
        }
        return totalWt;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heavy = this.items.get(0);
        for (Item item: items) {
            if (item.getWeight() > heavy.getWeight()) {
                heavy = item;
            }
        }
        return heavy;
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)"; 
        }
        
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    
}
