package com.TCF.coreJava.assignments.a5AbstractClass;

public class SelfDrivingCar extends VehicleAI {
    private String laneDetectionModel;
    private double brakeSensitivity;

    public SelfDrivingCar(String vehicleID, double currentSpeed, double[] locationCoordinates,
                          String laneDetectionModel, double brakeSensitivity) {
        super(vehicleID, currentSpeed, locationCoordinates);
        this.laneDetectionModel = laneDetectionModel;
        this.brakeSensitivity = brakeSensitivity;
    }

    @Override
    public void navigate() {
        System.out.println("Car " + vehicleID + " navigating urban streets using " + laneDetectionModel);
    }

    @Override
    public void adjustSpeed(double targetSpeed) {
        if (targetSpeed < currentSpeed) {
            currentSpeed -= brakeSensitivity * (currentSpeed - targetSpeed);
        } else {
            currentSpeed = targetSpeed;
        }
        System.out.println("Car " + vehicleID + " adjusted speed to " + currentSpeed);
    }

    @Override
    public void detectObstacles() {
        System.out.println("Car " + vehicleID + " detecting vehicles and pedestrians");
    }
}
