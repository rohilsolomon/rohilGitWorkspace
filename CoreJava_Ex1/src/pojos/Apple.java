package pojos;

public class Apple extends Fruits{
	//constructor initializer block
	public Apple(String name) {
		super(name);
	}
	//method to add taste of apple
	public String taste()
	{
		return "Sweet & Sour";
	}

	@Override
	public String toString() {
		return super.toString() + " ,taste=" + taste();
	}
	
	
}
