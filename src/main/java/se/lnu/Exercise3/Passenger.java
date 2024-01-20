package se.lnu.Exercise3;

public class Passenger {
    private String name;

    public Passenger(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Name cannot be empty or less than 3 characters!");
        }
        this.name = name;
    }

    public int getPrice() {
        return 25;
    }
}