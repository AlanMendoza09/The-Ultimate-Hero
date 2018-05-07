import java.io.Serializable;
public abstract class Hero extends Weapon implements Serializable{
	private String name;
	private int level;
	private int life;
	private int abilities;
	private int exp;
	private int pos;
	private int pos1;
	public abstract void pickUp();
	public abstract void attack();
	public abstract void defend();
	public abstract void move();

	public Hero(int attack, int defense, String name, int level, int life, int abilities, int exp, int pos, int pos1){
		super(attack, defense);
		this.name = name;
		this.level = level;
		this.life = life;
		this.abilities = abilities;
		this.exp = exp;
		this.pos=pos;
		this.pos1=pos1;
	}
	public int getPos(){
		return pos;
	}
	public void setPos(int pos){
		this.pos=pos;
	}
	public int getPos1(){
		return pos1;
	}
	public void setPos1(int pos1){
		this.pos1=pos1;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}

	public void setLife(int life){
		this.life = life;
	}
	public int getLife(){
		return life;
	}

	public void setAbilities(int abilities){
		this.abilities = abilities;
	}
	public int getAbilities(){
		return abilities;
	}

	public void setExp(int exp){
		this.exp = exp;
	}
	public int getExp(){
		return exp;
	}

}











