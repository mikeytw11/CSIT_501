import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LightDark extends Application {

    private boolean isDarkMode = false;

    @Override
    public void start(Stage primaryStage) {
        // Create a button to toggle between light and dark mode
        Button toggleButton = new Button("Toggle Mode");
        toggleButton.setOnAction(e -> toggleMode(primaryStage));

        // Create a StackPane as the root node
        StackPane root = new StackPane(toggleButton);

        // Create the scene
        Scene scene = new Scene(root, 400, 300);

        // Apply initial mode
        applyMode(scene);

        // Set the scene on the primary stage
        primaryStage.setScene(scene);

        // Set the title of the stage
        primaryStage.setTitle("Light/Dark Mode Toggle");

        // Show the stage
        primaryStage.show();
    }

    // Method to toggle between light and dark mode
    private void toggleMode(Stage primaryStage) {
        isDarkMode = !isDarkMode;
        applyMode(primaryStage.getScene());
    }

    // Method to apply light or dark mode styles
    private void applyMode(Scene scene) {
        if (isDarkMode) {
            scene.getStylesheets().add(getClass().getResource("darkmode.css").toExternalForm());
        } else {
            scene.getStylesheets().remove(getClass().getResource("darkmode.css").toExternalForm());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
