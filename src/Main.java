/*
 * Course: SWE2410-121
 * Fall 2024-2025
 * File header contains class Main
 * Name: kleicha
 * Created 12/7/2024
 */

/**
 * Course SWE2410-121
 * Fall 2024-2025
 * Class Main Purpose: Runs the javafx application
 *
 * @author kleicha
 * @version created on 12/7/2024 2:29 PM
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OutputGui.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("House Builder");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
