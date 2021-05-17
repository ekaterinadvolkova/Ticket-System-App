package com.javaschool.ev.dao.api;

import com.javaschool.ev.domain.Route;

import java.util.List;

public interface RouteDAO {
    void createNewRoute(Route route);

    List<Route> getAllRoutes();

    List<Route> getTrainRoutes(Long trainId);

    Route getRouteById(Long routeId);

    //List<Route> getTrainRoutesByQuery(TrainQueryDto trainQuery);

    void deleteRoute(int routeID);

    void editRoute(Route route);
}
