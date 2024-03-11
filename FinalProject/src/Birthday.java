import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
//import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Birthday extends HBox{
    DatePicker datePicker;
    static Image image2;
    static Text ageLabel;

    public Birthday()
    {
        Label bdayLabel = new Label("Select your birthday");

        datePicker = new DatePicker(LocalDate.now());
        datePicker.setOnAction(this::processDateChoice);

        ageLabel = new Text("");

        HBox bdayBox = new HBox(bdayLabel, datePicker, ageLabel);
        bdayBox.setPadding(new Insets(15, 15, 15, 25));
        bdayBox.setSpacing(10);

        getChildren().addAll(bdayBox);
    }

    private void processDateChoice(ActionEvent actionEvent) {
        LocalDate birthDate = datePicker.getValue();
        LocalDate current = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthDate, current);
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();
        ageLabel.setText(age + " years old");

        if (month == 12)
        {
            if (day < 22) {
                image2 = new Image("zodiac\\Capricorn.png");
            } else {
                image2 = new Image("zodiac\\Capricorn.png");
            }
        }
        else if (month == 1)
        {
            if (day < 22)
            //"C:\\Users\\lasst\\Desktop\\Coding\\Java\\CSIT 501\\FinalProject\\zodiac\\Capricorn.png"
            {
                image2 = new Image("zodiac\\Capricorn.png");
            } else {
                image2 = new Image("zodiac\\Aquarius.png");
            }

        }

        else if (month == 2)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Aquarius.png");
            }else {
                image2 = new Image("zodiac\\Pisces.png");
            }

        }
        else if (month == 3)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Pisces.png");
            }else{
                image2 = new Image("zodiac\\Aries.png");
            }
        }

        else if (month == 4)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Aries.png");
            }else{
                image2 = new Image("zodiac\\Taurus.png");
            }
        }
        else if (month == 5)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Taurus.png");
            }else{
                image2 = new Image("zodiac\\Gemini.png");
            }
        }
        else if (month == 6)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Gemini.png");
            }else{
                image2 = new Image("zodiac\\Cancer.png");
            }
        }
        else if (month == 7)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Cancer.png");
            }else{
                image2 = new Image("zodiac\\Leo.png");
            }
        }
        else if (month == 8)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Leo.png");
            }else{
                image2 = new Image("zodiac\\Virgo.png");
            }
        }
        else if (month == 9)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Virgo.png");
            }else{
                image2 = new Image("zodiac\\Libra.png");
            }
        }
        else if (month == 10)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Libra.png");
            }else{
                image2 = new Image("zodiac\\Scorpio.png");
            }
        }
        else if (month == 11)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Scorpio.png");
            }else{
                image2 = new Image("zodiac\\Sagittarius.png");
            }
        }
        else if (month == 12)
        {
            if(day < 22)
            {
                image2 = new Image("zodiac\\Sagittarius.png");
            }else{
                image2 = new Image("zodiac\\Capricorn.png");
            }
        }


    }
}
