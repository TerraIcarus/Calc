package com.example.calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text OutText;
    private long num1=0;
    private long num2=0;

    private boolean start = true;

    private String op="";
    private Model model =new Model();



    @FXML
    private void numbers(ActionEvent event)
    {
        if (start){
            OutText.setText("");
            start=false;
        }
        String value = ((Button)event.getSource()).getText();
        OutText.setText(OutText.getText()+value);
    }

    @FXML
    private void operators(ActionEvent event)
    {
        String value = ((Button)event.getSource()).getText();
        if(!"=".equals(value))
        {
            if (!op.isEmpty()) return;
            op = value;
            num1=Long.parseLong(OutText.getText());
            OutText.setText("");
        }
        else
        {
            if(op.isEmpty()) return;
            OutText.setText(String.valueOf(model.Calculation(num1,Long.parseLong(OutText.getText()),op)));
            op ="";
            start=true;
        }
    }
}

