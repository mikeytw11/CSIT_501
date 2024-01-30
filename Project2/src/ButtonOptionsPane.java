import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonOptionsPane extends Application
{
    private Button redButton, blueButton;
    private FlowPane pane;

    public void start(Stage primaryStage)
    {
        redButton = new Button("Red!");
        redButton.setOnAction(this::processColorButton);

        blueButton = new Button("Blue!");
        blueButton.setOnAction(this::processColorButton);

        pane = new FlowPane(redButton, blueButton);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        //pane.setStyle("-fx-backgroound-color: white");

        Scene scene = new Scene(pane, 300, 100);

        primaryStage.setTitle("Red or BLue?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void processColorButton(ActionEvent event)
    {
        if (event.getSource() == redButton)
            pane.setStyle("-fx-background-color: crimson");
        else
            pane.setStyle("-fx-background-color: deepskyblue");
    }
}