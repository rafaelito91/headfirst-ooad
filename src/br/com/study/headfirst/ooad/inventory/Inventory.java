package br.com.study.headfirst.ooad.inventory;

import br.com.study.headfirst.ooad.instrument.characteristics.Builder;
import br.com.study.headfirst.ooad.instrument.characteristics.Type;
import br.com.study.headfirst.ooad.instrument.characteristics.Wood;
import br.com.study.headfirst.ooad.instrument.guitar.Guitar;
import br.com.study.headfirst.ooad.instrument.guitar.GuitarSpec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rafael on 20/08/17.
 */
public class Inventory {

    private List<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, Double price, Builder builder, String model,
                          Type type, Wood backWood, Wood topWood, int numStrings) {
        GuitarSpec spec = new GuitarSpec(builder, model, type, backWood, topWood, numStrings);
        Guitar guitar = new Guitar(serialNumber, price, spec);
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
            if(guitarSpec.match(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }

        return matchingGuitars;
    }
}
