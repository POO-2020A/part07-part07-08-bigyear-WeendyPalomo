/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WENDY
 */
public class Bird {

    private String name;
    private String latin;
    int observation;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }

    public void observation(String name) {
        if (this.name.equals(name)) {
            this.observation++;
        }
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    public int getObservation() {
        return observation;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.observation + " observations";
    }

}
