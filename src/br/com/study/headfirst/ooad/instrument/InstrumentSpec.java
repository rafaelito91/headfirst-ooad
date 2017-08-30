package br.com.study.headfirst.ooad.instrument;

import br.com.study.headfirst.ooad.instrument.characteristics.Builder;
import br.com.study.headfirst.ooad.instrument.characteristics.Type;
import br.com.study.headfirst.ooad.instrument.characteristics.Wood;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rafael on 29/08/17.
 */
public class InstrumentSpec {

    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null) {
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
    }

    public Object getProperty(String property) {
        return properties.get(property);
    }

    public Collection<String> getProperties() {
        return properties.keySet();
    }

    public boolean match(InstrumentSpec otherSpec) {
        for (String property : otherSpec.getProperties()) {
            if(!getProperty(property).equals(otherSpec.getProperty(property))) {
                return false;
            }
        }
        return true;
    }
}
