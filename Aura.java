/*
time dependent things will be checked 60 times per second
maybe have the effect stored as a string which gets parsed and executed in Sim?
*/

public class Aura{
	private String name="";
	private Unit author;
	private Unit target;
	private double duration;//think this should be in seconds or frames?
	private double progress;
	private String effect;
	private int stacks;
	private boolean stackable;//if true, successive applications increment stacks
	private int maxStacks;

	public Aura(String input){//input gets parsed in some clever way
		author=auth;
		target = targ;
		duration=dur;
		effect=eff;
	}

	public boolean setStacks(int n){
		stacks = n;
	}

}