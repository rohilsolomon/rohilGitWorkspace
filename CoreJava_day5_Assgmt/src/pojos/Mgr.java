package pojos;

public class Mgr extends Emp{
	private double performanceBonus;

	public Mgr(int id, String name, int deptId, double basicSal, double performanceBonus) {
		super(id, name, deptId, basicSal);
		this.performanceBonus = performanceBonus;
	}

	public double getPerformanceBonus() {
		return performanceBonus;
	}
	
	
	public void setPerformanceBonus(double performanceBonus) {
		this.performanceBonus = performanceBonus;
	}

	public double computeNetSal()
	{
		return getBasicSal() + getPerformanceBonus();
	}

	@Override
	public String toString() {
		return super.toString() + "Mgr [performanceBonus=" + performanceBonus +" NetSal="+ computeNetSal() + "]";
	}
	
	
	
}
