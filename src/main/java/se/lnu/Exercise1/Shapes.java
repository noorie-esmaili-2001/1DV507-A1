package se.lnu.Exercise1;

public enum Shapes {
    CIRCLE("Circle"),

    RECTANGLE("Rectangle"),

    SQUARE("Square");

    private String name;

    Shapes(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
