package se.lnu.Exercise3;

import se.lnu.Exercise3.Exceptions.NotEnoughSpaceException;

import java.util.*;

public class FerrySystem implements Ferry {

    ArrayList<Vehicle> arrayV;
    ArrayList<Passenger> arrayP;

    public FerrySystem() {
        arrayV = new ArrayList<>();
        arrayP = new ArrayList<>();
        setArrayV(arrayV);
        setArrayP(arrayP);
    }

    public ArrayList<Vehicle> getArrayV() {
        return arrayV;
    }

    public void setArrayV(ArrayList<Vehicle> arrayV) {
        this.arrayV = arrayV;
    }

    public ArrayList<Passenger> getArrayP() {
        return arrayP;
    }

    public void setArrayP(ArrayList<Passenger> arrayP) {
        this.arrayP = arrayP;
    }

    public int countPassengers() {
        return getArrayP().size();
    }

    public int countVehicleSpace() {
        return getArrayV().size();
    }

    public int countMoney() {
        int totalMoney = 0;

        for (Vehicle vehicle : getArrayV()) {
            totalMoney += vehicle.totalPrice();
        }

        for (int i = 0; i < countPassengers(); i++) {
            totalMoney += 25;
        }

        return totalMoney;
    }

    public Vehicle[] getAllVehicles() {
        Vehicle[] arr = new Vehicle[countVehicleSpace()];
        for (int i = 0; i < arrayV.size(); i++) {
            arr[i] = arrayV.get(i);
        }
        return arr;
    }

    public void embark(Vehicle v) {
        if (hasSpaceFor(v)) {
            arrayV.add(v);
        } else {
            throw new NotEnoughSpaceException("The ferry is full of vehicles!");
        }
    }

    public void embark(Passenger p) {
        if (hasRoomFor(p)) {
            arrayP.add(p);
        } else {
            throw new NotEnoughSpaceException("The ferry is full of passengers!");
        }
    }

    public void disembark() {
        arrayP.clear();
        arrayV.clear();
    }

    public boolean hasSpaceFor(Vehicle v) {
        int maxVehicles = 200;
        return countVehicleSpace() < maxVehicles;
    }

    public boolean hasRoomFor(Passenger p) {
        int maxPassengers = 200;
        return countPassengers() < maxPassengers;
    }

    public int currentProfit() {
        return countMoney();
    }

    public String toString() {
        return "\n\t\t FERRY STATUS:" + "\nCurrent amount of passengers: " + countPassengers()
                + "\nNumber of vehicles: " + countVehicleSpace() + "\n";
    }

}