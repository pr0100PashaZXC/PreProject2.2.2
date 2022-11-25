package web.model;

import java.time.Period;

public class Car {
    private int id;
    private String type;
    private int series;

    public Car(int id, String type, int series) {
        this.type = type;
        this.series = series;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", series='" + series + '\'' +
                ", id=" + id +
                '}';
    }
}
