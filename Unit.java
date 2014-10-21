//thinking of GridWorld's Actor
import java.util.ArrayList;
public class Unit{
	private String name;
	private int HP;
	private ArrayList<Aura> auras;

	//Garrosh Fucking Hellscream, 69420, Auras
	public Unit(String input, ArrayList<Aura> au){
		String[] data = input.split(", ");
		name = data[0];
		HP=Integer.parseInt(data[1]);
		for(Aura a: au)
			auras.add(a);
	}
}