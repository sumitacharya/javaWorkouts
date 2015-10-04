
public class PrincipalAmount {
	/*
	 * Principal Amount
	 */
	private double principal;
	
	public PrincipalAmount(double init){
		if (init>0){
			principal=init;
		}
		else {
		principal=0;
		}
	}
	
	public void setPrincipalAmount(double P){
		principal=P;
	}
	
	public double getPrincipalAmount(){
		return principal;
	}
}
