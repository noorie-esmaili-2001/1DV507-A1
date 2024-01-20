package se.lnu;

import se.lnu.Exercise3.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FerryMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FerrySystem ferrySystem = new FerrySystem();

        int choice;
        int numOfPass;
        int tmp;

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
                            System.out.println("How many passengers? choose a number between " + 0 + " & " + bicycle.getSpace() + ":");
                            try {
                                numOfPass = sc.nextInt();
                                sc.nextLine();
                                while (numOfPass < 0 || numOfPass > bicycle.getSpace()) {
                                    System.err.println("Please choose a number between " + 0 + " & " + bicycle.getSpace());
                                    numOfPass = sc.nextInt();
                                }
                                ArrayList<Passenger> passengers = new ArrayList<>();
                                for (int i = 0; i < numOfPass; i++) {
                                    System.out.println("What is passenger name?");
                                    String passengerName = sc.nextLine();
                                    passengers.add(new Passenger(passengerName));
                                }
                                bicycle.setPassengers(passengers);
                                tmp = bicycle.totalPrice();
                                System.out.println("The total cost is: " + tmp);
                                ferrySystem.embark(bicycle);
                            } catch (InputMismatchException e) {
                                System.err.println("Invalid input. Please enter a valid number.");
                                sc.nextLine();
                            }
                            break;
                        case 2:
                            Car car = new Car();
                            System.out.println("How many passengers?\n" + "select a number between " + 0 + " & " + car.getSpace() + ".");
                            System.out.print("Your choice: ");
                            numOfPass = sc.nextInt();
                            if (numOfPass > car.getSpace() || numOfPass < 0) {
                                System.err.println("Please choose a number between " + 0 + " and " + car.getSpace() + ".");
                                break;
                            } else {
                                tmp = car.totalPrice();
                                System.out.println("The total cost is: " + tmp);
                                ferrySystem.embark(car);
                            }
                            break;
                        case 3:
                            Bus bus = new Bus();
                            System.out.println("How many passengers?\n" + "select a number between " + 0 + " & " + bus.getSpace() + ".");
                            System.out.print("Your choice: ");
                            numOfPass = sc.nextInt();
                            if (numOfPass > bus.getSpace() | numOfPass < 0) {
                                System.err.println("Please choose a number between " + 0 + " and " + bus.getSpace() + " Passengers!");
                                break;
                            } else {
                                tmp = bus.totalPrice();
                                System.out.println("The total cost is: " + tmp);
                                ferrySystem.embark(bus);
                            }
                            break;
                        case 4:
                            Lorry lorry = new Lorry();
                            System.out.println("How many passengers?\n" + "select a number between " + 0 + " & " + lorry.getSpace() + ".");
                            System.out.print("Your choice: ");
                            numOfPass = sc.nextInt();
                            if (numOfPass > lorry.getSpace() || numOfPass < 0) {
                                System.err.println("Please choose a number between " + 0 + " and " + lorry.getSpace() + " Passengers!");
                                break;
                            } else {
                                tmp = lorry.totalPrice();
                                System.out.println("The total cost is: " + tmp);
                                ferrySystem.embark(lorry);
                            }
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("How many passengers?\n" + "select a number between " + 0 + " & " + 200 + ".");
                    System.out.print("Your choice: ");
                    numOfPass = sc.nextInt();
                    if (numOfPass > 200 || numOfPass < 0) {
                        System.err.println("Please choose a number between " + 0 + " and " + 200 + " Passengers!");
                        continue;
                    } else {
                        Passenger passenger = new Passenger("Noorie");
                        tmp = passenger.getPrice();
                        System.out.println("The total cost is: " + tmp);
                        ferrySystem.embark(passenger);
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
                    for (int i = 0; i < v.length; i++) {
                        System.out.println(v[i]);
                    }
                    System.out.println("===============================");
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}