package com.ninja.lms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import jakarta.validation.constraints.NotBlank;
import javax.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_lms_program")
public class LmsProgramEntity {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "program_id")
 private Long programId;
 @NotBlank (message = "Program Name is mandatory")
 @Column(name = "program_name")
 private String name;
 @Column(name = "program_description")
 private String desc;
 @Column(name = "program_status")
 private String status;
 public Long getProgramId() {
	return programId;
}
 public void setProgramId(Long programId) {
	this.programId = programId;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public String getDesc() {
	return desc;
 }
 public void setDesc(String desc) {
	this.desc = desc;
 }
 public String getStatus() {
	return status;
 }
 public void setStatus(String status) {
	this.status = status;
 }
}