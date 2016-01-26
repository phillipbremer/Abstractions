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
public class Vessel extends thing {

    public Vessel(String thing) {
        super(thing);
    }
    private String Vessel;

    public Vessel(String Vessel, String thing) {
        super(thing);
        this.Vessel = Vessel;
    }

    public String getVessel() {
        return Vessel;
    }

    public void setVessel(String Vessel) {
        this.Vessel = Vessel;
    }
    
}
