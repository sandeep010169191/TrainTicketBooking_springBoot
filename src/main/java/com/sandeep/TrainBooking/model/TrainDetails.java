package com.sandeep.TrainBooking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "train_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrainDetails {

    @Id
    private int tno;
    private String tname;
    private String tsource;
    private String tdestination;
}
