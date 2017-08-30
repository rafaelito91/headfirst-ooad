package br.com.study.headfirst.ooad.instrument.characteristics;

/**
 * Created by rafael on 29/08/17.
 */
public enum InstrumentType {

    GUITAR, MANDOLIN, BANJO;

    @Override
    public String toString() {
        switch (this) {
            case GUITAR:
                return "Guitar";
            case MANDOLIN:
                return "Mandolin";
            case BANJO:
                return "Banjo";
            default:
                return null;
        }
    }
}
