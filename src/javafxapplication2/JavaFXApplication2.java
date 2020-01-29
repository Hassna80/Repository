/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class JavaFXApplication2 extends Application {
     
    @Override
    public void start(Stage Stage1) throws IOException {
        
       Parent root1 = FXMLLoader.load(getClass().getResource("FXML1.fxml"));
       Scene scene1 = new Scene(root1);
       Stage1.setScene(scene1);
       Stage1.show();
       
       
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   
    
    
}
    
    
   
     
