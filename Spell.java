/*
Wondering if spell attributes should be figured here
or if they should be figured in the player class

I originally thought this would be an interface but i couldn't
think of a way to get around needing things like cast time,
target, author, etc. Is abstract the way to go here? I'm considering
going abstract and having each individual spell extend this with fully
implemented cast()s.

Thinking that cast progress should be tracked here to make
channeled spells easier to deal with. If this is how it ends
up then maybe tracking time in terms of frames will be the
way to go?

WoWHead has some pretty good documentation. Claims to know damage
values as functions of stats.

-Crits-
So your character has a crit value and i'm pretty sure spells also have their
own crit values (eg Fire mage has a passive that ups the crit chances of 
certain spells)
Thinking of having crits rolled in Sim
*/
public abstract class Spell{
	private double castTime;//will clearly be a function of auras and stats
	private double progress;
	private double critChance;
	private String name;
	//this will probably always be the player, so i'm not sure how useful this will be
	private Unit author;
	private Unit target;
	//will damage type (frost, fire, etc) even matter?
	private String type;

	public Spell(){//does it even need a ctor?

	}

	/*
	child classes will deal with shit like auras, damage and all that jazz
	*/
	public abstract boolean cast(Unit target);

}