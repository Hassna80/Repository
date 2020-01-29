/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class Controller  {
    @FXML
    private Button x;
    @FXML
    private Button btn1;
    @FXML
    
    public void btnlog (ActionEvent event ) throws IOException{
       System.out.println("Bonjour!"); 
       Stage Stage2= new Stage();
       Parent root2 = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
       Scene scene2 = new Scene(root2);
       Stage2.setScene(scene2);
       Stage2.show();
    }
    
    @FXML
    public void btnx(ActionEvent event2)throws InterruptedException{
     
      Thread.sleep(1000);   
    }
    
   
    
    
}
    

   
    
    

