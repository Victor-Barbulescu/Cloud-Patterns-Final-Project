/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class Controller
 * Name: kleicha
 * Created 12/6/2024
 */

import Builder.ConcreteHouseBuilder;
import Rooms.Room;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class Controller Purpose: Responsible for managing the components of the javafx application
 *
 * @author kleicha
 * @version created on 12/6/2024 12:55 PM
 */
public class Controller {
    private ConcreteHouseBuilder houseBuilder = new ConcreteHouseBuilder();
    @FXML
    private Label priceOutputLabel;

    @FXML
    private Label roomListLabel;

    @FXML
    private Label houseDescriptionLabel;
    private int totalPrice;
    @FXML
    private void clickAddLivingRoom() {
        houseBuilder.addLivingRoom();
        updateRoomList();
        updatePrice();
    }
    @FXML
    private void clickAddKitchen() {
        houseBuilder.addKitchen();
        updateRoomList();
        updatePrice();
    }
    @FXML
    private void clickAddBathroom() {
        houseBuilder.addBathroom();
        updateRoomList();
        updatePrice();
    }
    @FXML
    private void clickAddBasement() {
        houseBuilder.addBasement();
        updateRoomList();
        updatePrice();
    }
    @FXML
    private void clickAddBedroom() {
        houseBuilder.addBackyard();
        updateRoomList();
        updatePrice();
    }
    @FXML
    private void clickAddGarage() {
        houseBuilder.addGarage();
        updateRoomList();
        updatePrice();
    }
    @FXML
    private void clickRemove() {
        int price = houseBuilder.getHouse().removeRoom();
        totalPrice -= price;
        priceOutputLabel.setText(String.format("$%d", totalPrice));
        updateRoomList();
    }
    @FXML
    private void clickBuild() {
        houseBuilder.build();
        houseDescriptionLabel.setText(houseBuilder.getHouse().toString());
    }
    @FXML
    private void clickRestart() {
        totalPrice = 0;
        houseBuilder.getHouse().getRoomStack().clear();
        roomListLabel.setText("");
        houseDescriptionLabel.setText("");
        priceOutputLabel.setText("$0");
    }
    private void updatePrice() {
        totalPrice += houseBuilder.getHouse().getRoomStack().getLast().getPrice();
        priceOutputLabel.setText(String.format("$%d", totalPrice));
    }
    private void updateRoomList() {
        StringBuilder roomList = new StringBuilder();
        for (Room room : houseBuilder.getHouse().getRoomStack()) {
            roomList.append(room.toString()).append("\n");
        }
        roomListLabel.setText(roomList.toString());
    }
}
