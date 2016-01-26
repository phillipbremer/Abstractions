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
public class Pen extends InkBasedWritingUtensil {

    public Pen(String WritingUtensil, String thing) {
        super(WritingUtensil, thing);
    }
    private String Pen;

    public Pen(String Pen, String WritingUtensil, String thing) {
        super(WritingUtensil, thing);
        this.Pen = Pen;
    }

    public String getPen() {
        return Pen;
    }

    public void setPen(String Pen) {
        this.Pen = Pen;
    }
    
}
