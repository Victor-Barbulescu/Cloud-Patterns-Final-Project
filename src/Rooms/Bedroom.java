package Rooms;

public class Bedroom extends Room {

    public Bedroom(int price){
        super(price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}
