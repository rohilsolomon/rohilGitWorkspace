package pojos;

//inheriting name from super class
public class Orange extends Fruits{
	//constructor initializer
	public Orange(String name) {
		super(name);
	}
	//adding a method to add taste to orange
	public String taste() {
		return "Sour";
	}
	
	@Override
	public String toString() {
		return super.toString()+" , taste="+taste();
	}
	
}
