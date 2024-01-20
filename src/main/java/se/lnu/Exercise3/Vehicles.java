package se.lnu.Exercise3;

public enum Vehicles {
    BICYCLE("Bicycle", 1, 40, 25),
    BUS("Bus", 20, 200, 15),
    CAR("Car", 5, 100, 20),
    LORRY("Lorry", 40, 300, 20);

    private String name;
    private int space;
    private int vehiclePrice;
    private int passengerPrice;

    Vehicles(String name, int space, int price, int passengerPrice) {
        setName(name);
        setSpace(space);
        setVehiclePrice(price);
        setPassengerPrice(passengerPrice);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public int getPassengerPrice() {
        return passengerPrice;
    }

    public void setPassengerPrice(int passengerPrice) {
        this.passengerPrice = passengerPrice;
    }
}
