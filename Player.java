/*
Clearly different classes have different resources,
plus secondary resources like soul shards and garbage like that.
So I'm thinking of keeping this thing pretty abstract and having
the individual specs be child classes of this.

Interacts with gear
*/
import java.util.ArrayList;
public class Player extends Unit{
	private int STAM=0;
	private int INT=0;
	private int AGI=0;
	private int STR=0;
	private int SPIR=0;
	private int CRIT=0;
	private int MAST=0;
	private int HASTE=0;
	private int DODGE=0;
	private int PARRY=0;
	private int MULTI=0;
	private int VERS=0;
	private ArrayList<Gear> wardrobe;

	public player(String input, ArrayList<Aura> au, ArrayList<Gear> set){
		super(input, au);

		//shit taken from item. not sure how this is going to work tbh. inb4 this whole project fizzles
		for(Gear piece: set){
			int[14]stats=piece.stats();
			STAM+= stats[0];
			INT+= stats[1];
			AGI+= stats[2];
			STR+= stats[3];
			SPIR+= stats[4];
			CRIT+= stats[5];
			MAST+= stats[6];
			HASTE+= stats[7];
			DODGE+= stats[8];
			PARRY+= stats[9];
			MULTI+= stats[10];
			VERS+= stats[11];

		}
	}
}