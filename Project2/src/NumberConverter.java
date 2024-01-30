import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NumberConverter extends Application
{
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new NumberPane(), 300, 150);


        primaryStage.setTitle("Number Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}