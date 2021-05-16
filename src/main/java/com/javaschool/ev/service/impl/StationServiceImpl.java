package com.javaschool.ev.service.impl;


import com.javaschool.ev.dao.api.StationDAO;
import com.javaschool.ev.dao.impl.StationDAOImpl;
import com.javaschool.ev.domain.Station;
import com.javaschool.ev.service.api.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StationServiceImpl implements StationService {

    private StationDAO stationDAO;
    @Autowired
    public void setPassengerDAO (StationDAO stationDAO){
        this.stationDAO=stationDAO;
    }

    @Override
    public List<Station> allStations() {
        return stationDAO.allStations();
    }

    @Override
    public void add(Station station) {
        stationDAO.add(station);
    }

    @Override
    public void delete(Station station) {
        stationDAO.delete(station);
    }

    @Override
    public void edit(Station station) {
        stationDAO.edit(station);

    }

    @Override
    public Station getById(int stationID) {
        return stationDAO.getById(stationID);
    }

    @Override
    public boolean checkStation(String name) {
        return stationDAO.checkStation(name);
    }
}