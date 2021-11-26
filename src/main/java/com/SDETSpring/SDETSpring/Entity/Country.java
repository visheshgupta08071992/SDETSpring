package com.SDETSpring.SDETSpring.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Country {

    int id;
    String countryname;
    String countryCapital;
}
