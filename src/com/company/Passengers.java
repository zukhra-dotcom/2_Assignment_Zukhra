package com.company;

import java.util.List;

public class Passengers implements BusStopDisplay{

    private String busStop;

    public Passengers(String busStop){
        this.busStop = busStop;
    }

    @Override
    public void update(List<String> nextBus){
        System.out.println("Bus Stop is "+ busStop+"\nNext bus will appear:\n" + nextBus +"\n"); //+time + busNumber
    }
}
