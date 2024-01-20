package se.lnu;

import se.lnu.Exercise3.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FerryMain {
    static Scanner sc = new Scanner(System.in);
    static FerrySystem ferrySystem = new FerrySystem();

    static int choice;
    static int numOfPass;
    static int tmp;

    public static void main(String[] args) {

        while (true) {
            System.out.println("""
                    1. Vehicles
                    2. Passengers
                    3. Disembark & Profit
                    4. Ferry Status
                    5. Exit Application""");
            System.out.println("Choose your option: ");
            choice = sc.nextInt();

            switch (choice) {
                default:
                    System.out.println("Wrong choice!");
                    continue;
                case 1:
                    System.out.println("""
                            Which one you want to embark:
                            1. Bicycle
                            2. Car
                            3. Buss
                            4. Lorry
                            5. Back""");
                    choice = sc.nextInt();
                    while (choice <= 0 || choice > 5) {
                        System.err.print("\nInvalid choice!\n");
                        System.out.println("""
                                Which one you want to embark:
                                1. Bicycle
                                2. Car
                                3. Buss
                                4. Lorry
                                5. Back""");
                        choice = sc.nextInt();
                    }
                    switch (choice) {
                        case 1:
                            Bicycle bicycle = new Bicycle();
                            embarkVehicle(bicycle);
                            break;
                        case 2:
                            Car car = new Car();
                            embarkVehicle(car);
                            break;
                        case 3:
                            Bus bus = new Bus();
                            embarkVehicle(bus);
                            break;
                        case 4:
                            Lorry lorry = new Lorry();
                            embarkVehicle(lorry);
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    int passSpace = 200 - ferrySystem.countPassengers();
                    System.out.println("How many passengers? " + passSpace + " space is left.");
                    try {
                        numOfPass = sc.nextInt();
                        sc.nextLine();
                        while (numOfPass < 0 || numOfPass > passSpace) {
                            System.err.println("Please choose a number between " + 0 + " & " + passSpace);
                            numOfPass = sc.nextInt();
                        }
                        for (int i = 0; i < numOfPass; i++) {
                            System.out.println("What is passenger name?");
                            String passengerName = sc.nextLine();
                            ferrySystem.embark(new Passenger(passengerName));
                        }
                        System.out.println("The total cost is: " + (numOfPass * 25));
                        System.out.println(numOfPass + " passengers embarked.");
                    } catch (InputMismatchException e) {
                        System.err.println("Invalid input. Please enter a valid number.");
                        sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Current profit: " + ferrySystem.currentProfit() + " SEK\n");
                    ferrySystem.disembark();
                    break;
                case 4:
                    System.out.println(ferrySystem);
                    Vehicle[] v = ferrySystem.getAllVehicles();
                    System.out.println("===============================");
                    for (Vehicle vehicle : v) {
                        System.out.println(vehicle);
                    }
                    System.out.println("===============================");
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }

    public static void embarkVehicle(Vehicle vehicle) {
        System.out.println("How many passengers? choose a number between " + 0 + " & " + vehicle.getSpace() + ":");
        try {
            numOfPass = sc.nextInt();
            sc.nextLine();
            while (numOfPass < 0 || numOfPass > vehicle.getSpace()) {
                System.err.println("Please choose a number between " + 0 + " & " + vehicle.getSpace());
                numOfPass = sc.nextInt();
            }
            ArrayList<Passenger> passengers = new ArrayList<>();
            for (int i = 0; i < numOfPass; i++) {
                System.out.println("What is passenger name?");
                String passengerName = sc.nextLine();
                passengers.add(new Passenger(passengerName));
            }
            vehicle.setPassengers(passengers);
            tmp = vehicle.totalPrice();
            System.out.println("The total cost is: " + tmp);
            ferrySystem.embark(vehicle);
            System.out.println(vehicle.getName() + " embarked with " + vehicle.getPassengers().size() + " passengers.");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid number.");
            sc.nextLine();
        }
    }
}