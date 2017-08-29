package br.com.study.headfirst.ooad.instrument.guitar;

import br.com.study.headfirst.ooad.instrument.characteristics.Builder;
import br.com.study.headfirst.ooad.instrument.characteristics.Type;
import br.com.study.headfirst.ooad.instrument.characteristics.Wood;

/**
 * Created by rafael on 28/08/17.
 */
public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public boolean match(GuitarSpec spec) {

        if (builder != spec.getBuilder()) {
            return false;
        }

        String searchSpecModel = spec.getModel();
        if ((searchSpecModel != null) && (!searchSpecModel.equals("")) && (!searchSpecModel.equals(model))) {
            return false;
        }

        if (type != spec.getType()) {
            return false;
        }

        if (backWood != spec.getBackWood()) {
            return false;
        }

        if (topWood != spec.getTopWood()) {
            return false;
        }

        if (numStrings != spec.getNumStrings()) {
            return false;
        }

        return true;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }


}
