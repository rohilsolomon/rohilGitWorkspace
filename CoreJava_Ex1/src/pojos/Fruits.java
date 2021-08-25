package pojos;

public class Fruits {
	private String name;

	//@MappedSuperClass => will acts as a super class for all child entities
	//parameter constructor to initialize Fruits class
	public Fruits(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name ;
	}
	
	
}
