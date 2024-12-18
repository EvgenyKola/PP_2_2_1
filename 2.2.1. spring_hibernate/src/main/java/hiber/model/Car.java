package hiber.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Car {

    @Column(name="model")
    private String model;

    @Column(name="series")
    private int series;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}