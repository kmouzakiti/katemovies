package com.example.katemovies.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.katemovies.transfer.KeyValue;
import lombok.*;

import javax.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Actors")
@SequenceGenerator(name = "idGenerator", sequenceName = "ACTORS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Actor extends com.example.katemovies.domain.BaseEntity {

    @Column(length = 50, nullable = false, unique = false)
    private String email;


    @Column(length = 20, nullable = false)
    private String firstname;


    @Column(length = 30, nullable = false)
    private String lastname;

    @Column(length = 2)
    private String age;

    @Column(length = 50)
    private String address;

    @Column(length = 50)
    private String movieTitle;

    @Column(length = 50)
    private String nationality;

}