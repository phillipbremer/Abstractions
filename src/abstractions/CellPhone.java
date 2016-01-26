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
public class CellPhone extends MobileDevice {

    public CellPhone(String MobileDevice, String ElectronicDevice, String thing) {
        super(MobileDevice, ElectronicDevice, thing);
    }
    private String CellPhone;

    public String getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(String CellPhone) {
        this.CellPhone = CellPhone;
    }
    
}
