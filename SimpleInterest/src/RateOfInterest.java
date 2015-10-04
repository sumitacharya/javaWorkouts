
public class RateOfInterest {
	public double rate;
	
	public RateOfInterest(double init){
		if (init > 0){
			rate = init;
		}
		else{
			rate = 0;
		}
	}
	
	public void setRate(double r){
		rate = r;
	}
	
	public double getRate(){
		return rate;
	}
}
