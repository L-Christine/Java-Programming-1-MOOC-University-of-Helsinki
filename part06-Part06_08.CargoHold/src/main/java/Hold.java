
import java.util.ArrayList;

public class Hold {

    private int maxCaseWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxCaseWeight) {
        this.maxCaseWeight = maxCaseWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxCaseWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalCaseWt = 0;
        for (Suitcase suitcase : suitcases) {
            totalCaseWt += suitcase.totalWeight();
        }
        return totalCaseWt;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
