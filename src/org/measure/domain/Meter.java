package org.measure.domain;

public class Meter extends Length{
	
	private static final double base_conversion_factor = 100d;

	public Meter(double value) {
		this.value = value;
	}

	public Meter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(value*base_conversion_factor);
	}
	
	public Meter revertToMeter(Length length){
		return new Meter(length.convertToBaseValue().value/base_conversion_factor);
	}
	
	public Meter add(Length length){
		return new Meter(this.convertToBaseValue().additionToBase(length.convertToBaseValue())/base_conversion_factor);
	}
}
