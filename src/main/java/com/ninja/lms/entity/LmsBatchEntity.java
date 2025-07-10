package com.ninja.lms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import jakarta.validation.constraints.NotBlank;
import javax.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_lms_batch")
public class LmsBatchEntity {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "batch_id")
	 private Long batchId;
	@NotBlank (message = "Batch Name is mandatory")
	 @Column(name = "batch_name")
	 private String name;
	 @Column(name = "batch_description")
	 private String desc;
	 @NotBlank (message = "Batch Status is mandatory")
	 @Column(name = "batch_status")
	 private String status;
	 @ManyToOne
	 @JoinColumn(name = "batch_program_id", referencedColumnName = "program_id")  // FK column in tbl_lms_batch
	 private LmsProgramEntity program;
	 @NotNull (message = "Number of classes is mandatory")
	 @Column(name = "batch_no_of_classes")
	 private Long noOfClass;
	 public Long getBatchId() {
		 return batchId;
	 }
	 public void setBatchId(Long batchId) {
		 this.batchId = batchId;
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
	 public LmsProgramEntity getProgram() {
		 return program;
	 }
	 public void setProgram(LmsProgramEntity program) {
		 this.program = program;
	 }
	 public Long getNoOfClass() {
		 return noOfClass;
	 }
	 public void setNoOfClass(Long noOfClass) {
		 this.noOfClass = noOfClass;
	 }

}
