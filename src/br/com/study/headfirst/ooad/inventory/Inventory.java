package br.com.study.headfirst.ooad.inventory;

import br.com.study.headfirst.ooad.instrument.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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

    public List search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Guitar guitar : guitars) {
            GuitarSpec guitarSpec = guitar.getSpec();
            if (guitarSpec.getBuilder() != searchSpec.getBuilder()) {
                continue;
            }

            String model = searchSpec.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel()))) {
                continue;
            }

            if (guitarSpec.getType() != searchSpec.getType()) {
                continue;
            }

            if (guitarSpec.getBackWood() != searchSpec.getBackWood()) {
                continue;
            }

            if (guitarSpec.getTopWood() != searchSpec.getTopWood()) {
                continue;
            }

            matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }
}
