package org.measure.domain;

public class Mile extends Length{
	
	private static final double base_conversion_factor = 160934d;

	public Mile(double value) {
		this.value = value;
	}

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(this.value*base_conversion_factor);
	}

	public Mile revertToMile(Length length){
		return new Mile(length.convertToBaseValue().value/base_conversion_factor);
	}
	
	public Mile add(Length length){
		return new Mile(this.convertToBaseValue().additionToBase(length.convertToBaseValue())/base_conversion_factor);
	}
}
