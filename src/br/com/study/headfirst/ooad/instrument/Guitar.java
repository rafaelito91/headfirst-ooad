package br.com.study.headfirst.ooad.instrument;

/**
 * Created by rafael on 20/08/17.
 */
public class Guitar {

    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String type;
    private String backWood;
    private String topWood;

    public Guitar(String seriaNumber, double price, String builder, String model,
                  String type, String backWood, String topWood) {
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

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
}
