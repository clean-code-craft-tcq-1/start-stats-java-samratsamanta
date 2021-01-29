package statisticker;

import java.util.List;
import java.util.Collections;

public static class Statistics {
	static class Stats {
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

public class StatsChecker {
	float maxThreshold;
	IAlerter iAlerter[];

	StatsChecker(float maxThreshold, IAlerter iAlerter[]) {
		this.maxThreshold = maxThreshold;
		this.iAlerter = iAlerter;
	}

	void checkAndAlert(List<Float> numberList) {
		Stats s = Statistics.getStatistics(numberList);
		if (s.max > maxThreshold) {
			iAlerter[0].emailSent = true;
			iAlerter[1].ledGlows = true;
		}
	}
}

public class EmailAlert extends IAlerter {
	EmailAlert() {
		emailSent = false;
	}
}

public class LEDAlert extends IAlerter {
	LEDAlert() {
		ledGlows = false;
	}
}

public class IAlerter {
	public boolean ledGlows;
	public boolean emailSent;
}