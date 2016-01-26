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
public class ImperialIIClassDestroyer extends Destroyer {

    public ImperialIIClassDestroyer(String Warship, String Vessel, String thing) {
        super(Warship, Vessel, thing);
    }
    private String ImperialIIClassDestroyer;

    public ImperialIIClassDestroyer(String ImperialIIClassDestroyer, String Warship, String Vessel, String thing) {
        super(Warship, Vessel, thing);
        this.ImperialIIClassDestroyer = ImperialIIClassDestroyer;
    }

    public String getImperialIIClassDestroyer() {
        return ImperialIIClassDestroyer;
    }

    public void setImperialIIClassDestroyer(String ImperialIIClassDestroyer) {
        this.ImperialIIClassDestroyer = ImperialIIClassDestroyer;
    }
    
}
