package tddmicroexercises.realLife;

public class IndexValueComputer {

	public double compute(double a, double b) {
		double res = 0;
		UserLogger.info("Start Computing");
		res = a + b; // Complex calculation
		UserLogger.info("Computing End");
		return res;
	}
	
}
