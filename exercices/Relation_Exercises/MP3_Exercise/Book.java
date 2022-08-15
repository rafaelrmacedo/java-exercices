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
public class Book extends Archive{
    private int pageNumber;
    private int readNumber;
    
    public Book(int pageNumber, String name, int KbytesSize, int visitsNumber) {
        super(name, KbytesSize, visitsNumber);
        this.pageNumber = pageNumber;
    }
    
    public int getPageNumber() {
        return pageNumber;
    }

    public int getReadNumber() {
        return readNumber;
    }

    @Override
    public void showData(){
        System.out.println("");
    }
    
    public void read(){
        System.out.println("You're reading a book.");
        readNumber = readNumber++;
    }
    
}
