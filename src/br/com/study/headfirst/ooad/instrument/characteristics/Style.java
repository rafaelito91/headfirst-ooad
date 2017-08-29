package br.com.study.headfirst.ooad.instrument.characteristics;

/**
 * Created by rafael on 29/08/17.
 */
public enum Style {

    A, F;

    public String toString() {
        switch (this) {
            case A:
                return "A style";
            case F:
                return "F style";
            default:
                return "Unspecified";
        }
    }
}
