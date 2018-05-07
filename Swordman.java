public class Swordman extends Hero{
	private int strength;
	private int defense;

	public Swordman(String name, int level, int life, int abilities, int exp, int strength, int defense){
		super(name, level, life, abilities, exp);
		this.strength = strength;
		this.defense = defense;
	}

	public void setStrength(int strength){
		this.strength = strength;
	}
	public int getStrength(){
		return strength;
	}

	public void setDefense(int defense){
		this.defense = defense;
	}
	public int getDefense(){
		return defense;
	}
}