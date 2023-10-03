import java.util.*;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random rand = new Random();
        int randJoke = rand.nextInt(jokes.size());
        return this.jokes.get(randJoke);
    }
    
    public void printJokes() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }
}
