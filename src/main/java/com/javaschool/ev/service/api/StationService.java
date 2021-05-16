package com.javaschool.ev.service.api;

import com.javaschool.ev.domain.Station;

import java.util.List;

public interface StationService {

    List<Station> allStations();
    void add(Station station);
    void delete(Station station);
    void edit(Station station);
    Station getById(int stationID);
    boolean checkStation(String name);
}