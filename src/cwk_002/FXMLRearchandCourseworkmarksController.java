/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk_002;

import static cwk_002.FXMLModuleMarksController.Module;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXMLRearchandCourseworkmarksController implements Initializable {
    
    int countAttendance = 0;
    int countPrimary = 0;
    int countCoreOptional = 0;
    int att=0;
    int mark=0;
   
     @FXML private Label lblInputHours; 
    @FXML private TextField txtInputHours;
    @FXML private TextField txtMarksSC411;
    @FXML private TextField txtAttemptSC411;
    @FXML private TextField txtMarksSC412;
    @FXML private TextField txtAttemptSC412;
    @FXML private TextField txtMarksSC413;
    @FXML private TextField txtAttemptSC413;
    @FXML private TextField txtAttemptSC414;
    @FXML private TextField txtMarksSC414;
    @FXML private TextField txtAttemptSC415;
    @FXML private TextField txtMarksSC415;
    @FXML private TextField txtAttemptSC418;
    @FXML private TextField txtMarksSC418;
    @FXML private TextField txtAttemptSC417;
    @FXML private TextField txtMarksSC417;
    @FXML private TextField txtAttemptSC531;
    @FXML private TextField txtMarksSC531;
    @FXML private TextField txtAttemptSC535;
    @FXML private TextField txtMarksSC535;
    @FXML private TextField txtAttemptSC537;
    @FXML private TextField txtMarksSC537;
    @FXML private TextField txtAttemptSC538;
    @FXML private TextField txtMarksSC538;
    @FXML private TextField txtAttemptSC539;
    @FXML private TextField txtMarksSC539;
    @FXML private TextField txtAttemptSC546;
    @FXML private TextField txtMarksSC546;
    @FXML private TextField txtAttemptSC554;
    @FXML private TextField txtMarksSC554;
    @FXML private TextField txtAttemptSC555;
    @FXML private TextField txtMarksSC555;
    @FXML private TextField txtAttemptSC597;
    @FXML private TextField txtMarksSC597;
    @FXML private TextField txtAttemptSC532;
    @FXML private TextField txtMarksSC532;
    @FXML private TextField txtAttemptSC533;
    @FXML private TextField txtMarksSC533;
    @FXML private TextField txtAttemptSC534;
    @FXML private TextField txtMarksSC534;
    @FXML private TextField txtAttemptSC536;
    @FXML private TextField txtMarksSC536;
    @FXML private TextField txtAttemptSC540;
    @FXML private TextField txtMarksSC540;
    @FXML private TextField txtAttemptSC541;
    @FXML private TextField txtMarksSC541;
    @FXML private TextField txtAttemptSC542;
    @FXML private TextField txtMarksSC542;
    @FXML private TextField txtAttemptSC543;
    @FXML private TextField txtMarksSC543;
    @FXML private TextField txtAttemptSC547;
    @FXML private TextField txtMarksSC547;
    @FXML private TextField txtAttemptSC548;
    @FXML private TextField txtMarksSC548;
    @FXML private TextField txtAttemptSC549;
    @FXML private TextField txtMarksSC549;
    @FXML private TextField txtAttemptSC550;
    @FXML private TextField txtMarksSC550;
    @FXML private TextField txtAttemptSC551;
    @FXML private TextField txtMarksSC551;
    @FXML private TextField txtAttemptSC552;
    @FXML private TextField txtMarksSC552;
    @FXML private TextField txtAttemptSC553;
    @FXML private TextField txtMarksSC553;
    @FXML private TextField txtAttemptSC556;
    @FXML private TextField txtMarksSC556;
    @FXML private TextField txtAttemptSC557;
    @FXML private TextField txtMarksSC557;
    @FXML private TextField txtAttemptSC558;
    @FXML private TextField txtMarksSC558;
    @FXML private TextField txtAttemptSC559;
    @FXML private TextField txtMarksSC559;
    @FXML private TextField txtAttemptSC560;
    @FXML private TextField txtMarksSC560;
    @FXML private TextField txtAttemptSC561;
    @FXML private TextField txtMarksSC561;
    @FXML private Button btnCheckAttendance;
    @FXML private Label  lblmessage;
    @FXML private CheckBox CheckBox1;
    @FXML private CheckBox CheckBox2;
    @FXML private TextField txtMarksSC599;
    @FXML private TextField txtMarksSC598;
    @FXML private Label lblmessageSC411;
    @FXML private Label lblmessageSC412;
    @FXML private Label lblmessageSC414;
    @FXML private Label lblmessageSC415;
     @FXML private Label lblmessageSC416;
    @FXML private Label lblmessageSC418;
    @FXML private Label lblmessageSC417;
    
    //@FXML private CheckBox seminar;
    
    
    static ArrayList<ModuleMarks> Module = new ArrayList<ModuleMarks>();
    
    public void CheckAttendance (ActionEvent Event ) {
     try{   
      int InputHours = Integer.parseInt(txtInputHours.getText());
        double att;
        att=(InputHours/1190.00)*100;
     lblmessage.setText(String.valueOf(att));
     if(att<80.00){
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("attendance should be more than 80%");
            message.showAndWait();
     }else{
         countAttendance = 1;
     }
       }catch(NumberFormatException ex){ // handle your exception
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Invalid input");
            message.showAndWait();
}
   
    }
    
    
    
    public void CalculateMarks (ActionEvent Event){
        
//----------------------------------------------------------------------------------------------------------------------------------------------
                
                try{ 

            if(countPrimary >= 1){
                
                countCoreOptional++;
                
                ModuleMarks SC531 = new ModuleMarks();
                SC531.setid ("SC531");
                SC531.setattempt (Integer.parseInt(txtAttemptSC531.getText()));
                SC531.setmarks (Integer.parseInt(txtMarksSC531.getText()));
                Module.add(SC531);
                ModuleMarks SC535 = new ModuleMarks();
                SC535.setid ("SC535");
                SC535.setattempt ( Integer.parseInt(txtAttemptSC535.getText()));
                SC535.setmarks(Integer.parseInt(txtMarksSC535.getText()));
                Module.add(SC535);
                ModuleMarks SC537 = new ModuleMarks();
                SC537.setid("SC537");
                SC537.setattempt (Integer.parseInt(txtAttemptSC537.getText()));
                SC537.setmarks ( Integer.parseInt(txtMarksSC537.getText()));
                Module.add(SC537);
                ModuleMarks SC538 = new ModuleMarks();
                SC538.setid ("SC538");
                SC538.setattempt(Integer.parseInt(txtAttemptSC538.getText()));
                SC538.setmarks ( Integer.parseInt(txtMarksSC538.getText()));
                Module.add(SC538); 
                ModuleMarks SC539 = new ModuleMarks();
                SC539.setid ("SC539");
                SC539.setattempt ( Integer.parseInt(txtAttemptSC539.getText()));
                SC539.setmarks (Integer.parseInt(txtMarksSC539.getText()));
                Module.add(SC539);
                ModuleMarks SC546 = new ModuleMarks();
                SC546.setid("SC546");
                SC546.setattempt ( Integer.parseInt(txtAttemptSC546.getText()));
                SC546.setmarks ( Integer.parseInt(txtMarksSC546.getText()));
                Module.add(SC546);
                ModuleMarks SC554= new ModuleMarks();
                SC554.setid("SC554");
                SC554.setattempt ( Integer.parseInt(txtAttemptSC554.getText()));
                SC554.setmarks ( Integer.parseInt(txtMarksSC554.getText()));
                Module.add(SC554);
                 ModuleMarks SC555 = new ModuleMarks();
                SC555.setid ("SC555");
                SC555.setattempt ( Integer.parseInt(txtAttemptSC555.getText()));
                SC555.setmarks (Integer.parseInt(txtMarksSC555.getText()));
                Module.add(SC555);
                ModuleMarks SC532 = new ModuleMarks();
                SC532.setid ("SC532");
                SC532.setattempt (Integer.parseInt(txtAttemptSC532.getText()));
                SC532.setmarks (Integer.parseInt(txtMarksSC532.getText()));
                Module.add(SC532);
                ModuleMarks SC533 = new ModuleMarks();
                SC533.setid ( "SC533");
                SC533.setattempt ( Integer.parseInt(txtAttemptSC533.getText()));
                SC533.setmarks (Integer.parseInt(txtMarksSC533.getText()));
                Module.add(SC533);
                ModuleMarks SC534 = new ModuleMarks();
                SC534.setid ("SC534");
                SC534.setattempt( Integer.parseInt(txtAttemptSC534.getText()));
                SC534.setmarks ( Integer.parseInt(txtMarksSC534.getText()));
                Module.add(SC534);
                ModuleMarks SC536 = new ModuleMarks();
                SC536.setid ("SC536");
                SC536.setattempt (Integer.parseInt(txtAttemptSC536.getText()));
                SC536.setmarks (Integer.parseInt(txtMarksSC536.getText()));
                Module.add(SC536);
                ModuleMarks SC540 = new ModuleMarks();
                SC540.setid ( "SC540");
                SC540.setattempt (Integer.parseInt(txtAttemptSC540.getText()));
                SC540.setmarks (Integer.parseInt(txtMarksSC540.getText()));
                Module.add(SC540);
                ModuleMarks SC541 = new ModuleMarks();
                SC541.setid ( "SC541");
                SC541.setattempt ( Integer.parseInt(txtAttemptSC541.getText()));
                SC541.setmarks(Integer.parseInt(txtMarksSC541.getText()));
                Module.add(SC541);
                ModuleMarks SC542 = new ModuleMarks();
                SC542.setid ("SC542");
                SC542.setattempt ( Integer.parseInt(txtAttemptSC542.getText()));
                SC542.setmarks (Integer.parseInt(txtMarksSC542.getText()));
                Module.add(SC542);
                ModuleMarks SC543 = new ModuleMarks();
                SC543.setid ( "SC543");
                SC543.setattempt ( Integer.parseInt(txtAttemptSC543.getText()));
                SC543.setmarks ( Integer.parseInt(txtMarksSC543.getText()));
                Module.add(SC543);
                ModuleMarks SC548 = new ModuleMarks();
                SC548.setid ("SC548");
                SC548.setattempt ( Integer.parseInt(txtAttemptSC548.getText()));
                SC548.setmarks ( Integer.parseInt(txtMarksSC548.getText()));
                Module.add(SC548);
                ModuleMarks SC549 = new ModuleMarks();
                SC549.setid("SC549");
                SC549.setattempt ( Integer.parseInt(txtAttemptSC549.getText()));
                SC549.setmarks ( Integer.parseInt(txtMarksSC549.getText()));
                Module.add(SC549);
                ModuleMarks SC550 = new ModuleMarks();
                SC550.setid ( "SC550");
                SC550.setattempt ( Integer.parseInt(txtAttemptSC550.getText()));
                SC550.setmarks ( Integer.parseInt(txtMarksSC550.getText()));
                Module.add(SC550);
                ModuleMarks SC551 = new ModuleMarks();
                SC551.setid ( "SC551");
                SC551.setattempt ( Integer.parseInt(txtAttemptSC551.getText()));
                SC551.setmarks ( Integer.parseInt(txtMarksSC551.getText()));
                Module.add(SC551);
                ModuleMarks SC552 = new ModuleMarks();
                SC552.setid ( "SC552");
                SC552.setattempt ( Integer.parseInt(txtAttemptSC552.getText()));
                SC552.setmarks (Integer.parseInt(txtMarksSC552.getText()));
                Module.add(SC552);
                ModuleMarks SC553 = new ModuleMarks();
                SC553.setid ( "SC553");
                SC553.setattempt ( Integer.parseInt(txtAttemptSC553.getText()));
                SC553.setmarks (Integer.parseInt(txtMarksSC553.getText()));
                Module.add(SC553);
                ModuleMarks SC556 = new ModuleMarks();
                SC556.setid ( "SC556");
                SC556.setattempt ( Integer.parseInt(txtAttemptSC556.getText()));
                SC556.setmarks ( Integer.parseInt(txtMarksSC556.getText()));
                Module.add(SC556);
                ModuleMarks SC557 = new ModuleMarks();
                SC557.setid ("SC557");
                SC557.setattempt ( Integer.parseInt(txtAttemptSC557.getText()));
                SC557.setmarks ( Integer.parseInt(txtMarksSC557.getText()));
                Module.add(SC557);
                ModuleMarks SC558 = new ModuleMarks();
                SC558.setid ("SC558");
                SC558.setattempt (Integer.parseInt(txtAttemptSC558.getText()));
                SC558.setmarks ( Integer.parseInt(txtMarksSC558.getText()));
                Module.add(SC558);
                ModuleMarks SC559 = new ModuleMarks();
                SC559.setid ("SC559");
                SC559.setattempt ( Integer.parseInt(txtAttemptSC559.getText()));
                SC559.setmarks (Integer.parseInt(txtMarksSC559.getText()));
                Module.add(SC559);
                ModuleMarks SC560 = new ModuleMarks();
                SC560.setid ("SC560");
                SC560.setattempt (Integer.parseInt(txtAttemptSC560.getText()));
                SC560.setmarks ( Integer.parseInt(txtMarksSC560.getText()));
                Module.add(SC560);
                ModuleMarks SC561 = new ModuleMarks();
                SC561.setid ("SC561");
                SC561.setattempt ( Integer.parseInt(txtAttemptSC561.getText()));
                SC561.setmarks ( Integer.parseInt(txtMarksSC561.getText()));
                Module.add(SC561);     
                
                att=0;
                mark=0;
                for(int j = 6;j < Module.size();j++){
                    if(Module.get(j).getattempt()>3){
                        att++;
                    }
                    if(Module.get(j).getmarks()>100){
                        mark++;
                    }
                }
                if(att>0){
                    Module.clear();
                    Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("In valid attempt");
            message.showAndWait();
            countCoreOptional=0;
            primary();
                }
                
                if(mark>0){
                    Module.clear();
                    Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("In valid marks");
            message.showAndWait();
            countCoreOptional=0;
            primary();
                }

            }else{
                 Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("First you have to check Primary Models");
            message.showAndWait();
            }
            
            }catch(NumberFormatException ex){ // handle your exception
            Module.clear();
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Invalid input");
            message.showAndWait();
            countCoreOptional=0;
                    primary();
            }
    }
    
    public void primary(){
        
                try{
                    Module.clear();
                    countCoreOptional=0;
                countPrimary++;
                
                
                ModuleMarks SC411 = new ModuleMarks();
                SC411.setid("SC411");
                SC411.setattempt(Integer.parseInt(txtAttemptSC411.getText()));
                SC411.setmarks ( Integer.parseInt(txtMarksSC411.getText()));
                Module.add(SC411);
                ModuleMarks SC412 = new ModuleMarks();
                SC412.setid ( "SC412");
                SC412.setattempt (Integer.parseInt(txtAttemptSC412.getText()));
                SC412.setmarks ( Integer.parseInt(txtMarksSC412.getText()));
                Module.add(SC412);
                ModuleMarks SC414 = new ModuleMarks();
                SC414.setid("SC414");
                SC414.setattempt(Integer.parseInt(txtAttemptSC414.getText()));
                SC414.setmarks(Integer.parseInt(txtMarksSC414.getText()));
                Module.add(SC414);
                ModuleMarks SC415 = new ModuleMarks();
                SC415.setid ("SC415");
                SC415.setattempt (Integer.parseInt(txtAttemptSC415.getText()));
                SC415.setmarks ( Integer.parseInt(txtMarksSC415.getText()));
                Module.add(SC415);
                ModuleMarks SC418= new ModuleMarks();
                SC418.setid("SC418");
                SC418.setattempt(Integer.parseInt(txtAttemptSC418.getText()));
                SC418.setmarks( Integer.parseInt(txtMarksSC418.getText()));
                Module.add(SC418);
                ModuleMarks SC417 = new ModuleMarks();
                SC417.setid ("SC417");
                SC417.setattempt (Integer.parseInt(txtAttemptSC417.getText()));
                SC417.setmarks (Integer.parseInt(txtMarksSC417.getText()));
                Module.add(SC417);
        
        
                if(CheckBox1.isSelected()) { //checkbox 
                  lblmessageSC416.setText("Pass");
              }else{lblmessageSC416.setText("Fail");
        } 
                
        if(Module.get(0).getmarks()>=34&& Module.get(0).getmarks()<=100 && Module.get(0).getattempt()>0 && Module.get(0).getattempt()<=3){
       lblmessageSC411.setText("Pass");
          }else{lblmessageSC411.setText("Fail");
        }
        
        if(Module.get(1).getmarks()>=34 && Module.get(1).getmarks()<=100 && Module.get(1).getattempt()>0 && Module.get(1).getattempt()<=3){
         lblmessageSC412.setText("Pass");
          }else{lblmessageSC412.setText("Fail");
        }
        
        if(Module.get(2).getmarks()>=34 && Module.get(2).getmarks()<=100 && Module.get(2).getattempt()>0 && Module.get(2).getattempt()<=3){
         lblmessageSC414.setText("Pass");
          }else{lblmessageSC414.setText("Fail");
        }
        
        if(Module.get(3).getmarks()>=34 && Module.get(3).getmarks()<=100 && Module.get(3).getattempt()>0 && Module.get(3).getattempt()<=3){
         lblmessageSC415.setText("Pass");
          }else{lblmessageSC415.setText("Fail");
        }
        
        if(Module.get(4).getmarks()>=34 && Module.get(4).getmarks()<=100 && Module.get(4).getattempt()>0 && Module.get(4).getattempt()<=3){
         lblmessageSC418.setText("Pass");
          }else{lblmessageSC418.setText("Fail");
        }
        
        if(Module.get(5).getmarks()>=34 && Module.get(5).getmarks()<=100 && Module.get(5).getattempt()>0 && Module.get(5).getattempt()<=3){
         lblmessageSC417.setText("Pass");
          }else{lblmessageSC417.setText("Fail");
        }
        
                int att1=0;
                int mark1=0;
                for(int j = 0;j < 6;j++){
                    if(Module.get(j).getattempt()>3){
                        att1++;
                    }
                    if(Module.get(j).getmarks()>100){
                        mark1++;
                    }
                }
                if(att1>0){
                    Module.clear();
                    Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("In valid attempt");
            message.showAndWait(); 
            countPrimary=0;
                }
                
                if(mark1>0){
                    Module.clear();
                    Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("In valid marks");
            message.showAndWait();
            countPrimary=0;
                }
        
        }catch(NumberFormatException ex){ // handle your exception
            Module.clear();
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Invalid input");
            message.showAndWait();
            countPrimary=0;
            }

        
    }
     
     public void marks() {
         
         if(countAttendance == 1){
         
         if(countCoreOptional>=1){
         
         int coreModuleCount = 0;
         
         
         for(int j=6; j<=13; j++){
             if(Module.get(j).getmarks()>0 && Module.get(j).getmarks()<=100 && Module.get(j).getattempt()>0 && Module.get(j).getattempt()<=3){
             coreModuleCount++;
         }
         }
         
         if(CheckBox2.isSelected()) { //checkbox 
                 
              }else{
             coreModuleCount = 0;
        }
         
         if(att != 0 && mark != 0){
             coreModuleCount = 0;
         }
         
         
         
         if (coreModuleCount == 8){
        int attempt = 0;
        int APlus = 0;
        int A = 0;
        int AM =0;
        int BPlus = 0;
        int B = 0;
        int BM = 0;
        int CPlus = 0;
        int C = 0;
        int F = 0;
        int credit = 0;
        double gpa = 0;
//        String Grade="";
       
//        double number = 0;
//        int totalCredits = 0;
//        int totalCreditsEarned = 0;
                
//        for(int i = 6;i < 15;i++){
//            if(Module.get(i).getmarks()>=0 && Module.get(i).getmarks()<=34){
//                  // If student fail a core module.
//             }
//        }
//        if(Module.get(0).getmarks()>=0 && Module.get(0).getmarks()<=34){
//         lblmessageSC411.setText("Fail");
//        }
//        if(Module.get(1).getmarks()>=0 && Module.get(1).getmarks()<=34){
//         lblmessageSC412.setText("Fail");
//        }
//        if(Module.get(2).getmarks()>=0 && Module.get(2).getmarks()<=34){
//         lblmessageSC414.setText("Fail");
//        }
//        if(Module.get(3).getmarks()>=0 && Module.get(3).getmarks()<=34){
//         lblmessageSC415.setText("Fail");
//        }
//        if(Module.get(1).getmarks()>=0 && Module.get(4).getmarks()<=34){
//         lblmessageSC418.setText("Fail");
//        }
//        if(Module.get(1).getmarks()>=0 && Module.get(6).getmarks()<=34){
//         lblmessageSC417.setText("Fail");
//        }  
//       if(Module.get(0).getmarks()>=0 && Module.get(0).getmarks()<=34){
//         lblmessageSC411.setText("Fail");
//       }else{lblmessageSC411.setText("Pass");
//        }
//        if(Module.get(1).getmarks()>=0 && Module.get(1).getmarks()<=34){
//         lblmessageSC412.setText("Fail");
//          }else{lblmessageSC412.setText("Pass");
//        }
//        if(Module.get(2).getmarks()>=0 && Module.get(2).getmarks()<=34){
//         lblmessageSC414.setText("Fail");
//          }else{lblmessageSC414.setText("Pass");
//        }
//        if(Module.get(3).getmarks()>=0 && Module.get(3).getmarks()<=34){
//         lblmessageSC415.setText("Fail");
//          }else{lblmessageSC415.setText("Pass");
//        }
//        if(Module.get(1).getmarks()>=0 && Module.get(4).getmarks()<=34){
//         lblmessageSC418.setText("Fail");
//          }else{lblmessageSC418.setText("Pass");
//        }
//        if(Module.get(1).getmarks()>=0 && Module.get(6).getmarks()<=34){
//         lblmessageSC417.setText("Fail");
//          }else{lblmessageSC417.setText("Pass");
//        }

         
                  
              for(int i = 6;i < Module.size();i++){
                   
//          if(CheckBox2.isSelected() ) {
//                    credit++;
//                     }

            if(Module.get(i).getattempt()==1){
                
                 if(Module.get(i).getmarks()>=85 && Module.get(i).getmarks()<=100){
                APlus++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=70 && Module.get(i).getmarks()<=84){
                A++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=65 && Module.get(i).getmarks()<=69){
                AM++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=60 && Module.get(i).getmarks()<=64){
                BPlus++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=55 && Module.get(i).getmarks()<=59){
                B++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=45 && Module.get(i).getmarks()<=54){
                BM++;
                 credit+=2;
                }else if(Module.get(i).getmarks()>=40 && Module.get(i).getmarks()<=44){
                CPlus++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=35 && Module.get(i).getmarks()<=39){
                C++;
                credit+=2;
                }else if(Module.get(i).getmarks()>0 && Module.get(i).getmarks()<=34){
                F++;
                }
//                if(checkbox1.isSelected() ) { //checkbox 
//                      credit++;
//                      } 
//                if(checkbox2.isSelected() ) {
//                      credit++;
//                      }
                  
            }else if(Module.get(i).getattempt()==2){
                
                attempt+=2;
                if(Module.get(i).getmarks()>=55 && Module.get(i).getmarks()<=100){
                B++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=45 && Module.get(i).getmarks()<=54){
                BM++;
                 credit+=2;
                }else if(Module.get(i).getmarks()>=40 && Module.get(i).getmarks()<=44){
                CPlus++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=35 && Module.get(i).getmarks()<=39){
                C++;
                credit+=2;
                }else if(Module.get(i).getmarks()>0 && Module.get(i).getmarks()<=34){
                F++;
                }
//                  if(checkbox1.isSelected() ) { //checkbox 
//                      credit++;
//                      } 
//                if(checkbox2.isSelected() ) {
//                      credit++;
//                      }
                
                  }else if(Module.get(i).getattempt()==3){
                      
                attempt+=2;
               
                if(Module.get(i).getmarks()>=55 && Module.get(i).getmarks()<=100){
                B++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=45 && Module.get(i).getmarks()<=54){
                BM++;
                 credit+=2;
                }else if(Module.get(i).getmarks()>=40 && Module.get(i).getmarks()<=44){
                CPlus++;
                credit+=2;
                }else if(Module.get(i).getmarks()>=35 && Module.get(i).getmarks()<=39){
                C++;
                credit+=2;
                }else if(Module.get(i).getmarks()>0 && Module.get(i).getmarks()<=34){
                F++;
                }
                
                
//                if(checkbox1.isSelected() ) { //checkbox 
//                      credit++;
//                      } 
//                if(checkbox2.isSelected() ) {
//                      credit++;
//                      }
               
            }
//                  else{
//                      if(Module.get(i).getattempt()==4){  
//                
//            Alert message = new Alert(Alert.AlertType.INFORMATION);
//            message.setHeaderText("attention");
//            message.setContentText("u have to apply Resit ");
//            message.showAndWait();
//            break;
//            
//                     }
//
//            }
            }  
              if(attempt<=15){
                  if(attempt > 0 && attempt<=5){
                      Alert message = new Alert(Alert.AlertType.INFORMATION);
                    message.setHeaderText("Attention");
                    message.setContentText("You got "+attempt+" credits Free of charge");
                    message.showAndWait();
                  }else if(attempt > 5 && attempt<=15){
                      int a=attempt-5;
                      Alert message = new Alert(Alert.AlertType.INFORMATION);
                    message.setHeaderText("Attention");
                    message.setContentText("You got 5 credits Free of charge and "+a+" ctedits");
                    message.showAndWait();
                  }
                  
                  int AplusCredit = APlus*2;
            int ACredit =A*2;
            int AMCredit = AM*2;
            int BplusCredit = BPlus*2;
            int BCredit = B*2;
            int BMCredit = BM * 2;
            int CplusCredit = CPlus * 2;
            int CCredit = C*2;
            
            double totalCredit =  AplusCredit*4.0 + ACredit*4.0 + AMCredit*3.7 + BplusCredit*3.3 + BCredit*3.0 + BMCredit*2.7 + CplusCredit*2.3 + CCredit*2.0;
            gpa = totalCredit/credit;
            credit++;
            
            int RearchMark =0;
            
            if(gpa >= 3.00 && credit >= 30){
                RearchMark = Integer.parseInt(txtMarksSC598.getText());
            }
            
            if(RearchMark>34 && RearchMark<=100){
             credit=credit+15;
             FXMLEnrollmentController a = new FXMLEnrollmentController();
            a.window(gpa,credit,2);
         }else{
                FXMLEnrollmentController a = new FXMLEnrollmentController();
            a.window(gpa,credit,1);
            }
            
            
              }else{
                  Module.clear();
                  Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("Maximum you can have 15 credits from repeat modules");
            message.showAndWait();
            countCoreOptional=0;
            primary();
              }
              
            
              }else{
             Module.clear();
                 Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("You have to select every core module !");
            message.showAndWait(); 
            countCoreOptional=0;
            primary();
            }
           
          
//                 Alert message = new Alert(Alert.AlertType.INFORMATION);
//            message.setHeaderText("attention");
//            message.setContentText("pass/ Fail");
//            message.showAndWait(); 
     }else{
                 Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("First you have to Calculate Module Marks !");
            message.showAndWait(); 
            } 
        
     }else{
             Module.clear();
             Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Attention");
            message.setContentText("First you have to Check Attendance !");
            message.showAndWait();
            countCoreOptional=0;
            countPrimary=0;
         }
     
     }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

        }