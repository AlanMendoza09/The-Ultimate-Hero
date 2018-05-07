public class Shadow extends Monster{
	private int strike;

	public Shadow(String name, int strength, int life, int att, int strike){
		super(name, strength, life, att);
		this.strike = strike;
	}

	public void setStrike(int strike){
		this.strike = strike;
	}
	public int getStrike(){
		return strike;
	}
}