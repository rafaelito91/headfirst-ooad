package br.com.study.headfirst.ooad.instrument.guitar;

import br.com.study.headfirst.ooad.instrument.InstrumentSpec;
import br.com.study.headfirst.ooad.instrument.characteristics.Builder;
import br.com.study.headfirst.ooad.instrument.characteristics.Type;
import br.com.study.headfirst.ooad.instrument.characteristics.Wood;

/**
 * Created by rafael on 28/08/17.
 */
public class GuitarSpec extends InstrumentSpec {

    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    @Override
    public boolean match(InstrumentSpec otherSpec) {
        if (!super.match(otherSpec)) {
            return false;
        }

        if (!(otherSpec instanceof GuitarSpec)) {
            return false;
        }

        GuitarSpec guitarSpec = (GuitarSpec) otherSpec;
        if (numStrings != guitarSpec.getNumStrings()) {
            return false;
        }

        return true;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
