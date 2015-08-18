package org.measure.domain;

public class Centimeter extends Length{

	public Centimeter(double d) {
		this.value = d;
	}
	
	private static final double base_conversion_factor = 1d;

	@Override
	public Centimeter convertToBaseValue() {
		return new Centimeter(value*base_conversion_factor);
	}
	
	public Centimeter revertToCM(Length length){
		return new Centimeter(length.convertToBaseValue().value/base_conversion_factor);
	}
	
	public double additionToBase(Length length) {
		return this.convertToBaseValue().value+length.convertToBaseValue().value;
	}
	
	public Centimeter add(Length length){
		return new Centimeter(this.convertToBaseValue().additionToBase(length.convertToBaseValue())/base_conversion_factor);
	}
	
	
	@Override
	public boolean equals(Object obj){
		Centimeter centimeter = (Centimeter)obj;
		if(Math.abs((this.value)-(centimeter.value))<0.01)return true;
		return false;
	}
}
