package br.com.study.headfirst.ooad.instrument;

/**
 * Created by rafael on 29/08/17.
 */
public class Instrument {

    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public InstrumentSpec getSpec() {
        return instrumentSpec;
    }
}
