package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics {
	public static class Stats {
		public static Float average, max, min;

		public Stats() {
			average = Float.NaN;
			max = Float.NaN;
			min = Float.NaN;
		}
	}

	public static Stats getStatistics(List<Float> numbers) {
		Stats s = new Stats();
		if (!numbers.isEmpty()) {
			s.average = avg(numbers);
			s.max = maximun(numbers);
			s.min = minimum(numbers);
		}
		return s;
	}

	private static Float avg(List<Float> marks) {
		Float sum = 0f;
		for (Float mark : marks) {
			sum += mark;
		}
		return sum / marks.size();
	}

	private static Float maximun(List<Float> numbers) {
		return Collections.max(numbers);
	}

	private static Float minimum(List<Float> numbers) {
		return Collections.min(numbers);
	}
}