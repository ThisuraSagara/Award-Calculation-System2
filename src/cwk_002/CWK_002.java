/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk_002;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */

public class CWK_002 extends Application {
    
       @Override
    public void start(Stage stage) throws Exception { 
        Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

// Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
//        
//        Scene scene = new Scene(root);
//      
//        //Stage stage= (Stage) (((Node)event.getSource()).getScene().getWindow());
//        stage.setTitle("Login");
//        stage.setScene(scene);
//        stage.show();
//


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
