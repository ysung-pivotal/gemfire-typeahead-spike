package io.pivotal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.Region;

@Region("Property")
public class Property {
	Float Lat;
	
	Float Lon;
	
	@Id
	String Address; 
	
	Integer PxElevation;    
	
	Integer PxSlope;
	
	Integer PxAspect;   
	
	Integer Type;
	
	Integer ElevationFeet;   
	
	Integer AspectAzimuth;   
	
	Integer SlopeGradePercentage;
	
	@PersistenceConstructor
	public Property(String address, Integer elevation) {
		Address = address;
		ElevationFeet = elevation;
	}
	
	public Float getLat() {
		return Lat;
	}
	public void setLat(Float lat) {
		Lat = lat;
	}
	public Float getLon() {
		return Lon;
	}
	public void setLon(Float lon) {
		Lon = lon;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Integer getPxElevation() {
		return PxElevation;
	}
	public void setPxElevation(Integer pxElevation) {
		PxElevation = pxElevation;
	}
	public Integer getPxSlope() {
		return PxSlope;
	}
	public void setPxSlope(Integer pxSlope) {
		PxSlope = pxSlope;
	}
	public Integer getPxAspect() {
		return PxAspect;
	}
	public void setPxAspect(Integer pxAspect) {
		PxAspect = pxAspect;
	}
	public Integer getType() {
		return Type;
	}
	public void setType(Integer type) {
		Type = type;
	}
	public Integer getElevationFeet() {
		return ElevationFeet;
	}
	public void setElevationFeet(Integer elevationFeet) {
		ElevationFeet = elevationFeet;
	}
	public Integer getAspectAzimuth() {
		return AspectAzimuth;
	}
	public void setAspectAzimuth(Integer aspectAzimuth) {
		AspectAzimuth = aspectAzimuth;
	}
	public Integer getSlopeGradePercentage() {
		return SlopeGradePercentage;
	}
	public void setSlopeGradePercentage(Integer slopeGradePercentage) {
		SlopeGradePercentage = slopeGradePercentage;
	}
	
}
