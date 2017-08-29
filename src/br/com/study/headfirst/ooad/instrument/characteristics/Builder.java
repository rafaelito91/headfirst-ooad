package br.com.study.headfirst.ooad.instrument.characteristics;

/**
 * Created by rafael on 20/08/17.
 */
public enum Builder {

    FENDER, EASTWOOD, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    public String toString() {
        switch (this) {
            case FENDER:
                return "Fender";
            case EASTWOOD:
                return "Eastwood";
            case MARTIN:
                return "Martin";
            case GIBSON:
                return "Gibson";
            case COLLINGS:
                return "Collings";
            case OLSON:
                return "Olson";
            case RYAN:
                return "Ryan";
            case PRS:
                return "PRS";
            case ANY:
                return "ANY";
            default:
                return null;
        }
    }
}
