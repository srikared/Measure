package org.measure.domain;

public class Inch extends Length{
	
	private static final double base_conversion_factor = 2.54d;

	public Inch(double value) {
		this.value = value;
	}

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(value*base_conversion_factor);
	}
	
	public Inch revertToInch(Length length){
		return new Inch(length.convertToBaseValue().value/base_conversion_factor);
	}
	
	public Inch add(Length length){
		return new Inch(this.convertToBaseValue().additionToBase(length.convertToBaseValue())/base_conversion_factor);
	}
	
}
