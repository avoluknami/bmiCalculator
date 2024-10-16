package org.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
   private Label  myLabel1;
    @FXML
    private Label myLabel2;
    @FXML
   private TextField myText1;
    @FXML
    private TextField myText2;


@FXML
    private void calculate_BMI (){
        if(myText2.getText().trim().isEmpty() ||myText1.getText().trim().isEmpty()){
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setContentText("enter your height and weight correctly!");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();
        }else {
            float a = Float.parseFloat(myText1.getText());
            float b = Float.parseFloat(myText2.getText());
            float bmi = b/(a*a);
            myLabel1.setText(""+bmi);


            if(bmi<18.5){
                myLabel2.setText("underweight");;
            } else if (bmi>=18.5 && bmi<=24.9) {
                myLabel2.setText("normal");
            }else if (bmi>=25 && bmi<=29.9){
                myLabel2.setText("overweight");
            }else{
                myLabel2.setText("obese");
            }
        }
    }


    }


