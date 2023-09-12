
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        int size = this.rooms * this.squares;
        if (size > compared.rooms * compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int price = this.squares * this.pricePerSquare;
        int comparePrice = compared.squares * compared.pricePerSquare;
        if (price > comparePrice) {
            return price - comparePrice;
        }
        return comparePrice - price;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.squares * this.pricePerSquare;
        int comparePrice = compared.squares * compared.pricePerSquare;
        if (price > comparePrice) {
            return true;
        }
        return false;
    }
}
