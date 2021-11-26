package com.SDETSpring.SDETSpring.ServiceTest;

import com.SDETSpring.SDETSpring.Service.CountryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CountryServiceTest {

    @Autowired
    CountryService countryService;

    @Test
    public void getAllCountriesTest(){

        System.out.println(countryService.getAllCountries());
    }
}
