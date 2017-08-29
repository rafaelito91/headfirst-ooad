package br.com.study.headfirst.ooad.config;

import br.com.study.headfirst.ooad.instrument.Builder;
import br.com.study.headfirst.ooad.instrument.Guitar;
import br.com.study.headfirst.ooad.instrument.Type;
import br.com.study.headfirst.ooad.instrument.Wood;
import br.com.study.headfirst.ooad.inventory.Inventory;

import java.util.List;

/**
 * Created by rafael on 20/08/17.
 */
public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        intializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", Double.valueOf(0), Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List<Guitar> guitars = inventory.search(whatErinLikes);

        if(guitars.size() == 0) {
            System.out.println("Sorry, Erin, we have nothing for you");
        } else {
            for (Guitar guitar : guitars) {
                System.out.println("Erin, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + " guitar:" + "\n" +
                        "\t" + guitar.getBackWood() + " back and sides," + "\n" +
                        "\t" + guitar.getTopWood() + " top." + "\n" +
                        "You can have it for only $" + guitar.getPrice() + "!");
                System.out.println("------------------------------------------------");
            }
        }
    }

    private static void intializeInventory(Inventory inventory) {
        inventory.addGuitar("214534", Double.valueOf(2000.00), Builder.FENDER, "Model 1", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("D32334", Double.valueOf(9999.99), Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("H86833", Double.valueOf(5000.00), Builder.EASTWOOD, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V95693", Double.valueOf(1499.95), Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("T44324", Double.valueOf(4499.95), Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}
