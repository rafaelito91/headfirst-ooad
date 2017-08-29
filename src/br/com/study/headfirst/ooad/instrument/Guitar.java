package br.com.study.headfirst.ooad.instrument;

/**
 * Created by rafael on 20/08/17.
 */
public class Guitar {

    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public Guitar(String seriaNumber, Double price, Builder builder, String model,
                  Type type, Wood backWood, Wood topWood) {
        this.serialNumber = seriaNumber;
        this.price = price;
        this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
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
