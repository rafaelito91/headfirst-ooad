package br.com.study.headfirst.ooad.instrument;

/**
 * Created by rafael on 20/08/17.
 */
public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "Acoustic";
            case ELECTRIC:
                return "Electric";
            default:
                return null;
        }
    }
}
