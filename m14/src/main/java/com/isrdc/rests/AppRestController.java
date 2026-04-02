package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.entities.State;
import com.isrdc.repos.StateRepo;

@RestController
public class AppRestController {
	
	@Autowired
	private StateRepo stateRepo;
	
	@PostMapping("/save_state")
	public String saveState(@RequestBody State state) {
		stateRepo.save(state);
		return "state saved successfully in cache";
	}
	
	@GetMapping("/show_all_states")
	public Iterable<State> showAllStates() {
		return stateRepo.findAll();
	}
}
