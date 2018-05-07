public abstract class Items{
	private String name;
	private int level;
	private String function;

	public Items(String name, int level, String function){
		this.name  =name;
		this.level= level;
		this.function = function;
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

	public void setFunction(String function){
		this.function = function;
	}
	public String getFunction(){
		return function;
	}


}