import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.ToggleGroup;


//---------------------------------------------------------------------------
// Create a list of all cars in inventory.
//---------------------------------------------------------------------------
public class Listing extends Application
{
    public Label count, heading carText;

    public VBox vbox;

    public HBox hbox;

    public ChoiceBox<String> choice;

    public Button viewDetails;

    public Car current;

    //public DealershipInventory dealership;

    public ImageView imageView;

    public Image img;

    public void start(Stage primaryStage)

    {
        DealershipInventory listing = new DealershipInventory();

        listing.addCar("Ford", "Edge SEL", "2FMPK4J98MBA31672", "clean",
                2021, 20550, 27995, "car1.png");
        listing.addCar("Ford", "F-150", "1FTFX1EF1HKE54525", "clean",
                2017, 61431, 26995, "car2.png");
        listing.addCar("Chevrolet", "Camaro 1LT", "1G1FA1RS4M0139581", "accident reported",
                2021, 25675, 27995, "car3.png");
        listing.addCar("Dodge", "Challenger R/T", "2C3CDZBT6NH128103", "accident reported",
                2021, 27852, 26995, "car4.png");

        System.out.println(listing);

    //}
    //private ChoiceBox<String> choice;
    //public void start(Stage primaryStage)
    //{
        String[] cars = {"2021 Ford Edge SEL", "2017 Ford F-150", "2021 Chevy Camaro 1LT", "2021 Dodge Challenger R/T"};

        count = new Label(dealership.toString());

        Label select = new Label("Select a Car:");

        choice = new ChoiceBox<String>();
        choice.getItems().addAll(cars);
        choice.getSelectionModel().selectFirst();
        choice.setOnAction(this::processChoice);

        DealershipInventory pane = new DealershipInventory();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: skyblue");


        Scene scene = new Scene(pane, 300, 150);

        primaryStage.setTitle("Choose your car!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/
}