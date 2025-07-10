package com.ninja.lms.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ninja.lms.entity.LmsBatchEntity;

public interface LmsBatchRepository extends JpaRepository<LmsBatchEntity, Long>{

}