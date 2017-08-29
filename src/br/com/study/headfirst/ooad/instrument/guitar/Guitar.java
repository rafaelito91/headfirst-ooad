package br.com.study.headfirst.ooad.instrument.guitar;

import br.com.study.headfirst.ooad.instrument.Instrument;

/**
 * Created by rafael on 20/08/17.
 */
public class Guitar extends Instrument {

    public Guitar(String seriaNumber, Double price, GuitarSpec spec) {
        super(seriaNumber, price, spec);
    }
}
