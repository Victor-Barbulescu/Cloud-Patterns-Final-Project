package Builder;

import Rooms.Room;

import java.text.NumberFormat;
import java.util.*;

public class House {
    private final Stack<Room> rooms = new Stack<>();

    /**
     * Default constructor with no rooms
     */
    public House() {

    }

    /**
     * Add a room to the house
     * @param room room to add
     */
    public void addRoom(Room room){
        rooms.push(room);
    }
    public int removeRoom() {
        return rooms.isEmpty() ? 0 : rooms.pop().getPrice();
    }
    /**
     * toString describes the rooms in the house
     * @return Description of the house
     */
    public String toString() {
        Map<String, Integer> roomCount = new HashMap<>();

        // Count each room type
        for (Room room : rooms) {
            String type = room.toString();
            roomCount.put(type, roomCount.getOrDefault(type, 0) + 1);
        }

        // Build the description string
        StringBuilder description = new StringBuilder("House with");
        roomCount.forEach((type, count) -> description.append(" ")
                                                      .append(count)
                                                      .append(" ")
                                                      .append(type)
                                                      .append(count > 1 ? "s" : "")
                                                      .append(","));

        // Remove the trailing comma
        if (description.charAt(description.length() - 1) == ',') {
            description.setCharAt(description.length() - 1, '.');
        }
        int price = 0;
        for(Room r: rooms){
            price += r.getPrice();
        }

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        description.append("\nTotal Price: ").append(currencyFormatter.format(price));

        return description.toString();
    }
    public Stack<Room> getRoomStack() {
        return rooms;
    }
}
