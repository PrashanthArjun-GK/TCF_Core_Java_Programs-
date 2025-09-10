package com.TCF.coreJava.assignments.a5AbstractClass;

public class AutonomousVehicleSimulation {
    public static void main(String[] args) {
        VehicleAI car = new SelfDrivingCar("CAR001", 60, new double[]{10.5, 20.3}, "DeepLaneNet", 0.5);
        VehicleAI drone = new DeliveryDrone("DRONE101", 40, new double[]{5.2, 15.8}, 120, 5);

        car.navigate();
        car.adjustSpeed(40);
        car.detectObstacles();
        car.logTelemetry();

        System.out.println();

        drone.navigate();
        drone.adjustSpeed(50);
        drone.detectObstacles();
        drone.logTelemetry();
    }
}
