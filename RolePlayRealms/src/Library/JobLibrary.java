package Library;

import Objects.Job;
import Objects.Spell;

import java.util.ArrayList;

public class JobLibrary {
    private MainLibrary mainLibrary;
    private TraitLibrary traitLibrary;
    private SpellLibrary spellLibrary;
    private EquipmentLibrary equipmentLibrary;
    private ArrayList<Job> jobLibrary;

    public JobLibrary(MainLibrary mainLibrary) {
        this.mainLibrary = mainLibrary;
        traitLibrary = mainLibrary.getTraitLibrary();
        spellLibrary = mainLibrary.getSpellLibrary();
        equipmentLibrary = mainLibrary.getEquipmentLibrary();
        jobLibrary = new ArrayList<>();

        Job barbarian = new Job("Barbarian", "Masters of primal strength and ferocity, barbarians are" +
                " fierce warriors who eschew traditional combat techniques in favor of raw power and instinct. They hail" +
                " from rugged lands or nomadic tribes, where survival depends on physical prowess and adaptability." +
                " Barbarians tap into their primal rage in battle, becoming nearly unstoppable forces of destruction." +
                " Despite their reputation as savage fighters, many barbarians possess a deep connection to nature and" +
                " a strong sense of honor, defending their kin and their way of life with unwavering determination.\n", 12);
        barbarian.addSkill(spellLibrary.getSpell("Rage"));
        barbarian.addTrait(traitLibrary.getTrait("Unarmored Defense"));
        barbarian.addEquipment(equipmentLibrary.getEquipment("Greataxe"));
        barbarian.addEquipment(equipmentLibrary.getEquipment("Handaxe"));
        barbarian.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        barbarian.addEquipment(equipmentLibrary.getEquipment("Javelin"));
        jobLibrary.add(barbarian);

        Job bard = new Job("Bard", "Masters of music, magic, and storytelling, bards are charismatic" +
                " performers who wield the power of inspiration to shape the world around them. They often travel from" +
                " place to place, captivating audiences with their tales and music while honing their skills in various" +
                " arts and arcane traditions. Bards possess a versatile array of abilities, from bolstering allies with" +
                " stirring performances to manipulating minds with enchanting melodies. Beyond their entertainment" +
                " prowess, bards are also skilled diplomats, spies, and adventurers, using their wit and charm to" +
                " navigate the complexities of life and leave their mark on history.", 8);
        bard.addTrait(traitLibrary.getTrait("Spellcasting"));
        bard.addSkill(spellLibrary.getSpell("Bardic Inspiration"));
        bard.addCantrip(spellLibrary.getSpell("Blade Ward"));
        bard.addCantrip(spellLibrary.getSpell("Dancing Lights"));
        bard.addCantrip(spellLibrary.getSpell("Friends"));
        bard.addCantrip(spellLibrary.getSpell("Light"));
        bard.addCantrip(spellLibrary.getSpell("Mage Hand"));
        bard.addCantrip(spellLibrary.getSpell("Mending"));
        bard.addCantrip(spellLibrary.getSpell("Message"));
        bard.addCantrip(spellLibrary.getSpell("Minor Illusion"));
        bard.addCantrip(spellLibrary.getSpell("Prestidigitation"));
        bard.addCantrip(spellLibrary.getSpell("Thunderclap"));
        bard.addCantrip(spellLibrary.getSpell("True Strike"));
        bard.addCantrip(spellLibrary.getSpell("Vicious Mockery"));
        bard.addSpell(spellLibrary.getSpell("Animal Friendship"));
        bard.addSpell(spellLibrary.getSpell("Bane"));
        bard.addSpell(spellLibrary.getSpell("Charm Person"));
        bard.addSpell(spellLibrary.getSpell("Color Spray"));
        bard.addSpell(spellLibrary.getSpell("Command"));
        bard.addSpell(spellLibrary.getSpell("Comprehend Languages"));
        bard.addSpell(spellLibrary.getSpell("Cure Wounds"));
        bard.addSpell(spellLibrary.getSpell("Detect Magic"));
        bard.addSpell(spellLibrary.getSpell("Disguise Self"));
        bard.addSpell(spellLibrary.getSpell("Dissonant Whispers"));
        bard.addSpell(spellLibrary.getSpell("Distort Value"));
        bard.addSpell(spellLibrary.getSpell("Earth Tremor"));
        bard.addSpell(spellLibrary.getSpell("Faerie Fire"));
        bard.addSpell(spellLibrary.getSpell("Feather Fall"));
        bard.addSpell(spellLibrary.getSpell("Guiding Hand"));
        bard.addSpell(spellLibrary.getSpell("Healing Word"));
        bard.addSpell(spellLibrary.getSpell("Heroism"));
        bard.addSpell(spellLibrary.getSpell("Identify"));
        bard.addSpell(spellLibrary.getSpell("Illusory Script"));
        bard.addSpell(spellLibrary.getSpell("Longstrider"));
        bard.addSpell(spellLibrary.getSpell("Puppet"));
        bard.addSpell(spellLibrary.getSpell("Sense Emotion"));
        bard.addSpell(spellLibrary.getSpell("Silent Image"));
        bard.addSpell(spellLibrary.getSpell("Silvery Barbs"));
        bard.addSpell(spellLibrary.getSpell("Sleep"));
        bard.addSpell(spellLibrary.getSpell("Speak with Animals"));
        bard.addSpell(spellLibrary.getSpell("Sudden Awakening"));
        bard.addSpell(spellLibrary.getSpell("Tasha's Hideous Laughter"));
        bard.addSpell(spellLibrary.getSpell("Thunderwave"));
        bard.addSpell(spellLibrary.getSpell("Unearthly Chorus"));
        bard.addSpell(spellLibrary.getSpell("Unseen Servant"));
        bard.addEquipment(equipmentLibrary.getEquipment("Rapier"));
        bard.addEquipment(equipmentLibrary.getEquipment("Longsword"));
        bard.addEquipment(equipmentLibrary.getEquipment("Diplomat's Pack"));
        bard.addEquipment(equipmentLibrary.getEquipment("Entertainer's Pack"));
        bard.addEquipment(equipmentLibrary.getEquipment("Lute"));
        bard.addEquipment(equipmentLibrary.getEquipment("Leather Armor"));
        bard.addEquipment(equipmentLibrary.getEquipment("Dagger"));
        jobLibrary.add(bard);

        Job cleric = new Job("Cleric", "Devoted servants of divine powers, clerics are conduits of faith" +
                " and wielders of divine magic. They serve gods, pantheons, or higher powers, channeling their divine" +
                " will to heal the wounded, protect the innocent, and smite the wicked. Clerics often belong to organized" +
                " religions, serving as priests, healers, or warriors of their faith. Their spells and abilities are" +
                " imbued with the essence of their deity, granting them the power to turn the tide of battle or bring" +
                " solace to those in need. Despite their devotion, clerics may interpret their divine mandates in" +
                " different ways, leading to a wide range of beliefs, practices, and moral codes among their ranks.", 8);
        cleric.addTrait(traitLibrary.getTrait("Spellcasting"));
        cleric.addTrait(traitLibrary.getTrait("Divine Domain"));
        cleric.addCantrip(spellLibrary.getSpell("Decompose"));
        cleric.addCantrip(spellLibrary.getSpell("Guidance"));
        cleric.addCantrip(spellLibrary.getSpell("Hand of Radiance"));
        cleric.addCantrip(spellLibrary.getSpell("Light"));
        cleric.addCantrip(spellLibrary.getSpell("Mending"));
        cleric.addCantrip(spellLibrary.getSpell("Resistance"));
        cleric.addCantrip(spellLibrary.getSpell("Sacred Flame"));
        cleric.addCantrip(spellLibrary.getSpell("Spare the Dying"));
        cleric.addCantrip(spellLibrary.getSpell("Thaumaturgy"));
        cleric.addCantrip(spellLibrary.getSpell("Toll the Dead"));
        cleric.addCantrip(spellLibrary.getSpell("Virtue"));
        cleric.addCantrip(spellLibrary.getSpell("Word of Radiance"));
        cleric.addSpell(spellLibrary.getSpell("Bane"));
        cleric.addSpell(spellLibrary.getSpell("Bless"));
        cleric.addSpell(spellLibrary.getSpell("Ceremony"));
        cleric.addSpell(spellLibrary.getSpell("Command"));
        cleric.addSpell(spellLibrary.getSpell("Create or Destroy Water"));
        cleric.addSpell(spellLibrary.getSpell("Cure Wounds"));
        cleric.addSpell(spellLibrary.getSpell("Detect Evil and Good"));
        cleric.addSpell(spellLibrary.getSpell("Detect Magic"));
        cleric.addSpell(spellLibrary.getSpell("Detect Poison and Disease"));
        cleric.addSpell(spellLibrary.getSpell("Guiding Bolt"));
        cleric.addSpell(spellLibrary.getSpell("Guiding Hand"));
        cleric.addSpell(spellLibrary.getSpell("Healing Word"));
        cleric.addSpell(spellLibrary.getSpell("Inflict Wounds"));
        cleric.addSpell(spellLibrary.getSpell("Protection from Evil and Good"));
        cleric.addSpell(spellLibrary.getSpell("Purify Food and Drink"));
        cleric.addSpell(spellLibrary.getSpell("Sanctuary"));
        cleric.addSpell(spellLibrary.getSpell("Shield of Faith"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Mace"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Warhammer"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Scale Mail"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Leather Armor"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Chain Mail"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Light Crossbow"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Bolt"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Priest's Pack"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Shield"));
        cleric.addEquipment(equipmentLibrary.getEquipment("Holy Symbol"));
        jobLibrary.add(cleric);

        Job druid = new Job("Druid", "Guardians of the natural world, druids are mystics who commune" +
                " with the primal forces of nature, wielding its power to protect and preserve the balance of the world." +
                " They are deeply connected to the land, often dwelling in secluded groves or wild places where they" +
                " study the cycles of life and death. Druids can shape-shift into animals, call upon the elements, and" +
                " command the flora and fauna to aid them in their endeavors. While some druids are solitary hermits," +
                " others band together in circles or orders, united by their reverence for nature and their commitment" +
                " to safeguarding the wilderness from exploitation and corruption.", 8);
        druid.addTrait(traitLibrary.getTrait("Druidic"));
        druid.addTrait(traitLibrary.getTrait("Spellcasting"));
        druid.addCantrip(spellLibrary.getSpell("Control Flames"));
        druid.addCantrip(spellLibrary.getSpell("Create Bonfire"));
        druid.addCantrip(spellLibrary.getSpell("Druidcraft"));
        druid.addCantrip(spellLibrary.getSpell("Frostbite"));
        druid.addCantrip(spellLibrary.getSpell("Guidance"));
        druid.addCantrip(spellLibrary.getSpell("Gust"));
        druid.addCantrip(spellLibrary.getSpell("Infestation"));
        druid.addCantrip(spellLibrary.getSpell("Magic Stone"));
        druid.addCantrip(spellLibrary.getSpell("Mending"));
        druid.addCantrip(spellLibrary.getSpell("Mold Earth"));
        druid.addCantrip(spellLibrary.getSpell("Poison Spray"));
        druid.addCantrip(spellLibrary.getSpell("Primal Savagery"));
        druid.addCantrip(spellLibrary.getSpell("Produce Flame"));
        druid.addCantrip(spellLibrary.getSpell("Resistance"));
        druid.addCantrip(spellLibrary.getSpell("Shape Water"));
        druid.addCantrip(spellLibrary.getSpell("Shillelagh"));
        druid.addCantrip(spellLibrary.getSpell("Thorn Whip"));
        druid.addCantrip(spellLibrary.getSpell("Thunderclap"));
        druid.addSpell(spellLibrary.getSpell("Absorb Elements"));
        druid.addSpell(spellLibrary.getSpell("Animal Friendship"));
        druid.addSpell(spellLibrary.getSpell("Beast Bond"));
        druid.addSpell(spellLibrary.getSpell("Charm Person"));
        druid.addSpell(spellLibrary.getSpell("Create or Destroy Water"));
        druid.addSpell(spellLibrary.getSpell("Cure Wounds"));
        druid.addSpell(spellLibrary.getSpell("Detect Magic"));
        druid.addSpell(spellLibrary.getSpell("Detect Poison and Disease"));
        druid.addSpell(spellLibrary.getSpell("Earth Tremor"));
        druid.addSpell(spellLibrary.getSpell("Entangle"));
        druid.addSpell(spellLibrary.getSpell("Faerie Fire"));
        druid.addSpell(spellLibrary.getSpell("Fog Cloud"));
        druid.addSpell(spellLibrary.getSpell("Goodberry"));
        druid.addSpell(spellLibrary.getSpell("Guiding Hand"));
        druid.addSpell(spellLibrary.getSpell("Healing Word"));
        druid.addSpell(spellLibrary.getSpell("Ice Knife"));
        druid.addSpell(spellLibrary.getSpell("Jump"));
        druid.addSpell(spellLibrary.getSpell("Longstrider"));
        druid.addSpell(spellLibrary.getSpell("Protection from Evil and Good"));
        druid.addSpell(spellLibrary.getSpell("Purify Food and Drink"));
        druid.addSpell(spellLibrary.getSpell("Snare"));
        druid.addSpell(spellLibrary.getSpell("Speak with Animals"));
        druid.addSpell(spellLibrary.getSpell("Thunderwave"));
        druid.addSpell(spellLibrary.getSpell("Wild Cunning"));
        druid.addEquipment(equipmentLibrary.getEquipment("Wooden Shield"));
        druid.addEquipment(equipmentLibrary.getEquipment("Scimitar"));
        druid.addEquipment(equipmentLibrary.getEquipment("Leather Armor"));
        druid.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        druid.addEquipment(equipmentLibrary.getEquipment("Druidic Focus"));
        jobLibrary.add(druid);

        Job fighter = new Job("Fighter", "Masters of martial prowess and battlefield tactics, fighters" +
                " are versatile warriors who excel in combat through discipline, skill, and determination. They come" +
                " from diverse backgrounds, ranging from seasoned veterans of armies to self-trained gladiators or noble" +
                " knights. Fighters are proficient in a wide array of weapons and armor, adapting their fighting style" +
                " to suit any situation or opponent. They can specialize in specific combat techniques, such as archery," +
                " swordsmanship, or hand-to-hand combat, becoming experts in their chosen field. Whether defending their" +
                " homeland, seeking glory in tournaments, or embarking on daring quests, fighters are the backbone of" +
                " any adventuring party, relying on their strength, courage, and expertise to overcome the challenges" +
                " they face.", 10);
        fighter.addTrait(traitLibrary.getTrait("Fighting Style"));
        fighter.addSkill(spellLibrary.getSpell("SecondWind"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Chain Mail"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Leather Armor"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Longbow"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Arrow"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Shield"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Light Crossbow"));
        fighter.addEquipment(equipmentLibrary.getEquipment("bolt"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Handaxe"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        fighter.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        jobLibrary.add(fighter);

        Job monk = new Job("Monk", "Disciplined warriors and ascetic scholars, monks harness the power" +
                " of mind, body, and spirit to achieve extraordinary feats. They are practitioners of ancient martial" +
                " arts, honing their physical abilities through rigorous training and meditation. Monks eschew" +
                " traditional weapons in favor of unarmed combat, using their fists, feet, and even their inner energy," +
                " known as ki, to strike with deadly precision and agility. Beyond their martial prowess, monks possess" +
                " supernatural abilities, such as deflecting projectiles, moving with unnatural speed, and even" +
                " manipulating the elements. Rooted in philosophies of self-discipline and enlightenment, monks often" +
                " lead lives of simplicity and introspection, seeking mastery over themselves as much as over their" +
                " foes.\n", 8);
        monk.addTrait(traitLibrary.getTrait("Unarmored Defense"));
        monk.addTrait(traitLibrary.getTrait("Martial Arts"));
        monk.addEquipment(equipmentLibrary.getEquipment("Shortsword"));
        monk.addEquipment(equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        monk.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        monk.addEquipment(equipmentLibrary.getEquipment("Dart"));
        jobLibrary.add(monk);

        Job paladin = new Job("Paladin", "Champions of virtue and righteousness, paladins are holy" +
                " warriors devoted to upholding justice, protecting the innocent, and smiting evil wherever it lurks." +
                " They are often members of religious orders or knightly orders, bound by a strict code of conduct that" +
                " guides their actions and empowers their divine abilities. Paladins are infused with divine power," +
                " drawing strength from their unwavering faith in their chosen deity or cause. They are skilled in" +
                " combat, wielding weapons and armor with precision and zeal, while also possessing potent spells to" +
                " heal the wounded, banish darkness, and inspire courage in their allies. Though their path is fraught" +
                " with danger and sacrifice, paladins stand as beacons of hope and bastions of light in a world besieged" +
                " by darkness.", 10);
        paladin.addSkill(spellLibrary.getSpell("Divine Sense"));
        paladin.addSkill(spellLibrary.getSpell("Lay on Hands"));
        paladin.addEquipment(equipmentLibrary.getEquipment("Shield"));
        paladin.addEquipment(equipmentLibrary.getEquipment("Javelin"));
        paladin.addEquipment(equipmentLibrary.getEquipment("Priest's Pack"));
        paladin.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        paladin.addEquipment(equipmentLibrary.getEquipment("Chain Mail"));
        paladin.addEquipment(equipmentLibrary.getEquipment("Holy Symbol"));
        jobLibrary.add(paladin);

        Job ranger = new Job("Ranger", "Masters of the wilderness and skilled hunters, rangers are" +
                " solitary trackers and guardians of the natural world. They possess a deep connection to the land," +
                " often roaming vast forests, rugged mountains, or untamed wilderness in pursuit of their quarry." +
                " Rangers are adept at survival, using their knowledge of nature to navigate the wilderness, forage for" +
                " supplies, and track both beasts and foes with uncanny precision. They are skilled archers, wielding" +
                " bows or ranged weapons with deadly accuracy, but are also proficient in melee combat when the need" +
                " arises. Rangers often form close bonds with animal companions, befriending and training them to aid" +
                " in their quests. Whether defending the wilds from encroaching civilization or embarking on daring" +
                " adventures in the untamed frontier, rangers are stalwart defenders of nature's balance.", 10);
        ranger.addTrait(traitLibrary.getTrait("Favored Enemy"));
        ranger.addTrait(traitLibrary.getTrait("Natural Explorer"));
        ranger.addEquipment(equipmentLibrary.getEquipment("Scale Mail"));
        ranger.addEquipment(equipmentLibrary.getEquipment("Leather Armor"));
        ranger.addEquipment(equipmentLibrary.getEquipment("Shortsword"));
        ranger.addEquipment(equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        ranger.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        ranger.addEquipment(equipmentLibrary.getEquipment("Longbow"));
        ranger.addEquipment(equipmentLibrary.getEquipment("Arrow"));
        jobLibrary.add(ranger);

        Job rogue = new Job("Rogue", "Masters of stealth, deception, and agility, rogues are cunning" +
                " adventurers who thrive on the edge of society. They excel in the arts of subterfuge, infiltration," +
                " and opportunistic combat, relying on their wit and finesse to outmaneuver their foes. Rogues are" +
                " skilled thieves, spies, and assassins, capable of slipping past guards, picking locks, and disarming" +
                " traps with ease. They are experts in the art of surprise, striking swiftly and decisively from the" +
                " shadows before vanishing without a trace. Despite their reputation as outlaws and scoundrels, rogues" +
                " often possess a strong sense of loyalty to their comrades and a code of honor that guides their" +
                " actions. Whether pursuing riches, uncovering secrets, or righting wrongs, rogues are indispensable" +
                " members of any adventuring party, using their unique talents to turn the tide of fortune in their" +
                " favor.\n", 8);
        rogue.addTrait(traitLibrary.getTrait("Expertise"));
        rogue.addTrait(traitLibrary.getTrait("Thieves' Cant"));
        rogue.addSkill(spellLibrary.getSpell("Sneak Attack"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Rapier"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Shortsword"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Shortbow"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Arrow"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Burglar's Pack"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Leather Armor"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Dagger"));
        rogue.addEquipment(equipmentLibrary.getEquipment("Thieves' Tools"));
        jobLibrary.add(rogue);

        Job sorcerer = new Job("Sorcerer", "Born with innate magical talent, sorcerers are conduits of" +
                " raw arcane power, drawing their abilities from their bloodline, ancestry, or some other mysterious" +
                " source. Unlike wizards who study magic through rigorous study and practice, sorcerers possess an" +
                " inherent connection to magic that allows them to cast spells instinctively. They wield a variety of" +
                " arcane spells, manipulating the elements, conjuring magical effects, and bending reality to their" +
                " will. Sorcerers often manifest unique magical abilities tied to their bloodline, such as draconic" +
                " ancestry or wild magic surges, which set them apart from other spellcasters. Though their powers may" +
                " be unpredictable and difficult to control, sorcerers embrace their magical heritage, harnessing their" +
                " gifts to unravel mysteries, shape destinies, and leave their mark on the world.\n", 6);
        sorcerer.addTrait(traitLibrary.getTrait("Spellcasting"));
        sorcerer.addTrait(traitLibrary.getTrait("Sorcerous Origin"));
        sorcerer.addCantrip(spellLibrary.getSpell("Acid Splash"));
        sorcerer.addCantrip(spellLibrary.getSpell("Blade Ward"));
        sorcerer.addCantrip(spellLibrary.getSpell("Booming Blade"));
        sorcerer.addCantrip(spellLibrary.getSpell("Chill Touch"));
        sorcerer.addCantrip(spellLibrary.getSpell("Control Flames"));
        sorcerer.addCantrip(spellLibrary.getSpell("Create Bonfire"));
        sorcerer.addCantrip(spellLibrary.getSpell("Dancing Lights"));
        sorcerer.addCantrip(spellLibrary.getSpell("Fire Bolt"));
        sorcerer.addCantrip(spellLibrary.getSpell("Friends"));
        sorcerer.addCantrip(spellLibrary.getSpell("Frostbite"));
        sorcerer.addCantrip(spellLibrary.getSpell("Green-Flame Blade"));
        sorcerer.addCantrip(spellLibrary.getSpell("Gust"));
        sorcerer.addCantrip(spellLibrary.getSpell("Infestation"));
        sorcerer.addCantrip(spellLibrary.getSpell("Light"));
        sorcerer.addCantrip(spellLibrary.getSpell("Lightning Lure"));
        sorcerer.addCantrip(spellLibrary.getSpell("Mage Hand"));
        sorcerer.addCantrip(spellLibrary.getSpell("Mending"));
        sorcerer.addCantrip(spellLibrary.getSpell("Message"));
        sorcerer.addCantrip(spellLibrary.getSpell("Mind Sliver"));
        sorcerer.addCantrip(spellLibrary.getSpell("Minor Illusion"));
        sorcerer.addCantrip(spellLibrary.getSpell("Mold Earth"));
        sorcerer.addCantrip(spellLibrary.getSpell("On/Off"));
        sorcerer.addCantrip(spellLibrary.getSpell("Poison Spray"));
        sorcerer.addCantrip(spellLibrary.getSpell("Prestidigitation"));
        sorcerer.addCantrip(spellLibrary.getSpell("Ray of Frost"));
        sorcerer.addCantrip(spellLibrary.getSpell("Shape Water"));
        sorcerer.addCantrip(spellLibrary.getSpell("Shocking Grasp"));
        sorcerer.addCantrip(spellLibrary.getSpell("Sword Burst"));
        sorcerer.addCantrip(spellLibrary.getSpell("Thunderclap"));
        sorcerer.addCantrip(spellLibrary.getSpell("True Strike"));
        sorcerer.addSpell(spellLibrary.getSpell("Absorb Elements"));
        sorcerer.addSpell(spellLibrary.getSpell("Acid Stream"));
        sorcerer.addSpell(spellLibrary.getSpell("Burning Hands"));
        sorcerer.addSpell(spellLibrary.getSpell("Catapult"));
        sorcerer.addSpell(spellLibrary.getSpell("Chaos Bolt"));
        sorcerer.addSpell(spellLibrary.getSpell("Charm Person"));
        sorcerer.addSpell(spellLibrary.getSpell("Chromatic Orb"));
        sorcerer.addSpell(spellLibrary.getSpell("Color Spray"));
        sorcerer.addSpell(spellLibrary.getSpell("Comprehend Languages"));
        sorcerer.addSpell(spellLibrary.getSpell("Detect Magic"));
        sorcerer.addSpell(spellLibrary.getSpell("Disguise Self"));
        sorcerer.addSpell(spellLibrary.getSpell("Distort Value"));
        sorcerer.addSpell(spellLibrary.getSpell("Earth Tremor"));
        sorcerer.addSpell(spellLibrary.getSpell("Expeditious Retreat"));
        sorcerer.addSpell(spellLibrary.getSpell("False Life"));
        sorcerer.addSpell(spellLibrary.getSpell("Feather Fall"));
        sorcerer.addSpell(spellLibrary.getSpell("Fog Cloud"));
        sorcerer.addSpell(spellLibrary.getSpell("Grease"));
        sorcerer.addSpell(spellLibrary.getSpell("Ice Knife"));
        sorcerer.addSpell(spellLibrary.getSpell("Id Insulation"));
        sorcerer.addSpell(spellLibrary.getSpell("Infallible Relay"));
        sorcerer.addSpell(spellLibrary.getSpell("Jump"));
        sorcerer.addSpell(spellLibrary.getSpell("Mage Armor"));
        sorcerer.addSpell(spellLibrary.getSpell("Magic Missle"));
        sorcerer.addSpell(spellLibrary.getSpell("Ray of Sickness"));
        sorcerer.addSpell(spellLibrary.getSpell("Remote Access"));
        sorcerer.addSpell(spellLibrary.getSpell("Shield"));
        sorcerer.addSpell(spellLibrary.getSpell("Silent Image"));
        sorcerer.addSpell(spellLibrary.getSpell("Silvery Barbs"));
        sorcerer.addSpell(spellLibrary.getSpell("Sleep"));
        sorcerer.addSpell(spellLibrary.getSpell("Sudden Awakening"));
        sorcerer.addSpell(spellLibrary.getSpell("Tasha's Caustic Brew"));
        sorcerer.addSpell(spellLibrary.getSpell("Thunderwave"));
        sorcerer.addSpell(spellLibrary.getSpell("Witch Bolt"));
        sorcerer.addEquipment(equipmentLibrary.getEquipment("Light Crossbow"));
        sorcerer.addEquipment(equipmentLibrary.getEquipment("Bolt"));
        sorcerer.addEquipment(equipmentLibrary.getEquipment("Component Pouch"));
        sorcerer.addEquipment(equipmentLibrary.getEquipment("Arcane Focus"));
        sorcerer.addEquipment(equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        sorcerer.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        sorcerer.addEquipment(equipmentLibrary.getEquipment("Dagger"));
        jobLibrary.add(sorcerer);

        Job warlock = new Job("Warlock", "Seekers of forbidden knowledge and wielders of dark magic," +
                " warlocks forge pacts with otherworldly beings in exchange for arcane power. These patrons, which" +
                " could be fiends, fey, or eldritch entities, grant warlocks access to powerful spells and abilities" +
                " beyond mortal comprehension. Unlike wizards who learn magic through study or sorcerers who inherit it" +
                " through bloodlines, warlocks gain their magic through a pact, often at a great cost. Warlocks harness" +
                " eldritch energy to cast spells, summon otherworldly creatures, and weave curses upon their enemies." +
                " Though they may face temptation and corruption from their patrons, warlocks often use their powers" +
                " to pursue their own agendas, whether seeking vengeance, unraveling mysteries, or delving into" +
                " forbidden lore.\n", 8);
        warlock.addTrait(traitLibrary.getTrait("Otherworldly Patron"));
        warlock.addTrait(traitLibrary.getTrait("Pact Magic"));
        warlock.addCantrip(spellLibrary.getSpell("Blade Ward"));
        warlock.addCantrip(spellLibrary.getSpell("Booming Blade"));
        warlock.addCantrip(spellLibrary.getSpell("Chill Touch"));
        warlock.addCantrip(spellLibrary.getSpell("Create Bonfire"));
        warlock.addCantrip(spellLibrary.getSpell("Eldritch Blast"));
        warlock.addCantrip(spellLibrary.getSpell("Friends"));
        warlock.addCantrip(spellLibrary.getSpell("Frostbite"));
        warlock.addCantrip(spellLibrary.getSpell("Green-Flame Blade"));
        warlock.addCantrip(spellLibrary.getSpell("Infestation"));
        warlock.addCantrip(spellLibrary.getSpell("Lightning Lure"));
        warlock.addCantrip(spellLibrary.getSpell("Mage Hand"));
        warlock.addCantrip(spellLibrary.getSpell("Magic Stone"));
        warlock.addCantrip(spellLibrary.getSpell("Mind Sliver"));
        warlock.addCantrip(spellLibrary.getSpell("Minor Illusion"));
        warlock.addCantrip(spellLibrary.getSpell("On/Off"));
        warlock.addCantrip(spellLibrary.getSpell("Poison Spray"));
        warlock.addCantrip(spellLibrary.getSpell("Prestidigitation"));
        warlock.addCantrip(spellLibrary.getSpell("Sword Burst"));
        warlock.addCantrip(spellLibrary.getSpell("Thunderclap"));
        warlock.addCantrip(spellLibrary.getSpell("Toll the Dead"));
        warlock.addCantrip(spellLibrary.getSpell("True Strike"));
        warlock.addSpell(spellLibrary.getSpell("Armor of Agathys"));
        warlock.addSpell(spellLibrary.getSpell("Arms of Hadar"));
        warlock.addSpell(spellLibrary.getSpell("Cause Fear"));
        warlock.addSpell(spellLibrary.getSpell("Charm Person"));
        warlock.addSpell(spellLibrary.getSpell("Comprehend Languages"));
        warlock.addSpell(spellLibrary.getSpell("Distort Value"));
        warlock.addSpell(spellLibrary.getSpell("Expeditious Retreat"));
        warlock.addSpell(spellLibrary.getSpell("Healing Elixir"));
        warlock.addSpell(spellLibrary.getSpell("Hellish Rebuke"));
        warlock.addSpell(spellLibrary.getSpell("Hex"));
        warlock.addSpell(spellLibrary.getSpell("Id Insinuation"));
        warlock.addSpell(spellLibrary.getSpell("Illusory Script"));
        warlock.addSpell(spellLibrary.getSpell("Infallible Relay"));
        warlock.addSpell(spellLibrary.getSpell("Protection from Evil and Good"));
        warlock.addSpell(spellLibrary.getSpell("Puppet"));
        warlock.addSpell(spellLibrary.getSpell("Remote Access"));
        warlock.addSpell(spellLibrary.getSpell("Sense Emotion"));
        warlock.addSpell(spellLibrary.getSpell("Unseen Servant"));
        warlock.addSpell(spellLibrary.getSpell("Witch Bolt"));
        warlock.addEquipment(equipmentLibrary.getEquipment("Light Crossbow"));
        warlock.addEquipment(equipmentLibrary.getEquipment("Bolt"));
        warlock.addEquipment(equipmentLibrary.getEquipment("Component Pouch"));
        warlock.addEquipment(equipmentLibrary.getEquipment("Arcane Focus"));
        warlock.addEquipment(equipmentLibrary.getEquipment("Scholar's Pack"));
        warlock.addEquipment(equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        warlock.addEquipment(equipmentLibrary.getEquipment("Leather Armor"));
        warlock.addEquipment(equipmentLibrary.getEquipment("Dagger"));
        jobLibrary.add(warlock);

        Job wizard = new Job("Wizard", "Scholars of arcane lore and masters of spellcraft, wizards are" +
                " intellectuals who unlock the secrets of magic through study, experimentation, and intense focus. They" +
                " devote their lives to the pursuit of knowledge, poring over ancient tomes, deciphering cryptic runes," +
                " and mastering the intricacies of spellcasting. Wizards wield a vast array of spells, encompassing" +
                " everything from elemental manipulation to mind control, which they cast through intricate gestures" +
                " and arcane incantations. Through their extensive training and research, wizards can specialize in" +
                " specific schools of magic, such as evocation, necromancy, or illusion, mastering spells that align" +
                " with their chosen discipline. Despite their scholarly nature, wizards are formidable adventurers," +
                " using their magical prowess to overcome challenges, uncover mysteries, and reshape the world" +
                " according to their will.\n", 6);
        wizard.addTrait(traitLibrary.getTrait("Spellcasting"));
        wizard.addSkill(spellLibrary.getSpell("Arcane Recovery"));
        wizard.addCantrip(spellLibrary.getSpell("Acid Splash"));
        wizard.addCantrip(spellLibrary.getSpell("Blade Ward"));
        wizard.addCantrip(spellLibrary.getSpell("Booming Blade"));
        wizard.addCantrip(spellLibrary.getSpell("Chill Touch"));
        wizard.addCantrip(spellLibrary.getSpell("Control Flames"));
        wizard.addCantrip(spellLibrary.getSpell("Create Bonfire"));
        wizard.addCantrip(spellLibrary.getSpell("Dancing Lights"));
        wizard.addCantrip(spellLibrary.getSpell("Encode Thoughts"));
        wizard.addCantrip(spellLibrary.getSpell("Fire Bolt"));
        wizard.addCantrip(spellLibrary.getSpell("Friends"));
        wizard.addCantrip(spellLibrary.getSpell("Frostbite"));
        wizard.addCantrip(spellLibrary.getSpell("Green-Flame Blade"));
        wizard.addCantrip(spellLibrary.getSpell("Gust"));
        wizard.addCantrip(spellLibrary.getSpell("Infestation"));
        wizard.addCantrip(spellLibrary.getSpell("Light"));
        wizard.addCantrip(spellLibrary.getSpell("Lightning Lure"));
        wizard.addCantrip(spellLibrary.getSpell("Mage Hand"));
        wizard.addCantrip(spellLibrary.getSpell("Mending"));
        wizard.addCantrip(spellLibrary.getSpell("Message"));
        wizard.addCantrip(spellLibrary.getSpell("Mind Sliver"));
        wizard.addCantrip(spellLibrary.getSpell("Minor Illusion"));
        wizard.addCantrip(spellLibrary.getSpell("Mold Earth"));
        wizard.addCantrip(spellLibrary.getSpell("On/Off"));
        wizard.addCantrip(spellLibrary.getSpell("Poison Spray"));
        wizard.addCantrip(spellLibrary.getSpell("Prestidigitation"));
        wizard.addCantrip(spellLibrary.getSpell("Ray of Frost"));
        wizard.addCantrip(spellLibrary.getSpell("Sapping Sting"));
        wizard.addCantrip(spellLibrary.getSpell("Shape Water"));
        wizard.addCantrip(spellLibrary.getSpell("Shocking Grasp"));
        wizard.addCantrip(spellLibrary.getSpell("Sword Burst"));
        wizard.addCantrip(spellLibrary.getSpell("Thunderclap"));
        wizard.addCantrip(spellLibrary.getSpell("Toll the Dead"));
        wizard.addCantrip(spellLibrary.getSpell("True Strike"));
        wizard.addSpell(spellLibrary.getSpell("Absorb Elements"));
        wizard.addSpell(spellLibrary.getSpell("Acid Stream"));
        wizard.addSpell(spellLibrary.getSpell("Alarm"));
        wizard.addSpell(spellLibrary.getSpell("Burning Hands"));
        wizard.addSpell(spellLibrary.getSpell("Catapult"));
        wizard.addSpell(spellLibrary.getSpell("Cause Fear"));
        wizard.addSpell(spellLibrary.getSpell("Charm Person"));
        wizard.addSpell(spellLibrary.getSpell("Chromatic Orb"));
        wizard.addSpell(spellLibrary.getSpell("Color Spray"));
        wizard.addSpell(spellLibrary.getSpell("Comprehend Languages"));
        wizard.addSpell(spellLibrary.getSpell("Detect Magic"));
        wizard.addSpell(spellLibrary.getSpell("Disguise Self"));
        wizard.addSpell(spellLibrary.getSpell("Distort Value"));
        wizard.addSpell(spellLibrary.getSpell("Earth Tremor"));
        wizard.addSpell(spellLibrary.getSpell("Expeditious Retreat"));
        wizard.addSpell(spellLibrary.getSpell("False Life"));
        wizard.addSpell(spellLibrary.getSpell("Feather Fall"));
        wizard.addSpell(spellLibrary.getSpell("Find Familiar"));
        wizard.addSpell(spellLibrary.getSpell("Fog Cloud"));
        wizard.addSpell(spellLibrary.getSpell("Frost Fingers"));
        wizard.addSpell(spellLibrary.getSpell("Gift of Alacrity"));
        wizard.addSpell(spellLibrary.getSpell("Grease"));
        wizard.addSpell(spellLibrary.getSpell("Guiding Hand"));
        wizard.addSpell(spellLibrary.getSpell("Healing Elixir"));
        wizard.addSpell(spellLibrary.getSpell("Ice Knife"));
        wizard.addSpell(spellLibrary.getSpell("Id Insinuation"));
        wizard.addSpell(spellLibrary.getSpell("Identify"));
        wizard.addSpell(spellLibrary.getSpell("Illusory Script"));
        wizard.addSpell(spellLibrary.getSpell("Infallible Relay"));
        wizard.addSpell(spellLibrary.getSpell("Jim's Magic Missle"));
        wizard.addSpell(spellLibrary.getSpell("Jump"));
        wizard.addSpell(spellLibrary.getSpell("Longstrider"));
        wizard.addSpell(spellLibrary.getSpell("Mage Armor"));
        wizard.addSpell(spellLibrary.getSpell("Magic Missile"));
        wizard.addSpell(spellLibrary.getSpell("Magnify Grafity"));
        wizard.addSpell(spellLibrary.getSpell("Protection from Evil and Good"));
        wizard.addSpell(spellLibrary.getSpell("Puppet"));
        wizard.addSpell(spellLibrary.getSpell("Ray of Sickness"));
        wizard.addSpell(spellLibrary.getSpell("Remote Access"));
        wizard.addSpell(spellLibrary.getSpell("Sense Emotion"));
        wizard.addSpell(spellLibrary.getSpell("Shield"));
        wizard.addSpell(spellLibrary.getSpell("Silent Image"));
        wizard.addSpell(spellLibrary.getSpell("Silvery Barbs"));
        wizard.addSpell(spellLibrary.getSpell("Sleep"));
        wizard.addSpell(spellLibrary.getSpell("Snare"));
        wizard.addSpell(spellLibrary.getSpell("Sudden Awakening"));
        wizard.addSpell(spellLibrary.getSpell("Tasha's Caustic Brew"));
        wizard.addSpell(spellLibrary.getSpell("Tasha's Hideous Laughter"));
        wizard.addSpell(spellLibrary.getSpell("Tenser's Floating Disk"));
        wizard.addSpell(spellLibrary.getSpell("Thunderwave"));
        wizard.addSpell(spellLibrary.getSpell("Unseen Servant"));
        wizard.addSpell(spellLibrary.getSpell("Witch Bolt"));
        wizard.addEquipment(equipmentLibrary.getEquipment("Quarterstaff"));
        wizard.addEquipment(equipmentLibrary.getEquipment("Dagger"));
        wizard.addEquipment(equipmentLibrary.getEquipment("Component Pouch"));
        wizard.addEquipment(equipmentLibrary.getEquipment("Arcane Focus"));
        wizard.addEquipment(equipmentLibrary.getEquipment("Scholar's Pack"));
        wizard.addEquipment(equipmentLibrary.getEquipment("Explorer's Pack"));
        wizard.addEquipment(equipmentLibrary.getEquipment("Spellbook"));
        jobLibrary.add(wizard);
    }

    public ArrayList<Job> getJobLibrary() {
        return jobLibrary;
    }

    public Job getJob(String jobName) {
        Job selectedJob = null;
        for (Job job : jobLibrary) {
            if (job.getName().equals(jobName)) {
                selectedJob = job;
                break;
            }
        }
        return selectedJob;
    }

}