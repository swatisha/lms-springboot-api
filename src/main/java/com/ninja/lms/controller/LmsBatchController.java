package com.ninja.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja.lms.entity.LmsBatchEntity;
import com.ninja.lms.jpa.LmsBatchRepository;

@RestController
@RequestMapping("/")
public class LmsBatchController {
	 
	 @Autowired
	 LmsBatchRepository batchRepository;
	 
	 // Get All batch
	 @GetMapping("/batch")
	 List<LmsBatchEntity> all(){
	 return batchRepository.findAll(); 
	 }
	 
	 // Get Single batch
	 @GetMapping("/batch/{id}")
	 Optional <LmsBatchEntity> findProgram(@PathVariable Long id){
	 return batchRepository.findById(id);
	 }
	 
	 // Create New batch
	 @PostMapping("/batch")
	 LmsBatchEntity createProgram (@RequestBody LmsBatchEntity newBatch) {
	 return batchRepository.save(newBatch);
	 }
	 
	 // Update Batch Information
	 @PutMapping("/batch/{id}")
	 LmsBatchEntity updateProgram (@RequestBody LmsBatchEntity updatedBatch, @PathVariable Long id) {
		 updatedBatch.setBatchId(id);
	 return batchRepository.save(updatedBatch);
	 }
	 
	 // Delete Single Batch;
	 @DeleteMapping ("/batch/{id}")
	 void deleteProgram(@PathVariable Long id){
		 batchRepository.deleteById(id);
	 }
	}