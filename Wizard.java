public class Wizard extends Hero{
	private int magic;
	private int spAttack;

	public Wizard(String name, int level, int life, int abilities, int exp, int magic, int spAttack){
		super(name, level, life, abilities, exp);
		this.magic = magic;
		this.spAttack = spAttack;
	}

	public void setMagic(int magic){
		this.magic = magic;
	}
	public int getMagic(){
		return magic;
	}

	public void setSpAttack(int spAtack){
		this.spAttack = spAttack;
	}
	public int getSpAttack(){
		return spAttack;
	}
}
