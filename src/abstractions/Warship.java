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
public class Warship extends SpaceShip {

    public Warship(String Vessel, String thing) {
        super(Vessel, thing);
    }
    private String Warship;

    public Warship(String Warship, String Vessel, String thing) {
        super(Vessel, thing);
        this.Warship = Warship;
    }

    public String getWarship() {
        return Warship;
    }

    public void setWarship(String Warship) {
        this.Warship = Warship;
    }
    
}
