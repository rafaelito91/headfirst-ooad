package br.com.study.headfirst.ooad.config;

import br.com.study.headfirst.ooad.instrument.Guitar;
import br.com.study.headfirst.ooad.inventory.Inventory;

/**
 * Created by rafael on 20/08/17.
 */
public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        intializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, "Fender", "Stratocastor", "Electric", "Alder", "Alder");

        Guitar guitar = inventory.search(whatErinLikes);

        if (guitar != null) {
            System.out.println("Erin, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + " guitar:" + "\n" +
                    "\t" + guitar.getBackWood() + " back and sides," + "\n" +
                    "\t" + guitar.getTopWood() + " top." + "\n" +
                    "You can have it for only $" + guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, we have nothing for you");
        }
    }

    private static void intializeInventory(Inventory inventory) {
        inventory.addGuitar("214534", 2000.00, "Fender", "Model 1", "Electric", "Alder", "Alder");
        inventory.addGuitar("D32334", 9999.99, "Fender", "Stratocastor", "Acoustic", "Alder", "Alder");
        inventory.addGuitar("H86833", 5000.00, "Eastwood", "Stratocastor", "Electric", "Alder", "Alder");
        inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "Electric", "Alder", "Alder");
    }
}
