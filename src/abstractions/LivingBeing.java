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
public class LivingBeing extends character {

    public LivingBeing(String character) {
        super(character);
    }
    private String LivingBeing;

    public LivingBeing(String LivingBeing, String character) {
        super(character);
        this.LivingBeing = LivingBeing;
    }

    public String getLivingBeing() {
        return LivingBeing;
    }

    public void setLivingBeing(String LivingBeing) {
        this.LivingBeing = LivingBeing;
    }
    
}
