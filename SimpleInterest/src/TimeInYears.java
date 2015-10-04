
public class TimeInYears {
	public double time;
	
	public TimeInYears(double init){
		if (init > 0){
			time = init;
		}
		else{
			time = 0;
		}
	}
	
	public void setTime(double t){
		time = t;
	}
	
	public double getTime(){
		return time;
	}
}
