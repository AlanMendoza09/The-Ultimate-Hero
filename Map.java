import java.io.Serializable;

public class Map implements Serializable{
	
	public Box[][] boxes;

	public Map(int rows, int columns){
		boxes= new Box[rows][columns];
	}

	public Box[][] getBoxes(){
		return boxes;
	}
}