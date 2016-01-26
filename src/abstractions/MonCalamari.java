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
public class MonCalamari extends Fish {

    public MonCalamari(String Fish, String LivingBeing, String character) {
        super(Fish, LivingBeing, character);
    }
    private String MonCalamari;

    public String getMonCalamari() {
        return MonCalamari;
    }

    public void setMonCalamari(String MonCalamari) {
        this.MonCalamari = MonCalamari;
    }
    
}
