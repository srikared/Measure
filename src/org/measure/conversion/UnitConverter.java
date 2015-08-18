package org.measure.conversion;

import org.measure.domain.Length;
import org.measure.domain.Meter;

public class UnitConverter {
	public Meter convertToMeter(Length length){
		Meter meter = new Meter();
		return meter.revertToMeter(length);
	}

}
