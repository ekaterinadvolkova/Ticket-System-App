package com.javaschool.ev.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter @NoArgsConstructor
public class ticket {
    String Passenger_First_Name;
    String Passenger_Last_Name;
    int Train_Number;
    private timetable departure_time;

}
