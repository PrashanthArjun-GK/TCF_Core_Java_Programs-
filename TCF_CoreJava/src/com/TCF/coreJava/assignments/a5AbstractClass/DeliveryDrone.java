package com.TCF.coreJava.assignments.a5AbstractClass;

public class DeliveryDrone extends VehicleAI {
    private double altitude;
    private double payloadWeight;

    public DeliveryDrone(String vehicleID, double currentSpeed, double[] locationCoordinates,
                         double altitude, double payloadWeight) {
        super(vehicleID, currentSpeed, locationCoordinates);
        this.altitude = altitude;
        this.payloadWeight = payloadWeight;
    }

    @Override
    public void navigate() {
        System.out.println("Drone " + vehicleID + " navigating in air at altitude " + altitude);
    }

    @Override
    public void adjustSpeed(double targetSpeed) {
        currentSpeed = targetSpeed - (payloadWeight * 0.1);
        System.out.println("Drone " + vehicleID + " adjusted speed to " + currentSpeed);
    }

    @Override
    public void detectObstacles() {
        System.out.println("Drone " + vehicleID + " detecting buildings and birds");
    }
}
