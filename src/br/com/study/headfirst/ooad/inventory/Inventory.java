package br.com.study.headfirst.ooad.inventory;

import br.com.study.headfirst.ooad.instrument.Guitar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rafael on 20/08/17.
 */
public class Inventory {

    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, Double price, String builder, String model,
                          String type, String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();

            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder()))) {
                continue;
            }

            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) {
                continue;
            }

            String type = searchGuitar.getType();
            if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType()))) {
                continue;
            }

            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood()))) {
                continue;
            }

            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood()))) {
                continue;
            }
        }

        return null;
    }
}
