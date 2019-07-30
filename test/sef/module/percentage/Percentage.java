package sef.module.percentage;

import junit.framework.AssertionFailedError;

public class Percentage {
	static double totalTestCount = 0;
	static double failedCount = 0;
	static String percentage;
	
	static public double getTotalTestCount() {
		return totalTestCount;
	}
	static public void setTotalTestCount(int totalTestCount) {
		Percentage.totalTestCount = totalTestCount;
	}
	static public double getFailedCount() {
		return failedCount;
	}

	static public String setFailedCount(int failedCount, String exception1) {
		Percentage.failedCount = Percentage.failedCount + failedCount;
		return "TEST FAILED: " + Percentage.failedCount+ ", ERROR: " + exception1;
	}
	static public String setFailedCount(boolean isLastTestCase, int totalTestCount) {
		if (isLastTestCase){
			Percentage.computePercentage(totalTestCount);
			throw new AssertionFailedError();
		}
		return "TEST FAILED: " + Percentage.failedCount;
	}
	
	static public String getMessage(String exception1){
		return "TEST FAILED: " + Percentage.failedCount + ", ERROR: " + exception1;
	}
	
	static public String computePercentage(int totalTestCount){
		Percentage.totalTestCount = totalTestCount;
		double passedCount = (Percentage.totalTestCount - Percentage.failedCount);
			if(passedCount != 0){
				double average = (passedCount/Percentage.totalTestCount) * 100;
				Percentage.percentage = String.valueOf(average);
			}else{
				Percentage.percentage = "0.0";
			}
		System.out.printf("" + "Number of Failed Test: " + Percentage.failedCount +  "\nTotal Testcase: " + Percentage.totalTestCount + "\nScore: " + (Percentage.totalTestCount - Percentage.failedCount)+"/"+Percentage.totalTestCount+ " = "+ "%.2f",Double.valueOf(Percentage.percentage));
		
	return Percentage.percentage;
	}

}
