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
public class InkBasedWritingUtensil extends WritingUtensil {

    public InkBasedWritingUtensil(String WritingUtensil, String thing) {
        super(WritingUtensil, thing);
    }
    private String InkBasedWritingUtensil;
    
    public String getInkBasedWritingUtensil() {
        return InkBasedWritingUtensil;
    }

    public void setInkBasedWritingUtensil(String InkBasedWritingUtensil) {
        this.InkBasedWritingUtensil = InkBasedWritingUtensil;
    }
    
}
