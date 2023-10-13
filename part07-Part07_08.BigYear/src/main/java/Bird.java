import java.util.*;

public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String name() {
        return name;
    }
    
    public void observation() {
        observations++;
    }
    
    public int getObservation() {
        return observations;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observations + " observations";
    }
}
