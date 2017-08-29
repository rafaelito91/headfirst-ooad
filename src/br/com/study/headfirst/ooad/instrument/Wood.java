package br.com.study.headfirst.ooad.instrument;

/**
 * Created by rafael on 20/08/17.
 */
public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADINRONDACK, ALDER, STIKA;

    public String toString() {
        switch(this) {
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian Rosewood";
            case MAHOGANY:
                return "Mahogany";
            case MAPLE:
                return "Maple";
            case COCOBOLO:
                return "Cocobolo";
            case CEDAR:
                return "Cedar";
            case ADINRONDACK:
                return "Adinrodack";
            case ALDER:
                return "Alder";
            case STIKA:
                return "Stika";
            default:
                return null;
        }
    }
}
