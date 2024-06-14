package Library;

import Objects.Race;

import java.util.ArrayList;

public class RaceLibrary {
    private MainLibrary mainLibrary;
    private ArrayList<Race> raceLibrary;
    private TraitLibrary traitLibrary;
    private SpellLibrary spellLibrary;
    private Race selectedRace;

    public RaceLibrary(MainLibrary mainLibrary, TraitLibrary traitLibrary, SpellLibrary spellLibrary) {
        this.mainLibrary = mainLibrary;
        this.traitLibrary = traitLibrary;
        this.spellLibrary = spellLibrary;
        raceLibrary = new ArrayList<>();

        Race dwarf = new Race("Dwarf", "Stout and sturdy, dwarves are master craftsmen known for their" +
                " skill in mining and metalwork. They typically reside in mountain strongholds and are characterized by " +
                "their short stature, long beards, and fierce loyalty to their clans. Resilient and enduring, dwarves" +
                " are formidable warriors with a deep respect for tradition and history.",
                0, 2, 0, 0, 0, 0, 0);
        raceLibrary.add(dwarf);
        dwarf.addTrait(this.traitLibrary.getTrait("Constitution Increase"));
        dwarf.addTrait(this.traitLibrary.getTrait("Dark Vision"));
        dwarf.addTrait(this.traitLibrary.getTrait("Dwarven Resilience"));
        dwarf.addTrait(this.traitLibrary.getTrait("Stone Cutting"));

        Race hillDwarf = new Race("Hill Dwarf", "A subset of dwarves, hill dwarves are known for their" +
                " exceptional toughness and keen senses. They live in rolling hills and underground fortresses," +
                " excelling in craftsmanship and metalwork. Distinguished by their resilience and wisdom, hill dwarves" +
                " are highly respected for their deep connection to the land and their rich cultural heritage.\n"
                , 0, 2, 0, 0, 1, 0, 0);
        raceLibrary.add(hillDwarf);
        hillDwarf.addTrait(this.traitLibrary.getTrait("Constitution Increase"));
        hillDwarf.addTrait(this.traitLibrary.getTrait("Dark Vision"));
        hillDwarf.addTrait(this.traitLibrary.getTrait("Dwarven Resilience"));
        hillDwarf.addTrait(this.traitLibrary.getTrait("Stone Cutting"));
        hillDwarf.addTrait(this.traitLibrary.getTrait("Wisdom Increase"));
        hillDwarf.addTrait(this.traitLibrary.getTrait("Dwarven Toughness"));

        Race elf = new Race("Elf", "Graceful and immortal, elves are renowned for their beauty, agility," +
                " and mastery of magic. They typically inhabit ancient forests or ethereal realms, living in harmony" +
                " with nature. With keen senses and a profound appreciation for art and music, elves are skilled archers" +
                " and spellcasters, embodying elegance and wisdom.",
                0, 2, 0, 0, 0, 0, 0);
        raceLibrary.add(elf);
        elf.addTrait(this.traitLibrary.getTrait("Dexterity Increase"));
        elf.addTrait(this.traitLibrary.getTrait("Dark Vision"));
        elf.addTrait(this.traitLibrary.getTrait("Keen Senses"));
        elf.addTrait(this.traitLibrary.getTrait("Fey Ancestry"));
        elf.addTrait(this.traitLibrary.getTrait("Trance"));

        Race highElf = new Race("High Elf", "A distinguished subgroup of elves, high elves are noted for" +
                " their exceptional intelligence, mastery of magic, and regal bearing. They often dwell in splendid" +
                " cities or mystical realms, valuing knowledge, art, and refinement. High elves are tall, fair, and" +
                " exude an aura of grace and superiority, often acting as leaders and scholars within elven society.",
                0, 2, 0, 1, 0, 0, 0);
        raceLibrary.add(highElf);
        highElf.addTrait(this.traitLibrary.getTrait("Dexterity Increase"));
        highElf.addTrait(this.traitLibrary.getTrait("Dark Vision"));
        highElf.addTrait(this.traitLibrary.getTrait("Keen Senses"));
        highElf.addTrait(this.traitLibrary.getTrait("Fey Ancestry"));
        highElf.addTrait(this.traitLibrary.getTrait("Trance"));
        highElf.addTrait(this.traitLibrary.getTrait("Intelligence Increase"));
        highElf.addTrait(this.traitLibrary.getTrait("Cantrip"));

        Race halfling = new Race("Halfling", "Small and nimble, halflings are known for their cheerful" +
                " dispositions, resourcefulness, and love of comfort. They typically live in pastoral communities," +
                " enjoying simple pleasures like good food, good company, and peace. Despite their unassuming appearance," +
                " halflings are brave and quick-witted, often surprising others with their daring and ingenuity in times of need.",
                0, 2, 0, 0, 0, 0, 0);
        raceLibrary.add(halfling);
        halfling.addTrait(this.traitLibrary.getTrait("Dexterity Increase"));
        halfling.addTrait(this.traitLibrary.getTrait("Lucky"));
        halfling.addTrait(this.traitLibrary.getTrait("Brave"));
        halfling.addTrait(this.traitLibrary.getTrait("Halfling Nimbleness"));

        Race lightFootHalfling = new Race("Lightfoot Halfling", "A subrace of halflings, Lightfoot Halflings are known for" +
                " their exceptional stealth, agility, and luck. They are naturally inclined to move quietly and blend" +
                " into their surroundings, making them excellent scouts and thieves. Lightfoot Halflings are sociable" +
                " and adaptable, often found traveling in caravans or mingling with other races. They possess a carefree" +
                " and curious nature, enjoying the simple pleasures of life while easily making friends wherever they" +
                " go. Despite their unassuming appearance, they are brave and resourceful, able to turn the tide of" +
                " fortune in their favor with a combination of quick thinking and good luck.",
                0, 2, 0, 0, 0, 0, 0);
        raceLibrary.add(lightFootHalfling);
        lightFootHalfling.addTrait(this.traitLibrary.getTrait("Dexterity Increase"));
        lightFootHalfling.addTrait(this.traitLibrary.getTrait("Lucky"));
        lightFootHalfling.addTrait(this.traitLibrary.getTrait("Brave"));
        lightFootHalfling.addTrait(this.traitLibrary.getTrait("Halfling Nimbleness"));
        lightFootHalfling.addTrait(this.traitLibrary.getTrait("Charisma Increase"));
        lightFootHalfling.addTrait(this.traitLibrary.getTrait("Naturally Stealthy"));

        Race human = new Race("Human", "Versatile and ambitious, humans are known for their adaptability" +
                " and drive. They inhabit diverse environments and societies, excelling in a wide range of professions" +
                " from farming to wizardry. With relatively short lifespans compared to other races, humans are often" +
                " motivated to achieve greatness quickly, leading to their significant influence in politics, culture, and innovation.",
                1,1,1,1,1,0, 0);
        raceLibrary.add(human);
        human.addTrait(this.traitLibrary.getTrait("Ability Score Increase"));

        /*
        Race dragonborn = new Race("Dragonborn", "Proud and powerful, dragonborn are draconic humanoids" +
                " with a strong sense of honor and clan loyalty. They possess dragon-like features, including scales," +
                " claws, and the ability to breathe elemental energy. Dragonborn are often driven by a desire to prove" +
                " themselves and bring glory to their kin, showcasing their innate strength, bravery, and determination" +
                " in both combat and leadership.",
                2, 0, 0, 0, 0, 1, 0);
        raceLibrary.add(dragonborn);

        Race gnome = new Race("Gnome", "Small in stature but big in intellect, gnomes are known for" +
                " their boundless curiosity, inventiveness, and whimsical nature. They often dwell in burrows, hidden" +
                " villages, or bustling cities, where they pursue their interests in tinkering, alchemy, and illusion" +
                " magic. Gnomes have a mischievous streak and a penchant for pranks, but they are also fiercely loyal" +
                " friends and allies, using their cleverness and quick thinking to overcome challenges.",
                0, 0, 0, 2, 0, 0, 0);
        raceLibrary.add(gnome);

        Race halfElf = new Race("Half-Elf", "Straddling two worlds, half-elves embody the grace of elves" +
                " and the versatility of humans. They often find themselves torn between their elven heritage's love of" +
                " nature and beauty and their human lineage's ambition and drive. Gifted with keen senses and" +
                " adaptability, half-elves navigate social circles with ease, excelling in diplomacy, exploration, and" +
                " the arts. Though they may face challenges fitting into either society, their unique perspective often" +
                " allows them to bridge divides and forge connections between different races and cultures.",
                0, 1, 0, 0, 1, 2, 0);
        raceLibrary.add(halfElf);

        Race halfOrc = new Race("Half-Orc", "Born of both human and orc ancestry, half-orcs possess" +
                " formidable strength and resilience, tempered by a complex identity shaped by both cultures. Often" +
                " shunned or misunderstood, they face prejudice due to their orcish heritage, yet their human blood" +
                " grants them intelligence and adaptability. Half-orcs frequently find themselves drawn to paths of" +
                " conflict, either as warriors seeking to prove themselves or as outcasts seeking acceptance. Despite" +
                " their rough exterior, many possess a strong sense of loyalty and honor, forging deep bonds with those" +
                " who see beyond their appearance.",
                2, 0, 1, 0, 0, 0, 0);
        raceLibrary.add(halfOrc);
         */

        System.out.println("Race Library Completed");
    }

    public ArrayList<Race> getRaceLibrary() {
        return raceLibrary;
    }

    public Race getRace(String raceName) {

        for (Race race : raceLibrary) {
            if (race.getName().equals(raceName)) {
                selectedRace = race;
                break;
            }
        }
        return selectedRace;
    }

}
