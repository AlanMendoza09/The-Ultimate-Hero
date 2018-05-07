public abstract class Monster extends Weapon{
	private String name;
	private int strength;
	private int life;
	

	public Monster(int attack, int defense, String name, int strength, int life){
		super(attack, defense);
		this.name = name;
		this.strength = strength;
		this.life  = life;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setStrength(int strength){
		this.strength = strength;
	}
	public int getStrength(){
		return strength;
	}

	public void setLife(int life){
		this.life = life;
	}
	public int getLife(){
		return life;
	}
}