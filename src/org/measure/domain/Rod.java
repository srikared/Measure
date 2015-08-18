package org.measure.domain;

public class Rod extends Length{
	
	private static final double base_conversion_factor = 502.92d;

	public Rod(double value) {
		this.value = value;
	}

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(this.value*base_conversion_factor);
	}
	
	public Rod revertToRod(Length length){
		return new Rod(length.convertToBaseValue().value/base_conversion_factor);
	}
	
	public Rod add(Length length){
		return new Rod(this.convertToBaseValue().additionToBase(length.convertToBaseValue())/base_conversion_factor);
	}
}
