package com.xworkz.nirmala.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class NirmalaEntity {
@Id
	private int id;
	private String name;
	private String location;
	private double cost;
	private LocalTime duration;
	private String createdBy;
	private LocalDate createDate;
	private String updatedBy;
	private LocalDate updateDate;

	public NirmalaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NirmalaEntity( String name, String location, double cost, LocalTime duration, String createdBy,
			LocalDate createDate, String updatedBy, LocalDate updateDate) {
		super();
		
		this.name = name;
		this.location = location;
		this.cost = cost;
		this.duration = duration;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.updatedBy = updatedBy;
		this.updateDate = updateDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "NirmalaEntity [id=" + id + ", name=" + name + ", location=" + location + ", cost=" + cost
				+ ", duration=" + duration + ", createdBy=" + createdBy + ", createDate=" + createDate + ", updatedBy="
				+ updatedBy + ", updateDate=" + updateDate + "]";
	}

}
