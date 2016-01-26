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
public class ElectronicDevice extends thing {

    public ElectronicDevice(String thing) {
        super(thing);
    }
    private String ElectronicDevice;

    public ElectronicDevice(String ElectronicDevice, String thing) {
        super(thing);
        this.ElectronicDevice = ElectronicDevice;
    }

    public String getElectronicDevice() {
        return ElectronicDevice;
    }

    public void setElectronicDevice(String ElectronicDevice) {
        this.ElectronicDevice = ElectronicDevice;
    }
    
}
