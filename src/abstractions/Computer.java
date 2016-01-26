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
public class Computer extends ElectronicDevice {

    public Computer(String ElectronicDevice, String thing) {
        super(ElectronicDevice, thing);
    }
    private String Computer;

    public String getComputer() {
        return Computer;
    }

    public void setComputer(String Computer) {
        this.Computer = Computer;
    }
    
}
