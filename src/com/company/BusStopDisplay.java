package com.company;
import java.util.List;

public interface BusStopDisplay { //Observer, takes info from data
    void update(List <String> nextBus);
}
