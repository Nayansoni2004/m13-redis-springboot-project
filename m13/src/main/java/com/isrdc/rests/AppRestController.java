package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.entities.City;
import com.isrdc.repos.CityRepo;

@RestController
public class AppRestController {
	@Autowired
	private CityRepo cityRepo;
	
//	http://localhost:9090/showall -> use postman, method -> GET, -> send request
	@GetMapping("/showall")
	public Iterable<City> showAllCities() {
		return cityRepo.findAll();
	}
	
//	http://localhost:9090/save -> use postman, method -> POST, -> set dummy json text, send request 
	@PostMapping("/save")
	public String saveCity(@RequestBody City city) {
		cityRepo.save(city);
		return "city saved successfully";
	}
}
