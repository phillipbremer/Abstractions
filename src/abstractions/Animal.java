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
public class Animal extends LivingBeing {

    public Animal(String LivingBeing, String character) {
        super(LivingBeing, character);
    }
    private String Animal;

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }
    

}
