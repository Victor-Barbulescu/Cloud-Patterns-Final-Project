package Builder;

import Rooms.Backyard;
import Rooms.Basement;
import Rooms.Bathroom;
import Rooms.Garage;
import Rooms.Kitchen;
import Rooms.LivingRoom;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder addBackyard() {
        house.addRoom(new Backyard(10000));
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

}
