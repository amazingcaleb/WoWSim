
public class Item{
	/*Should stats be an enum? array? this alright as is?
	Moving stats over to player. why the fuck did i put
	them here in the first place? As a consequence this is
	probably getting gutted and parsing might move as well. fuh

	UPDATE:
	thinking of turning the stats into an array that gets processed
	in Player.
	Plan: item puts stats into a vector(array). player sums the gear vectors
	and adds this sum to base stats.
	
	0  private int STAM=0; 
	1  private int INT=0;
	2  private int AGI=0;
	3  private int STR=0;
	4  private int SPIR=0;
	5  private int CRIT=0;
	6  private int MAST=0;
	7  private int HASTE=0;
	8  private int DODGE=0;
	9  private int PARRY=0;
	10 private int MULTI=0;
	11 private int VERS=0;

	*/
	private int[14] stats;
	private String NAME="";

	/*
	looks gay as hell right now
	sample input: "Thing of Kil, STAM 69, SPIR 420, STR 86"
	*/
	public Item(String input){
		stats = new int[14];
		String[] data = input.split(", ");
		//Ghetto parse
		for(int i=0; i<data.length; i++){
			if(i==0)
				NAME=data[i];
			else{
				String[] set = data[i].split(" ");
				if(set.length>0){
					switch(set[0]){
						case "STAM":
							stats[0] = Integer.parseInt(set[1]);
							break;
						case "INT":
							stats[1] = Integer.parseInt(set[1]);
							break;
						case "AGI":
							stats[2] = Integer.parseInt(set[1]);
							break;
						case "STR":
							stats[3] = Integer.parseInt(set[1]);
							break;
						case "CRIT":
							stats[5] = Integer.parseInt(set[1]);
							break;
						case "SPIR":
							stats[4] = Integer.parseInt(set[1]);
							break;
						case "MAST":
							stats[6] = Integer.parseInt(set[1]);
							break;
						case "HASTE":
							stats[7] = Integer.parseInt(set[1]);
							break;
						case "DODGE":
							stats[8] = Integer.parseInt(set[1]);
							break;
						case "PARRY":
							stats[9] = Integer.parseInt(set[1]);
							break;
						case "MULTI":
							stats[10] = Integer.parseInt(set[1]);
							break;
						case "VERS":
							stats[11] = Integer.parseInt(set[1]);
							break;
						default:
							break;
					}
				}
			}
		}
	}

	public int[] stats(){
		return stats;
	}

}