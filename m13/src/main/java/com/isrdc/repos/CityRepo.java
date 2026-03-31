package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.City;

public interface CityRepo extends CrudRepository<City, Integer> {

}
