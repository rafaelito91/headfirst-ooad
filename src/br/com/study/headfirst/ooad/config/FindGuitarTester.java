package br.com.study.headfirst.ooad.config;

import br.com.study.headfirst.ooad.instrument.*;
import br.com.study.headfirst.ooad.inventory.Inventory;

import java.util.List;

/**
 * Created by rafael on 20/08/17.
 */
public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        intializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4);

        List<Guitar> guitars = inventory.search(whatErinLikes);

        if(guitars.size() == 0) {
            System.out.println("Sorry, Erin, we have nothing for you");
        } else {
            for (Guitar guitar : guitars) {
                GuitarSpec guitarSpec = guitar.getSpec();
                System.out.println("Erin, you might like this " + guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " + guitarSpec.getType() + " guitar:" + "\n" +
                        "\t" + guitarSpec.getBackWood() + " back and sides," + "\n" +
                        "\t" + guitarSpec.getTopWood() + " top." + "\n" +
                        "\t" + guitarSpec.getNumStrings() + " Strings." + "\n" +
                        "You can have it for only $" + guitar.getPrice() + "!");
                System.out.println("------------------------------------------------");
            }
        }
    }

    private static void intializeInventory(Inventory inventory) {
        inventory.addGuitar("214534", Double.valueOf(2000.00), Builder.FENDER, "Model 1", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4);
        inventory.addGuitar("D32334", Double.valueOf(9999.99), Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 4);
        inventory.addGuitar("H86833", Double.valueOf(5000.00), Builder.EASTWOOD, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4);
        inventory.addGuitar("V95693", Double.valueOf(1499.95), Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4);
        inventory.addGuitar("T44324", Double.valueOf(4499.95), Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4);
    }
}
