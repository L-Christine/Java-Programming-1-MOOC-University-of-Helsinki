
public class Timer {
    private ClockHand hundred;
    private ClockHand sec;
    
    public Timer() {
        this.hundred = new ClockHand(100);
        this.sec = new ClockHand(60);
    }
    
    public void advance() {
        this.hundred.advance();
        
        if (this.hundred.value() == 0) {
            this.sec.advance();
        }
    }
    
    public String toString() {
        return sec + ":" + hundred;
    }
}
