package br.com.study.headfirst.ooad.instrument;

/**
 * Created by rafael on 20/08/17.
 */
public class Guitar {

    private String serialNumber;
    private double price;
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public Guitar(String seriaNumber, Double price, Builder builder, String model,
                  Type type, Wood backWood, Wood topWood) {
        this.serialNumber = seriaNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }
}
