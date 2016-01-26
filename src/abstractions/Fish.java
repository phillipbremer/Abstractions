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
public class Fish extends Animal {

    public Fish(String LivingBeing, String character) {
        super(LivingBeing, character);
    }
    private String Fish;

    public Fish(String Fish, String LivingBeing, String character) {
        super(LivingBeing, character);
        this.Fish = Fish;
    }

    public String getFish() {
        return Fish;
    }

    public void setFish(String Fish) {
        this.Fish = Fish;
    }
    
}
