package br.com.study.headfirst.ooad.config;

import br.com.study.headfirst.ooad.instrument.Instrument;
import br.com.study.headfirst.ooad.instrument.characteristics.Builder;
import br.com.study.headfirst.ooad.instrument.characteristics.Type;
import br.com.study.headfirst.ooad.instrument.characteristics.Wood;
import br.com.study.headfirst.ooad.instrument.guitar.Guitar;
import br.com.study.headfirst.ooad.instrument.guitar.GuitarSpec;
import br.com.study.headfirst.ooad.instrument.mandolin.Mandolin;
import br.com.study.headfirst.ooad.instrument.mandolin.MandolinSpec;
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

        List<Instrument> instruments = inventory.search(whatErinLikes);

        if(instruments.size() == 0) {
            System.out.println("Sorry, Erin, we have nothing for you");
        } else {
            for (Instrument foundInstrument : instruments) {
                if (foundInstrument instanceof Guitar) {
                    GuitarSpec guitarSpec = (GuitarSpec) foundInstrument.getSpec();
                    System.out.println("Erin, you might like this Guitar: " + guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " + guitarSpec.getType() + " guitar:" + "\n" +
                            "\t" + guitarSpec.getBackWood() + " back and sides," + "\n" +
                            "\t" + guitarSpec.getTopWood() + " top." + "\n" +
                            "\t" + guitarSpec.getNumStrings() + " Strings." + "\n" +
                            "You can have it for only $" + foundInstrument.getPrice() + "!");
                    System.out.println("------------------------------------------------");
                } else if (foundInstrument instanceof Mandolin) {
                    MandolinSpec mandolinSpec = (MandolinSpec) foundInstrument.getSpec();
                    System.out.println("Erin, you might like this Mandolin: " + mandolinSpec.getBuilder() + " " + mandolinSpec.getModel() + " " + mandolinSpec.getType() + " guitar:" + "\n" +
                            "\t" + mandolinSpec.getBackWood() + " back and sides," + "\n" +
                            "\t" + mandolinSpec.getTopWood() + " top." + "\n" +
                            "\t" + mandolinSpec.getType() + " Style." + "\n" +
                            "You can have it for only $" + foundInstrument.getPrice() + "!");
                    System.out.println("------------------------------------------------");
                }

            }
        }
    }

    private static void intializeInventory(Inventory inventory) {
        inventory.addInstrument("214534", Double.valueOf(2000.00), new GuitarSpec(Builder.FENDER, "Model 1", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4));
        inventory.addInstrument("D32334", Double.valueOf(9999.99), new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 4));
        inventory.addInstrument("H86833", Double.valueOf(5000.00), new GuitarSpec(Builder.EASTWOOD, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4));
        inventory.addInstrument("V95693", Double.valueOf(1499.95), new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4));
        inventory.addInstrument("T44324", Double.valueOf(4499.95), new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 4));
    }
}
