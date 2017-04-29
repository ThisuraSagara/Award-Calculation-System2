
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLEnrollmentController implements Initializable {

    @FXML private Button btnGPA;
    @FXML private Button btnDegreeTitle; 
    @FXML private Label  lblmessagegpa;
    @FXML private Label  lblmessagedegreetitle;
    static int credit;
    static double gpa;
    static int couse;
    
    
    public void window(double gpa1, int credit1, int couse1){
        gpa= gpa1;
        credit = credit1;
        couse = couse1;
        System.out.println(gpa);
        Parent root = null;
           try {
               root = FXMLLoader.load(getClass().getResource("FXMLEnrollment.fxml"));
           } catch (IOException ex) {
               Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
           }
          Scene scene = new Scene(root);
         Stage stage = new Stage();
     
         stage.setTitle("Grades");
           stage.setScene(scene);
            stage.show();  
            
            
    } 
    
    public void gpa(ActionEvent Event){
        lblmessagegpa.setText(String.valueOf(gpa));
    }
    
    public void degree(ActionEvent Event){
        if (couse == 1){
        if (30 <= credit){
            if(gpa <= 4.0 && gpa >= 3.70){
                lblmessagedegreetitle.setText("MSc by Coursework with Distinction");
            }else if(gpa <= 3.69 && gpa >= 3.50){
                lblmessagedegreetitle.setText("MSc by Coursework with Merit");
            }else if(gpa <= 3.49 && gpa >= 3.00){
                lblmessagedegreetitle.setText("MSc by Coursework with Pass");
            }
                }else if (25 <= credit && 30 > credit){
            if(gpa <= 2.99 && gpa >= 2.75){
               lblmessagedegreetitle.setText("Postgraduate Diploma in Computer Science");
            }
        }else{
                    lblmessagedegreetitle.setText("you got "+credit+", its not enough for a MSc or Diploma");
                }
        }
        
        if (couse == 2){
        if (30 <= credit){
            if(gpa <= 4.0 && gpa >= 3.70){
                lblmessagedegreetitle.setText("MSc by Research with Distinction");
            }else if(gpa <= 3.69 && gpa >= 3.50){
                lblmessagedegreetitle.setText("MSc by Research with Merit");
            }else if(gpa <= 3.49 && gpa >= 3.00){
                lblmessagedegreetitle.setText("MSc by Research with Pass");
            }
                
        }else{
                    lblmessagedegreetitle.setText("you got "+credit+", its not enough for a MSc or Diploma");
                }
        }
        
        if (couse == 3){
        if (30 <= credit){
            if(gpa <= 4.0 && gpa >= 3.70){
                lblmessagedegreetitle.setText("MSc by Coursework and Research with Distinction");
            }else if(gpa <= 3.69 && gpa >= 3.50){
                lblmessagedegreetitle.setText("MSc by Coursework and Research with Merit");
            }else if(gpa <= 3.49 && gpa >= 3.00){
                lblmessagedegreetitle.setText("MSc by Coursework and Research with Pass");
            }
                
        }else{
                    lblmessagedegreetitle.setText("you got "+credit+", its not enough for a MSc or Diploma");
                }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
