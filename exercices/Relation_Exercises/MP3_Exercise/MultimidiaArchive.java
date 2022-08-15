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
public class MultimidiaArchive extends Archive{
    int duration;
    String author;

    public MultimidiaArchive(int duration, String author, String name, int KbytesSize, int visitsNumber) {
        super(name, KbytesSize, visitsNumber);
        this.duration = duration;
        this.author = author;
    }

    //Override serve para avisar que o método já existe, mas está sendo reescrito
    @Override
    public void showData(){
        System.out.printf("Your archive duration is %d", duration);
        System.out.printf("The archive of this author is %s", author);
    }
    
}
