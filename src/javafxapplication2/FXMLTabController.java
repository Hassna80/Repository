/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;


import com.mysql.cj.xdevapi.Table;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
/**
 * FXML Controller class
 *
 * @author Dell
 */
public class FXMLTabController implements Initializable {
    @FXML 
    TableView <Table> tab;
    @FXML
    private TableColumn<?, ?> Id;
    @FXML
    private TableColumn<?, ?> M1SS;
    @FXML
    private TableColumn<?, ?> M2;
    @FXML
    private TableColumn<?, ?> M3;
    @FXML
    private TableColumn<?, ?> M4;
    @FXML
    private TableColumn<?, ?> M5;
    @FXML
    private TableColumn<?, ?> M6;
    @FXML
    private TableColumn<?, ?> M7;

     final ObservableList<Table> data =FXCollections.observableArrayList(
    
    
    );
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
}
