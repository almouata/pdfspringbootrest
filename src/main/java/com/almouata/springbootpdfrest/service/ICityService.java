package com.almouata.springbootpdfrest.service;

import com.almouata.springbootpdfrest.bean.City;

import java.util.List;

/**
 * Created by ALmouatass on 18/12/2017.
 */
public interface ICityService {

    public List<City> findAll();
}