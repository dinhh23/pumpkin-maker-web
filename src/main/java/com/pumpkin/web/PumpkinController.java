package com.pumpkin.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pumpkin.business.Pumpkin;
import com.pumpkin.db.PumpkinRepo;

@CrossOrigin
@RestController
@RequestMapping("/pumpkins")
public class PumpkinController {
	
	@Autowired
	private PumpkinRepo pumpkinRepo;
	
	// List all pumpkins
	@GetMapping("/")
	public List<Pumpkin> getAllPumpkins() {
		return pumpkinRepo.findAll();
	}
	
	// Get pumpkin by id
	@GetMapping("/{id}")
	public Optional getAllPumpkin(@PathVariable int id) {
		Optional<Pumpkin> p = pumpkinRepo.findById(id);
		return p;
	}
	
	// Add a pumpkin 
	@PostMapping("/")
	public Pumpkin addPumpkin(@RequestBody Pumpkin p) {
		return pumpkinRepo.save(p);
	}
	
	// Update a pumpkin
	@PutMapping("/")
	public Pumpkin updatePumpkin(@RequestBody Pumpkin p) {
		return pumpkinRepo.save(p);
	}
	
	// Delete a pumpkin
	@DeleteMapping("/")
	public void deletePumpkin(@RequestBody Pumpkin p) {
		pumpkinRepo.delete(p);
	}
	
}
