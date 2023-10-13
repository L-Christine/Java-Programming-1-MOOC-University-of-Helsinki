import java.util.*;

public class BirdDB {
    private ArrayList<Bird> birds;

    public BirdDB() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }
    
    public boolean observation(String name) {
        for (Bird bird: birds) {
            if (bird.name().equals(name)) {
                bird.observation();
                return true;
            }
        }
        return false;
    }
    
    public String one(String name) {
        for (Bird bird: birds) {
            if (bird.name().equals(name)) {
                return bird.toString();
            }
        }
        return "Not a bird!";
    }
    
    public String all() {
        String all = "";
        for (Bird bird: birds) {
            all += bird.toString();
        }
        return all;
    }
}
