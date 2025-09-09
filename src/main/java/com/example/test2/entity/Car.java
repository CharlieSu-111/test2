package com.example.test2.entity;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Year;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Car {
    private String name;
    private long id;
    private Year year;
}
