package org.measure.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.measure.domain.Centimeter;
import org.measure.domain.Foot;
import org.measure.domain.Meter;
import org.measure.domain.Mile;
import org.measure.domain.Millimeter;
import org.measure.domain.Rod;
import org.measure.domain.Yard;
public class UnitConverterTest {
	
	@Test
	public void shouldReturnTrueWhenConversionFromMeterToMillimeterIsCorrect(){
		Millimeter millimeter = new Millimeter(1000);
		Meter meter = new Meter(1);
		assertEquals(true,millimeter.convertToBaseValue().equals(meter.revertToMeter(millimeter).convertToBaseValue()));
	}
	
	@Test
	public void shouldReturnTrueWhenConversionFromCentimeterToMeterIsCorrect(){
		Centimeter centimeter = new Centimeter(100);
		Meter meter = new Meter(1);
		assertEquals(true,meter.convertToBaseValue().equals(meter.revertToMeter(centimeter).convertToBaseValue()));
	}
	
	@Test
	public void shouldReturnTrueWhenConversionFromFeetToMillimeterIsCorrect(){
		Millimeter millimeter = new Millimeter(30.48);
		Foot foot = new Foot(0.1);
		assertEquals(true,millimeter.convertToBaseValue().equals(millimeter.revertToMillimeter(foot).convertToBaseValue()));
	}
	
	@Test
	public void shouldReturnTrueWhenConversionFromYardToMillimeterIsCorrect(){
		Millimeter millimeter = new Millimeter(30.48);
		Yard yard = new Yard(0.1);
		assertEquals(true,millimeter.convertToBaseValue().equals(yard.revertToYard(millimeter).convertToBaseValue()));
	}
	
	@Test
	public void shouldReturnTrueWhenConversionFromRodToMileIsCorrect(){
		Rod rod = new Rod(1);
		Mile mile = new Mile(0.003125);
		assertEquals(true,rod.convertToBaseValue().equals(rod.revertToRod(mile).convertToBaseValue()));
	}
	
	@Test
	public void shouldAddYardAndMillimeterValuesAndProduceCorrectResultInYard(){
		Millimeter millimeter = new Millimeter(914.4);
		Yard yard = new Yard(1);
		Yard result = yard.add(millimeter);
		assertEquals(true,result.convertToBaseValue().equals(new Yard(2).convertToBaseValue()));
	}
	
	@Test
	public void shouldAddMillimeterAndYardValuesAndProduceCorrectResultInMillimeter(){
		Millimeter millimeter = new Millimeter(100);
		Yard yard = new Yard(0.109361);
		Millimeter result = millimeter.add(yard);
		assertEquals(true,result.convertToBaseValue().equals(new Millimeter(200).convertToBaseValue()));
	}
	
	@Test
	public void shouldAddMeterAndMeterAndProduceCorrectResult(){
		Meter meter = new Meter(1);
		Meter meter2 = new Meter(2);
		Meter result = meter.add(meter2);
		assertEquals(true,result.convertToBaseValue().equals(new Meter(3).convertToBaseValue()));
	}
}
