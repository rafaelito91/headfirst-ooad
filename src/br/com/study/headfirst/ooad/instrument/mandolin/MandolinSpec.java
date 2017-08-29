package br.com.study.headfirst.ooad.instrument.mandolin;

import br.com.study.headfirst.ooad.instrument.InstrumentSpec;
import br.com.study.headfirst.ooad.instrument.characteristics.Builder;
import br.com.study.headfirst.ooad.instrument.characteristics.Style;
import br.com.study.headfirst.ooad.instrument.characteristics.Type;
import br.com.study.headfirst.ooad.instrument.characteristics.Wood;

/**
 * Created by rafael on 29/08/17.
 */
public class MandolinSpec extends InstrumentSpec {

    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    @Override
    public boolean match(InstrumentSpec otherSpec) {
        if (!super.match(otherSpec)) {
            return false;
        }

        if (!(otherSpec instanceof MandolinSpec)) {
            return false;
        }

        MandolinSpec mandolinSpec = (MandolinSpec) otherSpec;
        if (style != mandolinSpec.getStyle()) {
            return false;
        }

        return true;

    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
