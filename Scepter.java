public abstract class Scepter extends Weapon{
	private int magicPower;
	public Scepter (int attack, int defense, int magicPower){
		super(attack, defense);
		this.magicPower=magicPower;
	}
		public int getMagicPower(){
		return magicPower;
	}
	public void setMagicPower(int magicPower){
		this.magicPower=magicPower;
	}
	public double attackPower(double strength){

		return strength / 1.2;

		
	}

	public double Defense(double defend){

		return defend * .07;

		
	}
}