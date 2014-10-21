/*
2: Red
3: Blue
5: Yellow
7: Meta
30: Prismatic
*/
public class Socket{
	private boolean filled = false;
	private int color=0;
	private Gem gem;

	public Socket(String color){
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
	}
	public boolean fill(Gem g){
		gem = g;
		filled = true;
	}
}