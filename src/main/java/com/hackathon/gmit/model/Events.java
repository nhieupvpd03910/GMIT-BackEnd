/*
 * Copyright Pham Van Nhieu and has some source refer on internet
 */

package com.hackathon.gmit.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Events implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    LocalDateTime startTime;
    LocalDateTime endTime;
    @Column(length=3000)
    String description;
    @Column(length = 50)
    String imageEvent;
    @OneToMany(mappedBy = "location")
    private List<CategoryLocation> categoryLocation;
}
