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
public class Unicorn extends Equestrian {

    public Unicorn(String Equestrian, String LivingBeing, String character) {
        super(Equestrian, LivingBeing, character);
    }
    private String Unicorn;

    public String getUnicorn() {
        return Unicorn;
    }

    public void setUnicorn(String Unicorn) {
        this.Unicorn = Unicorn;
    }
    
}
