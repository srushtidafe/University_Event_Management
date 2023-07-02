package com.geekster.H2fun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Event_Id")
    private Integer eventId;

    @NotBlank
//    @Column(name = "Event_Name",unique = true)
    private String eventName;

    @NotBlank
//    @Column(name = "Event_Location")
    private  String locationOfEvent;

    @NotBlank
//    @Column(name = "Date")
    private String date;

//    @Column(name = "Start_Time")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private LocalTime startTime;

//    @Column(name = "End_Time")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private LocalTime endTime;
}
