import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class NumberPane extends GridPane
{
    private Label result;
    private TextField number;
    public NumberPane()
    {
        Font font = new Font(18);

        Label inputLabel = new Label("Number:");
        inputLabel.setFont(font);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);

        Label outputLabel = new Label("Odd/Even?");
        outputLabel.setFont(font);
        GridPane.setHalignment(outputLabel, HPos.RIGHT);

        result = new Label("---");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);

        number = new TextField();
        number.setFont(font);
        number.setPrefWidth(50);
        number.setAlignment(Pos.CENTER);
        number.setOnAction(this::processReturn);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        //setStyle("-fx-background-color: yellow");

        add(inputLabel, 0, 0);
        add(number, 1,  0);
        add(outputLabel, 0, 1);
        add(result, 1, 1);
    }
    public void processReturn(ActionEvent event)
    {
        int num = Integer.parseInt(number.getText());
        if(num%2 == 0) {
            Image img = new Image("https://loodibee.com/wp-content/uploads/nhl-new-jersey-devils-logo.png");
            ImageView imgView = new ImageView(img);
                //System.out.println("That is even");
            }else {
                Image img = new Image("https://loodibee.com/wp-content/uploads/nhl-new-york-rangers-logo.png");
                ImageView imgView = new ImageView(img);
                //System.out.println("That is odd");
                result.setText(num + "");
            }
    }
}