//Main here
/*
-Flow would be something like (60x/second)-
(while boss isn't kil)
	evaluate auras
	check player state
		(if not casting/on GCD)
			cast next spell in rotation(determined by checking for proc auras/priority list)
				apply any resulting auras to units
				update unit resources accordingly

-Aura evaluation-
update stats
update player priority list(?)
update unit resources accordingly (damage/primary-/secondary resources)

-Spell Casting-
puts player in casting state for duration of cast
resources are updated on cast completion (i think)
leaves player in GCD state if applicable

-Damage-
Roll for crit
I. apply auras
II. update recipient's resources (I + II = "apply and update")
Roll for multistrike (if applicable[always?])
	roll for crit
	apply and update
	Roll for multistrike 2
		roll for crit
		apply and update

Am I missing anything?

*/