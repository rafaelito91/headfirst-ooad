package br.com.study.headfirst.ooad.instrument;

import br.com.study.headfirst.ooad.instrument.characteristics.Builder;
import br.com.study.headfirst.ooad.instrument.characteristics.Type;
import br.com.study.headfirst.ooad.instrument.characteristics.Wood;
import br.com.study.headfirst.ooad.instrument.guitar.GuitarSpec;

/**
 * Created by rafael on 29/08/17.
 */
public abstract class InstrumentSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public boolean match(InstrumentSpec otherSpec) {

        if (builder != otherSpec.getBuilder()) {
            return false;
        }

        String searchSpecModel = otherSpec.getModel();
        if ((searchSpecModel != null) && (!searchSpecModel.equals("")) && (!searchSpecModel.equals(model))) {
            return false;
        }

        if (type != otherSpec.getType()) {
            return false;
        }

        if (backWood != otherSpec.getBackWood()) {
            return false;
        }

        if (topWood != otherSpec.getTopWood()) {
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
}
