
public class Statistics {
    private int numberCount;
    private int sum;

    public Statistics() {

    }

    public void addNumber(int number) {
        // write code here
        this.sum += number;
        this.numberCount++;
    }

    public int getCount() {
        return this.numberCount;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.sum != 0 && this.numberCount != 0){
            return 1.0 * sum / numberCount;
        }
        return 0.0;
    }
}