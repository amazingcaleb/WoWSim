
public class Item{
	//Should stats be an enum? array? this alright as is?
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
	private String NAME="";

	/*
	Takes input. Gets name. Sends the rest to statParse
	Takes array from statParse and fills stats
	looks gay as hell right now
	*/
	public Item(String input){
		String[] data = input.split(", ");
		for(int i=0; i<data.length; i++){
			if(i==0)
				NAME=data[i];
			else{
				String[] set = data[i].split(" ");
				if(set.length>0){
					switch(set[0]){
						case "STAM":
							STAM = Integer.parseInt(set[1]);
							break;
						case "INT":
							INT = Integer.parseInt(set[1]);
							break;
						case "AGI":
							AGI = Integer.parseInt(set[1]);
							break;
						case "STR":
							STR = Integer.parseInt(set[1]);
							break;
						case "CRIT":
							CRIT = Integer.parseInt(set[1]);
							break;
						case "SPIR":
							SPIR = Integer.parseInt(set[1]);
							break;
						case "MAST":
							MAST = Integer.parseInt(set[1]);
							break;
						case "HASTE":
							HASTE = Integer.parseInt(set[1]);
							break;
						case "DODGE":
							DODGE = Integer.parseInt(set[1]);
							break;
						case "PARRY":
							PARRY = Integer.parseInt(set[1]);
							break;
						case "MULTI":
							MULTI = Integer.parseInt(set[1]);
							break;
						case "VERS":
							VERS = Integer.parseInt(set[1]);
							break;
						default:
							break;
					}
				}
			}
		}
	}

	public int STAM(){
		return STAM;
	}

	public int INT(){
		return INT;
	}
	public int AGI(){
		return AGI;
	}

	public int STR(){
		return STR;
	}
	public int SPIR(){
		return SPIR;
	}

	public int CRIT(){
		return CRIT;
	}
	public int HASTE(){
		return HASTE;
	}

	public int MAST(){
		return MAST;
	}
	public int DODGE(){
		return PARRY;
	}

	public int MULTI(){
		return MULTI;
	}
	public int VERS(){
		return VERS;
	}

	public int STAM(){
		return STAM;
	}

}