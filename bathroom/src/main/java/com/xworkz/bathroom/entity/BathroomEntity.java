package com.xworkz.bathroom.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="br")
public class BathroomEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="gender")
	private String gender;
	@Column(name="type")
	private String type;
	@Column(name="cost")
	private double cost;
	@Column(name="duration")
	private LocalTime duration;
	@Column(name="createdBy")
	private String createdBy;
	@Column(name="createdDate")
	private LocalDate createdDate;
	@Column(name="updateBy")
	private String updateBy;
	@Column(name=" updateDate")
	private LocalDate updateDate;
	
	
}
