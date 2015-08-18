package org.measure.domain;

public class Kilometer extends Length{
	
	private static final double base_conversion_factor = 100000d;

	public Kilometer(double value) {
		this.value = value;
	}

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(value*base_conversion_factor);
	}
	
	public Kilometer revertToKilometer(Length length){
		return new Kilometer(length.convertToBaseValue().value/base_conversion_factor);
	}
	
	public Kilometer add(Length length){
		return new Kilometer(this.convertToBaseValue().additionToBase(length.convertToBaseValue())/base_conversion_factor);
	}

}
