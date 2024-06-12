package Library;

import Main.Battle;
import Objects.Trait;

import java.util.ArrayList;

public class TraitLibrary {
    private MainLibrary mainLibrary;
    private ArrayList<Trait> traitLibrary;
    private Battle battle;

    public TraitLibrary(MainLibrary mainLibrary, Battle battle) {
        this.mainLibrary = mainLibrary;
        traitLibrary = new ArrayList<>();

        // Racial Traits

        Trait abilitiesIncrease = new Trait("Ability Scores Increase", "Your ability scores each " +
                "increase by 1.", mainLibrary);
        traitLibrary.add(abilitiesIncrease);

        Trait brave = new Trait("Brave", "You have advantage on saving throws against being frightened."
                , mainLibrary);
        traitLibrary.add(brave);

        Trait cantrip = new Trait("Cantrip", "You know one cantrip of your choice from the wizard spell" +
                " list. Intelligence is your spellcasting ability for it.", mainLibrary);
        traitLibrary.add(cantrip);

        Trait charIncrease = new Trait("Charisma Increase", "Your Charisma score increases by 1.", mainLibrary);
        traitLibrary.add(charIncrease);

        Trait constIncrease = new Trait("Constitution Increase", "Your Constitution score increases by 2."
                , mainLibrary);
        traitLibrary.add(constIncrease);

        Trait darkVision = new Trait("Dark Vision", "Accustomed to life underground, you have superior " +
                "vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright " +
                "light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray."
                , mainLibrary);
        traitLibrary.add(darkVision);

        Trait dexIncrease = new Trait("Dexterity Increase", "Your Dexterity score increases by 2.", mainLibrary);
        traitLibrary.add(dexIncrease);

        Trait dwarvenResilience = new Trait("Dwarven Resilience", "You have advantage on saving throws " +
                "against poison, and you have resistance against poison damage.", mainLibrary);
        traitLibrary.add(dwarvenResilience);

        Trait dwarvenToughness = new Trait("Dwarven Toughness", "Your hit point maximum increases by 1, " +
                "and it increases by 1 every time you gain a level.", mainLibrary);
        traitLibrary.add(dwarvenToughness);

        Trait feyAncestry = new Trait("Fey Ancestry", "You have advantage on saving throws against being" +
                " charmed, and magic can’t put you to sleep.", mainLibrary);
        traitLibrary.add(feyAncestry);

        Trait intIncrease = new Trait("Intelligence Increase", "Your Intelligence score increases by 1."
                , mainLibrary);
        traitLibrary.add(intIncrease);

        Trait keenSenses = new Trait("Keen Senses", "You have proficiency in the Perception skill.", mainLibrary);
        traitLibrary.add(keenSenses);

        Trait lucky = new Trait("Lucky", "When you roll a 1 on the d20 for an attack roll, ability " +
                "check, or saving throw, you can reroll the die and must use the new roll.", mainLibrary);
        traitLibrary.add(lucky);

        Trait natStealthy = new Trait("Naturally Stealthy", "You can attempt to hide even when you are " +
                "obscured only by a creature that is at least one size larger than you.", mainLibrary);
        traitLibrary.add(natStealthy);

        Trait nimbleness = new Trait("Halfling Nimbleness", "You can move through the space of any " +
                "creature that is of a size larger than yours.", mainLibrary);
        traitLibrary.add(nimbleness);

        Trait stoneCutting = new Trait("Stone Cutting", "Whenever you make an Intelligence (History) " +
                "check related to the origin of stonework, you are considered proficient in the History skill and add " +
                "double your proficiency bonus to the check, instead of your normal proficiency bonus.", mainLibrary);
        traitLibrary.add(stoneCutting);

        Trait trance = new Trait("Trance", "Elves don’t need to sleep. Instead, they meditate deeply, " +
                "remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While " +
                "meditating, you can dream after a fashion; such dreams are actually mental exercises that have become " +
                "reflexive through years of practice. After resting in this way, you gain the same benefit that a human " +
                "does from 8 hours of sleep.", mainLibrary);
        traitLibrary.add(trance);

        Trait wisdIncrease = new Trait("Wisdom Increase", "Your Wisdom score increases by 1.", mainLibrary);
        traitLibrary.add(wisdIncrease);

        // Job Traits

        Trait arcaneRecovery = new Trait("Arcane Recovery", "You have learned to regain some of your" +
                " magical energy by studying your spellbook. Once per day when you finish a short rest, you can choose" +
                " expended spell slots to recover. The spell slots can have a combined level that is equal to or less" +
                " than half your wizard level (rounded up), and none of the slots can be 6th level or higher.\n" +
                "For example, if you’re a 4th-level wizard, you can recover up to two levels worth of spell" +
                " slots. You can recover either a 2nd-level spell slot or two 1st-level spell slots.",
                mainLibrary);
        traitLibrary.add(arcaneRecovery);

        Trait archery = new Trait("Archery", "You gain a +2 bonus to attack rolls you make with ranged" +
                " weapons.", mainLibrary);
        traitLibrary.add(archery);

        Trait defense = new Trait("Defense", "While you are wearing armor, you gain a +1 bonus to AC.",
                mainLibrary);
        traitLibrary.add(defense);

        Trait divineSense = new Trait("Divine Sense", "The presence of strong evil registers on your" +
                " senses like a noxious odor, and powerful good rings like heavenly music in your ears. As an action," +
                " you can open your awareness to detect such forces. Until the end of your next turn, you know the " +
                "location of any celestial, fiend, or undead within 60 feet of you that is not behind total cover. You" +
                " know the type (celestial, fiend, or undead) of any being whose presence you sense, but not its " +
                "identity (the vampire Count Strahd von Zarovich, for instance). Within the same radius, you also " +
                "detect the presence of any place or object that has been consecrated or desecrated, as with the hallow" +
                " spell.\n" + "You can use this feature a number of times equal to 1 + your Charisma modifier. When you" +
                " finish a long rest, you regain all expended uses.", mainLibrary);
        traitLibrary.add(divineSense);

        Trait dueling = new Trait("Dueling", "When you are wielding a melee weapon in one hand and no " +
                "other weapons, you gain a +2 bonus to damage rolls with that weapon.", mainLibrary);
        traitLibrary.add(dueling);

        Trait expertise = new Trait("Expertise", "At 1st level, choose two of your skill proficiencies," +
                " or one of your skill proficiencies and your proficiency with thieves’ tools. Your proficiency bonus is" +
                "doubled for any ability check you make that uses either of the chosen proficiencies.\n" +
                "At 6th level, you can choose two more of your proficiencies (in skills or with thieves’ tools) to gain" +
                "this benefit.", mainLibrary);
        traitLibrary.add(expertise);

        Trait favoredEnemy = new Trait("Favored Enemy", "Beginning at 1st level, you have significant" +
                "experience studying, tracking, hunting, and even talking to a certain type of enemy.\n" +
                "Choose a type of favored enemy: aberrations, beasts, celestials, constructs, dragons, elementals, fey," +
                " fiends, giants, monstrosities, oozes, plants, or undead. Alternatively, you can select two races of" +
                "humanoid (such as gnolls and orcs) as favored enemies.\n" +
                "You have advantage on Wisdom (Survival) checks to track your favored enemies, as well as on " +
                "Intelligence checks to recall information about them.\n" +
                "When you gain this feature, you also learn one language of your choice that is spoken by your favored" +
                " enemies, if they speak one at all.\n" +
                "You choose one additional favored enemy, as well as an associated language, at 6th and 14th level. As" +
                "System Reference Document 5.1 36 you gain levels, your choices should reflect the types of monsters " +
                "you have encountered on your adventures.", mainLibrary);
        traitLibrary.add(favoredEnemy);

        Trait fightingStyle = new Trait("Fighting Style", "You adopt a particular style of fighting as" +
                " your specialty. Choose one of the following options. You can’t take a Fighting Style option more than" +
                " once, even if you later get to choose again.", mainLibrary);
        traitLibrary.add(fightingStyle);

        Trait greatWeaponFighting = new Trait("Great Weapon Fighting", "When you roll a 1 or 2 on a " +
                "damage die for an attack you make with a melee weapon that you are wielding with two hands, you can " +
                "reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have " +
                "the two-handed or versatile property for you to gain this benefit.", mainLibrary);
        traitLibrary.add(greatWeaponFighting);

        Trait layOnHands = new Trait("Lay on Hands", "Your blessed touch can heal wounds. You have a " +
                "pool of healing power that replenishes when you take a long rest. With that pool, you can restore a" +
                "total number of hit points equal to your paladin level × 5.\n" +
                "As an action, you can touch a creature and draw power from the pool to restore a number of hit points" +
                " to that creature, up to the maximum amount remaining in your pool.\n" +
                "Alternatively, you can expend 5 hit points from your pool of healing to cure the target of one disease" +
                "or neutralize one poison affecting it. You can cure multiple diseases and neutralize multiple poisons" +
                "with a single use of Lay on Hands, expending hit points separately for each one.\n" +
                "This feature has no effect on undead and constructs.", mainLibrary);
        traitLibrary.add(layOnHands);

        Trait martialArts = new Trait("Martial Arts", "At 1st level, your practice of martial arts " +
                "gives you mastery of combat styles that use unarmed strikes and monk weapons, which are shortswords" +
                " and any simple melee weapons that don’t have the two-handed or heavy property.\n" +
                "You gain the following benefits while you are unarmed or wielding only monk weapons and you aren’t " +
                "wearing armor or wielding a shield:\n" +
                "• You can use Dexterity instead of Strength for the attack and damage rolls of your unarmed strikes" +
                " and monk weapons.\n" +
                "• You can roll a d4 in place of the normal damage of your unarmed strike or monk weapon. This die " +
                "changes as you gain monk levels, as shown in the Martial Arts column of the Monk table.\n" +
                "• When you use the Attack action with an unarmed strike or a monk weapon on your turn, you can System" +
                " Reference Document 5.1 27 make one unarmed strike as a bonus action. For example, if you take the " +
                "Attack action and attack with a quarterstaff, you can also make an unarmed strike as a bonus action," +
                " assuming you haven’t already taken a bonus action this turn.\n" +
                "Certain monasteries use specialized forms of the monk weapons. For example, you might use a club that" +
                " is two lengths of wood connected by a short chain (called a nunchaku) or a sickle with a shorter, " +
                "straighter blade (called a kama). Whatever name you use for a monk weapon, you can use the game " +
                "statistics provided for the weapon.", mainLibrary);
        traitLibrary.add(martialArts);

        Trait naturalExplorer = new Trait("Natural Explorer", "You are particularly familiar with one " +
                "type of natural environment and are adept at traveling and surviving in such regions. Choose one type" +
                " of favored terrain: arctic, coast, desert, forest, grassland, mountain, or swamp. When you make an" +
                "Intelligence or Wisdom check related to your favored terrain, your proficiency bonus is doubled if" +
                "you are using a skill that you’re proficient in.\n" +
                "While traveling for an hour or more in your favored terrain, you gain the following benefits:\n" +
                "• Difficult terrain doesn’t slow your group’s travel.\n" +
                "• Your group can’t become lost except by magical\n" +
                "means.\n" +
                "• Even when you are engaged in another activity while traveling (such as foraging, navigating, or" +
                "tracking), you remain alert to danger.\n" +
                "• If you are traveling alone, you can move stealthily at a normal pace.\n" +
                "• When you forage, you find twice as much food as you normally would.\n" +
                "• While tracking other creatures, you also learn their exact number, their sizes, and how long ago" +
                "they passed through the area. You choose additional favored terrain types at 6th and 10th level.",
                mainLibrary);
        traitLibrary.add(naturalExplorer);

        Trait otherworldlyPatron = new Trait("Otherworldly Patron", "At 1st level, you have struck a " +
                "bargain with an otherworldly being of your choice: the Archfey, the Fiend, or the Great Old One, each" +
                " of which is detailed at the end of the class description. Your choice grants you features at 1st " +
                "level and again at 6th, 10th, and 14th level.", mainLibrary);
        traitLibrary.add(otherworldlyPatron);

        Trait pactMagic = new Trait("Pact Magic", "Your arcane research and the magic bestowed on you" +
                " by your patron have given you facility with spells.\n\n" +
                "Cantrips\n\n" +
                "You know two cantrips of your choice from the warlock spell list. You learn additional warlock " +
                "cantrips of your choice at higher levels, as shown in the Cantrips Known column of the Warlock table.\n\n" +
                "Spell Slots\n\n" +
                "The Warlock table shows how many spell slots you have. The table also shows what the level of those" +
                "slots is; all of your spell slots are the same level. To cast one of your warlock spells of 1st level" +
                " or higher, you must expend a spell slot. You regain all expended spell slots when you finish a short" +
                " or long rest.\n" +
                "For example, when you are 5th level, you have two 3rd-level spell slots. To cast the 1st-level spell" +
                "thunderwave, you must spend one of those slots, and you cast it as a 3rd-level spell.\n\n" +
                "Spells Known of 1st Level and Higher\n\n" +
                "At 1st level, you know two 1st-level spells of your choice from the warlock spell list.\n" +
                "The Spells Known column of the Warlock table shows when you learn more warlock spells of your choice" +
                " of 1st level and higher. A spell you choose must be of a level no higher than what’s shown in the " +
                "table’s Slot Level column for your level. When you reach 6th level, for example, you learn a new" +
                "warlock spell, which can be 1st, 2nd, or 3rd level.\n" +
                "Additionally, when you gain a level in this class, you can choose one of the warlock spells you know" +
                "and replace it with another spell from the warlock spell list, which also must be of a level for which" +
                " you have spell slots.\n\n" +
                "Spellcasting Ability\n\n" +
                "Charisma is your spellcasting ability for your warlock spells, so you use your Charisma whenever a " +
                "spell refers to your spellcasting ability. In addition, you use your Charisma modifier when setting" +
                " the saving throw DC for a warlock spell you cast and when making an attack roll with one.\n\n" +
                "Spell save DC = 8 + your proficiency bonus + your Charisma modifier\n\n" +
                "Spell attack modifier = your proficiency bonus + your Charisma modifier\n\n" +
                "Spellcasting Focus\n\n" +
                "You can use an arcane focus as a spellcasting focus for your warlock spells.", mainLibrary);
        traitLibrary.add(pactMagic);

        Trait protection = new Trait("Protection", "When a creature you can see attacks a target other " +
                "than you that is within 5 feet of you, you can use your reaction to impose disadvantage on the attack " +
                "roll. You must be wielding a shield.", mainLibrary);
        traitLibrary.add(protection);

        Trait secondWind = new Trait("Second Wind", "You have a limited well of stamina that you can " +
                "draw on to protect yourself from harm. On your turn, you can use a bonus action to regain hit points" +
                " equal to 1d10 + your fighter level. Once you use this feature, you must finish a short or long rest" +
                " before you can use it again.", mainLibrary);
        traitLibrary.add(secondWind);

        Trait sneakAttack = new Trait("Sneak Attack", "Beginning at 1st level, you know how to strike " +
                "subtly and exploit a foe’s distraction. Once per turn, you can deal an extra 1d6 damage to one " +
                "creature you hit with an attack if you have advantage on the attack roll. The attack must use a " +
                "finesse or a ranged weapon.\n" +
                "You don’t need advantage on the attack roll if another enemy of the target is within 5 feet of it, " +
                "that enemy isn’t incapacitated, and you don’t have disadvantage on the attack roll.\n" +
                "The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak " +
                "Attack column of the Rogue table.", mainLibrary);
        traitLibrary.add(sneakAttack);

        Trait sorcerousOrigin = new Trait("Sorcerous Origin", "Choose a sorcerous origin, which " +
                "describes the source of your innate magical power, such as Draconic Bloodline.\n" +
                "Your choice grants you features when you choose it at 1st level and again at 6th, 14th, and 18th level.",
                mainLibrary);
        traitLibrary.add(sorcerousOrigin);

        Trait spellCasting = new Trait("Spellcasting", "An event in your past, or in the life of a " +
                "parent or ancestor, left an indelible mark on you, infusing you with arcane magic. This font of magic," +
                " whatever its origin, fuels your spells.\n" +
                "Cantrips\n" +
                "At 1st level, you know four cantrips of your choice from the sorcerer spell list. You learn additional" +
                "sorcerer cantrips of your choice at higher levels, as shown in the Cantrips Known column of the " +
                "Sorcerer table.\n" +
                "Spell Slots\n" +
                "The Sorcerer table shows how many spell slots you have to cast your spells of 1st level and higher. To" +
                "cast one of these sorcerer spells, you must expend a slot of the spell’s level or higher. You regain all" +
                "expended spell slots when you finish a long rest.\n" +
                "For example, if you know the 1st-level spell burning hands and have a 1st-level and a 2nd-level spell" +
                " slot available, you can cast burning hands using either slot.\n" +
                "Spells Known of 1st Level and Higher\n" +
                "You know two 1st-level spells of your choice from the sorcerer spell list.\n" +
                "The Spells Known column of the Sorcerer table shows when you learn more sorcerer spells of your choice." +
                " Each of these spells must be of a level for which you have spell slots. For instance, when you reach" +
                " 3rd level in this class, you can learn one new spell of 1st or 2nd level.\n" +
                "Additionally, when you gain a level in this class, you can choose one of the sorcerer spells you know" +
                "and replace it with another spell from the sorcerer spell list, which also must be of a level for " +
                "which you have spell slots.\n" +
                "Spellcasting Ability\n" +
                "Charisma is your spellcasting ability for your sorcerer spells, since the power of your magic relies" +
                "on your ability to project your will into the world. You use your Charisma whenever a spell refers to" +
                "your spellcasting ability. In addition, you use your Charisma modifier when setting the saving throw DC" +
                "for a sorcerer spell you cast and when making an attack roll with one.\n" +
                "Spell save DC = 8 + your proficiency bonus + your Charisma modifier\n" +
                "Spell attack modifier = your proficiency bonus + your Charisma modifier\n" +
                "Spellcasting Focus\n" +
                "You can use an arcane focus as a spellcasting focus for your sorcerer spells.", mainLibrary);
        traitLibrary.add(spellCasting);

        Trait thievesCant = new Trait("Thieves' Cant", "During your rogue training you learned thieves’" +
                " cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal" +
                "conversation. Only another creature that knows thieves’ cant understands such messages. It takes four" +
                " times longer to convey such a message than it does to speak the same idea plainly.\n" +
                "In addition, you understand a set of secret signs and symbols used to convey short, simple messages," +
                "System Reference Document 5.1 40 such as whether an area is dangerous or the territory of a thieves’" +
                " guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe" +
                " house for thieves on the run.", mainLibrary);
        traitLibrary.add(thievesCant);

        Trait twoWeaponFighting = new Trait("Two-Weapon Fighting", "When you engage in two-weapon " +
                "fighting, you can add your ability modifier to the damage of the second attack.", mainLibrary);
        traitLibrary.add(twoWeaponFighting);

        Trait unarmoredDefense = new Trait("Unarmored Defense", "While you are not wearing any armor, " +
                "your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a " +
                "shield and still gain this benefit.", mainLibrary);
        traitLibrary.add(unarmoredDefense);

    }

    public ArrayList<Trait> getTraitLibrary() {
        return traitLibrary;
    }

    public Trait getTrait(String traitName) {
        Trait selectedTrait = null;

        for (Trait trait : traitLibrary) {
            if (trait.getName().equals(traitName)) {
                selectedTrait = trait;
            }
        }
        return selectedTrait;
    }
}
