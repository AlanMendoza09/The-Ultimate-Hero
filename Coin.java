public class Coin extends Items{
	private int value;

	public Coin(String name, int level, String function, int value){
		super(name, level, function);
		this.value=value;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value=value;
	}
}
