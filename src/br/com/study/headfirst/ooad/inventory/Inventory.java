package br.com.study.headfirst.ooad.inventory;

import br.com.study.headfirst.ooad.instrument.Builder;
import br.com.study.headfirst.ooad.instrument.Guitar;
import br.com.study.headfirst.ooad.instrument.Type;
import br.com.study.headfirst.ooad.instrument.Wood;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rafael on 20/08/17.
 */
public class Inventory {

    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, Double price, Builder builder, String model,
                          Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {

            if (guitar.getBuilder() != searchGuitar.getBuilder()) {
                continue;
            }

            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) {
                continue;
            }

            if (guitar.getType() != searchGuitar.getType()) {
                continue;
            }

            if (guitar.getBackWood() != searchGuitar.getBackWood()) {
                continue;
            }

            if (guitar.getTopWood() != searchGuitar.getTopWood()) {
                continue;
            }

            return guitar;
        }

        return null;
    }
}
