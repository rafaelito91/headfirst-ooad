package br.com.study.headfirst.ooad.instrument.guitar;

/**
 * Created by rafael on 20/08/17.
 */
public class Guitar {

    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public Guitar(String seriaNumber, Double price, GuitarSpec spec) {
        this.serialNumber = seriaNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}
