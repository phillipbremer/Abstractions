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
public class Destroyer extends Warship {

    public Destroyer(String Warship, String Vessel, String thing) {
        super(Warship, Vessel, thing);
    }
    private String Destroyer;

    public String getDestroyer() {
        return Destroyer;
    }

    public void setDestroyer(String Destroyer) {
        this.Destroyer = Destroyer;
    }
    
}
