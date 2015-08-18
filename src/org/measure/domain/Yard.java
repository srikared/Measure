package org.measure.domain;

public class Yard extends Length{
	
	private static final double base_conversion_factor = 91.44d;

	public Yard(double value) {
		this.value = value;
	}

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(value*base_conversion_factor);
	}
	
	public Yard revertToYard(Length length){
		return new Yard(length.convertToBaseValue().value/base_conversion_factor);
	}
	
	public Yard add(Length length){
		Length baseValue = length.convertToBaseValue();
		return new Yard(this.convertToBaseValue().additionToBase(baseValue)/base_conversion_factor);
	}
}
