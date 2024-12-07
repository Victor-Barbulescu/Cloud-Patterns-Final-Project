import Builder.ConcreteHouseBuilder;
import Builder.House;

public class Director {
    ConcreteHouseBuilder houseBuilder;
    public Director(ConcreteHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House buildHouse() {
        return houseBuilder.build();
    }
}
