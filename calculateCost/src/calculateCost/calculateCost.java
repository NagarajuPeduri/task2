package calculateCost;

public class calculateCost {
	
	public int calculate(String material,double area, String auto) {
		if(material.equals("high standard materials") && auto.equals("Fully Automated Home"))
		{
			return (int) (2500*area);
		}
	   else if(material.equals("standard materials"))
		{
			return (int) (area*1200);
		}
		else if(material.equals("above standard materials"))
		{
			return (int) (1500*area);
		}
		else if(material.equals("high standard materials"))
		{
			return (int) (1800*area);
		}
		return 0;
		
	}

}
