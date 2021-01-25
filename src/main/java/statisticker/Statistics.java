package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics {
	static class Stats{
		public static Float average, max, min;
	}

	public static Stats getStatistics(List<Float> numbers) {
		Stats s = new Stats();
		s.average = avg(numbers);
		s.max = maximun(numbers);
		s.min = minimum(numbers);
		return s;
	}

	private static Float avg(List<Float> marks) {
		Float sum = 0f;
		if (!marks.isEmpty()) {
			for (Float mark : marks) {
				sum += mark;
			}
			return sum / marks.size();
		}
		return sum;
	}

	private static Float maximun(List<Float> numbers) {
		return Collections.max(numbers);
	}

	private static Float minimum(List<Float> numbers) {
		return Collections.min(numbers);
	}
}
//public class EmailAlert{
//	
//}
//public static class LEDAlert{
//
//}
//public cass IAlerter{
//	EmailAler emailAler;
//	LEDAlert ledAlert;
//	IAlerter(EmailAler emailAler,LEDAlert ledAlert){
//		this.emailAler=emailAler;
//		this.ledAlert=ledAlert;
//	}
//}
