public class Potion extends Items{
	private int health;

	public Potion(String name, int level, String function,int health){
		super(name,level,function);
		this.health=health;
	}
	public int getHealth(){
		return health;
	}
	public void setHealth(int health){
		this.health=health;
	}
}
