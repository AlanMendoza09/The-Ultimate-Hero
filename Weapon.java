public abstract class Weapon implements Att{
	private int attack;
	private int defense;

	public Weapon(int attack, int defense){
		this.attack=attack;
		this.defense=defense;
	}

	public int getAttack(){
		return attack;
	}
	public void setAttack(int attack){
		this.attack=attack;
	}
	public int getDefense(){
		return defense;
	}
	public void setDefense(){
		this.defense=defense;
	}
}
