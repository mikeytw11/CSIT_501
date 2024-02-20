import java.time.LocalDate;
import java.time.Period;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BirthDate extends Application
{
    private Text message;
    private DatePicker datePicker;
    private ColorPicker colorPicker;

    public void start(Stage primaryStage)
    {
        datePicker = new DatePicker(LocalDate.now());
        datePicker.setOnAction(this::processDateChoice);

        colorPicker = new ColorPicker(Color.BLACK);
        colorPicker.setOnAction(this::processColorChoice);

        //message = new Text("HAPPY " + LocalDate.now() .getDayOfWeek());
        message = new Text("Select your Birthdate");
        message.setFont(Font.font("Helvetica", FontWeight.BOLD,
                FontPosture.REGULAR, 24));

        HBox pickers = new HBox(datePicker, colorPicker);
        pickers.setSpacing(15);
        pickers.setAlignment(Pos.CENTER);

        VBox root = new VBox();
        root.setStyle("-fx-background-color: white");
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(pickers, message);

        Scene scene = new Scene(root, 400, 150);

        primaryStage.setTitle("Birthdate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processDateChoice(ActionEvent event)
    {
        LocalDate date = datePicker.getValue();
            int age = Period.between(date, LocalDate.now()).getYears();
            message.setText("You are: " + age + " years old");

    }
    public void processColorChoice(ActionEvent event)
    {
        message.setFill(colorPicker.getValue());
    }
}