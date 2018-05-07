public abstract class Sword extends Weapon{
	private int strikePower;
	public Sword (int attack, int defense,int strikePower){
		super(attack, defense);
		this.strikePower=strikePower;
	}
	public int getStrikePower(){
		return strikePower;
	}
	public void setStrikePower(int strikePower){
		this.strikePower=strikePower;
	}
	public double attackPower(double strength){

		return strength / 1.5;

		
	}

	public double Defense(double defend){

		return defend * .08;

		
	}


}