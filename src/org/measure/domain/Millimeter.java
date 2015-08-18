package org.measure.domain;

public class Millimeter extends Length{
	
	private static final double base_conversion_factor = 0.1d;

	public Millimeter(double value) {
		this.value = value;
	}

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(value*base_conversion_factor);
	}
	
	public Millimeter revertToMillimeter(Length length){
		return new Millimeter(length.convertToBaseValue().value/base_conversion_factor);
	}

	public Millimeter add(Length length){
		return new Millimeter(this.convertToBaseValue().additionToBase(length.convertToBaseValue())/base_conversion_factor);
	}
	
}
