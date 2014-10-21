/*
2: Red
3: Blue
5: Yellow
7: Meta
30: Prismatic
*/
public class Gem extends Item{
	private int color=0;

	//Sample: "Gem of Stat, 10, INT 420, CRIT 69"
	//(10 is orange)
	public Gem(String input){
		color=input.split(", ")[1];
		super(input);
	}
}