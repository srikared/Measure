package org.measure.domain;

public class Foot extends Length{
	
	private static final double base_conversion_factor = 30.48d;

	public Foot(double value) {
		this.value = value;
	}

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(value*base_conversion_factor);
	}
	
	public Foot revertToFoot(Length length){
		return new Foot(length.convertToBaseValue().value/base_conversion_factor);
	}
	
	public Foot add(Length length){
		return new Foot(this.convertToBaseValue().additionToBase(length.convertToBaseValue())/base_conversion_factor);
	}

}
