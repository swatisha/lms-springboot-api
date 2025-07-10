package com.ninja.lms.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ninja.lms.entity.LmsProgramEntity;

public interface LmsProgramRepository extends JpaRepository<LmsProgramEntity, Long>{

}
