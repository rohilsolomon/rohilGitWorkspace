package pojos;

public class Worker extends Emp{
	private int hoursWorked;
	private int hourlyRate;
	public Worker(int id, String name, int deptId, double basicSal, int hoursWorked, int hourlyRate) {
		super(id, name, deptId, basicSal);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public double computeNetSal() {
		return getBasicSal() + (getHoursWorked() * getHourlyRate());
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}
	

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return super.toString() +"Worker [hoursWorked=" + getHoursWorked() + ", hourlyRate=" + getHourlyRate() + "NetSal="+computeNetSal()  + "]";
	}
	
	
	
}
