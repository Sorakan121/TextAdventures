package Library;

import Objects.Job;
import Objects.Spell;
import Main.Battle;

import java.util.ArrayList;

public class SpellLibrary {
    private MainLibrary mainLibrary;
    private ArrayList<Spell> spellLibrary;
    private Battle battle;
    private Spell selectedSpell;

    public SpellLibrary(MainLibrary mainLibrary, Battle battle) {
        this.mainLibrary = mainLibrary;
        this.battle = battle;
        this.spellLibrary = new ArrayList<>();

        // Jobs will have lists for knownSpells and traits

        // Abilities

        Spell acolyteOfNature = new Spell("Acolyte of Nature", "At 1st level, you learn one cantrip of" +
                " your choice from the druid spell list. This cantrip counts as a cleric cantrip for you, but it doesn’t" +
                " count against the number of cleric cantrips you know. You also gain proficiency in one of the " +
                "following skills of your choice: Animal Handling, Nature, or Survival.", mainLibrary);
        spellLibrary.add(acolyteOfNature);

        Spell arcaneInitiate = new Spell("Arcane Initiate", "When you choose this domain at 1st level," +
                " you gain proficiency in the Arcana skill, and you gain two cantrips of your choice from the wizard" +
                " spell list. For you, these cantrips count as cleric cantrips.", mainLibrary);
        spellLibrary.add(arcaneInitiate);

        Spell bardicInspiration = new Spell("Bardic Inspiration", "You can inspire others through " +
                "stirring words or music. To do so, you use a bonus action on your turn to choose one creature other " +
                "than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die," +
                " a d6.\n" + "Once within the next 10 minutes, the creature can roll the die and add the number rolled" +
                " to one ability check, attack roll, or saving throw it makes. The creature can wait until after it " +
                "rolls the d20 before deciding to use the Bardic Inspiration die, but must decide before the GM says " +
                "whether the roll succeeds or fails. Once the Bardic Inspiration die is rolled, it is lost. A creature" +
                " can have only one Bardic Inspiration die at a time.\n" + "You can use this feature a number of times " +
                "equal to your Charisma modifier (a minimum of once). You regain any expended uses when you finish a " +
                "long rest.\n" + "Your Bardic Inspiration die changes when you reach certain levels in this class. The" +
                " die becomes a d8 at 5th level, a d10 at 10th level, and a d12 at 15th level.", mainLibrary);
        spellLibrary.add(bardicInspiration);

        Spell blessingsOfKnowledge = new Spell("Blessings of Knowledge", "At 1st level, you learn two " +
                "languages of your choice. You also become proficient in your choice of two of the following skills: " +
                "Arcana, History, Nature, or Religion.\n" + "\n" + "Your proficiency bonus is doubled for any ability" +
                " check you make that uses either of those skills.", mainLibrary);
        spellLibrary.add(blessingsOfKnowledge);

        Spell blessingOfTheForge = new Spell("Blessing of the Forge", "At 1st level, you gain the " +
                "ability to imbue magic into a weapon or armor. At the end of a long rest, you can touch one nonmagical" +
                " object that is a suit of armor or a simple or martial weapon. Until the end of your next long rest or" +
                " until you die, the object becomes a magic item, granting a +1 bonus to AC if it's armor or a +1 bonus" +
                " to attack and damage rolls if it's a weapon.\n" + "\n" + "Once you use this feature, you can't use it" +
                " again until you finish a long rest.", mainLibrary);
        spellLibrary.add(blessingOfTheForge);

        Spell blessingOfTheTrickster = new Spell("Blessing of the Trickster", "Starting when you choose" +
                " this domain at 1st level, you can use your action to touch a willing creature other than yourself to" +
                " give it advantage on Dexterity (Stealth) checks. This blessing lasts for 1 hour or until you use this" +
                " feature again.", mainLibrary);
        spellLibrary.add(blessingOfTheTrickster);

        Spell circleOfMortality = new Spell("Circle of Mortality", "At 1st level, you gain the ability" +
                " to manipulate the line between life and death. When you would normally roll one or more dice to " +
                "restore hit points with a spell to a creature at 0 hit points, you instead use the highest number " +
                "possible for each die.\n" + "\n" + "In addition, you learn the Spare the Dying cantrip, which doesn't" +
                " count against the number of cleric cantrips you know. For you, it has a range of 30 feet, and you can" +
                " cast it as a bonus action.", mainLibrary);
        spellLibrary.add(circleOfMortality);

        Spell discipleOfLife = new Spell("Disciple of Life", "Also starting at 1st level, your healing" +
                " spells are more effective. Whenever you use a spell of 1st level or higher to restore hit points to " +
                "a creature, the creature regains additional hit points equal to 2 + the spell's level.", mainLibrary);
        spellLibrary.add(discipleOfLife);

        Spell divineDomain = new Spell("Divine Domain", "Choose one domain related to your deity, such" +
                " as Life. Each domain is detailed at the end of the class description, and each one provides examples" +
                " of gods associated with it. Your choice grants you domain spells and other features when you choose " +
                "it at 1st level. It also grants you additional ways to use Channel Divinity when you gain that feature" +
                " at 2nd level, and additional benefits at 6th, 8th, and 17th levels.\n" +
                "Each domain has a list of spells —its domain spells— that you gain at the cleric levels noted in the" +
                " domain description. Once you gain a domain spell, you always have it prepared, and it doesn’t count" +
                " against the number of spells you can prepare each day. If you have a domain spell that doesn’t appear" +
                " on the cleric spell list, the spell is nonetheless a cleric spell for you.", mainLibrary);
        spellLibrary.add(divineDomain);

        Spell emboldeningBond = new Spell("Emboldening Bond", "Starting at 1st level, you can forge an" +
                " empowering bond among people who are at peace with one another. As an action, you choose a number of" +
                " willing creatures within 30 feet of you (this can include yourself) equal to your proficiency bonus." +
                " You create a magical bond among them for 10 minutes or until you use this feature again. While any " +
                "bonded creature is within 30 feet of another, the creature can roll a d4 and add the number rolled to" +
                " an attack roll, an ability check, or a saving throw it makes. Each creature can add the d4 no more " +
                "than once per turn.\n" + "\n" + "You can use this feature a number of times equal to your proficiency" +
                " bonus, and you regain all expended uses when you finish a long rest.", mainLibrary);
        spellLibrary.add(emboldeningBond);

        Spell eyesOfTheGrave = new Spell("Eyes of the Grave", "At 1st level, you gain the ability to " +
                "occasionally sense the presence of the undead, whose existence is an insult to the natural cycle of " +
                "life. As an action, you can open your awareness to magically detect undead. Until the end of your next" +
                " turn, you know the location of any undead within 60 feet of you that isn't behind total cover and " +
                "that isn't protected from divination magic. This sense doesn't tell you anything about a creature's " +
                "capabilities or identity.\n" + "\n" + "You can use this feature a number of times equal to your Wisdom" +
                " modifier (minimum of once). You regain all expended uses when you finish a long rest.", mainLibrary);
        spellLibrary.add(eyesOfTheGrave);

        Spell eyesOfTheNight = new Spell("Eyes of the Night", "Starting at 1st level, you can see " +
                "through the deepest gloom. You have darkvision out to a range of 300 feet. In that radius, you can see" +
                " in dim light as if it were bright light and in darkness as if it were dim light.\n" + "\n" + "As an " +
                "action, you can magically share the darkvision of this feature with willing creatures you can see " +
                "within 10 feet of you, up to a number of creatures equal to your Wisdom modifier (minimum of one " +
                "creature). The shared darkvision lasts for 1 hour. Once you share it, you can't do so again until " +
                "you finish a long rest, unless you expend a spell slot of any level to share it again.", mainLibrary);
        spellLibrary.add(eyesOfTheNight);

        Spell implementOfPeace = new Spell("Implement of Peace", "When you choose this domain at 1st " +
                "level, you gain proficiency in the Insight, Performance, or Persuasion skill (your choice).",
                mainLibrary);
        spellLibrary.add(implementOfPeace);

        Spell rage = new Spell("Rage", "In battle, you fight with primal ferocity. On your turn, you " +
                "can enter a rage as a bonus action.\n" + "While raging, you gain the following benefits if you aren’t " +
                "wearing heavy armor:\n" + "• You have advantage on Strength checks and Strength saving throws.\n" +
                "• When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that " +
                "increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.\n" +
                "• You have resistance to bludgeoning, piercing, and slashing damage.\n" + "If you are able to cast " +
                "spells, you can’t cast them or concentrate on them while raging.\n" + "Your rage lasts for 1 minute. " +
                "It ends early if you are knocked unconscious or if your turn ends and you haven’t attacked a hostile " +
                "creature since your last turn or taken damage since then. You can also end your rage on your turn as a" +
                " bonus action. Once you have raged the number of times shown for your barbarian level in the Rages " +
                "column of the Barbarian table, you must finish a long rest before you can rage again.", mainLibrary);
        spellLibrary.add(rage);

        Spell reaper = new Spell("Reaper", "At 1st level, you learn one necromancy cantrip of your " +
                "choice from any spell list. When you cast a necromancy cantrip that normally targets only one creature," +
                " the spell can instead target two creatures within range and within 5 feet of each other.",
                mainLibrary);
        spellLibrary.add(reaper);

        Spell vigilantBlessing = new Spell("Vigilant Blessing", "At 1st level, the night has taught you" +
                " to be vigilant. As an action, you give one creature you touch (including possibly yourself) advantage" +
                " on the next initiative roll the creature makes. This benefit ends immediately after the roll or if " +
                "you use this feature again.", mainLibrary);
        spellLibrary.add(vigilantBlessing);

        Spell voiceOfAuthority = new Spell("Voice of Authority", "Starting at 1st level, you can invoke" +
                " the power of law to embolden an ally to attack. If you cast a spell with a spell slot of 1st level or" +
                " higher and target an ally with the spell, that ally can use their reaction immediately after the spell" +
                " to make one weapon attack against a creature of your choice that you can see.\n" + "\n" + "If the " +
                "spell targets more than one ally, you choose the ally who can make the attack.", mainLibrary);
        spellLibrary.add(voiceOfAuthority);

        Spell warPriest = new Spell("War Priest", "From 1st level, your god delivers bolts of " +
                "inspiration to you while you are engaged in battle. When you use the Attack action, you can make one" +
                " weapon attack as a bonus action.\n" + "\n" + "You can use this feature a number of times equal to " +
                "your Wisdom modifier (a minimum of once). You regain all expended uses when you finish a long rest.",
                mainLibrary);
        spellLibrary.add(warPriest);

        Spell wardingFlare = new Spell("Warding Flare", "Also at 1st level, you can interpose divine " +
                "light between yourself and an attacking enemy. When you are attacked by a creature within 30 feet of" +
                " you that you can see, you can use your reaction to impose disadvantage on the attack roll, causing" +
                " light to flare before the attacker before it hits or misses. An attacker that can't be blinded is " +
                "immune to this feature.\n" + "\n" + "You can use this feature a number of times equal to your Wisdom" +
                " modifier (a minimum of once). You regain all expended uses when you finish a long rest.", mainLibrary);
        spellLibrary.add(wardingFlare);

        Spell wrathOfTheStorm = new Spell("Wrath of the Storm", "Also at 1st level, you can thunderously" +
                " rebuke attackers. When a creature within 5 feet of you that you can see hits you with an attack, you" +
                " can use your reaction to cause the creature to make a Dexterity saving throw. The creature takes 2d8" +
                " lightning or thunder damage (your choice) on a failed saving throw, and half as much damage on a " +
                "successful one.\n" + "\n" + "You can use this feature a number of times equal to your Wisdom modifier" +
                " (a minimum of once). You regain all expended uses when you finish a long rest.", mainLibrary);
        spellLibrary.add(wrathOfTheStorm);

        // Cantrips

        Spell acidSplash = new Spell("Acid Splash", "You hurl a bubble of acid. Choose one creature you" +
                " can see within range, or choose two creatures you can see within range that are within 5 feet of each" +
                " other. A target must succeed on a Dexterity saving throw or take 1d6 acid damage.\n" +
                "\n" +
                "At Higher Levels. This spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level " +
                "(3d6), and 17th level (4d6).", mainLibrary);
        spellLibrary.add(acidSplash);

        Spell bladeWard = new Spell("Blade Ward", "You extend your hand and trace a sigil of warding in" +
                " the air. Until the end of your next turn, you have resistance against bludgeoning, piercing, and " +
                "slashing damage dealt by weapon attacks.", mainLibrary);
        spellLibrary.add(bladeWard);

        Spell boomingBlade = new Spell("Booming Blade", "You brandish the weapon used in the spell’s " +
                "casting and make a melee attack with it against one creature within 5 feet of you. On a hit, the " +
                "target suffers the weapon attack’s normal effects and then becomes sheathed in booming energy until " +
                "the start of your next turn. If the target willingly moves 5 feet or more before then, the target " +
                "takes 1d8 thunder damage, and the spell ends.\n" +
                "\n" +
                "At Higher Levels. At 5th level, the melee attack deals an extra 1d8 thunder damage to the target on a" +
                " hit, and the damage the target takes for moving increases to 2d8. Both damage rolls increase by 1d8" +
                " at 11th level (2d8 and 3d8) and again at 17th level (3d8 and 4d8).", mainLibrary);
        spellLibrary.add(boomingBlade);

        Spell chillTouch = new Spell("Chill Touch", "You create a ghostly, skeletal hand in the space " +
                "of a creature within range. Make a ranged spell attack against the creature to assail it with the " +
                "chill of the grave. On a hit, the target takes 1d8 necrotic damage, and it can’t regain hit points " +
                "until the start of your next turn. Until then, the hand clings to the target. If you hit an undead " +
                "target, it also has disadvantage on attack rolls against you until the end of your next turn.\n" +
                "\n" +
                "At Higher Levels. This spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level " +
                "(3d8), and 17th level (4d8).", mainLibrary);
        spellLibrary.add(chillTouch);

        Spell controlFlames = new Spell("Control Flames", "You choose nonmagical flame that you can see" +
                " within range and that fits within a 5-foot cube. You affect it in one of the following ways:\n" + "\n" +
                "    You instantaneously expand the flame 5 feet in one direction, provided that wood or other fuel is" +
                " present in the new location.\n" + "\n" + "    You instantaneously extinguish the flames within the" +
                " cube.\n" + "\n" + "    You double or halve the area of bright light and dim light cast by the flame," +
                " change its color, or both. The change lasts for 1 hour.\n" + "\n" + "    You cause simple shapes—such" +
                " as the vague form of a creature, an inanimate object, or a location—to appear within the flames and" +
                " animate as you like. The shapes last for 1 hour.\n" + "\n" + "If you cast this spell multiple times," +
                " you can have up to three of its non-instantaneous effects active at a time, and you can dismiss such" +
                " an effect as an action.", mainLibrary);
        spellLibrary.add(controlFlames);

        Spell createBonfire = new Spell("Create Bonfire", "You create a bonfire on ground that you can" +
                " see within range. Until the spell ends, the bonfire fills a 5-foot cube. Any creature in the bonfire’s" +
                " space when you cast the spell must succeed on a Dexterity saving throw or take 1d8 fire damage. A" +
                " creature must also make the saving throw when it enters the bonfire’s space for the first time on a" +
                " turn or ends its turn there.\n" + "\n" + "At Higher Levels. The spell’s damage increases by 1d8 when" +
                " you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).", mainLibrary);
        spellLibrary.add(createBonfire);

        Spell dancingLights = new Spell("Dancing Lights", "You create up to four torch-sized lights " +
                "within range, making them appear as torches, lanterns, or glowing orbs that hover in the air for the" +
                " duration. You can also combine the four lights into one glowing vaguely humanoid form of Medium size." +
                " Whichever form you choose, each light sheds dim light in a 10-foot radius.\n" + "\n" +
                "As a bonus action on your turn, you can move the lights up to 60 feet to a new spot within range. A " +
                "light must be within 20 feet of another light created by this spell, and a light winks out if it " +
                "exceeds the spell’s range.", mainLibrary);
        spellLibrary.add(dancingLights);

        Spell decompose = new Spell("Decompose", "You reach out and touch the corpse of a creature. " +
                "Over the next minute, the corpse begins to rapidly decompose, sprouting fungus and moss as it begins " +
                "to degrade into compost and mulch. An odd-colored flower or two may also spring from the corpse in " +
                "this time. Applicable requirements for resurrection are unaffected by this decomposition.",
                mainLibrary);
        spellLibrary.add(decompose);

        Spell druidCraft = new Spell("Druidcraft", "Whispering to the spirits of nature, you create one" +
                " of the following effects within range:\n" + "\n" + "    You create a tiny, harmless sensory effect" +
                " that predicts what the weather will be at your location for the next 24 hours. The effect might " +
                "manifest as a golden orb for clear skies, a cloud for rain, falling snowflakes for snow, and so on." +
                " This effect persists for 1 round.\n" + "\n" + "    You instantly make a flower blossom, a seed pod" +
                " open, or a leaf bud bloom.\n" + "\n" + "    You create an instantaneous, harmless sensory effect," +
                " such as falling leaves, a puff of wind, the sound of a small animal, or the faint odor of skunk. The" +
                " effect must fit in a 5-foot cube.\n" + "\n" + "    You instantly light or snuff out a candle, a " +
                "torch, or a small campfire.\n", mainLibrary);
        spellLibrary.add(druidCraft);

        Spell eldritchBlast = new Spell("Eldritch Blast", "A beam of crackling energy streaks toward a" +
                " creature within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10" +
                " force damage.\n" +
                "\n" +
                "At Higher Levels. The spell creates more than one beam when you reach higher levels: two beams at 5th" +
                " level, three beams at 11th level, and four beams at 17th level. You can direct the beams at the same" +
                " target or at different ones. Make a separate attack roll for each beam.", mainLibrary);
        spellLibrary.add(eldritchBlast);

        Spell encodeThoughts = new Spell("Encode Thoughts", "You pull a memory, an idea, or a message" +
                " from your mind and transform it into a tangible string of glowing energy called a thought strand," +
                " which persists for the duration or until you cast this spell again. The thought strand appears in an" +
                " unoccupied space within 5 feet of you as a Tiny, weightless, semisolid object that can be held and" +
                " carried like a ribbon. It is otherwise stationary.\n" +
                "\n" +
                "If you cast this spell while concentrating on a spell or an ability that allows you to read or" +
                " manipulate the thoughts of others (such as detect thoughts or modify memory), you can transform the" +
                " thoughts or memories you read, rather than your own, into a thought strand.\n" +
                "\n" +
                "Casting this spell while holding a thought strand allows you to instantly receive whatever memory," +
                " idea, or message the thought strand contains. (Casting detect thoughts on the strand has the same" +
                " effect.)", mainLibrary);
        spellLibrary.add(encodeThoughts);

        Spell fireBolt = new Spell("Fire Bolt", "You hurl a mote of fire at a creature or object within" +
                " range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 fire damage. A" +
                " flammable object hit by this spell ignites if it isn’t being worn or carried.\n" +
                "\n" +
                "At Higher Levels. This spell’s damage increases by 1d10 when you reach 5th level (2d10), 11th level" +
                " (3d10), and 17th level (4d10).", mainLibrary);
        spellLibrary.add(fireBolt);

        Spell friends = new Spell("Friends", "For the duration, you have advantage on all Charisma" +
                " checks directed at one creature of your choice that isn't hostile toward you. When the spell ends," +
                " the creature realizes that you used magic to influence its mood and becomes hostile toward you. A" +
                " creature prone to violence might attack you. Another creature might seek retribution in other ways" +
                " (at the DM's discretion), depending on the nature of your interaction with it.", mainLibrary);
        spellLibrary.add(friends);

        Spell frostbite = new Spell("Frostbite", "You cause numbing frost to form on one creature that" +
                " you can see within range. The target must make a Constitution saving throw. On a failed save, the" +
                " target takes 1d6 cold damage, and it has disadvantage on the next weapon attack roll it makes before" +
                " the end of its next turn.\n" + "\n" + "At Higher Levels. The spell’s damage increases by 1d6 when " +
                "you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).", mainLibrary);
        spellLibrary.add(frostbite);

        Spell greenFlameBlade = new Spell("Green-Flame Blade", "You brandish the weapon used in the " +
                "spell’s casting and make a melee attack with it against one creature within 5 feet of you. On a hit, " +
                "the target suffers the weapon attack’s normal effects, and you can cause green fire to leap from the" +
                " target to a different creature of your choice that you can see within 5 feet of it. The second " +
                "creature takes fire damage equal to your spellcasting ability modifier.\n" +
                "\n" +
                "At Higher Levels. At 5th level, the melee attack deals an extra 1d8 fire damage to the target on a " +
                "hit, and the fire damage to the second creature increases to 1d8 + your spellcasting ability modifier." +
                " Both damage rolls increase by 1d8 at 11th level (2d8 and 2d8) and 17th level (3d8 and 3d8).", mainLibrary);
        spellLibrary.add(greenFlameBlade);

        Spell guidance = new Spell("Guidance", "You touch one willing creature. Once before the spell" +
                " ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can" +
                " roll the die before or after making the ability check. The spell then ends.", mainLibrary);
        spellLibrary.add(guidance);

        Spell gust = new Spell("Gust", "You seize the air and compel it to create one of the following" +
                " effects at a point you can see within range:\n" + "\n" + "    One Medium or smaller creature that " +
                "you choose must succeed on a Strength saving throw or be pushed up to 5 feet away from you.\n" + "\n" +
                "    You create a small blast of air capable of moving one object that is neither held nor carried and" +
                " that weighs no more than 5 pounds. The object is pushed up to 10 feet away from you. It isn’t pushed" +
                " with enough force to cause damage.\n" + "\n" + "    You create a harmless sensory affect using air," +
                " such as causing leaves to rustle, wind to slam shutters shut, or your clothing to ripple in a " +
                "breeze.\n", mainLibrary);
        spellLibrary.add(gust);

        Spell handOfRadiance = new Spell("Hand of Radiance", "You raise your hand, and burning radiance" +
                " erupts from it. Each creature of your choice that you can see within 5 feet of you must succeed on a" +
                " Constitution saving throw or take 1d6 radiant damage.\n" + "\n" + "At Higher Levels: The spell's " +
                "damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).",
                mainLibrary);
        spellLibrary.add(handOfRadiance);

        Spell infestation = new Spell("Infestation", "You cause a cloud of mites, fleas, and other " +
                "parasites to appear momentarily on one creature you can see within range. The target must succeed on" +
                " a Constitution saving throw, or it takes 1d6 poison damage and moves 5 feet in a random direction if" +
                " it can move and its speed is at least 5 feet. Roll a d4 for the direction: 1, north; 2, south; 3, " +
                "east; or 4, west. This movement doesn’t provoke opportunity attacks, and if the direction rolled is " +
                "blocked, the target doesn't move.\n" + "\n" + "At Higher Levels. The spell’s damage increases by 1d6" +
                " when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).", mainLibrary);
        spellLibrary.add(infestation);

        Spell light = new Spell("Light", "You touch one object that is no larger than 10 feet in any " +
                "dimension. Until the spell ends, the object sheds bright light in a 20-foot radius and dim light for" +
                " an additional 20 feet. The light can be colored as you like. Completely covering the object with " +
                "something opaque blocks the light. The spell ends if you cast it again or dismiss it as an action.\n" +
                "\n" + "If you target an object held or worn by a hostile creature, that creature must succeed on a" +
                " Dexterity saving throw to avoid the spell.", mainLibrary);
        spellLibrary.add(light);

        Spell lightningLure = new Spell("Lightning Lure", "You create a lash of lightning energy that" +
                " strikes at one creature of your choice that you can see within 15 feet of you. The target must " +
                "succeed on a Strength saving throw or be pulled up to 10 feet in a straight line toward you and then" +
                " take 1d8 lightning damage if it is within 5 feet of you.\n" +
                "\n" +
                "At Higher Levels. This spell's damage increases by 1d8 when you reach 5th level (2d8), 11th level " +
                "(3d8), and 17th level (4d8).", mainLibrary);
        spellLibrary.add(lightningLure);

        Spell mageHand = new Spell("Mage Hand", "A spectral, floating hand appears at a point you " +
                "choose within range. The hand lasts for the duration or until you dismiss it as an action. The hand" +
                " vanishes if it is ever more than 30 feet away from you or if you cast this spell again.\n" + "\n" +
                "You can use your action to control the hand. You can use the hand to manipulate an object, open an" +
                " unlocked door or container, stow or retrieve an item from an open container, or pour the contents" +
                " out of a vial. You can move the hand up to 30 feet each time you use it.\n" + "\n" + "The hand " +
                "can’t attack, activate magical items, or carry more than 10 pounds.", mainLibrary);
        spellLibrary.add(mageHand);

        Spell magicStone = new Spell("Magic Stone", "You touch one to three pebbles and imbue them with" +
                " magic. You or someone else can make a ranged spell attack with one of the pebbles by throwing it or " +
                "hurling it with a sling. If thrown, it has a range of 60 feet. If someone else attacks with the pebble," +
                " that attacker adds your " +
                " ability modifier, not the attacker’s, to the attack roll. On a" +
                " hit, the target takes bludgeoning damage equal to 1d6 + your spellcasting ability modifier. Hit or " +
                "miss, the spell then ends on the stone.\n" + "\n" + "If you cast this spell again, the spell ends " +
                "early on any pebbles still affected by it.", mainLibrary);
        spellLibrary.add(magicStone);

        Spell mending = new Spell("Mending", "This spell repairs a single break or tear in an object" +
                " you touch, such as a broken chain link, two halves of a broken key, a torn cloak, or a leaking " +
                "wineskin. As long as the break or tear is no larger than 1 foot in any dimension, you mend it, " +
                "leaving no trace of the former damage.\n" + "\n" + "This spell can physically repair a magic item " +
                "or construct, but the spell can’t restore magic to such an object.", mainLibrary);
        spellLibrary.add(mending);

        Spell message = new Spell("Message", "You point your finger toward a creature within range " +
                "and whisper a message. The target (and only the target) hears the message and can reply in a whisper" +
                " that only you can hear.\n" + "\n" + "You can cast this spell through solid objects if you are " +
                "familiar with the target and know it is beyond the barrier. Magical silence, 1 foot of stone, 1 " +
                "inch of common metal, a thin sheet of lead, or 3 feet of wood blocks the spell. The spell doesn’t " +
                "have to follow a straight line and can travel freely around corners or through openings.", mainLibrary);
        spellLibrary.add(message);

        Spell mindSliver = new Spell("Mind Sliver", "You drive a disorienting spike of psychic energy" +
                " into the mind of one creature you can see within range. The target must succeed on an Intelligence" +
                " saving throw or take 1d6 psychic damage and subtract 1d4 from the next saving throw it makes before" +
                " the end of your next turn.\n" +
                "\n" +
                "At Higher Levels. This spell’s damage increases by 1d6 when you reach certain levels: 5th level (2d6)," +
                " 11th level (3d6), and 17th level (4d6).", mainLibrary);
        spellLibrary.add(mindSliver);

        Spell minorIllusion = new Spell("Minor Illusion", "You create a sound or an image of an object" +
                " within range that lasts for the duration. The illusion also ends if you dismiss it as an action or" +
                " cast this spell again.\n" + "\n" + "If you create a sound, its volume can range from a whisper to " +
                "a scream. It can be your voice, someone else’s voice, a lion’s roar, a beating of drums, or any other" +
                " sound you choose. The sound continues unabated throughout the duration, or you can make discrete " +
                "sounds at different times before the spell ends.\n" + "\n" + "If you create an image of an object—such" +
                " as a chair, muddy footprints, or a small chest—it must be no larger than a 5-foot cube. The image" +
                " can’t create sound, light, smell, or any other sensory effect. Physical interaction with the image" +
                " reveals it to be an illusion, because things can pass through it.\n" + "\n" + "If a creature uses " +
                "its action to examine the sound or image, the creature can determine that it is an illusion with a" +
                " successful Intelligence (Investigation) check against your spell save DC. If a creature discerns " +
                "the illusion for what it is, the illusion becomes faint to the creature.", mainLibrary);
        spellLibrary.add(minorIllusion);

        Spell moldEarth = new Spell("Mold Earth", "You choose a portion of dirt or stone that you can" +
                " see within range and that fits within a 5-foot cube. You manipulate it in one of the following ways:\n" +
                "\n" + "    If you target an area of loose earth, you can instantaneously excavate it, move it along" +
                " the ground, and deposit it up to 5 feet away. This movement doesn’t have enough force to cause damage." +
                "\n" + "\n" + "    You cause shapes, colors, or both to appear on the dirt or stone, spelling out " +
                "words, creating images, or shaping patterns. The changes last for 1 hour.\n" + "\n" + "    If the dirt" +
                " or stone you target is on the ground, you cause it to become difficult terrain. Alternatively, you " +
                "can cause the ground to become normal terrain if it is already difficult terrain. This change lasts" +
                " for 1 hour.\n" + "\n" + "If you cast this spell multiple times, you can have no more than two of its" +
                " non-instantaneous effects active at a time, and you can dismiss such an effect as an action.",
                mainLibrary);
        spellLibrary.add(moldEarth);

        Spell onOff = new Spell("On/Off", "This cantrip allows you to activate or deactivate any " +
                "electronic device within range, as long as the device has a clearly defined on or off function that" +
                " can be easily accessed from the outside of the device. Any device that requires a software-based " +
                "shutdown sequence to activate or deactivate cannot be affected by On/Off.", mainLibrary);
        spellLibrary.add(onOff);

        Spell poisonSpray = new Spell("Poison Spray", "You extend your hand toward a creature you can" +
                " see within range and project a puff of noxious gas from your palm. The creature must succeed on a " +
                "Constitution saving throw or take 1d12 poison damage.\n" + "\n" + "At Higher Levels. This spell’s " +
                "damage increases by 1d12 when you reach 5th level (2d12), 11th level (3d12), and 17th level (4d12).",
                mainLibrary);
        spellLibrary.add(poisonSpray);

        Spell prestidigitation = new Spell("Prestidigitation", "This spell is a minor magical trick " +
                "that novice spellcasters use for practice. You create one of the following magical effects within " +
                "range:\n" + "\n" + "    You create an instantaneous, harmless sensory effect, such as a shower of " +
                "sparks, a puff of wind, faint musical notes, or an odd odor.\n" + "\n" + "    You instantaneously " +
                "light or snuff out a candle, a torch, or a small campfire.\n" + "\n" + "    You instantaneously " +
                "clean or soil an object no larger than 1 cubic foot.\n" + "\n" + "    You chill, warm, or flavor up " +
                "to 1 cubic foot of nonliving material for 1 hour.\n" + "\n" + "    You make a color, a small mark, " +
                "or a symbol appear on an object or a surface for 1 hour.\n" + "\n" + "    You create a nonmagical " +
                "trinket or an illusory image that can fit in your hand and that lasts until the end of your next turn.\n" +
                "\n" + "If you cast this spell multiple times, you can have up to three of its non-instantaneous " +
                "effects active at a time, and you can dismiss such an effect as an action.", mainLibrary);
        spellLibrary.add(prestidigitation);

        Spell primalSavagery = new Spell("Primal Savagery", "You channel primal magic to cause your " +
                "teeth or fingernails to sharpen, ready to deliver a corrosive attack. Make a melee spell attack " +
                "against one creature within 5 feet of you. On a hit, the target takes 1d10 acid damage. After you " +
                "make the attack, your teeth or fingernails return to normal.\n" + "\n" + "At Higher Levels. The " +
                "spell’s damage increases by 1d10 when you reach 5th level (2d10), 11th level (3d10), and 17th level" +
                " (4d10).", mainLibrary);
        spellLibrary.add(primalSavagery);

        Spell produceFlame = new Spell("Produce Flame", "A flickering flame appears in your hand. The" +
                " flame remains there for the duration and harms neither you nor your equipment. The flame sheds bright" +
                " light in a 10-foot radius and dim light for an additional 10 feet. The spell ends if you dismiss it" +
                " as an action or if you cast it again.\n" + "\n" + "You can also attack with the flame, although doing" +
                " so ends the spell. When you cast this spell, or as an action on a later turn, you can hurl the flame" +
                " at a creature within 30 feet of you. Make a ranged spell attack. On a hit, the target takes 1d8 fire" +
                " damage.\n" + "\n" + "At Higher Levels. This spell’s damage increases by 1d8 when you reach 5th level" +
                " (2d8), 11th level (3d8), and 17th level (4d8).", mainLibrary);
        spellLibrary.add(produceFlame);

        Spell resistance = new Spell("Resistance", "You touch one willing creature. Once before the " +
                "spell ends, the target can roll a d4 and add the number rolled to one saving throw of its choice. It" +
                " can roll the die before or after the saving throw. The spell then ends.", mainLibrary);
        spellLibrary.add(resistance);

        Spell rayOfFrost = new Spell("Ray of Frost", "A frigid beam of blue-white light streaks toward" +
                " a creature within range. Make a ranged spell attack against the target. On a hit, it takes 1d8 cold" +
                " damage, and its speed is reduced by 10 feet until the start of your next turn.\n" +
                "\n" +
                "At Higher Levels. The spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level " +
                "(3d8), and 17th level (4d8).", mainLibrary);
        spellLibrary.add(rayOfFrost);

        Spell sacredFlame = new Spell("Sacred Flame", "Flame-like radiance descends on a creature that" +
                " you can see within range. The target must succeed on a Dexterity saving throw or take 1d8 radiant " +
                "damage. The target gains no benefit from cover for this saving throw.\n" + "\n" + "At Higher Levels. " +
                "The spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level " +
                "(4d8).", mainLibrary);
        spellLibrary.add(sacredFlame);

        Spell sappingSting = new Spell("Sapping Sting", "You sap the vitality of one creature you can" +
                " see in range. The target must succeed on a Constitution saving throw or take 1d4 necrotic damage and" +
                " fall prone.\n" +
                "\n" +
                "At Higher Levels. This spell's damage increases by 1d4 when you reach 5th level (2d4), 11th level" +
                " (3d4), and 17th level (4d4).", mainLibrary);
        spellLibrary.add(sappingSting);

        Spell shapeWater = new Spell("Shape Water", "You choose an area of water that you can see " +
                "within range and that fits within a 5-foot cube. You manipulate it in one of the following ways:\n" +
                "\n" + "    You instantaneously move or otherwise change the flow of the water as you direct, up to 5" +
                " feet in any direction. This movement doesn’t have enough force to cause damage.\n" + "\n" + "    You" +
                " cause the water to form into simple shapes and animate at your direction. This change lasts for 1 " +
                "hour.\n" + "\n" + "    You change the water’s color or opacity. The water must be changed in the same" +
                " way throughout. This change lasts for 1 hour.\n" + "\n" + "    You freeze the water, provided that" +
                " there are no creatures in it. The water unfreezes in 1 hour.\n" + "\n" + "If you cast this spell " +
                "multiple times, you can have no more than two of its non-instantaneous effects active at a time, and" +
                " you can dismiss such an effect as an action.", mainLibrary);
        spellLibrary.add(shapeWater);

        Spell shillelagh = new Spell("Shillelagh", "The wood of a club or quarterstaff you are holding" +
                " is imbued with nature’s power. For the duration, you can use your spellcasting ability instead of " +
                "Strength for the attack and damage rolls of melee attacks using that weapon, and the weapon’s damage" +
                " die becomes a d8. The weapon also becomes magical, if it isn’t already. The spell ends if you cast " +
                "it again or if you let go of the weapon.", mainLibrary);
        spellLibrary.add(shillelagh);

        Spell shockingGrasp = new Spell("Shocking Grasp", "Lightning springs from your hand to deliver" +
                " a shock to a creature you try to touch. Make a melee spell attack against the target. You have " +
                "advantage on the attack roll if the target is wearing armor made of metal. On a hit, the target takes" +
                " 1d8 lightning damage, and it can’t take reactions until the start of its next turn.\n" +
                "\n" +
                "At Higher Levels. The spell’s damage increases by 1d8 when you reach 5th level (2d8), 11th level " +
                "(3d8), and 17th level (4d8).", mainLibrary);
        spellLibrary.add(shockingGrasp);

        Spell spareTheDying = new Spell("Spare the Dying", "You touch a living creature that has 0 hit" +
                " points. The creature becomes stable. This spell has no effect on undead or constructs.", mainLibrary);
        spellLibrary.add(spareTheDying);

        Spell swordBurst = new Spell("Sword Burst", "You create a momentary circle of spectral blades" +
                " that sweep around you. All other creatures within 5 feet of you must succeed on a Dexterity saving" +
                " throw or take 1d6 force damage.\n" +
                "\n" +
                "At Higher Levels. This spell's damage increases by 1d6 when you reach 5th level (2d6), 11th level " +
                "(3d6), and 17th level (4d6).", mainLibrary);
        spellLibrary.add(swordBurst);

        Spell thaumaturgy = new Spell("Thaumaturgy", "You manifest a minor wonder, a sign of " +
                "supernatural power, within range. You create one of the following magical effects within range:\n" +
                "\n" + "    Your voice booms up to three times as loud as normal for 1 minute.\n" + "\n" + "    You " +
                "cause flames to flicker, brighten, dim, or change color for 1 minute.\n" + "\n" + "    You cause " +
                "harmless tremors in the ground for 1 minute.\n" + "\n" + "    You create an instantaneous sound that" +
                " originates from a point of your choice within range, such as a rumble of thunder, the cry of a raven," +
                " or ominous whispers.\n" + "\n" + "    You instantaneously cause an unlocked door or window to fly " +
                "open or slam shut.\n" + "\n" + "    You alter the appearance of your eyes for 1 minute.\n" + "\n" +
                "If you cast this spell multiple times, you can have up to three of its 1-minute effects active at a " +
                "time, and you can dismiss such an effect as an action.", mainLibrary);
        spellLibrary.add(thaumaturgy);

        Spell thornWhip = new Spell("Thorn Whip", "You create a long, vine-like whip covered in thorns" +
                " that lashes out at your command toward a creature in range. Make a melee spell attack against the " +
                "target. If the attack hits, the creature takes 1d6 piercing damage, and if the creature is Large or" +
                " smaller, you pull the creature up to 10 feet closer to you.\n" + "\n" + "At Higher Levels. This " +
                "spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level " +
                "(4d6).", mainLibrary);
        spellLibrary.add(thornWhip);

        Spell thunderclap = new Spell("Thunderclap", "You create a burst of thunderous sound, which can" +
                " be heard 100 feet away. Each creature other than you within 5 feet of you must make a Constitution " +
                "saving throw. On a failed save, the creature takes 1d6 thunder damage.\n" + "\n" + "At Higher Levels." +
                " The spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level" +
                " (4d6).", mainLibrary);
        spellLibrary.add(thunderclap);

        Spell tollTheDead = new Spell("Toll the Dead", "You point at one creature you can see within " +
                "range, and the sound of a dolorous bell fills the air around it for a moment. The target must succeed" +
                " on a Wisdom saving throw or take 1d8 necrotic damage. If the target is missing any of its hit points," +
                " it instead takes 1d12 necrotic damage.\n" + "\n" + "At Higher Levels. The spell’s damage increases" +
                " by one die when you reach 5th level (2d8 or 2d12), 11th level (3d8 or 3d12), and 17th level (4d8 or" +
                " 4d12).", mainLibrary);
        spellLibrary.add(tollTheDead);

        Spell trueStrike = new Spell("True Strike", "You extend your hand and point a finger at a " +
                "target in range. Your magic grants you a brief insight into the target’s defenses. On your next turn," +
                " you gain advantage on your first attack roll against the target, provided that this spell hasn’t " +
                "ended.", mainLibrary);
        spellLibrary.add(trueStrike);

        Spell viciousMockery = new Spell("Vicious Mockery", "You unleash a string of insults laced " +
                "with subtle enchantments at a creature you can see within range. If the target can hear you (though " +
                "it need not understand you), it must succeed on a Wisdom saving throw or take 1d4 psychic damage and" +
                " have disadvantage on the next attack roll it makes before the end of its next turn.\n" + "\n" +
                "At Higher Levels. This spell’s damage increases by 1d4 when you reach 5th level (2d4), 11th level " +
                "(3d4), and 17th level (4d4).", mainLibrary);
        spellLibrary.add(viciousMockery);

        Spell virtue = new Spell("Virtue", "You touch one creature, imbuing it with vitality. If the " +
                "target has at least 1 hit point, it gains a number of temporary hit points equal to 1d4 + your " +
                "spellcasting ability modifier. The temporary hit points are lost when the spell ends.", mainLibrary);
        spellLibrary.add(virtue);

        Spell wordOfRadiance = new Spell("Word of Radiance", "You utter a divine word, and burning " +
                "radiance erupts from you. Each creature of your choice that you can see within range must succeed on " +
                "a Constitution saving throw or take 1d6 radiant damage.\n" + "\n" + "At Higher Levels. The spell’s " +
                "damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).",
                mainLibrary);
        spellLibrary.add(wordOfRadiance);

        // Spells

        Spell absorbElements = new Spell("Absorb Elements", "The spell captures some of the incoming " +
                "energy, lessening its effect on you and storing it for your next melee attack. You have resistance to" +
                " the triggering damage type until the start of your next turn. Also, the first time you hit with a " +
                "melee attack on your next turn, the target takes an extra 1d6 damage of the triggering type, and the" +
                " spell ends.\n" + "\n" + "At Higher Levels. When you cast this spell using a spell slot of 2nd level" +
                " or higher, the extra damage increases by 1d6 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(absorbElements);

        Spell acidStream = new Spell("Acid Stream", "A stream of acid emanates from you in a line 30 " +
                "feet long and 5 feet wide in a direction you choose. Each creature in the line must succeed on a " +
                "Dexterity saving throw or be covered in acid for the spell’s duration or until a creature uses its " +
                "action to scrape or wash the acid off itself or another creature. A creature covered in the acid takes" +
                " 3d4 acid damage at the start of each of its turns.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage " +
                "increases by 1d4 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(acidStream);

        Spell alarm = new Spell("Alarm", "You set an alarm against unwanted intrusion. Choose a door," +
                " a window, or an area within range that is no larger than a 20-foot cube. Until the spell ends, an" +
                " alarm alerts you whenever a tiny or larger creature touches or enters the warded area. When you cast" +
                " the spell, you can designate creatures that won’t set off the alarm. You also choose whether the" +
                " alarm is mental or audible.\n" +
                "\n" +
                "A mental alarm alerts you with a ping in your mind if you are within 1 mile of the warded area. This" +
                " ping awakens you if you are sleeping. An audible alarm produces the sound of a hand bell for 10" +
                " seconds within 60 feet.", mainLibrary);
        spellLibrary.add(alarm);

        Spell animalFriendship = new Spell("Animal Friendship", "This spell lets you convince a beast " +
                "that you mean it no harm. Choose a beast that you can see within range. It must see and hear you. If" +
                " the beast’s Intelligence is 4 or higher, the spell fails. Otherwise, the beast must succeed on a " +
                "Wisdom saving throw or be charmed by you for the spell’s duration. If you or one of your companions " +
                "harms the target, the spell ends.\n" + "\n" + "At Higher Levels. When you cast this spell using a " +
                "spell slot of 2nd level or higher, you can affect one additional beast for each slot level above " +
                "1st.", mainLibrary);
        spellLibrary.add(animalFriendship);

        Spell armorOfAgathys = new Spell("Armor of Agathys", "A protective magical force surrounds you," +
                " manifesting as a spectral frost that covers you and your gear. You gain 5 temporary hit points for " +
                "the duration. If a creature hits you with a melee attack while you have these hit points, the creature" +
                " takes 5 cold damage.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, both the " +
                "temporary hit points and the cold damage increase by 5 for each slot.", mainLibrary);
        spellLibrary.add(armorOfAgathys);

        Spell armsOfHadar = new Spell("Arms of Hadar", "You invoke the power of Hadar, the Dark Hunger." +
                " Tendrils of dark energy erupt from you and batter all creatures within 10 feet of you. Each creature" +
                " in that area must make a Strength saving throw. On a failed save, a target takes 2d6 necrotic damage" +
                " and can’t take reactions until its next turn. On a successful save, the creature takes half damage," +
                " but suffers no other effect.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage " +
                "increases by 1d6 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(armsOfHadar);

        Spell bane = new Spell("Bane", "Up to three creatures of your choice that you can see within " +
                "range must make Charisma saving throws. Whenever a target that fails this saving throw makes an attack" +
                " roll or a saving throw before the spell ends, the target must roll a d4 and subtract the number " +
                "rolled from the attack roll or saving throw.\n" + "\n" + "At Higher Levels. When you cast this spell" +
                " using a spell slot of 2nd level or higher, you can target one additional creature for each slot " +
                "level above 1st.", mainLibrary);
        spellLibrary.add(bane);

        Spell beastBond = new Spell("Beast Bond", "You establish a telepathic link with one beast you" +
                " touch that is friendly to you or charmed by you. The spell fails if the beast’s Intelligence is 4 or" +
                " higher. Until the spell ends, the link is active while you and the beast are within line of sight of" +
                " each other. Through the link, the beast can understand your telepathic messages to it, and it can " +
                "telepathically communicate simple emotions and concepts back to you. While the link is active, the " +
                "beast gains advantage on attack rolls against any creature within 5 feet of you that you can see.",
                mainLibrary);
        spellLibrary.add(beastBond);

        Spell bless = new Spell("Bless", "You bless up to three creatures of your choice within range." +
                " Whenever a target makes an attack roll or a saving throw before the spell ends, the target can roll" +
                " a d4 and add the number rolled to the attack roll or saving throw.\n" + "\n" + "At Higher Levels. " +
                "When you cast this spell using a spell slot of 2nd level or higher, you can target one additional " +
                "creature for each slot level above 1st.", mainLibrary);
        spellLibrary.add(bless);

        Spell burningHands = new Spell("Burning Hands", "As you hold your hands with thumbs touching " +
                "and fingers spread, a thin sheet of flames shoots forth from your outstretched fingertips. Each " +
                "creature in a 15-foot cone must make a Dexterity saving throw. A creature takes 3d6 fire damage on a " +
                "failed save, or half as much damage on a successful one.\n" + "\n" + "The fire ignites any flammable " +
                "objects in the area that aren’t being worn or carried.\n" + "\n" + "At Higher Levels. When you cast" +
                " this spell using a spell slot of 2nd level or higher, the damage increases by 1d6 for each slot level" +
                " above 1st.", mainLibrary);
        spellLibrary.add(burningHands);

        Spell catapult = new Spell("Catapult", "Choose one object weighing 1 to 5 pounds within range" +
                " that isn’t being worn or carried. The object flies in a straight line up to 90 feet in a direction" +
                " you choose before falling to the ground, stopping early if it impacts against a solid surface. If " +
                "the object would strike a creature, that creature must make a Dexterity saving throw. On a failed " +
                "save, the object strikes the target and stops moving. When the object strikes something, the object" +
                " and what it strikes each take 3d8 bludgeoning damage.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the maximum " +
                "weight of objects that you can target with this spell increases by 5 pounds, and the damage increases" +
                " by 1d8, for each slot level above 1st.", mainLibrary);
        spellLibrary.add(catapult);

        Spell causeFear = new Spell("Cause Fear", "You awaken the sense of mortality in one creature" +
                " you can see within range. A construct or an undead is immune to this effect. The target must succeed" +
                " on a Wisdom saving throw or become frightened of you until the spell ends. The frightened target can" +
                " repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, you can target" +
                " one additional creature for each slot level above 1st. The creatures must be within 30 feet of each" +
                " other when you target them.", mainLibrary);
        spellLibrary.add(causeFear);

        Spell ceremony = new Spell("Ceremony", "You perform one of several religious ceremonies. When " +
                "you cast the spell, choose one of the following ceremonies, the target of which must be within 10 feet" +
                " of you throughout the casting.\n" + "\n" + "Atonement. You touch one willing creature whose alignment" +
                " has changed, and you make a DC 20 Wisdom (Insight) check. On a successful check, you restore the " +
                "target to its original alignment.\n" + "\n" + "Bless Water. You touch one vial of water and cause it " +
                "to become holy water.\n" + "\n" + "Coming of Age. You touch one humanoid who is a young adult. For the" +
                " next 24 hours, whenever the target makes an ability check, it can roll a d4 and add the number rolled" +
                " to the ability check. A creature can benefit from this rite only once.\n" + "\n" + "Dedication. You " +
                "touch one humanoid who wishes to be dedicated to your god’s service. For the next 24 hours, whenever " +
                "the target makes a saving throw, it can roll a d4 and add the number rolled to the save. A creature " +
                "can benefit from this rite only once.\n" + "\n" + "Funeral Rite. You touch one corpse, and for the " +
                "next 7 days, the target can’t become undead by any means short of a Wish spell.\n" + "\n" +
                "Investiture (UA). You touch one willing humanoid. Choose one 1st-level spell you have prepared and " +
                "expend a spell slot and any material components as if you were casting that spell. The spell has no " +
                "effect. Instead, the target can cast this spell once without having to expend a spell slot or use " +
                "material components. If the target doesn’t cast the spell within 1 hour, the invested spell is lost.\n" +
                "\n" + "Wedding. You touch adult humanoids willing to be bonded together in marriage. For the next 7 " +
                "days, each target gains a +2 bonus to AC while they are within 30 feet of each other. A creature can " +
                "benefit from this rite again only if widowed.", mainLibrary);
        spellLibrary.add(ceremony);

        Spell chaosBolt = new Spell("Chaos Bolt", "You hurl an undulating, warbling mass of chaotic " +
                "energy at one creature in range. Make a ranged spell attack against the target. On a hit, the target" +
                " takes 2d8 + 1d6 damage. Choose one of the d8s. The number rolled on that die determines the attack's" +
                " damage type, as shown below.\n" +
                "d8 \tDamage Type\n" +
                "1 \tAcid\n" +
                "2 \tCold\n" +
                "3 \tFire\n" +
                "4 \tForce\n" +
                "5 \tLightning\n" +
                "6 \tPoison\n" +
                "7 \tPsychic\n" +
                "8 \tThunder\n" +
                "\n" +
                "If you roll the same number on both d8s, the chaotic energy leaps from the target to a different " +
                "creature of your choice within 30 feet of it. Make a new attack roll against the new target, and make" +
                " a new damage roll, which could cause the chaotic energy to leap again.\n" +
                "\n" +
                "A creature can be targeted only once by each casting of this spell.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, each target " +
                "takes 1d6 extra damage of the type rolled for each slot level above 1st.", mainLibrary);
        spellLibrary.add(chaosBolt);

        Spell charmPerson = new Spell("Charm Person", "You attempt to charm a humanoid you can see " +
                "within range. It must make a Wisdom saving throw, and does so with advantage if you or your companions" +
                " are fighting it. If it fails the saving throw, it is charmed by you until the spell ends or until " +
                "you or your companions do anything harmful to it. The charmed creature regards you as a friendly " +
                "acquaintance. When the spell ends, the creature knows it was charmed by you.\n" + "\n" + "At Higher " +
                "Levels. When you cast this spell using a spell slot of 2nd level or higher, you can target one " +
                "additional creature for each slot level above 1st. The creatures must be within 30 feet of each " +
                "other when you target them.", mainLibrary);
        spellLibrary.add(charmPerson);

        Spell chromaticOrb = new Spell("Chromatic Orb", "You hurl a 4-inch-diameter sphere of energy" +
                " at a creature that you can see within range. You choose acid, cold, fire, lightning, poison, or " +
                "thunder for the type of orb you create, and then make a ranged spell attack against the target. If " +
                "the attack hits, the creature takes 3d8 damage of the type you chose.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage " +
                "increases by 1d8 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(chromaticOrb);

        Spell colorSpray = new Spell("Color Spray", "A dazzling array of flashing, colored light springs" +
                " from your hand. Roll 6d10, the total is how many hit points of creatures this spell can effect. " +
                "Creatures in a 15-foot cone originating from you are affected in ascending order of their current hit" +
                " points (ignoring unconscious creatures and creatures that can’t see).\n" + "\n" + "Starting with the" +
                " creature that has the lowest current hit points, each creature affected by this spell is blinded " +
                "until the end of your next turn. Subtract each creature’s hit points from the total before moving on" +
                " to the creature with the next lowest hit points. A creature’s hit points must be equal to or less " +
                "than the remaining total for the creature to be affected.\n" + "\n" + "At Higher Levels. When you " +
                "cast this spell using a spell slot of 2nd level or higher, roll an additional 2d10 for each slot level" +
                " above 1st.", mainLibrary);
        spellLibrary.add(colorSpray);

        Spell command = new Spell("Command", "You speak a one-word command to a creature you can see " +
                "within range. The target must succeed on a Wisdom saving throw or follow the command on its next turn." +
                " The spell has no effect if the target is undead, if it doesn’t understand your language, or if your " +
                "command is directly harmful to it. Some typical commands and their effects follow. You might issue a " +
                "command other than one described here. If you do so, the DM determines how the target behaves. If the " +
                "target can’t follow your command, the spell ends.\n" + "\n" + "Approach. The target moves toward you " +
                "by the shortest and most direct route, ending its turn if it moves within 5 feet of you.\n" + "\n" +
                "Drop. The target drops whatever it is holding and then ends its turn.\n" + "\n" + "Flee. The target " +
                "spends its turn moving away from you by the fastest available means.\n" + "\n" + "Grovel. The target " +
                "falls prone and then ends its turn.\n" + "\n" + "Halt. The target doesn’t move and takes no actions. " +
                "A flying creature stays aloft, provided that it is able to do so. If it must move to stay aloft, it " +
                "flies the minimum distance needed to remain in the air.\n" + "\n" + "At Higher Levels. When you cast " +
                "this spell using a spell slot of 2nd level or higher, you can affect one additional creature for each" +
                " slot level above 1st. The creatures must be within 30 feet of each other when you target them.",
                mainLibrary);
        spellLibrary.add(command);

        Spell comprehendLanguages = new Spell("Comprehend Languages", "For the duration, you understand" +
                " the literal meaning of any spoken language that you hear. You also understand any written language " +
                "that you see, but you must be touching the surface on which the words are written. It takes about 1 " +
                "minute to read one page of text.\n" + "\n" + "This spell doesn’t decode secret messages in a text or" +
                " glyph, such as an arcane sigil, that isn’t part of a written language.", mainLibrary);
        spellLibrary.add(comprehendLanguages);

        Spell createOrDestroyWater = new Spell("Create or Destroy Water", "You either create or destroy" +
                " water.\n" + "\n" + "Create Water. You create up to 10 gallons of clean water within range in an open" +
                " container. Alternatively, the water falls as rain in a 30-foot cube within range, extinguishing " +
                "exposed flames in the area.\n" + "\n" + "Destroy Water. You destroy up to 10 gallons of water in an " +
                "open container within range. Alternatively, you destroy fog in a 30-foot cube within range.\n" + "\n"
                + "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, you create or" +
                " destroy 10 additional gallons of water, or the size of the cube increases by 5 feet, for each slot " +
                "level above 1st.", mainLibrary);
        spellLibrary.add(createOrDestroyWater);

        Spell cureWounds = new Spell("Cure Wounds", "A creature you touch regains a number of hit " +
                "points equal to 1d8 + your spellcasting ability modifier. This spell has no effect on undead or " +
                "constructs.\n" + "\n" + "At Higher Levels. When you cast this spell using a spell slot of 2nd level or" +
                " higher, the healing increases by 1d8 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(cureWounds);

        Spell detectEvilAndGood = new Spell("Detect Evil and Good", "For the duration, you know if " +
                "there is an aberration, celestial, elemental, fey, fiend, or undead within 30 feet of you, as well as" +
                " where the creature is located. Similarly, you know if there is a place or object within 30 feet of " +
                "you that has been magically consecrated or desecrated.\n" + "\n" + "The spell can penetrate most " +
                "barriers, but it is blocked by 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 " +
                "feet of wood or dirt.", mainLibrary);
        spellLibrary.add(detectEvilAndGood);

        Spell detectMagic = new Spell("Detect Magic", "For the duration, you sense the presence of " +
                "magic within 30 feet of you. If you sense magic in this way, you can use your action to see a faint " +
                "aura around any visible creature or object in the area that bears magic, and you learn its school of " +
                "magic, if any.\n" + "\n" + "The spell can penetrate most barriers, but is blocked by 1 foot of stone," +
                " 1 inch of common metal, a thin sheet of lead, or 3 feet of wood or dirt.", mainLibrary);
        spellLibrary.add(detectMagic);

        Spell detectPoisonAndDisease = new Spell("Detect Poison and Disease", "For the duration, you " +
                "can sense the presence and location of poisons, poisonous creatures, and diseases within 30 feet of " +
                "you. You also identify the kind of poison, poisonous creature, or disease in each case.\n" + "\n" +
                "The spell can penetrate most barriers, but is blocked by 1 foot of stone, 1 inch of common metal, a " +
                "thin sheet of lead, or 3 feet of wood or dirt.", mainLibrary);
        spellLibrary.add(detectPoisonAndDisease);

        Spell disguiseSelf = new Spell("Disguise Self", "You make yourself – including your clothing, " +
                "armor, weapons, and other belongings on your person – look different until the spell ends or until you" +
                " use your action to dismiss it. You can seem 1 foot shorter or taller and can appear thin, fat, or in" +
                " between. You can’t change your body type, so you must adopt a form that has the same basic arrangement" +
                " of limbs. Otherwise, the extent of the illusion is up to you.\n" + "\n" + "The changes wrought by " +
                "this spell fail to hold up to physical inspection. For example, if you use this spell to add a hat to" +
                " your outfit, objects pass through the hat, and anyone who touches it would feel nothing or would feel" +
                " your head and hair. If you use this spell to appear thinner than you are, the hand of someone who " +
                "reaches out to touch you would bump into you while it was seemingly still in midair. To discern that" +
                " you are disguised, a creature can use its action to inspect your appearance and must succeed on an " +
                "Intelligence (Investigation) check against your spell save DC.", mainLibrary);
        spellLibrary.add(disguiseSelf);

        Spell dissonantWhispers = new Spell("Dissonant Whispers", "You whisper a discordant melody that" +
                " only one creature of your choice within range can hear, wracking it with terrible pain. The target" +
                " must make a Wisdom saving throw. On a failed save, it takes 3d6 psychic damage and must immediately" +
                " use its reaction, if available, to move as far as its speed allows away from you. The creature doesn’t" +
                " move into obviously dangerous ground, such as a fire or a pit. On a successful save, the target takes" +
                " half as much damage and doesn’t have to move away. A deafened creature automatically succeeds on the" +
                " save.\n" + "\n" + "At Higher Levels. When you cast this spell using a spell slot of 2nd level or " +
                "higher, the damage increases by 1d6 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(dissonantWhispers);

        Spell distortValue = new Spell("Distort Value", "You cast this spell on an object no more than" +
                " 1 foot on a side, doubling the object's perceived value by adding illusionary flourish or reducing " +
                "its perceived value by half with the help of illusionary dents and scratches. Anyone examining the " +
                "object must roll an Investigation check against your spell DC.\n" + "\n" + "At Higher Levels. When " +
                "you cast this spell using a higher spell slot, you increase the size of the object by 1 foot per " +
                "spell slot over 1st.", mainLibrary);
        spellLibrary.add(distortValue);

        Spell divineFavor = new Spell("Divine Favor", "Your prayer empowers you with divine radiance. " +
                "Until the spell ends, your weapon attacks deal an extra 1d4 radiant damage on a hit.", mainLibrary);
        spellLibrary.add(divineFavor);

        Spell earthTremor = new Spell("Earth Tremor", "You cause a tremor in the ground in a 10-foot " +
                "radius. Each creature other than you in that area must make a Dexterity saving throw. On a failed save," +
                " a creature takes 1d6 bludgeoning damage and is knocked prone. If the ground in that area is loose " +
                "earth or stone, it becomes difficult terrain until cleared.\n" + "\n" + "At Higher Levels. When you " +
                "cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d6 for each slot " +
                "level above 1st.", mainLibrary);
        spellLibrary.add(earthTremor);

        Spell entangle = new Spell("Entangle", "Grasping weeds and vines sprout from the ground in a " +
                "20-foot square starting from a point within range. For the duration, these plants turn the ground in" +
                " the area into difficult terrain.\n" + "\n" + "A creature in the area when you cast the spell must " +
                "succeed on a Strength saving throw or be restrained by the entangling plants until the spell ends. A" +
                " creature restrained by the plants can use its action to make a Strength check against your spell " +
                "save DC. On a success, it frees itself.\n" + "\n" + "When the spell ends, the conjured plants wilt " +
                "away.", mainLibrary);
        spellLibrary.add(entangle);

        Spell expeditiousRetreat = new Spell("Expeditious Retreat", "This spell allows you to move at" +
                " an incredible pace. When you cast this spell, and then as a bonus action on each of your turns until" +
                " the spell ends, you can take the Dash action.", mainLibrary);
        spellLibrary.add(expeditiousRetreat);

        Spell fairieFire = new Spell("Fairie Fire", "Each object in a 20-foot cube within range is " +
                "outlined in blue, green, or violet light (your choice).\n" + "\n" + "Any creature in the area when the" +
                " spell is cast is also outlined in light if it fails a Dexterity saving throw. For the duration, " +
                "objects and affected creatures shed dim light in a 10-foot radius.\n" + "\n" + "Any attack roll " +
                "against an affected creature or object has advantage if the attacker can see it, and the affected " +
                "creature or object can’t benefit from being invisible.", mainLibrary);
        spellLibrary.add(fairieFire);

        Spell falseLife = new Spell("False Life", "Bolstering yourself with a necromantic facsimile of " +
                "life, you gain 1d4 + 4 temporary hit points for the duration.\n" + "\n" + "At Higher Levels. When you" +
                " cast this spell using a spell slot of 2nd level or higher, you gain 5 additional temporary hit points" +
                " for each slot level above 1st.", mainLibrary);
        spellLibrary.add(falseLife);

        Spell featherFall = new Spell("Feather Fall", "Choose up to five falling creatures within range." +
                " A falling creature’s rate of descent slows to 60 feet per round until the spell ends. If the creature" +
                " lands before the spell ends, it takes no falling damage and can land on its feet, and the spell ends" +
                " for that creature.", mainLibrary);
        spellLibrary.add(featherFall);

        Spell findFamiliar = new Spell("Find Familiar", "You gain the service of a familiar, a spirit" +
                " that takes an animal form you choose: bat, cat, crab, frog (toad), hawk, lizard, octopus, owl," +
                " poisonous snake, fish (quipper), rat, raven, sea horse, spider, or weasel. Appearing in an unoccupied" +
                " space within range, the familiar has the statistics of the chosen form, though it is a celestial," +
                " fey, or fiend (your choice) instead of a beast.\n" +
                "\n" +
                "Your familiar acts independently of you, but it always obeys your commands. In combat, it rolls its" +
                " own initiative and acts on its own turn. A familiar can’t attack, but it can take other actions as" +
                " normal.\n" +
                "\n" +
                "When the familiar drops to 0 hit points, it disappears, leaving behind no physical form. It reappears" +
                " after you cast this spell again. As an action, you can temporarily dismiss your familiar to a pocket" +
                " dimension. Alternatively, you can dismiss it forever. As an action while it is temporarily dismissed," +
                " you can cause it to reappear in any unoccupied space within 30 feet of you. Whenever the familiar" +
                " drops to 0 hit points or disappears into the pocket dimension, it leaves behind in its space anything" +
                " it was wearing or carrying.\n" +
                "\n" +
                "While your familiar is within 100 feet of you, you can communicate with it telepathically." +
                " Additionally, as an action, you can see through your familiar’s eyes and hear what it hears until" +
                " the start of your next turn, gaining the benefits of any special senses that the familiar has. During" +
                " this time, you are deaf and blind with regard to your own senses.\n" +
                "\n" +
                "You can’t have more than one familiar at a time. If you cast this spell while you already have a" +
                " familiar, you instead cause it to adopt a new form. Choose one of the forms from the above list. Your" +
                " familiar transforms into the chosen creature.\n" +
                "\n" +
                "Finally, when you cast a spell with a range of touch, your familiar can deliver the spell as if it" +
                " had cast the spell. Your familiar must be within 100 feet of you, and it must use its reaction to" +
                " deliver the spell when you cast it. If the spell requires an attack roll, you use your attack" +
                " modifier for the roll.", mainLibrary);
        spellLibrary.add(findFamiliar);

        Spell fogCloud = new Spell("Fog Cloud", "You create a 20-foot-radius sphere of fog centered on" +
                " a point within range. The sphere spreads around corners, and its area is heavily obscured. It lasts " +
                "for the duration or until a wind of moderate or greater speed (at least 10 miles per hour) disperses " +
                "it.\n" + "\n" + "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher," +
                " the radius of the fog increases by 20 feet for each slot level above 1st.", mainLibrary);
        spellLibrary.add(fogCloud);

        Spell frostFingers = new Spell("Frost Fingers", "Freezing cold blasts from your fingertips in a" +
                " 15-foot cone. Each creature in that area must make a Constitution saving throw, taking 2d8 cold" +
                " damage on a failed save, or half as much damage on a successful one.\n" +
                "\n" +
                "The cold freezes nonmagical liquids in the area that aren't being worn or carried.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage" +
                " increases by 1d8 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(frostFingers);

        Spell giftOfAlacrity = new Spell("Gift of Alacrity", "You touch a willing creature. For the" +
                " duration, the target can add 1d8 to its initiative rolls.", mainLibrary);
        spellLibrary.add(giftOfAlacrity);

        Spell goodBerry = new Spell("Goodberry", "Up to ten berries appear in your hand and are infused" +
                " with magic for the duration. A creature can use its action to eat one berry. Eating a berry restores" +
                " 1 hit point, and the berry provides enough nourishment to sustain a creature for one day.\n" + "\n" +
                "The berries lose their potency if they have not been consumed within 24 hours of the casting of this" +
                " spell.", mainLibrary);
        spellLibrary.add(goodBerry);

        Spell grease = new Spell("Grease", "Slick grease covers the ground in a 10-foot square centered" +
                " on a point within range and turns it into difficult terrain for the duration.\n" +
                "\n" +
                "When the grease appears, each creature standing in its area must succeed on a Dexterity saving throw" +
                " or fall prone. A creature that enters the area or ends its turn there must also succeed on a " +
                "Dexterity saving throw or fall prone.", mainLibrary);
        spellLibrary.add(grease);

        Spell guidingBolt = new Spell("Guiding Bolt", "A flash of light streaks toward a creature of " +
                "your choice within range. Make a ranged spell attack against the target. On a hit, the target takes " +
                "4d6 radiant damage, and the next attack roll made against this target before the end of your next turn" +
                " has advantage, thanks to the mystical dim light glittering on the target until then.\n" + "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage " +
                "increases by 1d6 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(guidingBolt);

        Spell guidingHand = new Spell("Guiding Hand", "You create a Tiny incorporeal hand of shimmering" +
                " light in an unoccupied space you can see within range. The hand exists for the duration, but it " +
                "disappears if you teleport or you travel to a different plane of existence.\n" + "\n" + "When the hand" +
                " appears, you name one major landmark, such as a city, mountain, castle, or battlefield on the same " +
                "plane of existence as you. Someone in history must have visited the site and mapped it. If the " +
                "landmark appears on no map in existence, the spell fails. Otherwise, whenever you move toward the " +
                "hand, it moves away from you at the same speed you moved, and it moves in the direction of the " +
                "landmark, always remaining 5 feet away from you.\n" + "\n" + "If you don’t move toward the hand, it " +
                "remains in place until you do and beckons for you to follow once every 1d4 minutes.", mainLibrary);
        spellLibrary.add(guidingHand);

        Spell healingElixir = new Spell("Healing Elixir", "You create a healing elixir in a simple vial" +
                " that appears in your hand. The elixir retains its potency for the duration or until it’s consumed, at" +
                " which point the vial vanishes.\n" +
                "\n" +
                "As an action, a creature can drink the elixir or administer it to another creature. The drinker " +
                "regains 2d4 + 2 hit points.", mainLibrary);
        spellLibrary.add(healingElixir);

        Spell healingWord = new Spell("Healing Word", "A creature of your choice that you can see within" +
                " range regains hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect " +
                "on undead or constructs.\n" + "\n" + "At Higher Levels. When you cast this spell using a spell slot of" +
                " 2nd level or higher, the healing increases by 1d4 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(healingWord);

        Spell hellishRebuke = new Spell("Hellish Rebuke", "You point your finger, and the creature that" +
                " damaged you is momentarily surrounded by hellish flames. The creature must make a Dexterity saving" +
                " throw. It takes 2d10 fire damage on a failed save, or half as much damage on a successful one.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage " +
                "increases by 1d10 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(hellishRebuke);

        Spell heroism = new Spell("Heroism", "A willing creature you touch is imbued with bravery. Until" +
                " the spell ends, the creature is immune to being frightened and gains temporary hit points equal to " +
                "your spellcasting ability modifier at the start of each of its turns. When the spell ends, the target" +
                " loses any remaining temporary hit points from this spell.\n" + "\n" + "At Higher Levels. When you " +
                "cast this spell using a spell slot of 2nd level or higher, you can target one additional creature for" +
                " each slot level above 1st.", mainLibrary);
        spellLibrary.add(heroism);

        Spell hex = new Spell("Hex", "You place a curse on a creature that you can see within range." +
                " Until the spell ends, you deal an extra 1d6 necrotic damage to the target whenever you hit it with" +
                " an attack. Also, choose one ability when you cast the spell. The target has disadvantage on ability" +
                " checks made with the chosen ability.\n" +
                "\n" +
                "If the target drops to 0 hit points before this spell ends, you can use a bonus action on a subsequent" +
                " turn of yours to curse a new creature.\n" +
                "\n" +
                "A Remove Curse cast on the target ends this spell early.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 3rd or 4th level, you can maintain" +
                " your concentration on the spell for up to 8 hours. When you use a spell slot of 5th level or higher," +
                " you can maintain your concentration on the spell for up to 24 hours.", mainLibrary);
        spellLibrary.add(hex);

        Spell iceKnife = new Spell("Ice Knife", "You create a shard of ice and fling it at one creature" +
                " within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 piercing" +
                " damage. Hit or miss, the shard then explodes. The target and each creature within 5 feet of the point" +
                " where the ice exploded must succeed on a Dexterity saving throw or take 2d6 cold damage.\n" + "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the cold damage" +
                " increases by 1d6 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(iceKnife);

        Spell idInsinuation = new Spell("Id Insinuation", "You unleash a torrent of conflicting desires" +
                " in the mind of one creature you can see within range, impairing its ability to make decisions. The" +
                " target must succeed on a Wisdom saving throw or be incapacitated. At the end of each of its turns," +
                " it takes 1d12 psychic damage, and it can then make another Wisdom saving throw. On a success, the" +
                " spell ends on the target.", mainLibrary);
        spellLibrary.add(idInsinuation);

        Spell identify = new Spell("Identify", "You choose one object that you must touch throughout " +
                "the casting of the spell. If it is a magic item or some other magic-imbued object, you learn its " +
                "properties and how to use them, whether it requires attunement to use, and how many charges it has, if" +
                " any. You learn whether any spells are affecting the item and what they are. If the item was created" +
                " by a spell, you learn which spell created it.\n" + "\n" + "If you instead touch a creature throughout" +
                " the casting, you learn what spells, if any, are currently affecting it.", mainLibrary);
        spellLibrary.add(identify);

        Spell illusoryScript = new Spell("Illusory Script", "You write on parchment, paper, or some " +
                "other suitable writing material and imbue it with a potent illusion that lasts for the duration.\n" +
                "\n" + "To you and any creatures you designate when you cast the spell, the writing appears normal, " +
                "written in your hand, and conveys whatever meaning you intended when you wrote the text. To all others," +
                " the writing appears as if it were written in an unknown or magical script that is unintelligible. " +
                "Alternatively, you can cause the writing to appear to be an entirely different message, written in a " +
                "different hand and language, though the language must be one you know.\n" + "\n" + "Should the spell " +
                "be dispelled, the original script and the illusion both disappear. A creature with truesight can read" +
                " the hidden message.", mainLibrary);
        spellLibrary.add(illusoryScript);

        Spell infallibleRelay = new Spell("Infallible Relay", "With this spell, you can target any " +
                "creature with whom you have spoken previously, as long as the two of you are on the same plane of " +
                "existence. When you cast the spell, the nearest functioning telephone or similar communications " +
                "device within 100 feet of the target begins to ring. If there is no suitable device close enough to " +
                "the target, the spell fails.\n" +
                "\n" +
                "The target must make a successful Charisma saving throw or be compelled to answer your call. Once " +
                "the connection is established, the call is crystal clear and cannot be dropped until the conversation" +
                " has ended or the spell’s duration ends. You can end the conversation at any time, but a target must" +
                " succeed on a Charisma saving throw to end the conversation.", mainLibrary);
        spellLibrary.add(infallibleRelay);

        Spell inflictWounds = new Spell("Inflict Wounds", "Make a melee spell attack against a creature" +
                " you can reach. On a hit, the target takes 3d10 necrotic damage.\n" + "\n" + "At Higher Levels. When " +
                "you cast this spell using a spell slot of 2nd level or higher, the damage increases by 1d10 for each " +
                "slot level above 1st.", mainLibrary);
        spellLibrary.add(inflictWounds);

        Spell jimsMagicMissle = new Spell("Jim's Magic Missle", "You create three twisting, whistling," +
                " hypoallergenic, gluten-free darts of magical force. Each dart can target a creature of your choice" +
                " that you can see within range. Make a ranged spell attack for each missile. On a hit, the missile" +
                " does 2d4 force damage.\n" +
                "\n" +
                "If the attack roll scores a critical, the missile does 5d4 force damage instead of the 4d4 force that" +
                " you would normally get on a critical. If any of the attack roll is a natural one, all missiles turn" +
                " around and hit the caster for 1 force damage per missile.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the spell" +
                " creates one more dart for each slot level above 1st. This also increases the tax by 1 gp per spell" +
                " slot over 1st.", mainLibrary);
        spellLibrary.add(jimsMagicMissle);

        Spell jump = new Spell("Jump", "You touch a creature. The creature’s jump distance is tripled " +
                "until the spell ends.", mainLibrary);
        spellLibrary.add(jump);

        Spell longstrider = new Spell("Longstrider", "You touch a creature. The target’s speed increases" +
                " by 10 feet until the spell ends.\n" + "\n" + "At Higher Levels. When you cast this spell using a " +
                "spell slot of 2nd level or higher, you can target one additional creature for each slot level above " +
                "1st.", mainLibrary);
        spellLibrary.add(longstrider);

        Spell mageArmor = new Spell("Mage Armor", "You touch a willing creature who isn’t wearing " +
                "armor, and a protective magical force surrounds it until the spell ends. The target’s base AC becomes" +
                " 13 + its Dexterity modifier. The spell ends if the target dons armor or if you dismiss the spell as" +
                " an action.", mainLibrary);
        spellLibrary.add(mageArmor);

        Spell magicMissle = new Spell("Magic Missle", "You create three glowing darts of magical force." +
                " Each dart hits a creature of your choice that you can see within range. A dart deals 1d4 + 1 force" +
                " damage to its target. The darts all strike simultaneously and you can direct them to hit one creature" +
                " or several.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the spell " +
                "creates one more dart for each slot level above 1st.", mainLibrary);
        spellLibrary.add(magicMissle);

        Spell magnifyGravity = new Spell("Magnify Gravity", "The gravity in a 10-foot-radius sphere" +
                " centered on a point you can see within range increases for a moment. Each creature in the sphere on" +
                " the turn when you cast the spell must make a Constitution saving throw. On a failed save, a creature" +
                " takes 2d8 force damage, and its speed is halved until the end of its next turn. On a successful save," +
                " a creature takes half as much damage and suffers no reduction to its speed.\n" +
                "\n" +
                "Until the start of your next turn, any object that isn't being worn or carried in the sphere requires" +
                " a successful Strength check against your spell save DC to pick up or move.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage" +
                " increases by 1d8 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(magnifyGravity);

        Spell protectionFromEvilAndGood = new Spell("Protection from Evil and Good", "Until the spell " +
                "ends, one willing creature you touch is protected against certain types of creatures: aberrations, " +
                "celestials, elementals, fey, fiends, and undead.\n" + "\n" + "The protection grants several benefits." +
                " Creatures of those types have disadvantage on attack rolls against the target. The target also can't" +
                " be charmed, frightened, or possessed by them. If the target is already charmed, frightened, or " +
                "possessed by such a creature, the target has advantage on any new saving throw against the relevant " +
                "effect.", mainLibrary);
        spellLibrary.add(protectionFromEvilAndGood);

        Spell puppet = new Spell("Puppet", "Your gesture forces one humanoid you can see within range " +
                "to make a Constitution saving throw. On a failed save, the target must move up to its speed in a " +
                "direction you choose. In addition, you can cause the target to drop whatever it is holding. This spell" +
                " has no effect on a humanoid that is immune to being charmed.", mainLibrary);
        spellLibrary.add(puppet);

        Spell purifyFoodAndDrink = new Spell("Purify Food and Drink", "All nonmagical food and drink " +
                "within a 5-foot-radius sphere centered on a point of your choice within range is purified and rendered" +
                " free of poison and disease.", mainLibrary);
        spellLibrary.add(purifyFoodAndDrink);

        Spell rayOfSickness = new Spell("Ray of Sickness", "A ray of sickening greenish energy lashes " +
                "out toward a creature within range. Make a ranged spell attack against the target. On a hit, the " +
                "target takes 2d8 poison damage and must make a Constitution saving throw. On a failed save, it is also" +
                " poisoned until the end of your next turn.\n" + "\n" + "At Higher Levels. When you cast this spell " +
                "using a spell slot of 2nd level or higher, the damage increases by 1d8 for each slot level above 1st.",
                mainLibrary);
        spellLibrary.add(rayOfSickness);

        Spell remoteAccess = new Spell("Remote Access", "You can use any electronic device within range" +
                " as if it were in your hands. This is not a telekinesis effect. Rather, this spell allows you to " +
                "simulate a device's mechanical functions electronically. You are able to access only functions that" +
                " a person using the device manually would be able to access. You can use remote access with only one" +
                " device at a time.", mainLibrary);
        spellLibrary.add(remoteAccess);

        Spell sanctuary = new Spell("Sanctuary", "You ward a creature within range against attack. " +
                "Until the spell ends, any creature who targets the warded creature with an attack or a harmful spell" +
                " must first make a Wisdom saving throw. On a failed save, the creature must choose a new target or " +
                "lose the attack or spell. This spell doesn’t protect the warded creature from area effects, such as" +
                " the explosion of a fireball.\n" + "\n" + "If the warded creature makes an attack, casts a spell that" +
                " affects an enemy, or deals damage to another creature, this spell ends.", mainLibrary);
        spellLibrary.add(sanctuary);

        Spell searingSmite = new Spell("Searing Smite", "The next time you hit a creature with a melee" +
                " weapon attack during the spell’s duration, your weapon flares with white-hot intensity, and the " +
                "attack deals an extra 1d6 fire damage to the target and causes the target to ignite in flames.\n" + "\n" +
                "At the start of each of its turns until the spell ends, the target must make a Constitution saving " +
                "throw. On a failed save, it takes 1d6 fire damage. On a successful save, the spells ends. If the " +
                "target or a creature within 5 feet of it uses an action to put out the flames, or if some other effect" +
                " douses the flames (such as the target being submerged in water), the spell ends.\n" + "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the initial " +
                "extra damage dealt by the attack increases by 1d6 for each slot above 1st.", mainLibrary);
        spellLibrary.add(searingSmite);

        Spell senseEmotion = new Spell("Sense Emotion", "You attune your senses to pick up the emotions" +
                " of others for the duration. When you cast the spell, and as your action on each turn until the spell" +
                " ends, you can focus your senses on one humanoid you can see within 30 feet of you. You instantly " +
                "learn the target’s prevailing emotion, whether it’s love, anger, pain, fear, calm, or something else." +
                " If the target isn’t actually humanoid or it is immune to being charmed, you sense that it is calm."
                , mainLibrary);
        spellLibrary.add(senseEmotion);

        Spell shield = new Spell("Shield", "An invisible barrier of magical force appears and protects" +
                " you. Until the start of your next turn, you have a +5 bonus to AC, including against the triggering" +
                " attack, and you take no damage from magic missile.", mainLibrary);
        spellLibrary.add(shield);

        Spell shieldOfFaith = new Spell("Shield of Faith", "A shimmering field appears and surrounds a" +
                " creature of your choice within range, granting it a +2 bonus to AC for the duration.", mainLibrary);
        spellLibrary.add(shieldOfFaith);

        Spell silentImage = new Spell("Silent Image", "You create the image of an object, a creature, " +
                "or some other visible phenomenon that is no larger than a 15-foot cube. The image appears at a spot " +
                "within range and lasts for the duration. The image is purely visual; it isn’t accompanied by sound, " +
                "smell, or other sensory effects.\n" + "\n" + "You can use your action to cause the image to move to " +
                "any spot within range. As the image changes location, you can alter its appearance so that its " +
                "movements appear natural for the image. For example, if you create an image of a creature and move it," +
                " you can alter the image so that it appears to be walking.\n" + "\n" + "Physical interaction with the" +
                " image reveals it to be an illusion, because things can pass through it. A creature that uses its " +
                "action to examine the image can determine that it is an illusion with a successful Intelligence " +
                "(Investigation) check against your spell save DC. If a creature discerns the illusion for what it is," +
                " the creature can see through the image.", mainLibrary);
        spellLibrary.add(silentImage);

        Spell silveryBarbs = new Spell("Silvery Barbs", "You magically distract the triggering creature" +
                " and turn its momentary uncertainty into encouragement for another creature. The triggering creature" +
                " must reroll the d20 and use the lower roll.\n" + "\n" + "You can then choose a different creature you" +
                " can see within range (you can choose yourself). The chosen creature has advantage on the next attack" +
                " roll, ability check, or saving throw it makes within 1 minute. A creature can be empowered by only" +
                " one use of this spell at a time.", mainLibrary);
        spellLibrary.add(silveryBarbs);

        Spell sleep = new Spell("Sleep", "This spell sends creatures into a magical slumber. Roll 5d8, " +
                "the total is how many hit points of creatures this spell can affect. Creatures within 20 feet of a " +
                "point you choose within range are affected in ascending order of their current hit points (ignoring " +
                "unconscious creatures).\n" + "\n" + "Starting with the creature that has the lowest current hit " +
                "points, each creature affected by this spell falls unconscious until the spell ends, the sleeper takes" +
                " damage, or someone uses an action to shake or slap the sleeper awake. Subtract each creature’s hit " +
                "points from the total before moving on to the creature with the next lowest hit points. A creature’s " +
                "hit points must be equal to or less than the remaining total for that creature to be affected. Undead" +
                " and creatures immune to being charmed aren’t affected by this spell.\n" + "\n" + "At Higher Levels." +
                " When you cast this spell using a spell slot of 2nd level or higher, roll an additional 2d8 for each " +
                "slot level above 1st.", mainLibrary);
        spellLibrary.add(sleep);

        Spell snare = new Spell("Snare", "While you cast this spell, you use the cord or rope to create" +
                " a circle with a 5-foot radius on a flat surface within your reach. When you finish casting, the cord" +
                " or rope disappears to become a magical trap.\n" + "\n" + "The trap is nearly invisible and requires " +
                "a successful Intelligence (Investigation) check against your spell save DC to be found.\n" + "\n" +
                "The trap triggers when a Small creature or larger moves into the area protected by the spell. The " +
                "triggering creature must succeed on a Dexterity saving throw or fall prone and be hoisted into the " +
                "air until it hangs upside down 3 feet above the protected surface, where it is restrained.\n" + "\n" +
                "The restrained creature can make a Dexterity saving throw with disadvantage at the end of each of its" +
                " turns and ends the restrained effect on a success. Alternatively, another creature that can reach the" +
                " restrained creature can use an action to make an Intelligence (Arcana) check against your spell save" +
                " DC. On a success, the restrained effect also ends.", mainLibrary);
        spellLibrary.add(snare);

        Spell speakWithAnimals = new Spell("Speak With Animals", "You gain the ability to comprehend" +
                " and verbally communicate with beasts for the duration. The knowledge and awareness of many beasts is" +
                " limited by their intelligence, but at minimum, beasts can give you information about nearby locations" +
                " and monsters, including whatever they can perceive or have perceived within the past day. You might" +
                " be able to persuade a beast to perform a small favor for you, at the DM’s discretion.", mainLibrary);
        spellLibrary.add(speakWithAnimals);

        Spell suddenAwakening = new Spell("Sudden Awakening", "Each sleeping creature you choose within" +
                " range awakens, and then each prone creature within range can stand up without expending any movement."
                , mainLibrary);
        spellLibrary.add(suddenAwakening);

        Spell tashasCausticBrew = new Spell("Tasha's Caustic Brew", "A stream of acid emanates from you" +
                " in a line 30 feet long and 5 feet wide in a direction you choose. Each creature in the line must " +
                "succeed on a Dexterity saving throw or be covered in acid for the spell’s duration or until a creature" +
                " uses its action to scrape or wash the acid off itself or another creature. A creature covered in the" +
                " acid takes 2d4 acid damage at start of each of its turns.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot 2nd level or higher, the damage " +
                "increases by 2d4 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(tashasCausticBrew);

        Spell tashasHideousLaughter = new Spell("Tasha's Hideous Laughter", "A creature of your choice" +
                " that you can see within range perceives everything as hilariously funny and falls into fits of " +
                "laughter if this spell affects it. The target must succeed on a Wisdom saving throw or fall prone, " +
                "becoming incapacitated and unable to stand up for the duration. A creature with an Intelligence score" +
                " of 4 or less isn’t affected.\n" + "\n" + "At the end of each of its turns, and each time it takes " +
                "damage, the target can make another Wisdom saving throw. The target has advantage on the saving throw" +
                " if it’s triggered by damage. On a success, the spell ends.", mainLibrary);
        spellLibrary.add(tashasHideousLaughter);

        Spell tensersFloatingDisk = new Spell("Tenser's Floating Disk", "This spell creates a circular," +
                " horizontal plane of force, 3 feet in diameter and 1 inch thick, that floats 3 feet above the ground" +
                " in an unoccupied space of your choice that you can see within range. The disk remains for the" +
                " duration, and can hold up to 500 pounds. If more weight is placed on it, the spell ends, and" +
                " everything on the disk falls to the ground.\n" +
                "\n" +
                "The disk is immobile while you are within 20 feet of it. If you move more than 20 feet away from it," +
                " the disk follows you so that it remains within 20 feet of you. It can move across uneven terrain, up" +
                " or down stairs, slopes, and the like, but it can’t cross an elevation change of 10 feet or more. For" +
                " example, the disk can’t move across a 10-foot-deep pit, nor could it leave such a pit if it were" +
                " created at the bottom.\n" +
                "\n" +
                "If you move more than 100 feet from the disk (typically because it can’t move around an obstacle to" +
                " follow you), the spell ends.", mainLibrary);
        spellLibrary.add(tensersFloatingDisk);

        Spell thunderwave = new Spell("Thunderwave", "A wave of thunderous force sweeps out from you. " +
                "Each creature in a 15-foot cube originating from you must make a Constitution saving throw. On a failed" +
                " save, a creature takes 2d8 thunder damage and is pushed 10 feet away from you. On a successful save," +
                " the creature takes half as much damage and isn’t pushed.\n" + "\n" + "In addition, unsecured objects" +
                " that are completely within the area of effect are automatically pushed 10 feet away from you by the" +
                " spell’s effect, and the spell emits a thunderous boom audible out to 300 feet.\n" + "\n" + "At Higher" +
                " Levels. When you cast this spell using a spell slot of 2nd level or higher, the damage increases by" +
                " 1d8 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(thunderwave);

        Spell unearthlyChorus = new Spell("Unearthly Chorus", "Music of a style you choose fills the " +
                "air around you in a 30-foot radius. The music spreads around corners and can be heard from up to 100 " +
                "feet away. The music moves with you, centered on you for the duration.\n" + "\n" + "Until the spell" +
                " ends, you make Charisma (Performance) checks with advantage. In addition, you can use a bonus action" +
                " on each of your turns to beguile one creature you choose within 30 feet of you that can see you and" +
                " hear the music. The creature must make a Charisma saving throw. If you or your companions are " +
                "attacking it, the creature automatically succeeds on the saving throw. On a failure, the creature" +
                " becomes friendly to you for as long as it can hear the music and for 1 hour thereafter. You make " +
                "Charisma (Deception) checks and Charisma (Persuasion) checks against creatures made friendly by this" +
                " spell with advantage.", mainLibrary);
        spellLibrary.add(unearthlyChorus);

        Spell unseenServant = new Spell("Unseen Servant", "This spell creates an invisible, mindless, " +
                "shapeless, Medium force that performs simple tasks at your command until the spell ends. The servant " +
                "springs into existence in an unoccupied space on the ground within range. It has AC 10, 1 hit point, " +
                "and a Strength of 2, and it can’t attack. If it drops to 0 hit points, the spell ends.\n" + "\n" +
                "Once on each of your turns as a bonus action, you can mentally command the servant to move up to 15 " +
                "feet and interact with an object. The servant can perform simple tasks that a human servant could do," +
                " such as fetching things, cleaning, mending, folding clothes, lighting fires, serving food, and pouring" +
                " wine. Once you give the command, the servant performs the task to the best of its ability until it " +
                "completes the task, then waits for your next command.\n" + "\n" + "If you command the servant to " +
                "perform a task that would move it more than 60 feet away from you, the spell ends.", mainLibrary);
        spellLibrary.add(unseenServant);

        Spell wildCunning = new Spell("Wild Cunning", "You call out to the spirits of nature to aid you." +
                " When you cast this spell, choose one of the following effects:\n" + "\n" + "    If there are any " +
                "tracks on the ground within range, you know where they are, and you make Wisdom (Survival) checks to" +
                " follow these tracks with advantage for 1 hour or until you cast this spell again.\n" + "\n" + "    If" +
                " there is edible forage within range, you know it and where to find it.\n" + "\n" + "    If there is" +
                " clean drinking water within range, you know it and where to find it.\n" + "\n" + "    If there is " +
                "suitable shelter for you and your companions within range, you know it and where to find it.\n" + "\n" +
                "    Send the spirits to bring back wood for a fire and to set up a campsite in the area using your " +
                "supplies. The spirits build the fire in a circle of stones, put up tents, unroll bedrolls, and put " +
                "out any rations and water for consumption.\n" + "\n" + "    Have the spirits instantly break down a" +
                " campsite, which includes putting out a fire, taking down tents, packing up bags, and burying any " +
                "rubbish.\n", mainLibrary);
        spellLibrary.add(wildCunning);

        Spell witchBolt = new Spell("Witch Bolt", "A beam of crackling, blue energy lances out toward a" +
                " creature within range, forming a sustained arc of lightning between you and the target. Make a ranged" +
                " spell attack against that creature. On a hit, the target takes 1d12 lightning damage, and on each of" +
                " your turns for the duration, you can use your action to deal 1d12 lightning damage to the target " +
                "automatically. The spell ends if you use your action to do anything else. The spell also ends if the" +
                " target is ever outside the spell’s range or if it has total cover from you.\n" +
                "\n" +
                "At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the initial " +
                "damage increases by 1d12 for each slot level above 1st.", mainLibrary);
        spellLibrary.add(witchBolt);

        System.out.println("Spell Library Completed");

    }

    public Spell getSpell(String spellName) {

        for (Spell spell : spellLibrary) {
            if (spell.getName().equals(spellName.trim())) {
                selectedSpell = spell;
                break;
            }
        }
        return selectedSpell;
    }
}
