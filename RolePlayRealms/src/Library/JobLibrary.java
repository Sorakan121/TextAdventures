package Library;

import Objects.Job;

import java.util.ArrayList;

public class JobLibrary {
    private MainLibrary mainLibrary;
    private TraitLibrary traitLibrary;
    private SpellLibrary spellLibrary;
    private EquipmentLibrary equipmentLibrary;
    private ArrayList<Job> jobLibrary;
    private Job selectedJob;

    public JobLibrary(MainLibrary mainLibrary, EquipmentLibrary equipmentLibrary, TraitLibrary traitLibrary, SpellLibrary spellLibrary) {
        this.mainLibrary = mainLibrary;
        this.traitLibrary = traitLibrary;
        this.spellLibrary = spellLibrary;
        this.equipmentLibrary = equipmentLibrary;
        jobLibrary = new ArrayList<>();

        Job barbarian = new Job("Barbarian", "Masters of primal strength and ferocity, barbarians are" +
                " fierce warriors who eschew traditional combat techniques in favor of raw power and instinct. They hail" +
                " from rugged lands or nomadic tribes, where survival depends on physical prowess and adaptability." +
                " Barbarians tap into their primal rage in battle, becoming nearly unstoppable forces of destruction." +
                " Despite their reputation as savage fighters, many barbarians possess a deep connection to nature and" +
                " a strong sense of honor, defending their kin and their way of life with unwavering determination.\n", 12);
        barbarian.addSkill(this.spellLibrary.getSpell("Rage"));
        barbarian.addTrait(this.traitLibrary.getTrait("Unarmored Defense"));
        barbarian.addEquipment(this.equipmentLibrary.getEquipment("Greataxe"));
        barbarian.addEquipment(this.equipmentLibrary.getEquipment("Handaxe"));
        barbarian.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        barbarian.addEquipment(this.equipmentLibrary.getEquipment("Javelin"));
        jobLibrary.add(barbarian);

        Job bard = new Job("Bard", "Masters of music, magic, and storytelling, bards are charismatic" +
                " performers who wield the power of inspiration to shape the world around them. They often travel from" +
                " place to place, captivating audiences with their tales and music while honing their skills in various" +
                " arts and arcane traditions. Bards possess a versatile array of abilities, from bolstering allies with" +
                " stirring performances to manipulating minds with enchanting melodies. Beyond their entertainment" +
                " prowess, bards are also skilled diplomats, spies, and adventurers, using their wit and charm to" +
                " navigate the complexities of life and leave their mark on history.", 8);
        bard.addTrait(this.traitLibrary.getTrait("Spellcasting"));
        bard.addSkill(this.spellLibrary.getSpell("Bardic Inspiration"));
        bard.addCantrip(this.spellLibrary.getSpell("Blade Ward"));
        bard.addCantrip(this.spellLibrary.getSpell("Dancing Lights"));
        bard.addCantrip(this.spellLibrary.getSpell("Friends"));
        bard.addCantrip(this.spellLibrary.getSpell("Light"));
        bard.addCantrip(this.spellLibrary.getSpell("Mage Hand"));
        bard.addCantrip(this.spellLibrary.getSpell("Mending"));
        bard.addCantrip(this.spellLibrary.getSpell("Message"));
        bard.addCantrip(this.spellLibrary.getSpell("Minor Illusion"));
        bard.addCantrip(this.spellLibrary.getSpell("Prestidigitation"));
        bard.addCantrip(this.spellLibrary.getSpell("Thunderclap"));
        bard.addCantrip(this.spellLibrary.getSpell("True Strike"));
        bard.addCantrip(this.spellLibrary.getSpell("Vicious Mockery"));
        bard.addSpell(this.spellLibrary.getSpell("Animal Friendship"));
        bard.addSpell(this.spellLibrary.getSpell("Bane"));
        bard.addSpell(this.spellLibrary.getSpell("Charm Person"));
        bard.addSpell(this.spellLibrary.getSpell("Color Spray"));
        bard.addSpell(this.spellLibrary.getSpell("Command"));
        bard.addSpell(this.spellLibrary.getSpell("Comprehend Languages"));
        bard.addSpell(this.spellLibrary.getSpell("Cure Wounds"));
        bard.addSpell(this.spellLibrary.getSpell("Detect Magic"));
        bard.addSpell(this.spellLibrary.getSpell("Disguise Self"));
        bard.addSpell(this.spellLibrary.getSpell("Dissonant Whispers"));
        bard.addSpell(this.spellLibrary.getSpell("Distort Value"));
        bard.addSpell(this.spellLibrary.getSpell("Earth Tremor"));
        bard.addSpell(this.spellLibrary.getSpell("Faerie Fire"));
        bard.addSpell(this.spellLibrary.getSpell("Feather Fall"));
        bard.addSpell(this.spellLibrary.getSpell("Guiding Hand"));
        bard.addSpell(this.spellLibrary.getSpell("Healing Word"));
        bard.addSpell(this.spellLibrary.getSpell("Heroism"));
        bard.addSpell(this.spellLibrary.getSpell("Identify"));
        bard.addSpell(this.spellLibrary.getSpell("Illusory Script"));
        bard.addSpell(this.spellLibrary.getSpell("Longstrider"));
        bard.addSpell(this.spellLibrary.getSpell("Puppet"));
        bard.addSpell(this.spellLibrary.getSpell("Sense Emotion"));
        bard.addSpell(this.spellLibrary.getSpell("Silent Image"));
        bard.addSpell(this.spellLibrary.getSpell("Silvery Barbs"));
        bard.addSpell(this.spellLibrary.getSpell("Sleep"));
        bard.addSpell(this.spellLibrary.getSpell("Speak with Animals"));
        bard.addSpell(this.spellLibrary.getSpell("Sudden Awakening"));
        bard.addSpell(this.spellLibrary.getSpell("Tasha's Hideous Laughter"));
        bard.addSpell(this.spellLibrary.getSpell("Thunderwave"));
        bard.addSpell(this.spellLibrary.getSpell("Unearthly Chorus"));
        bard.addSpell(this.spellLibrary.getSpell("Unseen Servant"));
        bard.addEquipment(this.equipmentLibrary.getEquipment("Rapier"));
        bard.addEquipment(this.equipmentLibrary.getEquipment("Longsword"));
        bard.addEquipment(this.equipmentLibrary.getEquipment("Diplomat's Pack"));
        bard.addEquipment(this.equipmentLibrary.getEquipment("Entertainer's Pack"));
        bard.addEquipment(this.equipmentLibrary.getEquipment("Lute"));
        bard.addEquipment(this.equipmentLibrary.getEquipment("Leather Armor"));
        bard.addEquipment(this.equipmentLibrary.getEquipment("Dagger"));
        jobLibrary.add(bard);

        Job cleric = new Job("Cleric", "Devoted servants of divine powers, clerics are conduits of faith" +
                " and wielders of divine magic. They serve gods, pantheons, or higher powers, channeling their divine" +
                " will to heal the wounded, protect the innocent, and smite the wicked. Clerics often belong to organized" +
                " religions, serving as priests, healers, or warriors of their faith. Their spells and abilities are" +
                " imbued with the essence of their deity, granting them the power to turn the tide of battle or bring" +
                " solace to those in need. Despite their devotion, clerics may interpret their divine mandates in" +
                " different ways, leading to a wide range of beliefs, practices, and moral codes among their ranks.", 8);
        cleric.addTrait(this.traitLibrary.getTrait("Spellcasting"));
        cleric.addTrait(this.traitLibrary.getTrait("Divine Domain"));
        cleric.addCantrip(this.spellLibrary.getSpell("Decompose"));
        cleric.addCantrip(this.spellLibrary.getSpell("Guidance"));
        cleric.addCantrip(this.spellLibrary.getSpell("Hand of Radiance"));
        cleric.addCantrip(this.spellLibrary.getSpell("Light"));
        cleric.addCantrip(this.spellLibrary.getSpell("Mending"));
        cleric.addCantrip(this.spellLibrary.getSpell("Resistance"));
        cleric.addCantrip(this.spellLibrary.getSpell("Sacred Flame"));
        cleric.addCantrip(this.spellLibrary.getSpell("Spare the Dying"));
        cleric.addCantrip(this.spellLibrary.getSpell("Thaumaturgy"));
        cleric.addCantrip(this.spellLibrary.getSpell("Toll the Dead"));
        cleric.addCantrip(this.spellLibrary.getSpell("Virtue"));
        cleric.addCantrip(this.spellLibrary.getSpell("Word of Radiance"));
        cleric.addSpell(this.spellLibrary.getSpell("Bane"));
        cleric.addSpell(this.spellLibrary.getSpell("Bless"));
        cleric.addSpell(this.spellLibrary.getSpell("Ceremony"));
        cleric.addSpell(this.spellLibrary.getSpell("Command"));
        cleric.addSpell(this.spellLibrary.getSpell("Create or Destroy Water"));
        cleric.addSpell(this.spellLibrary.getSpell("Cure Wounds"));
        cleric.addSpell(this.spellLibrary.getSpell("Detect Evil and Good"));
        cleric.addSpell(this.spellLibrary.getSpell("Detect Magic"));
        cleric.addSpell(this.spellLibrary.getSpell("Detect Poison and Disease"));
        cleric.addSpell(this.spellLibrary.getSpell("Guiding Bolt"));
        cleric.addSpell(this.spellLibrary.getSpell("Guiding Hand"));
        cleric.addSpell(this.spellLibrary.getSpell("Healing Word"));
        cleric.addSpell(this.spellLibrary.getSpell("Inflict Wounds"));
        cleric.addSpell(this.spellLibrary.getSpell("Protection from Evil and Good"));
        cleric.addSpell(this.spellLibrary.getSpell("Purify Food and Drink"));
        cleric.addSpell(this.spellLibrary.getSpell("Sanctuary"));
        cleric.addSpell(this.spellLibrary.getSpell("Shield of Faith"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Mace"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Warhammer"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Scale Mail"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Leather Armor"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Chain Mail"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Light Crossbow"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Bolt"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Priest's Pack"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Shield"));
        cleric.addEquipment(this.equipmentLibrary.getEquipment("Holy Symbol"));
        jobLibrary.add(cleric);

        Job druid = new Job("Druid", "Guardians of the natural world, druids are mystics who commune" +
                " with the primal forces of nature, wielding its power to protect and preserve the balance of the world." +
                " They are deeply connected to the land, often dwelling in secluded groves or wild places where they" +
                " study the cycles of life and death. Druids can shape-shift into animals, call upon the elements, and" +
                " command the flora and fauna to aid them in their endeavors. While some druids are solitary hermits," +
                " others band together in circles or orders, united by their reverence for nature and their commitment" +
                " to safeguarding the wilderness from exploitation and corruption.", 8);
        druid.addTrait(this.traitLibrary.getTrait("Druidic"));
        druid.addTrait(this.traitLibrary.getTrait("Spellcasting"));
        druid.addCantrip(this.spellLibrary.getSpell("Control Flames"));
        druid.addCantrip(this.spellLibrary.getSpell("Create Bonfire"));
        druid.addCantrip(this.spellLibrary.getSpell("Druidcraft"));
        druid.addCantrip(this.spellLibrary.getSpell("Frostbite"));
        druid.addCantrip(this.spellLibrary.getSpell("Guidance"));
        druid.addCantrip(this.spellLibrary.getSpell("Gust"));
        druid.addCantrip(this.spellLibrary.getSpell("Infestation"));
        druid.addCantrip(this.spellLibrary.getSpell("Magic Stone"));
        druid.addCantrip(this.spellLibrary.getSpell("Mending"));
        druid.addCantrip(this.spellLibrary.getSpell("Mold Earth"));
        druid.addCantrip(this.spellLibrary.getSpell("Poison Spray"));
        druid.addCantrip(this.spellLibrary.getSpell("Primal Savagery"));
        druid.addCantrip(this.spellLibrary.getSpell("Produce Flame"));
        druid.addCantrip(this.spellLibrary.getSpell("Resistance"));
        druid.addCantrip(this.spellLibrary.getSpell("Shape Water"));
        druid.addCantrip(this.spellLibrary.getSpell("Shillelagh"));
        druid.addCantrip(this.spellLibrary.getSpell("Thorn Whip"));
        druid.addCantrip(this.spellLibrary.getSpell("Thunderclap"));
        druid.addSpell(this.spellLibrary.getSpell("Absorb Elements"));
        druid.addSpell(this.spellLibrary.getSpell("Animal Friendship"));
        druid.addSpell(this.spellLibrary.getSpell("Beast Bond"));
        druid.addSpell(this.spellLibrary.getSpell("Charm Person"));
        druid.addSpell(this.spellLibrary.getSpell("Create or Destroy Water"));
        druid.addSpell(this.spellLibrary.getSpell("Cure Wounds"));
        druid.addSpell(this.spellLibrary.getSpell("Detect Magic"));
        druid.addSpell(this.spellLibrary.getSpell("Detect Poison and Disease"));
        druid.addSpell(this.spellLibrary.getSpell("Earth Tremor"));
        druid.addSpell(this.spellLibrary.getSpell("Entangle"));
        druid.addSpell(this.spellLibrary.getSpell("Faerie Fire"));
        druid.addSpell(this.spellLibrary.getSpell("Fog Cloud"));
        druid.addSpell(this.spellLibrary.getSpell("Goodberry"));
        druid.addSpell(this.spellLibrary.getSpell("Guiding Hand"));
        druid.addSpell(this.spellLibrary.getSpell("Healing Word"));
        druid.addSpell(this.spellLibrary.getSpell("Ice Knife"));
        druid.addSpell(this.spellLibrary.getSpell("Jump"));
        druid.addSpell(this.spellLibrary.getSpell("Longstrider"));
        druid.addSpell(this.spellLibrary.getSpell("Protection from Evil and Good"));
        druid.addSpell(this.spellLibrary.getSpell("Purify Food and Drink"));
        druid.addSpell(this.spellLibrary.getSpell("Snare"));
        druid.addSpell(this.spellLibrary.getSpell("Speak with Animals"));
        druid.addSpell(this.spellLibrary.getSpell("Thunderwave"));
        druid.addSpell(this.spellLibrary.getSpell("Wild Cunning"));
        druid.addEquipment(this.equipmentLibrary.getEquipment("Wooden Shield"));
        druid.addEquipment(this.equipmentLibrary.getEquipment("Scimitar"));
        druid.addEquipment(this.equipmentLibrary.getEquipment("Leather Armor"));
        druid.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        druid.addEquipment(this.equipmentLibrary.getEquipment("Druidic Focus"));
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
        fighter.addTrait(this.traitLibrary.getTrait("Fighting Style"));
        fighter.addSkill(this.spellLibrary.getSpell("SecondWind"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Chain Mail"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Leather Armor"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Longbow"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Arrow"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Shield"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Light Crossbow"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("bolt"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Handaxe"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        fighter.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
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
        monk.addTrait(this.traitLibrary.getTrait("Unarmored Defense"));
        monk.addTrait(this.traitLibrary.getTrait("Martial Arts"));
        monk.addEquipment(this.equipmentLibrary.getEquipment("Shortsword"));
        monk.addEquipment(this.equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        monk.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        monk.addEquipment(this.equipmentLibrary.getEquipment("Dart"));
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
        paladin.addSkill(this.spellLibrary.getSpell("Divine Sense"));
        paladin.addSkill(this.spellLibrary.getSpell("Lay on Hands"));
        paladin.addEquipment(this.equipmentLibrary.getEquipment("Shield"));
        paladin.addEquipment(this.equipmentLibrary.getEquipment("Javelin"));
        paladin.addEquipment(this.equipmentLibrary.getEquipment("Priest's Pack"));
        paladin.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        paladin.addEquipment(this.equipmentLibrary.getEquipment("Chain Mail"));
        paladin.addEquipment(this.equipmentLibrary.getEquipment("Holy Symbol"));
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
        ranger.addTrait(this.traitLibrary.getTrait("Favored Enemy"));
        ranger.addTrait(this.traitLibrary.getTrait("Natural Explorer"));
        ranger.addEquipment(this.equipmentLibrary.getEquipment("Scale Mail"));
        ranger.addEquipment(this.equipmentLibrary.getEquipment("Leather Armor"));
        ranger.addEquipment(this.equipmentLibrary.getEquipment("Shortsword"));
        ranger.addEquipment(this.equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        ranger.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        ranger.addEquipment(this.equipmentLibrary.getEquipment("Longbow"));
        ranger.addEquipment(this.equipmentLibrary.getEquipment("Arrow"));
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
        rogue.addTrait(this.traitLibrary.getTrait("Expertise"));
        rogue.addTrait(this.traitLibrary.getTrait("Thieves' Cant"));
        rogue.addSkill(this.spellLibrary.getSpell("Sneak Attack"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Rapier"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Shortsword"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Shortbow"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Arrow"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Burglar's Pack"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Leather Armor"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Dagger"));
        rogue.addEquipment(this.equipmentLibrary.getEquipment("Thieves' Tools"));
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
        sorcerer.addTrait(this.traitLibrary.getTrait("Spellcasting"));
        sorcerer.addTrait(this.traitLibrary.getTrait("Sorcerous Origin"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Acid Splash"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Blade Ward"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Booming Blade"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Chill Touch"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Control Flames"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Create Bonfire"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Dancing Lights"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Fire Bolt"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Friends"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Frostbite"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Green-Flame Blade"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Gust"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Infestation"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Light"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Lightning Lure"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Mage Hand"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Mending"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Message"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Mind Sliver"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Minor Illusion"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Mold Earth"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("On/Off"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Poison Spray"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Prestidigitation"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Ray of Frost"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Shape Water"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Shocking Grasp"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Sword Burst"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("Thunderclap"));
        sorcerer.addCantrip(this.spellLibrary.getSpell("True Strike"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Absorb Elements"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Acid Stream"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Burning Hands"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Catapult"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Chaos Bolt"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Charm Person"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Chromatic Orb"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Color Spray"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Comprehend Languages"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Detect Magic"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Disguise Self"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Distort Value"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Earth Tremor"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Expeditious Retreat"));
        sorcerer.addSpell(this.spellLibrary.getSpell("False Life"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Feather Fall"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Fog Cloud"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Grease"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Ice Knife"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Id Insulation"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Infallible Relay"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Jump"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Mage Armor"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Magic Missle"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Ray of Sickness"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Remote Access"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Shield"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Silent Image"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Silvery Barbs"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Sleep"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Sudden Awakening"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Tasha's Caustic Brew"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Thunderwave"));
        sorcerer.addSpell(this.spellLibrary.getSpell("Witch Bolt"));
        sorcerer.addEquipment(this.equipmentLibrary.getEquipment("Light Crossbow"));
        sorcerer.addEquipment(this.equipmentLibrary.getEquipment("Bolt"));
        sorcerer.addEquipment(this.equipmentLibrary.getEquipment("Component Pouch"));
        sorcerer.addEquipment(this.equipmentLibrary.getEquipment("Arcane Focus"));
        sorcerer.addEquipment(this.equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        sorcerer.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        sorcerer.addEquipment(this.equipmentLibrary.getEquipment("Dagger"));
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
        warlock.addTrait(this.traitLibrary.getTrait("Otherworldly Patron"));
        warlock.addTrait(this.traitLibrary.getTrait("Pact Magic"));
        warlock.addCantrip(this.spellLibrary.getSpell("Blade Ward"));
        warlock.addCantrip(this.spellLibrary.getSpell("Booming Blade"));
        warlock.addCantrip(this.spellLibrary.getSpell("Chill Touch"));
        warlock.addCantrip(this.spellLibrary.getSpell("Create Bonfire"));
        warlock.addCantrip(this.spellLibrary.getSpell("Eldritch Blast"));
        warlock.addCantrip(this.spellLibrary.getSpell("Friends"));
        warlock.addCantrip(this.spellLibrary.getSpell("Frostbite"));
        warlock.addCantrip(this.spellLibrary.getSpell("Green-Flame Blade"));
        warlock.addCantrip(this.spellLibrary.getSpell("Infestation"));
        warlock.addCantrip(this.spellLibrary.getSpell("Lightning Lure"));
        warlock.addCantrip(this.spellLibrary.getSpell("Mage Hand"));
        warlock.addCantrip(this.spellLibrary.getSpell("Magic Stone"));
        warlock.addCantrip(this.spellLibrary.getSpell("Mind Sliver"));
        warlock.addCantrip(this.spellLibrary.getSpell("Minor Illusion"));
        warlock.addCantrip(this.spellLibrary.getSpell("On/Off"));
        warlock.addCantrip(this.spellLibrary.getSpell("Poison Spray"));
        warlock.addCantrip(this.spellLibrary.getSpell("Prestidigitation"));
        warlock.addCantrip(this.spellLibrary.getSpell("Sword Burst"));
        warlock.addCantrip(this.spellLibrary.getSpell("Thunderclap"));
        warlock.addCantrip(this.spellLibrary.getSpell("Toll the Dead"));
        warlock.addCantrip(this.spellLibrary.getSpell("True Strike"));
        warlock.addSpell(this.spellLibrary.getSpell("Armor of Agathys"));
        warlock.addSpell(this.spellLibrary.getSpell("Arms of Hadar"));
        warlock.addSpell(this.spellLibrary.getSpell("Cause Fear"));
        warlock.addSpell(this.spellLibrary.getSpell("Charm Person"));
        warlock.addSpell(this.spellLibrary.getSpell("Comprehend Languages"));
        warlock.addSpell(this.spellLibrary.getSpell("Distort Value"));
        warlock.addSpell(this.spellLibrary.getSpell("Expeditious Retreat"));
        warlock.addSpell(this.spellLibrary.getSpell("Healing Elixir"));
        warlock.addSpell(this.spellLibrary.getSpell("Hellish Rebuke"));
        warlock.addSpell(this.spellLibrary.getSpell("Hex"));
        warlock.addSpell(this.spellLibrary.getSpell("Id Insinuation"));
        warlock.addSpell(this.spellLibrary.getSpell("Illusory Script"));
        warlock.addSpell(this.spellLibrary.getSpell("Infallible Relay"));
        warlock.addSpell(this.spellLibrary.getSpell("Protection from Evil and Good"));
        warlock.addSpell(this.spellLibrary.getSpell("Puppet"));
        warlock.addSpell(this.spellLibrary.getSpell("Remote Access"));
        warlock.addSpell(this.spellLibrary.getSpell("Sense Emotion"));
        warlock.addSpell(this.spellLibrary.getSpell("Unseen Servant"));
        warlock.addSpell(this.spellLibrary.getSpell("Witch Bolt"));
        warlock.addEquipment(this.equipmentLibrary.getEquipment("Light Crossbow"));
        warlock.addEquipment(this.equipmentLibrary.getEquipment("Bolt"));
        warlock.addEquipment(this.equipmentLibrary.getEquipment("Component Pouch"));
        warlock.addEquipment(this.equipmentLibrary.getEquipment("Arcane Focus"));
        warlock.addEquipment(this.equipmentLibrary.getEquipment("Scholar's Pack"));
        warlock.addEquipment(this.equipmentLibrary.getEquipment("Dungeoneer's Pack"));
        warlock.addEquipment(this.equipmentLibrary.getEquipment("Leather Armor"));
        warlock.addEquipment(this.equipmentLibrary.getEquipment("Dagger"));
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
        wizard.addTrait(this.traitLibrary.getTrait("Spellcasting"));
        wizard.addSkill(this.spellLibrary.getSpell("Arcane Recovery"));
        wizard.addCantrip(this.spellLibrary.getSpell("Acid Splash"));
        wizard.addCantrip(this.spellLibrary.getSpell("Blade Ward"));
        wizard.addCantrip(this.spellLibrary.getSpell("Booming Blade"));
        wizard.addCantrip(this.spellLibrary.getSpell("Chill Touch"));
        wizard.addCantrip(this.spellLibrary.getSpell("Control Flames"));
        wizard.addCantrip(this.spellLibrary.getSpell("Create Bonfire"));
        wizard.addCantrip(this.spellLibrary.getSpell("Dancing Lights"));
        wizard.addCantrip(this.spellLibrary.getSpell("Encode Thoughts"));
        wizard.addCantrip(this.spellLibrary.getSpell("Fire Bolt"));
        wizard.addCantrip(this.spellLibrary.getSpell("Friends"));
        wizard.addCantrip(this.spellLibrary.getSpell("Frostbite"));
        wizard.addCantrip(this.spellLibrary.getSpell("Green-Flame Blade"));
        wizard.addCantrip(this.spellLibrary.getSpell("Gust"));
        wizard.addCantrip(this.spellLibrary.getSpell("Infestation"));
        wizard.addCantrip(this.spellLibrary.getSpell("Light"));
        wizard.addCantrip(this.spellLibrary.getSpell("Lightning Lure"));
        wizard.addCantrip(this.spellLibrary.getSpell("Mage Hand"));
        wizard.addCantrip(this.spellLibrary.getSpell("Mending"));
        wizard.addCantrip(this.spellLibrary.getSpell("Message"));
        wizard.addCantrip(this.spellLibrary.getSpell("Mind Sliver"));
        wizard.addCantrip(this.spellLibrary.getSpell("Minor Illusion"));
        wizard.addCantrip(this.spellLibrary.getSpell("Mold Earth"));
        wizard.addCantrip(this.spellLibrary.getSpell("On/Off"));
        wizard.addCantrip(this.spellLibrary.getSpell("Poison Spray"));
        wizard.addCantrip(this.spellLibrary.getSpell("Prestidigitation"));
        wizard.addCantrip(this.spellLibrary.getSpell("Ray of Frost"));
        wizard.addCantrip(this.spellLibrary.getSpell("Sapping Sting"));
        wizard.addCantrip(this.spellLibrary.getSpell("Shape Water"));
        wizard.addCantrip(this.spellLibrary.getSpell("Shocking Grasp"));
        wizard.addCantrip(this.spellLibrary.getSpell("Sword Burst"));
        wizard.addCantrip(this.spellLibrary.getSpell("Thunderclap"));
        wizard.addCantrip(this.spellLibrary.getSpell("Toll the Dead"));
        wizard.addCantrip(this.spellLibrary.getSpell("True Strike"));
        wizard.addSpell(this.spellLibrary.getSpell("Absorb Elements"));
        wizard.addSpell(this.spellLibrary.getSpell("Acid Stream"));
        wizard.addSpell(this.spellLibrary.getSpell("Alarm"));
        wizard.addSpell(this.spellLibrary.getSpell("Burning Hands"));
        wizard.addSpell(this.spellLibrary.getSpell("Catapult"));
        wizard.addSpell(this.spellLibrary.getSpell("Cause Fear"));
        wizard.addSpell(this.spellLibrary.getSpell("Charm Person"));
        wizard.addSpell(this.spellLibrary.getSpell("Chromatic Orb"));
        wizard.addSpell(this.spellLibrary.getSpell("Color Spray"));
        wizard.addSpell(this.spellLibrary.getSpell("Comprehend Languages"));
        wizard.addSpell(this.spellLibrary.getSpell("Detect Magic"));
        wizard.addSpell(this.spellLibrary.getSpell("Disguise Self"));
        wizard.addSpell(this.spellLibrary.getSpell("Distort Value"));
        wizard.addSpell(this.spellLibrary.getSpell("Earth Tremor"));
        wizard.addSpell(this.spellLibrary.getSpell("Expeditious Retreat"));
        wizard.addSpell(this.spellLibrary.getSpell("False Life"));
        wizard.addSpell(this.spellLibrary.getSpell("Feather Fall"));
        wizard.addSpell(this.spellLibrary.getSpell("Find Familiar"));
        wizard.addSpell(this.spellLibrary.getSpell("Fog Cloud"));
        wizard.addSpell(this.spellLibrary.getSpell("Frost Fingers"));
        wizard.addSpell(this.spellLibrary.getSpell("Gift of Alacrity"));
        wizard.addSpell(this.spellLibrary.getSpell("Grease"));
        wizard.addSpell(this.spellLibrary.getSpell("Guiding Hand"));
        wizard.addSpell(this.spellLibrary.getSpell("Healing Elixir"));
        wizard.addSpell(this.spellLibrary.getSpell("Ice Knife"));
        wizard.addSpell(this.spellLibrary.getSpell("Id Insinuation"));
        wizard.addSpell(this.spellLibrary.getSpell("Identify"));
        wizard.addSpell(this.spellLibrary.getSpell("Illusory Script"));
        wizard.addSpell(this.spellLibrary.getSpell("Infallible Relay"));
        wizard.addSpell(this.spellLibrary.getSpell("Jim's Magic Missle"));
        wizard.addSpell(this.spellLibrary.getSpell("Jump"));
        wizard.addSpell(this.spellLibrary.getSpell("Longstrider"));
        wizard.addSpell(this.spellLibrary.getSpell("Mage Armor"));
        wizard.addSpell(this.spellLibrary.getSpell("Magic Missile"));
        wizard.addSpell(this.spellLibrary.getSpell("Magnify Grafity"));
        wizard.addSpell(this.spellLibrary.getSpell("Protection from Evil and Good"));
        wizard.addSpell(this.spellLibrary.getSpell("Puppet"));
        wizard.addSpell(this.spellLibrary.getSpell("Ray of Sickness"));
        wizard.addSpell(this.spellLibrary.getSpell("Remote Access"));
        wizard.addSpell(this.spellLibrary.getSpell("Sense Emotion"));
        wizard.addSpell(this.spellLibrary.getSpell("Shield"));
        wizard.addSpell(this.spellLibrary.getSpell("Silent Image"));
        wizard.addSpell(this.spellLibrary.getSpell("Silvery Barbs"));
        wizard.addSpell(this.spellLibrary.getSpell("Sleep"));
        wizard.addSpell(this.spellLibrary.getSpell("Snare"));
        wizard.addSpell(this.spellLibrary.getSpell("Sudden Awakening"));
        wizard.addSpell(this.spellLibrary.getSpell("Tasha's Caustic Brew"));
        wizard.addSpell(this.spellLibrary.getSpell("Tasha's Hideous Laughter"));
        wizard.addSpell(this.spellLibrary.getSpell("Tenser's Floating Disk"));
        wizard.addSpell(this.spellLibrary.getSpell("Thunderwave"));
        wizard.addSpell(this.spellLibrary.getSpell("Unseen Servant"));
        wizard.addSpell(this.spellLibrary.getSpell("Witch Bolt"));
        wizard.addEquipment(this.equipmentLibrary.getEquipment("Quarterstaff"));
        wizard.addEquipment(this.equipmentLibrary.getEquipment("Dagger"));
        wizard.addEquipment(this.equipmentLibrary.getEquipment("Component Pouch"));
        wizard.addEquipment(this.equipmentLibrary.getEquipment("Arcane Focus"));
        wizard.addEquipment(this.equipmentLibrary.getEquipment("Scholar's Pack"));
        wizard.addEquipment(this.equipmentLibrary.getEquipment("Explorer's Pack"));
        wizard.addEquipment(this.equipmentLibrary.getEquipment("Spellbook"));
        jobLibrary.add(wizard);

        System.out.println("Job Library Completed");
    }

    public ArrayList<Job> getJobLibrary() {
        return jobLibrary;
    }

    public Job getJob(String jobName) {

        for (Job job : jobLibrary) {
            if (job.getName().equals(jobName.trim())) {
                selectedJob = job;
                break;
            }
        }
        return selectedJob;
    }

}