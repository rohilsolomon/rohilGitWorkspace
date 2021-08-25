package pojos;

public class Emp {
	private int id;
	private String name;
	private int deptId;
	private double basicSal;
	public Emp(int id, String name, int deptId, double basicSal) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basicSal = basicSal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", deptId=" + deptId + ", basicSal=" + basicSal + "]";
	}
	public double getBasicSal() {
		return basicSal;
	}
	public int getId() {
		return id;
	}
	
	
}
