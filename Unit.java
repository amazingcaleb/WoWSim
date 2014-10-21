//thinking of GridWorld's Actor
import java.util.ArrayList;
public abstract class Unit{
	private String name;
	private int HP;//function of stamina in player
	private ArrayList<Aura> auras;

	//"Garrosh Fucking Hellscream, 69420", Auras

	/*public Unit(String input, ArrayList<Aura> au){
		String[] data = input.split(", ");
		name = data[0];
		HP=Integer.parseInt(data[1]);
		for(Aura a: au)
			auras.add(a);
	*/
	public int HP(){
		return HP;
	}
}