/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk_002;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class FXMLLoginController implements Initializable {
    
    @FXML private Label lblUsername;
    @FXML private Label lblPassword;
    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    @FXML private Button btnLogin;
    static String userName;
    static String password;
  
//   @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        
//    }
    @FXML 
 public  void Login (ActionEvent event){
     
     int i =0;
       userName= txtUsername.getText();
       String password=txtPassword.getText();
        
       if(userName.equals("admin") && password.equals("123")){
         Parent root = null;
           try {
               root = FXMLLoader.load(getClass().getResource("FXMLRegister.fxml"));
           } catch (IOException ex) {
               Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
           }
          Scene scene = new Scene(root);
         Stage stage = new Stage();
          
         stage.setTitle("Register");
           stage.setScene(scene);
            stage.show();            
       }
       else{
           Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Check your username and password");
            message.showAndWait();
        }
       
       
       
       
//
//
//
// Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
//        
//        Scene scene = new Scene(root);
//      
//        Stage stage= (Stage) (((Node)event.getSource()).getScene().getWindow());
//        stage.setTitle("Login");
//        stage.setScene(scene);
//        stage.show();
//






 }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
