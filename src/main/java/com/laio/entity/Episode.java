package com.laio.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "episodes")
public class Episode {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "air_date")
    private LocalDate airDate;

    @NotNull
    @Column(name = "episode")
    private String episode;

}