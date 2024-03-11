import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public abstract class FontPicker extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a button to open the font chooser dialog
        Button fontbutton = new Button("Select Font");
        fontbutton.setOnAction(e -> selectFont(primaryStage));


// Method to open the font chooser dialog
    private void selectFont(Stage primaryStage) {
        FontChooser fontChooser = new FontChooser();
        fontChooser.showAndWait().ifPresent(selectedFont -> {
            // Apply the selected font to the button text
            Button button = (Button) primaryStage.getScene().getRoot();
            button.setFont(selectedFont);

        getChildren().addAll(colBox);
    }
}