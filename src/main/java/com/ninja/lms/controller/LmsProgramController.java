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

import com.ninja.lms.jpa.LmsProgramRepository;
import com.ninja.lms.entity.LmsProgramEntity;


@RestController
@RequestMapping("/")
public class LmsProgramController {
 
 // DemoEntity is the Customer Object
 
 @Autowired
 LmsProgramRepository programRepository;
 
 // Get All Programs
 @GetMapping("/programs")
 List<LmsProgramEntity> all(){
 return programRepository.findAll(); 
 }
 
 // Get Single Program
 @GetMapping("/programs/{id}")
 Optional <LmsProgramEntity> findProgram(@PathVariable Long id){
 return programRepository.findById(id);
 }
 
 // Create New Program
 @PostMapping("/programs")
 LmsProgramEntity createProgram (@RequestBody LmsProgramEntity newProgram) {
 return programRepository.save(newProgram);
 }
 
 // Update Program Information
 @PutMapping("/programs/{id}")
 LmsProgramEntity updateProgram (@RequestBody LmsProgramEntity updatedProgram, @PathVariable Long id) {
	 updatedProgram.setProgramId(id);
 return programRepository.save(updatedProgram);
 }
 
 // Delete Single Program;
 @DeleteMapping ("/programs/{id}")
 void deleteProgram(@PathVariable Long id){
	 programRepository.deleteById(id);
 }
}
 
