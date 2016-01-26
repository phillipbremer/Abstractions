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
public class Xbox extends GamingSystem {

    public Xbox(String GamingSystem, String ElectronicDevice, String thing) {
        super(GamingSystem, ElectronicDevice, thing);
    }
    private String Xbox;

    public String getXbox() {
        return Xbox;
    }

    public void setXbox(String Xbox) {
        this.Xbox = Xbox;
    }
    
}
