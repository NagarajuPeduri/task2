package compountAndSimple;

public class interestCal {

	public int compound(int priciple, int rate, int time) {		
		return (int)(priciple*(Math.pow((1+rate/100), time)));	
	}	
	
	public int simpleInterest(int principle, int rate, int time) {
		return (int)((principle*rate*time)/100);
	}
	
}
