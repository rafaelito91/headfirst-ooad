package br.com.study.headfirst.ooad.config;

import br.com.study.headfirst.ooad.instrument.Instrument;
import br.com.study.headfirst.ooad.instrument.InstrumentSpec;
import br.com.study.headfirst.ooad.instrument.characteristics.Builder;
import br.com.study.headfirst.ooad.instrument.characteristics.InstrumentType;
import br.com.study.headfirst.ooad.instrument.characteristics.Type;
import br.com.study.headfirst.ooad.instrument.characteristics.Wood;
import br.com.study.headfirst.ooad.inventory.Inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rafael on 20/08/17.
 */
public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        intializeInventory(inventory);

        Map desiredProperties = new HashMap();
        desiredProperties.put("builder", Builder.GIBSON);
        desiredProperties.put("backWood", Wood.MAPLE);
        InstrumentSpec whatClientLikes = new InstrumentSpec(desiredProperties);

        List<Instrument> instruments = inventory.search(whatClientLikes);

        if(instruments.size() == 0) {
            System.out.println("Sorry, Dear Client, we have nothing for you");
        } else {
            for (Instrument foundInstrument : instruments) {
                InstrumentSpec spec = foundInstrument.getSpec();

                System.out.println("We just found you a instrument with the following characteristics:");
                for (String property : spec.getProperties()) {
                    System.out.println("\t" + property + " : " + spec.getProperty(property).toString());
                }
                System.out.println("You can have it for only $" + foundInstrument.getPrice() + "!");
                System.out.println("------------------------------------------------");
            }
        }
    }

    private static void intializeInventory(Inventory inventory) {
        Map properties = new HashMap();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.STIKA);
        inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

        properties.put("builder", Builder.MARTIN);
        properties.put("model", "D-18");
        properties.put("topWood", Wood.MAHOGANY);
        properties.put("backWood", Wood.ADINRONDACK);
        inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

        properties.put("builder", Builder.FENDER);
        properties.put("model", "Stratocastor");
        properties.put("type", Type.ELECTRIC);
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood", Wood.ALDER);
        inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
        inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));

        properties.put("builder", Builder.GIBSON);
        properties.put("model", "Les Paul");
        properties.put("topWood", Wood.MAPLE);
        properties.put("backWood", Wood.MAPLE);
        inventory.addInstrument("70108276", 2295.95,
                new InstrumentSpec(properties));

        properties.put("model", "SG '61 Reissue");
        properties.put("topWood", Wood.MAHOGANY);
        properties.put("backWood", Wood.MAHOGANY);
        inventory.addInstrument("82765501", 1890.95,
                new InstrumentSpec(properties));

        properties.put("instrumentType", InstrumentType.MANDOLIN);
        properties.put("type", Type.ACOUSTIC);
        properties.put("model", "F-5G");
        properties.put("backWood", Wood.MAPLE);
        properties.put("topWood", Wood.MAPLE);
        properties.remove("numStrings");
        inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

        properties.put("instrumentType", InstrumentType.BANJO);
        properties.put("model", "RB-3 Wreath");
        properties.remove("topWood");
        properties.put("numStrings", 5);
        inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
    }

}
