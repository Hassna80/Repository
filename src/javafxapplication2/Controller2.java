/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;



import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class Controller2  {

    @FXML
    public AnchorPane x;
    @FXML
    public TextField user;
    @FXML
    public TextField pass;
    @FXML
    public Button btn2;
    @FXML
    public Button X;
   
 
      
	String URL="jdbc:mysql://localhost/locchambre";
	String PASSWORD="";
	public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
        Connection connection = null ;
        
        ResultSet r=null;
        @FXML
     public void button(ActionEvent event) throws SQLException {
        try {
			Class.forName(DRIVER_CLASS);
			connection=DriverManager.getConnection(URL, "root","");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
        
		 
		
		 
    }
}


   

