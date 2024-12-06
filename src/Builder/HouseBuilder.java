package Builder;

public interface HouseBuilder {
    HouseBuilder addBackyard();
    HouseBuilder addBasement();
    HouseBuilder addBathroom();
    HouseBuilder addGarage();
    HouseBuilder addKitchen();
    HouseBuilder addLivingRoom();

    House build();
}