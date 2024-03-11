import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Link extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label to instruct the user
        Label instructionLabel = new Label("Enter your link:");

        // Create a text field for the user input
        TextField linkTextField = new TextField();

        // Create a button to submit the link
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            String link = linkTextField.getText();
            // Handle the link, e.g., open it in a browser
            System.out.println("Submitted link: " + link);
        });

        // Create a VBox to arrange the UI components vertically
        VBox vbox = new VBox(10); // 10px spacing between nodes
        vbox.setPadding(new Insets(20)); // 20px padding around the VBox
        vbox.getChildren().addAll(instructionLabel, linkTextField, submitButton);

        // Create the scene
        Scene scene = new Scene(vbox, 300, 150);

        // Set the scene on the primary stage
        primaryStage.setScene(scene);

        // Set the title of the stage
        primaryStage.setTitle("Link Input");

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
