package br.com.study.headfirst.ooad.inventory;

import br.com.study.headfirst.ooad.instrument.Instrument;
import br.com.study.headfirst.ooad.instrument.InstrumentSpec;
import br.com.study.headfirst.ooad.instrument.guitar.Guitar;
import br.com.study.headfirst.ooad.instrument.guitar.GuitarSpec;
import br.com.study.headfirst.ooad.instrument.mandolin.Mandolin;
import br.com.study.headfirst.ooad.instrument.mandolin.MandolinSpec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rafael on 20/08/17.
 */
public class Inventory {

    private List<Instrument> instruments = new ArrayList<>();

    public void addInstrument(String serialNumber, Double price, InstrumentSpec spec) {
        Instrument instrument = null;

        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }

        instruments.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : instruments) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List search(InstrumentSpec searchSpec) {
        List<Instrument> matchingInstruments = new LinkedList<>();
        for (Instrument instrument : instruments) {
            if (instrument.getSpec().match(searchSpec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}
