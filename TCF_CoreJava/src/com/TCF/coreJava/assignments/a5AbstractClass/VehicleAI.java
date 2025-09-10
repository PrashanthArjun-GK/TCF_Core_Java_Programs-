package com.TCF.coreJava.assignments.a5AbstractClass;

abstract class VehicleAI {
    protected String vehicleID;
    protected double currentSpeed;
    protected double[] locationCoordinates;

    public VehicleAI(String vehicleID, double currentSpeed, double[] locationCoordinates) {
        this.vehicleID = vehicleID;
        this.currentSpeed = currentSpeed;
        this.locationCoordinates = locationCoordinates;
    }

    public abstract void navigate();
    public abstract void adjustSpeed(double targetSpeed);
    public abstract void detectObstacles();

    public void logTelemetry() {
        System.out.println("ID: " + vehicleID + " | Speed: " + currentSpeed +
                " | Location: (" + locationCoordinates[0] + "," + locationCoordinates[1] + ")");
    }
}

