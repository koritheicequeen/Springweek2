package com.promineotech;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;



public class TestDemo {
	int addPositive(int a, int b) {
		int Sum = 0;
		if (a > 0 && b > 0) {
			Sum = a + b;
			return Sum;
		} else {
			throw new IllegalArgumentException();
		}
		
	}
int randomNumberSquared() {
		int randomInt = getRandomInt();
		randomInt=randomInt*randomInt;
		return randomInt;
	}
	int getRandomInt() {

	    Random random = new Random();

	    return random.nextInt(10) + 1;

	}
String fetchEffectAndDescription(String name) {
		Map<String,String> Humanoid = new LinkedHashMap<>();
		
		//borrowed some code from a side project
        
         Humanoid.put("Human",
        		"```"
        		+ "Description: A versatile and resilient race known for their adaptability and determination. Humans can thrive in a variety of environments and possess a unique ability to learn and master different skills quickly"+"\n"
        		+ "Versatile Growth: Start with 30 points instead of 20.\r\n"
        		+ "Adaptive Learner: Gain 1.25x more EXP for leveling up."+ "```" +"\n"
        		+ "Help: Level"
        		);
        
         Humanoid.put("Enlightened Human", 
        		"```"
        		+ "Description: Humans who have attained higher knowledge and spiritual awareness. They often seek wisdom and understanding, transcending mundane concerns to achieve a greater sense of purpose."+"\n"
        		+ "Much to Learn Gain 1.2x more EXP for leveling up.\r\n"
        		+ "Insightful: Once per day, ask a single question about the game world and receive a truthful answer."+ "```"+"\n"
        		+ "Help: Level"
        		);
        
         Humanoid.put("Divine Human", "```"
        		+ "Description: Humans blessed with divine power and celestial attributes. These individuals are often chosen by the gods or possess a sacred lineage, granting them extraordinary abilities and a noble presence."+"\n"
        		+ "Divine Fury: Once per combat, deal 100% additional damage with all attacks for a turn.\r\n"
        		+ "Aura of Chaos: Enemies have Disadvantage on their attack rolls against you until you are damaged."+ "```"+"\n"
        		+ "Help: Alignment"
        		);
        
         Humanoid.put("Human (OtherWorlder)", "```"
        		+ "Description: Humans who have traveled from another world, often possessing unique abilities. Their experiences in different realms grant them knowledge and skills uncommon in their new environment."+"\n"
        		+ "Dimensional Knowledge: Gain 2 more ability slots.\r\n"
        		+ "Otherworldly Adaptation: 20% less EXP but start at level 5 with 45 stats instead of 20."+ "```"+"\n"
        		+ "Help:Level"
        		);
         Humanoid.put("Enlightened Human (OtherWorlder)", "```"
        		+ "Description: Humans who have traveled from another world, often possessing unique abilities. Their experiences in different realms grant them knowledge and skills uncommon in their new environment."+"\n"
        		+ "Cosmic Insight: Once per combat, reduce the stats of a single monster or demihuman by 50%\r\n"
        		+ "Planar Resistance: Reduce damage from magical attacks by 10%"+ "```"+"\n"
        		+ "Help:Level"
        		);
        
         Humanoid.put("Divine Human (OtherWorlder)",
        		
        		"```"
        		+ "Description: OtherWorlders endowed with divine powers, making them exceptional beings. They carry the blessings and mandates of higher powers, often becoming pivotal figures in their new world"+"\n"+
        		"Divine Protection:Once per combat, reduce the stats of all monsters and demi Humans of less level by half for 2 turns.\r\n"
        		+ "Radiant Presence: Allies gain Advantage on attack rolls."+ "```"+"\n"
        		+ "Help:Alignment"
        		);
        
         Humanoid.put("Halfling",
        		"```"
        				+ "Description: Small, agile beings known for their resourcefulness and quick wit. They are often underestimated due to their size but possess a keen intellect and remarkable dexterity, making them excellent adventurers."+"\n"+ 
        		"Luck of the Small: Once per combat, reroll one roll.\r\n"
        		+ "Stealthy Steps: Gain Advantage on Stealth checks."	+ "```"+"\n"
        		+ "Help:Level"
        	);
        
         Humanoid.put("Archaic Halfling", 
        		"```"
        				+ "Description: Halflings with a deep connection to ancient traditions and forgotten lore. Their understanding of old ways and hidden knowledge gives them an edge in navigating both the physical and mystical realms."+"\n" +
        		"Hidden Potential: User mimic one skill from anyone they fight if they have the slot, however, they lose it after 24 hours\r\n"
        		+ "Mystic Connection: Invisibility magic that conceals them entirely from all but the most perceptive."	+ "```"+"\n"
        		+ "Help: Doesnt Evolve"
        	);
        
         Humanoid.put("Dwarf", 
        		"```"
        	+ "Description: Stout and sturdy beings known for their craftsmanship and mining skills. They have a strong sense of community and tradition, often living in underground cities where they forge powerful weapons and beautiful artifacts."+"\n"+
        		"Stout Constitution: Reduce incoming damage from poisons 50%\r\n"
        		+ "Resilient Spirit: Immune to fear effects."+ "```"+"\n"
        		+ "Help:Level"
        		);
        
         Humanoid.put("High Dwarf",
        		"```"
        		+ "Description: Dwarves of noble lineage, renowned for their exceptional skills and leadership. They hold positions of power and influence, guiding their people with wisdom and strength, and often possessing superior abilities in smithing and combat." +"\n"+
        		"Stone Mastery: Armor has double bonus when wielded or crafted by them.\r\n"
        		+ "Mountain’s Strength: Once per combat, reduce all damage."	+ "```"+"\n"
        		+ "Help: Doesnt Evolve"
        	);
        
         Humanoid.put("Elf", 
        		"```"
        		+ "Description: Graceful and long-lived beings with a deep affinity for nature and magic. They are known for their beauty, wisdom, and elegance, often living in harmony with their surroundings and excelling in archery and spellcasting." +"\n"+
        		"Elven Agility: Agility reduces damage taken by half of the roll if fail to fully dodge.\r\n"
        		+ "Nature's Insight: Can tell what race someone is by sight."+ "```"+"\n"
        		+ "Help: Level and Affinity"
        		);
        
         Humanoid.put("High Elf", 
        		"```" 
        	+ "Description: Elves of noble heritage, possessing advanced magical abilities and wisdom. They are often the leaders and scholars of elven society, revered for their knowledge and mastery of the arcane arts."+"\n" +
        		"Homunculi: Creates a body double that acts independently\r\n"
        		+ "Arcane Knowledge: Agility reduces damage taken by 100% of the roll on fail"	+ "```"+"\n"
        		+ "Help: Doesnt Evolve"
        	);
        
         Humanoid.put("Dark Elf", 
        		"```"
        				+ "Description: Elves who dwell in shadows and practice dark magic, often shunned by other elves. They have a reputation for being cunning and ruthless, using their abilities for personal gain or vengeance."+"\n" +
        		"Shadow Affinity: Gain +10 to Magic rolls when casting dark spells.\r\n"
        		+ "True Vision: Can see someone's entire stat sheet by sight and ignores all forms of stealth."+ "```"+"\n"
        		+ "Help: Doesnt Evolve"
        		);
        
         Humanoid.put("Rabbit Folk", 
        		"```"
        				+ "Description: Small, agile humanoids with the features of rabbits. Rabbitfolk are known for their speed, cunning, and ability to escape from danger. They live in tight-knit communities and are adept at using their environment to their advantage, often creating intricate burrow systems to protect themselves and their kin."+"\n" +
        		"Quick Reflexes: Gain Advantage on dodging rolls.\r\n"
        		+ "Nimble Feet: Once per day, auto escape an encounter"+ "```"+"\n"
        		+ "Help: Unknown"
        		);
        
         Humanoid.put("Spirit Rabbit",
        		
        		"```"
        		+ "Description: Ethereal beings that embody the essence of the rabbit, often associated with luck and agility. Spirit Rabbits can traverse the spirit world and the physical realm, using their mystical abilities to guide and protect those they deem worthy. They are revered in many cultures for their connection to the spiritual and natural worlds." +"\n"
        		+ "Mystic Evolution: They can use Agility to attack with melee.\r\n"
        		+ "Nature's Abundance: Allies, including them, gain 1.5x EXP from combat."	+ "```"+"\n"
        		+ "Help: Doesnt Evolve"
        		);
        
         Humanoid.put("Witch",
        		"```"
        				+ "Description:  Practitioners of magic with a deep connection to mystical forces. They harness the natural and supernatural energies around them, using their knowledge to cast spells and brew potions." 
        		+ "Magical Affinity: Gain Advantage on Magic-based resistances checks.\r\n"
        		+ "Arcane Knowledge: All resistances have 1dmagic/2 added to them"+ "```"+"\n"
        		+ "Help: Alignment and Level"
        		);
        
         Humanoid.put("Evil Witch",
        		"```"
        				+ "Description: Witches who have embraced dark magic, using it for malicious purposes. They often engage in nefarious activities, driven by a desire for power or revenge, and are feared by many." +"\n"
        		+ "Dark Magic Mastery: Deal 25% additional damage with Dark Magic or 50% to anyone with light magic\r\n"
        		+ "Malevolent Aura: Enemies take magic/25 damage per turn (ignoring resistances)."+ "```"+"\n"
        		+ "Help: Level"
        		);
         // if it contains a key matching the name, itll return the description and bonuses of the humanoid
         if (Humanoid.containsKey(name)) {
        	 return Humanoid.get(name);
         } else return null;
	}
}
