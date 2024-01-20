package se.lnu.Exercise3;

import java.util.ArrayList;

public abstract class Vehicle {
    private String name;
    private int space;
    private int price;
    private int passengerPrice;
    private ArrayList<Passenger> passengers;

    public Vehicle(Vehicles type) {
        setName(type.getName());
        setSpace(type.getSpace());
        setPrice(type.getVehiclePrice());
        setPassengerPrice(type.getPassengerPrice());
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

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPassengerPrice() {
        return passengerPrice;
    }

    public void setPassengerPrice(int passengerPrice) {
        this.passengerPrice = passengerPrice;
    }

    public int totalPrice() {
        return getPrice() + getPassengers().size() * getPassengerPrice();
    }

    @Override
    public String toString() {
        return getName() +
                "{space= " + getSpace() +
                ", price= " + getPrice() +
                ", passengerPrice= " + getPassengerPrice() +
                ", passengers= " + getPassengers().size() +
                '}';
    }
}