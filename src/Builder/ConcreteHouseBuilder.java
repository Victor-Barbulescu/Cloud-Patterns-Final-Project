/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class ConcreteHouseBuilder
 * Name: Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * Created 12/7/2024
 */

package Builder;

import Rooms.Bedroom;
import Rooms.Basement;
import Rooms.Bathroom;
import Rooms.Garage;
import Rooms.Kitchen;
import Rooms.LivingRoom;

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class ConcreteHouseBuilder Purpose: Responsible for adding rooms to the housebuilder
 *
 * @author Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * @version created on 12/7/2024 2:29 PM
 */

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder addBackyard() {
        house.addRoom(new Bedroom(10000));
        return this;
    }

    @Override
    public HouseBuilder addBasement() {
        house.addRoom(new Basement(10000));
        return this;
    }

    @Override
    public HouseBuilder addBathroom() {
        house.addRoom(new Bathroom(5000));
        return this;
    }

    @Override
    public HouseBuilder addGarage() {
        house.addRoom(new Garage(15000));
        return this;
    }

    @Override
    public HouseBuilder addKitchen() {
        house.addRoom(new Kitchen(8000));
        return this;
    }

    @Override
    public HouseBuilder addLivingRoom() {
        house.addRoom(new LivingRoom(8000));
        return this;
    }

    @Override
    public House build(){
        return house;
    }

    public House getHouse() {
        return house;
    }

}
