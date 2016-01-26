/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author pbremer
 */
public class WritingUtensil extends thing {

    public WritingUtensil(String thing) {
        super(thing);
    }
    private String WritingUtensil;

    public WritingUtensil(String WritingUtensil, String thing) {
        super(thing);
        this.WritingUtensil = WritingUtensil;
    }

    public String getWritingUtensil() {
        return WritingUtensil;
    }

    public void setWritingUtensil(String WritingUtensil) {
        this.WritingUtensil = WritingUtensil;
    }
    
}
