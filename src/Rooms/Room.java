/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains interface Room
 * Name: Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * Created 12/7/2024
 */

package Rooms;

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Interface Room Purpose: Designs the template for a room implementation
 * that is extended by different concrete rooms
 *
 * @author Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * @version created on 12/7/2024 2:29 PM
 */
public abstract class Room {
    protected int price;

    public Room(int price){
        this.price = price;
    }
    public abstract int getPrice();
    public abstract String toString();

}
