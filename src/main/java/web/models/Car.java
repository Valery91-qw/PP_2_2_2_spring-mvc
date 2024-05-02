package web.models;

public class Car {
    private String model;
    private int year;
    private String user;

    public Car () {}

    public Car(String model, int year, String user) {
        this.model = model;
        this.year = year;
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
