import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.effect.Light;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application
{
    public void start(Stage primaryStage)
    {
        Name name1 = new Name();
        name1.setAlignment(Pos.CENTER);

        Picture picture1 = new Picture();
        picture1.setAlignment(Pos.CENTER);

        Birthday birthday1 = new Birthday();
        birthday1.setAlignment(Pos.CENTER);

        GenerateProfile gen1 = new GenerateProfile();
        gen1.setAlignment(Pos.CENTER);

        ColorPick accent = new ColorPick();
        accent.setAlignment(Pos.CENTER);

        Bio bio1 = new Bio();
        bio1.setAlignment(Pos.CENTER);

        LightDark lightDark = new LightDark();
        lightDark.setAlignment(Pos.CENTER);

        Link link = new Link();
        link.setAlignment(Pos.CENTER);

        VBox root = new VBox(name1, picture1, birthday1, accent, gen1, bio1);
        Scene scene = new Scene(root, 800, 900);

        primaryStage.initStyle(StageStyle.DECORATED); // This line is optional, just to ensure the stage has decorations
        primaryStage.initStyle(StageStyle.UNDECORATED); // Remove default decorations
        scene.getRoot().setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-padding: 10px;"); // Customize border color and width

        primaryStage.setTitle("Profile Gen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}