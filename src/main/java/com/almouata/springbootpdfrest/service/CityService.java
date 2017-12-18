package com.almouata.springbootpdfrest.service;

import com.almouata.springbootpdfrest.bean.City;
import com.almouata.springbootpdfrest.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ALmouatass on 18/12/2017.
 */
@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {

        List<City> cities = (List<City>) repository.findAll();

        return cities;
    }
}