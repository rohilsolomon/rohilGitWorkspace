package pojos;

public class Mango extends Fruits{
	public Mango(String name)
	{
		super(name);
	}
	
	public String taste() {
		return "Sweet";
	}
	
	@Override
	public String toString() {
		return super.toString()+" , taste="+taste() ;
	}
}
