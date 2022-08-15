/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.Relation_Exercises.MP3_Exercise;
/**
 *
 * @author 20201sg.inf_i0035
 */
public class MP3 extends MultimidiaArchive{
    private int downloadNumber;

    public MP3(int downloadNumber, int duration, String author, String name, int KbytesSize, int visitsNumber) {
        super(duration, author, name, KbytesSize, visitsNumber);
        this.downloadNumber = downloadNumber;
    }
    
    public int getDownloadNumber() {
        return downloadNumber;
    }

    public void setDownloadNumber(int downloadNumber) {
        this.downloadNumber = downloadNumber;
    }

    @Override
    public void showData(){
        System.out.printf("The download number is %d", downloadNumber);
    }
    
    public void execute(int visitsNumber){
        System.out.println("The music is reproducing");
        visitsNumber = visitsNumber++;
    }
    
}
