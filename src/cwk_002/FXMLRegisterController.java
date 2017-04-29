
package cwk_002;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author User
 */

public class FXMLRegisterController implements Initializable {
    @FXML private Label lblRegNumber;
    @FXML private Label lblFirstName;
    @FXML private Label lblLastName;
    @FXML private Label lblDegreeTitle;
    @FXML private Label lblmessage;
    @FXML private TextField txtRegNumber;
    @FXML private TextField txtFirstName;
    @FXML private TextField txtLastName;
    @FXML private Button        btnSubmit;
    @FXML private RadioButton   oneRadioButton;
    @FXML private RadioButton   twoRadioButton;
    @FXML private RadioButton   threeRadioButton;
    
    

    static ArrayList<Student> A = new ArrayList<Student>();
      
    
     public void Submit(ActionEvent Event ) {
         
        String message= "";
        String  FirstName    =   txtFirstName.getText();
        String  LastName     =   txtLastName.getText();
        String  RegNumber    =   txtRegNumber.getText();
        
        
        if(oneRadioButton.isSelected() ) {
            message += oneRadioButton.getText()+"\n";
             Parent root = null;
           try {
               root = FXMLLoader.load(getClass().getResource("FXMLModuleMarks.fxml"));
           } catch (IOException ex) {
               Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
           }
          Scene scene = new Scene(root);
         Stage stage = new Stage();
     
           
         stage.setTitle("Modules");
           stage.setScene(scene);
            stage.show(); 
            
        }
        //-----------------------------------------------------------------------------------------------------------------------------
        if(twoRadioButton.isSelected() ) {
            message += twoRadioButton.getText()+"\n";
            Parent root = null;
           try {
               root = FXMLLoader.load(getClass().getResource("FXMLResearchmodulemarks.fxml"));
           } catch (IOException ex) {
               Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
           }
          Scene scene = new Scene(root);
         Stage stage = new Stage();
     
           
         stage.setTitle("Reaserch ");
           stage.setScene(scene);
            stage.show(); 
            
        }
        //------------------------------------------------------------------------------------------------------------------------------------
        if(threeRadioButton.isSelected() ) {
            message +=threeRadioButton.getText()+"\n";
             Parent root = null;
           try {
               root = FXMLLoader.load(getClass().getResource("FXMLRearchandCourseworkmarks.fxml"));
           } catch (IOException ex) {
               Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
           }
          Scene scene = new Scene(root);
         Stage stage = new Stage();
     
           
         stage.setTitle("Reaserch and coursework ");
           stage.setScene(scene);
            stage.show(); 
        }
        
        
        lblmessage.setText(message);
        
        
        Student st = new Student();
        st.setFirstName(FirstName);
        st.setLastName(LastName);
        st.setRegNumber(RegNumber);
      
        A.add(st);
//        Parent root = null;
//           try {
//               root = FXMLLoader.load(getClass().getResource("FXMLModuleMarks.fxml"));
//           } catch (IOException ex) {
//               Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
//           }
//          Scene scene = new Scene(root);
//         Stage stage = new Stage();
//     
//           
//         stage.setTitle("Modules");
//           stage.setScene(scene);
//            stage.show(); 
//            
            

     }
     
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
