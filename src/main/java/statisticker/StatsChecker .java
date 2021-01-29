package statisticker;

import java.util.List;

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