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
public class StarDestroyer extends ImperialIIClassDestroyer {

    public StarDestroyer(String ImperialIIClassDestroyer, String Warship, String Vessel, String thing) {
        super(ImperialIIClassDestroyer, Warship, Vessel, thing);
    }
    private String StarDestroyer;

    public String getStarDestroyer() {
        return StarDestroyer;
    }

    public void setStarDestroyer(String StarDestroyer) {
        this.StarDestroyer = StarDestroyer;
    }
    
}
