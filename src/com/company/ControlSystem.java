package com.company;

import java.util.ArrayList;
import java.util.List;

public class ControlSystem implements Routes{

    private List<String> nextBus = new ArrayList<>();
    private List<BusStopDisplay> passenger = new ArrayList<>();

    public void addBus(String bus){
        this.nextBus.add(bus);
        notifyAllUsers();
    }

    public void removeBus(String bus){
        this.nextBus.remove(bus);
        notifyAllUsers();
    }

    @Override
    public void Drive(BusStopDisplay busNumber) {
        this.passenger.add(busNumber);
    }

    @Override
    public void Drove(BusStopDisplay busNumber) {
        this.passenger.remove(busNumber);
    }

    @Override
    public void notifyAllUsers() {
        for (BusStopDisplay busNumber: passenger) {   ///пробежаться по лупу, то есть уведомить об изменении всех пользователей
            busNumber.update(this.nextBus);
        }
    }
}
