/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains interface HouseBuilder
 * Name: Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * Created 12/7/2024
 */

package Builder;
/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Interface HouseBuilder Purpose: Contains methods used for adding rooms to
 * a housebuilder
 *
 * @author Victor Barbulescu, Alan Kleich, Charlie Nortrup
 * @version created on 12/7/2024 2:29 PM
 */

public interface HouseBuilder {
    HouseBuilder addBackyard();
    HouseBuilder addBasement();
    HouseBuilder addBathroom();
    HouseBuilder addGarage();
    HouseBuilder addKitchen();
    HouseBuilder addLivingRoom();

    House build();
}