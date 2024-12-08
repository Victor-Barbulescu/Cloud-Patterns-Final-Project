/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class Basement
 * Name: Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * Created 12/7/2024
 */

package Rooms;
/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class Basement Purpose: Creates a basement
 *
 * @author Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * @version created on 12/7/2024 2:29 PM
 */

public class Basement extends Room {

    public Basement(int price) {
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
