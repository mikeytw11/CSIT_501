import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class GenerateProfile extends HBox {
    Button submit, clear;
    VBox vbox2;
    HBox hbox;
    Label nameSet;

    public GenerateProfile(){

        submit = new Button("Generate Profile");
        submit.setOnAction(this::processSubmit);

        clear = new Button("Clear Form");
        clear.setOnAction(this::processClear);

        HBox subBox = new HBox(submit, clear);
        subBox.setPadding(new Insets(15, 15, 15, 25));
        subBox.setSpacing(10);
        getChildren().addAll(subBox);

    }

    private void processClear(ActionEvent actionEvent) {
    }

    private void processSubmit(ActionEvent actionEvent) {
        nameSet = new Label();
        nameSet.setText(Name.name.getText());

        ImageView profImg = new ImageView(Picture.image);
        profImg.setFitWidth(300);
        profImg.setPreserveRatio(true);

        ImageView img2 = new ImageView(Birthday.image2);
        img2.setFitWidth(100);
        img2.setPreserveRatio(true);

        hbox = new HBox(img2, Birthday.ageLabel);
        hbox.setPadding(new Insets(15, 15, 15, 25));
        hbox.setSpacing(10);
        getChildren().addAll(hbox);

        vbox2 = new VBox(nameSet, profImg, hbox);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setStyle("-fx-background-color: ghostwhite");

        ScrollPane root2 = new ScrollPane(vbox2);
        Scene secondScene = new Scene(root2, 900, 600);

        Stage newWindow = new Stage();
        newWindow.setTitle("Profile for" + Name.name.getText());
        newWindow.setScene(secondScene);

        newWindow.initModality(Modality.WINDOW_MODAL);

        newWindow.show();

        //newWindow.setX(primaryStage.getX());
    }
}
