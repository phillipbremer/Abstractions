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
public class Equestrian extends Animal {

    public Equestrian(String LivingBeing, String character) {
        super(LivingBeing, character);
    }
    private String Equestrian;

    public Equestrian(String Equestrian, String LivingBeing, String character) {
        super(LivingBeing, character);
        this.Equestrian = Equestrian;
    }

    public String getEquestrian() {
        return Equestrian;
    }

    public void setEquestrian(String Equestrian) {
        this.Equestrian = Equestrian;
    }
    
}
