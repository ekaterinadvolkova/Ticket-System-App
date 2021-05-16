package com.javaschool.ev.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name="train")
public class Train {

    @Id
    @Column(name="trainID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainID;

    @NonNull
    @Column(name="number")
    private int number;

    @NonNull
    @Column(name="availableSeats")
    private int availableSeats;

    @NonNull
    @Column(name="occurence")
    private String occurence;


    public Train(int trainID, int number, int availableSeats,
                 String occurence, LocalDate localDate) {
        this.trainID = trainID;
        this.number = number;
        this.availableSeats = availableSeats;
        this.occurence = occurence;

    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID=" + trainID +
                ", number=" + number +
                ", availableSeats=" + availableSeats +
                ", occurence='" + occurence + '\'' +

                '}';
    }
}