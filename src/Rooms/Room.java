package Rooms;

public abstract class Room {
    protected int price;

    public Room(int price){
        this.price = price;
    }
    public abstract int getPrice();
    public abstract String toString();

}
