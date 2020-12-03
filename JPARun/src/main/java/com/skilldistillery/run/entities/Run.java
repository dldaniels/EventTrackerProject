package com.skilldistillery.run.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "run")
public class Run {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String location;

	private Double distance;

	private Double time;

	private Integer calories;

	@Column(name = "elevation_gain")
	private Double elevationGain;

	@Column(name = "avg_heart_rate")
	private Integer avgHeartRate;

	private String date;

	private String description;

	public Run() {
		super();
	}

	public Run(int id, String location, Double distance, Double time, Integer calories, Double elevationGain,
			Integer avgHeartRate, String date, String description) {
		super();
		this.id = id;
		this.location = location;
		this.distance = distance;
		this.time = time;
		this.calories = calories;
		this.elevationGain = elevationGain;
		this.avgHeartRate = avgHeartRate;
		this.date = date;
		this.description = description;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Double getElevationGain() {
		return elevationGain;
	}

	public void setElevationGain(Double elevationGain) {
		this.elevationGain = elevationGain;
	}

	public Integer getAvgHeartRate() {
		return avgHeartRate;
	}

	public void setAvgHeartRate(Integer avgHeartRate) {
		this.avgHeartRate = avgHeartRate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Run other = (Run) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Run [id=").append(id).append(", location=").append(location).append(", distance=")
				.append(distance).append(", time=").append(time).append(", calories=").append(calories)
				.append(", elevationGain=").append(elevationGain).append(", avgHeartRate=").append(avgHeartRate)
				.append(", date=").append(date).append(", description=").append(description).append("]");
		return builder.toString();
	}

}
