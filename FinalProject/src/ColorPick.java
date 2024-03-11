import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class ColorPick extends HBox{
    public ColorPick(){
        Label accentLabel = new Label("Choose an accent color");

        ColorPicker accentColor = new ColorPicker(Color.BLACK);
        accentColor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Color newColor = accentColor.getValue();
                accentLabel.setTextFill(newColor);
            }
        });

        HBox colBox = new HBox(accentLabel, accentColor);
        colBox.setPadding(new Insets(15, 15, 15, 25));
        colBox.setSpacing(10);

        getChildren().addAll(colBox);
    }
}
