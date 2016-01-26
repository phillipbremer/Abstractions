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
public class SpaceShip extends Vessel {

    public SpaceShip(String Vessel, String thing) {
        super(Vessel, thing);
    }
    private String SpaceShip;

    public String getSpaceShip() {
        return SpaceShip;
    }

    public void setSpaceShip(String SpaceShip) {
        this.SpaceShip = SpaceShip;
    }
    
}
