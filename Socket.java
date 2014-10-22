/*
2: Red
3: Blue
5: Yellow
7: Meta
30: Prismatic
*/
public class Socket{
	private boolean filled;
	private int color;
	private Gem gem;

	public Socket(){
		filled = false;
		switch(color){
			case "Red": color = 2;
				break;
			case "Blue": color = 3;
				break;
			case "Yellow": color = 5;
				break;
			default: color = 0;
				break;
		}
		gem = null;
	}

	public Socket(String color){
		filled = false;
		switch(color){
			case "Red": color = 2;
				break;
			case "Blue": color = 3;
				break;
			case "Yellow": color = 5;
				break;
			default: color = 0;
				break;
		}
		gem = null;
	}

	public Socket(String color, Gem g){
		filled = true;
		switch(color){
			case "Red": color = 2;
				break;
			case "Blue": color = 3;
				break;
			case "Yellow": color = 5;
				break;
			default: color = 0;
				break;
		}
		gem = g;
	}

	public boolean isFilled(){
		return filled;
	}

	public int getColor(){
		return color;
	}

	public Gem getGem(){
		return g;
	}

	public void fill(Gem g){
		gem = g;
		filled = true;
	}
}