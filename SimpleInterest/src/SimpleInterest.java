//import java.util.Scanner;

public class SimpleInterest {

	public static double calculate(double P, double T, double R){
		return P*T*R/100;
	}
	public static void main(String[] args) {
		PrincipalAmount p = new PrincipalAmount(1000);
		RateOfInterest r = new RateOfInterest(1);
		TimeInYears t = new TimeInYears(12);
		double result = calculate(p.getPrincipalAmount(),t.getTime(),r.getRate());
		System.out.println("interest from constructor = " + result);
		p.setPrincipalAmount(2000.0);
		result = calculate(p.getPrincipalAmount(),t.getTime(),r.getRate());
		System.out.println("interest after setting Principal Amount= " + result);
		r.setRate(10);
		result = calculate(p.getPrincipalAmount(),t.getTime(),r.getRate());
		System.out.println("interest after updating rate = " + result);
		
	}

}
