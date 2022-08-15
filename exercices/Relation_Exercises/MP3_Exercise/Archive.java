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
public class Archive {
    String name;
    int KbytesSize;
    int visitsNumber;

    public Archive(String name, int KbytesSize, int visitsNumber) {
        this.name = name;
        this.KbytesSize = KbytesSize;
        this.visitsNumber = visitsNumber;
    }

    public void showData(){
        System.out.printf("The archive name is %s", name);
        System.out.printf("The archive size is %d", KbytesSize);
    }
    
}
