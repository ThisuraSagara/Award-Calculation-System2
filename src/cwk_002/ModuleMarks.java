
package cwk_002;

import java.util.ArrayList;
import java.util.Scanner;


public class ModuleMarks {

    
    //Scanner sc = new Scanner(System.in);
        
        private String id ;
	private int marks = 0;
	private int attempt = 0;
        private  String grade;
//        
        
        public String getid() {
            return this.id;
        }
    public void setid(String id){
        this.id = id;
    }
        public int getmarks() {
            return this.marks;
        }
        public void setmarks(int marks) {
            this.marks= marks;
        }
        public int getattempt(){
            return this.attempt;
            
        }
        
        public void setattempt (int attempt){
            this.attempt = attempt;
            
        }
        public String getgrade() {
            return this.grade;
            
        }
        public void setgrade(String grade) {
            this.grade=grade;
        }

    
        }
        

        
        
        
        
        
        
        

