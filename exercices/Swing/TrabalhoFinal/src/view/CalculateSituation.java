package view;

import bean.RegisterIntoDB;

public class CalculateSituation {
    
    RegisterIntoDB registerDB = new RegisterIntoDB();
    Double average;
    String situation;  
    
    public Double CalcGrades(RegisterIntoDB registerDB){
        
        Double fisicsGrade = registerDB.getFisica();
        Double historyGrade = registerDB.getHistoria();
        Double mathGrade = registerDB.getMatematica();
        
        average = (fisicsGrade + historyGrade + mathGrade) / 3;

        registerDB.setMedia(average);
        
        return average;
    }
    
    public String CalcSituation(RegisterIntoDB registerDB){
        
        if(average <= 4){
            situation = "Reprovado";
        }
        if(average < 6){
            situation = "Recuperação";
        }
        if(average >= 6){
            situation = "Aprovado";
        }
        
        registerDB.setSituacaoAluno(situation);
        
        return situation;
    }
    
}
