package com.pumpkin.db;

import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.data.repository.CrudRepository;

import com.pumpkin.business.Pumpkin;

public interface PumpkinRepo extends JpaRepository<Pumpkin, Integer> {

}
