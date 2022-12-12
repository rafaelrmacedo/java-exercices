package rafaelmacedo_prova11;

import javax.swing.JOptionPane;

public class Grades{
     int[] grades = new int[10]; //array w/ 10 positions
        int reprovedStudents = 0;
        int recuperationStudents = 0;
        int approvedStudents = 0;
        
        public void CalculateGrades(){
            
            for(int i = 0; i < grades.length; i++){
                grades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Type a grade for student:"));
                
                if(grades[i] < 5){
                    reprovedStudents++;
                } else if (grades[i] > 4 && grades[i] < 7){
                    recuperationStudents++;
                } else {
                    approvedStudents++;
                }
            }
        }
        
        public void ShowGrades(){
            int count = 1;
            for(int value : grades){
                JOptionPane.showMessageDialog(null, count + "º Grade: " + value);
                count++;
            }
        }
        
        public void ShowApprovedStudents(){
            JOptionPane.showMessageDialog(null, "The amount of approved students is " + approvedStudents);
        }
        
        public void ShowRecuperationStudents(){
            JOptionPane.showMessageDialog(null, "The amount of recuperations students is " + recuperationStudents);
        }
        
        public void ShowBiggerGrade(){
            int biggestGrade = 0;
            
            for(int i = 1; i <= grades.length; i++){
                if(grades[i] > biggestGrade){
                    biggestGrade = grades[i];
                } 
            }
                  
            JOptionPane.showMessageDialog(null, "The biggest grade is " + biggestGrade);        
        }
        
        public void ShowAverageGrades(){
            float averageGrades;
            float average = 0;
            for(int value : grades){
                average = average + value;
            }
            averageGrades = average / 10;
            
            JOptionPane.showMessageDialog(null, "The average grades is " + average);
        }
               
            
}
