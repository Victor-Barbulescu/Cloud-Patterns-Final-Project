/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class Director
 * Name: Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * Created 12/7/2024
 */

import Builder.ConcreteHouseBuilder;
import Builder.House;
/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class Director Purpose: Responsible for constructing the house after rooms are done being added
 *
 * @author Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * @version created on 12/7/2024 2:29 PM
 */

public class Director {
    ConcreteHouseBuilder houseBuilder;
    public Director(ConcreteHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House buildHouse() {
        return houseBuilder.build();
    }
}
