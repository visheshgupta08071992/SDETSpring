package com.SDETSpring.SDETSpring.Controller;

import com.SDETSpring.SDETSpring.Entity.Country;
import com.SDETSpring.SDETSpring.Service.CountryService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CountryControllerMockMvcTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getAllCountriesTest() throws Exception {
        this.mockMvc.perform(get("/getcountries"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().json("[{\"id\":1,\"countryname\":\"India\",\"countryCapital\":\"Delhi\"},{\"id\":2,\"countryname\":\"USA\",\"countryCapital\":\"Washington\"},{\"id\":3,\"countryname\":\"UK\",\"countryCapital\":\"London\"}]"))
                .andDo(print());
    }

    @Test
    public void getCountryByIDTest() throws Exception {
        this.mockMvc.perform(get("/getcountries/3"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().json("{\"id\":3,\"countryname\":\"UK\",\"countryCapital\":\"London\"}"))
                .andDo(print());
    }

    @Test
    public void getCountryByNameTest() throws Exception {
        this.mockMvc.perform(get("/getcountries/countryname?name=India"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().json("{\"id\":1,\"countryname\":\"India\",\"countryCapital\":\"Delhi\"}"))
                .andDo(print());
    }

    @Test
    public void addNewCountryTest() throws Exception {
        this.mockMvc.perform(post("/getcountries/addcountry").contentType(MediaType.APPLICATION_JSON).content("{\n" +
                "        \"countryname\":\"Singapore\",\n" +
                "        \"countryCapital\":\"Singapore\"\n" +
                "    }"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().json("{\"id\":4,\"countryname\":\"Singapore\",\"countryCapital\":\"Singapore\"}"))
                .andDo(print());
    }

    @Test
    public void updateCountryTest() throws Exception {
        this.mockMvc.perform(put("/getcountries/updatecountry").contentType(MediaType.APPLICATION_JSON).content("{\"id\":4,\"countryname\":\"Singapore\",\"countryCapital\":\"Singapore\"}"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().json("{\"id\":4,\"countryname\":\"Singapore\",\"countryCapital\":\"Singapore\"}"))
                .andDo(print());
    }

    @Test
    public void deleteCountryTest() throws Exception {
        this.mockMvc.perform(delete("/getcountries/deleteCountry/1"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("Country deleted"))
                .andDo(print());
    }

}
