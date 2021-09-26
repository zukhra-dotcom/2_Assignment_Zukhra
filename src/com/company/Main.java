package com.company;


public class Main {

    public static void main(String[] args) {
        ControlSystem GIS = new ControlSystem();

        GIS.addBus("№47 bus_____1 minutes");
        GIS.addBus("№21 bus_____5 minutes");
        GIS.addBus("№87 bus_____5 minutes");
        Passengers BusStop = new Passengers("ArmanQala");

        GIS.Drive(BusStop);
        GIS.addBus("№20 bus_____7 minutes");
        GIS.removeBus("№47 bus_____1 minutes");
        GIS.addBus("№47 bus_____15 minutes");
    }
}
