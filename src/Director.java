import Builder.ConcreteHouseBuilder;
import Builder.House;

public class Director {
    public static void main(String[] args) {
        ConcreteHouseBuilder houseBuilder = new ConcreteHouseBuilder();

        houseBuilder.addBackyard()
                    .addBasement()
                    .addGarage()
                    .addBathroom()
                    .addBathroom()
                    .addLivingRoom()
                    .addKitchen();

        House myHouse = houseBuilder.build();
        System.out.println(myHouse.toString());
    }
}
