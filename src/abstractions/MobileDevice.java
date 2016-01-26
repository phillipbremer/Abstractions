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
public class MobileDevice extends Computer {

    public MobileDevice(String ElectronicDevice, String thing) {
        super(ElectronicDevice, thing);
    }
    private String MobileDevice;

    public MobileDevice(String MobileDevice, String ElectronicDevice, String thing) {
        super(ElectronicDevice, thing);
        this.MobileDevice = MobileDevice;
    }

    public String getMobileDevice() {
        return MobileDevice;
    }

    public void setMobileDevice(String MobileDevice) {
        this.MobileDevice = MobileDevice;
    }
    
}
