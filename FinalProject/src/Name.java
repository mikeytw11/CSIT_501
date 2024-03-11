import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.HBox;
import java.awt.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Name extends HBox
{
    static TextField name;
    public static String personName;
    //public static InputMethodTextRun name;

    public Name()
    {
        Label inputLabel = new Label("What is your name?");

        name = new TextField();
        name.setPrefWidth(200);
        name.setAlignment(Pos.BASELINE_LEFT);
        name.getText();

        HBox nameBox = new HBox(inputLabel, name);
        nameBox.setPadding(new Insets(15, 15, 15, 25));
        nameBox.setSpacing(10);

        getChildren().addAll(nameBox);
    }
}