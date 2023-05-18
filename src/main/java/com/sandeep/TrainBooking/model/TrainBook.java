package com.sandeep.TrainBooking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "train_book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrainBook {

    @Id
    @GeneratedValue
    private int uid;
    private String usource;
    private String udestination;
    private String uclass;
}
