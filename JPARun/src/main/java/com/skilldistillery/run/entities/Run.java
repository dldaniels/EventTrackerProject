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

	private String name;

	private String location;

	private Double distance;

	private Double time;

	private Integer calories;

	@Column(name = "elevation_gain")
	private Double elevationGain;

	@Column(name = "avg_heart_rate")
	private Integer avgHeartRate;

	private String date;

	public Run() {
		super();
	}

	public Run(int id, String name, String location, Double distance, Double time, Integer calories,
			Double elevationGain, Integer avgHeartRate, String date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.distance = distance;
		this.time = time;
		this.calories = calories;
		this.elevationGain = elevationGain;
		this.avgHeartRate = avgHeartRate;
		this.date = date;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avgHeartRate == null) ? 0 : avgHeartRate.hashCode());
		result = prime * result + ((calories == null) ? 0 : calories.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((distance == null) ? 0 : distance.hashCode());
		result = prime * result + ((elevationGain == null) ? 0 : elevationGain.hashCode());
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		if (avgHeartRate == null) {
			if (other.avgHeartRate != null)
				return false;
		} else if (!avgHeartRate.equals(other.avgHeartRate))
			return false;
		if (calories == null) {
			if (other.calories != null)
				return false;
		} else if (!calories.equals(other.calories))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (distance == null) {
			if (other.distance != null)
				return false;
		} else if (!distance.equals(other.distance))
			return false;
		if (elevationGain == null) {
			if (other.elevationGain != null)
				return false;
		} else if (!elevationGain.equals(other.elevationGain))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Run [id=").append(id).append(", name=").append(name).append(", location=").append(location)
				.append(", distance=").append(distance).append(", time=").append(time).append(", calories=")
				.append(calories).append(", elevationGain=").append(elevationGain).append(", avgHeartRate=")
				.append(avgHeartRate).append(", date=").append(date).append("]");
		return builder.toString();
	}

}
