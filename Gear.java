/*Enum this shit?
0: Head
1: Neck
2: Shoulder
3: Chest
4: Wrist
5: Hands
6: Waist
7: Legs
8: Feet
9: Ring1
10: Ring2
11: Trinket1
12: Trinket2
13: Wep1
14: Wep2

Okay, maybe weapons need their own fucking class since they have
stats like Spell Power, Attack Power, Attack Speed, Damage per Second,...

plus i think stats of melee weapons are checked on their swings
maybe this can be worked around by giving all gear pieces these stats
and having only the items in certain slots checked on swings or some shit
*/
import java.util.ArrayList;
public class Gear extends Item{
	private String slot="";
	private ArrayList<Socket> sockets;
	private String socketBonus="";

	/*
	0: Name
	1: slot
	2-m: sockets
	m+1-...: stats
	*/
	public Gear(String input){
		String data = input.split(", ");
		super(input);
		slot = data[1];
		//Sockets 
		/*thinking of way to cleanly implement socket bonuses
		will probably add gem contributions then parse some string
		for bonus. fug
		*/
		sockets = new ArrayList<Socket>();
		for(int i=0; i<data.length; i++){
			String set = data[i].split(" ");
			if(set.length>1 && set[0].equalsIgnoreCase("Socket"))
				sockets.add(new Socket(set[1]));
			if(set.length>1)
		}

	}
	
}

//Thing of kil, Socket red, Socket Yellow, STAM 40, INT 70, Bonus Stam 40; INT 80; 