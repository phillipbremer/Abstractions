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
public class GamingSystem extends Computer {

    public GamingSystem(String ElectronicDevice, String thing) {
        super(ElectronicDevice, thing);
    }
    private String GamingSystem;

    public GamingSystem(String GamingSystem, String ElectronicDevice, String thing) {
        super(ElectronicDevice, thing);
        this.GamingSystem = GamingSystem;
    }

    public String getGamingSystem() {
        return GamingSystem;
    }

    public void setGamingSystem(String GamingSystem) {
        this.GamingSystem = GamingSystem;
    }
    
}
