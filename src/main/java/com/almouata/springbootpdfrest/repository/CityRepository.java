package com.almouata.springbootpdfrest.repository;

import com.almouata.springbootpdfrest.bean.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ALmouatass on 18/12/2017.
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}