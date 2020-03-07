package com.cerotid.JavaOOPS.cars;

import java.util.Date;

public class Cars {

	private String carName;
	private String carType;
	private String color;
	private int doors;
	private float maxSpeed;
	private Tires tires;
	private Engine engine;
	private boolean hasAndroidAuto;
	private boolean hasCarPlay;
	private Date lastOilChangeDate;
	private Date lastTireChangeDate;
	private String vin;

	public Cars() {

	}

	public Cars(String carName, String carType) {
		this.carName = carName;
		this.carType = carType;
	}

	public Cars(String carName, String carType, String color, int doors, float maxSpeed, Tires tires, Engine engine,
			boolean hasAndroidAuto, boolean hasCarPlay, Date lastOilChangeDate, Date lastTireChangeDate, String vin) {
		this.carName = carName;
		this.carType = carType;
		this.color = color;
		this.doors = doors;
		this.maxSpeed = maxSpeed;
		this.tires = tires;
		this.engine = engine;
		this.hasAndroidAuto = hasAndroidAuto;
		this.hasCarPlay = hasCarPlay;
		this.lastOilChangeDate = lastOilChangeDate;
		this.lastTireChangeDate = lastTireChangeDate;
		this.vin = vin;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tires getTires() {
		return tires;
	}

	public void setTires(Tires tires) {
		this.tires = tires;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isHasAndroidAuto() {
		return hasAndroidAuto;
	}

	public void setHasAndroidAuto(boolean hasAndroidAuto) {
		this.hasAndroidAuto = hasAndroidAuto;
	}

	public boolean isHasCarPlay() {
		return hasCarPlay;
	}

	public void setHasCarPlay(boolean hasCarPlay) {
		this.hasCarPlay = hasCarPlay;
	}

	public Date getLastOilChangeDate() {
		return lastOilChangeDate;
	}

	public void setLastOilChangeDate(Date lastOilChangeDate) {
		this.lastOilChangeDate = lastOilChangeDate;
	}

	public Date getLastTireChangeDate() {
		return lastTireChangeDate;
	}

	public void setLastTireChangeDate(Date lastTireChangeDate) {
		this.lastTireChangeDate = lastTireChangeDate;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carType=" + carType + ", color=" + color + ", doors=" + doors
				+ ", maxSpeed=" + maxSpeed + ", tires=" + tires + ", engine=" + engine + ", hasAndroidAuto="
				+ hasAndroidAuto + ", hasCarPlay=" + hasCarPlay + ", lastOilChangeDate=" + lastOilChangeDate
				+ ", lastTireChangeDate=" + lastTireChangeDate + ", vin=" + vin + "]";
	}

}
