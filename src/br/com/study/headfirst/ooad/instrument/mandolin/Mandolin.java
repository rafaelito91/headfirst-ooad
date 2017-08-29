package br.com.study.headfirst.ooad.instrument.mandolin;

import br.com.study.headfirst.ooad.instrument.Instrument;
import br.com.study.headfirst.ooad.instrument.InstrumentSpec;

/**
 * Created by rafael on 29/08/17.
 */
public class Mandolin extends Instrument {

    public Mandolin(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        super(serialNumber, price, instrumentSpec);
    }
}
