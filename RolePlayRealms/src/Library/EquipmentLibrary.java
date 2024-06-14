package Library;

import Objects.Equipment;

import java.util.ArrayList;

public class EquipmentLibrary {
    private ArrayList<Equipment> equipmentLibrary;
    private Equipment selectedEquipment;

    public EquipmentLibrary() {
        equipmentLibrary = new ArrayList<>();

        // Weapons

        Equipment shortSword = new Equipment("Short Sword", "1d6 piercing");
        equipmentLibrary.add(shortSword);

        Equipment rapier = new Equipment("Rapier", "1d8 piercing");
        equipmentLibrary.add(rapier);

        Equipment longsword = new Equipment("Longsword", "1d8 slashing");
        equipmentLibrary.add(longsword);

        Equipment dagger = new Equipment("Dagger", "1d4 piercing");
        equipmentLibrary.add(dagger);

        Equipment mace = new Equipment("Mace", "1d6 bludgeoning");
        equipmentLibrary.add(mace);

        Equipment warhammer = new Equipment("Warhammer", "1d8 bludgeoning");
        equipmentLibrary.add(warhammer);

        Equipment lightCrossbow = new Equipment("Light Crossbow", "1d8 piercing");
        equipmentLibrary.add(lightCrossbow);

        Equipment scimitar = new Equipment("Scimitar", "1d6 slashing");
        equipmentLibrary.add(scimitar);

        Equipment longbow = new Equipment("Longbow", "1d8 piercing");
        equipmentLibrary.add(longbow);

        Equipment handaxe = new Equipment("Handaxe", "1d6 slashing");
        equipmentLibrary.add(handaxe);

        Equipment quarterStaff = new Equipment("Quarterstaff", "1d6 bludgeoning");
        equipmentLibrary.add(quarterStaff);

        Equipment javelin = new Equipment("Javelin", "1d6 piercing");
        equipmentLibrary.add(javelin);

        // Shields

        Equipment shield = new Equipment("Shield", "AC: +2");
        equipmentLibrary.add(shield);

        Equipment woodenShield = new Equipment("WoodenShield", "AC: +2");
        equipmentLibrary.add(woodenShield);

        // Armors

        Equipment leatherArmor = new Equipment("Leather Armor", "AC: 11 + Dex modifier");
        equipmentLibrary.add(leatherArmor);

        Equipment paddedArmor = new Equipment("Padded Armor", "AC: 11 + Dex modifier");
        equipmentLibrary.add(paddedArmor);

        Equipment studdedArmor = new Equipment("Studded Armor", "AC: 12 + Dex Modifier");
        equipmentLibrary.add(studdedArmor);

        Equipment scaleMail = new Equipment("Scale Mail", "AC: 14 + Dex modifier (max 2)");
        equipmentLibrary.add(scaleMail);

        Equipment chainMail = new Equipment("Chain Mail", "AC: 16, Strength: 13");
        equipmentLibrary.add(chainMail);

        // Packs

        Equipment diplomatsPack = new Equipment("Diplomant's Pack", "Chest, 2 cases for maps and scrolls," +
                " a set of fine clothes, a bottle of ink, an ink pen, a lamp, 2 flasks of oil, 5 sheets of paper, a" +
                " vial of perfume, sealing wax, and soap.");
        equipmentLibrary.add(diplomatsPack);

        Equipment entertainersPack = new Equipment("Entertainer's Pack", "Backpack, a bedroll, 2" +
                " costumes, 5 candles, 5 days of rations, a waterskin, and a disguise kit.");
        equipmentLibrary.add(entertainersPack);

        Equipment priestsPack = new Equipment("Priest's Pack", "Backpack, a blanket, 10 candles, a" +
                " tinderbox, an alms box, 2 blocks of incense, a censer, vestments, 2 days of rations, and a waterskin.");
        equipmentLibrary.add(priestsPack);

        Equipment explorersPack = new Equipment("Explorer's Pack", "Backpack, a bedroll, a mess kit, a" +
                " tinderbox, 10 torches, 10 days of rations, and a waterskin. The pack also has 50 feet of hempen rope" +
                " strapped to the side of it.\n");
        equipmentLibrary.add(explorersPack);

        Equipment dungeoneersPack = new Equipment("Dungeoneer's Pack", "Backpack, a crowbar, a hammer," +
                " 10 pitons, 10 torches, a tinderbox, 10 days of rations, and a waterskin. The pack also has 50 feet of" +
                " hempen rope strapped to the side of it.");
        equipmentLibrary.add(dungeoneersPack);

        Equipment burglarsPack = new Equipment("Burglar's Pack", "Backpack, a bag of 1,000 ball bearings," +
                " 10 feet of string, a bell, 5 candles, a crowbar, a hammer, 10 pitons, a hooded lantern, 2 flasks of" +
                " oil, 5 days rations, a tinderbox and a waterskin. The pack also has 50 feet of hempen rope strapped" +
                " to the side of it.");
        equipmentLibrary.add(burglarsPack);

        Equipment scholarsPack = new Equipment("Scholar's Pack", "Backpack, a book of lore, a bottle of" +
                " ink, an ink pen, 10 sheets of parchment, a little bag of sand, and a small knife.");
        equipmentLibrary.add(scholarsPack);

        // Instruments

        Equipment lute = new Equipment("Lute", "");
        equipmentLibrary.add(lute);

        // Ammo

        Equipment bolt = new Equipment("Bolt", "");
        equipmentLibrary.add(bolt);

        Equipment arrow = new Equipment("Arrow", "");
        equipmentLibrary.add(arrow);

        Equipment dart = new Equipment("Dart", "1d4 piercing");
        equipmentLibrary.add(dart);

        // Misc

        Equipment holySymbol = new Equipment("Holy Symbol", "");
        equipmentLibrary.add(holySymbol);

        Equipment druidicFocus = new Equipment("Druidic Focus", "");
        equipmentLibrary.add(druidicFocus);

        Equipment thievesTools = new Equipment("Thieves' Tools", "");
        equipmentLibrary.add(thievesTools);

        Equipment arcaneFocus = new Equipment("Arcane Focus", "");
        equipmentLibrary.add(arcaneFocus);

        Equipment componentPouch = new Equipment("Component Pouch", "");
        equipmentLibrary.add(componentPouch);

        Equipment spellbook = new Equipment("Spellbook", "");
        equipmentLibrary.add(spellbook);

        System.out.println("Equipment Library Completed");

    }

    public ArrayList<Equipment> getEquipmentLibrary() {
        return equipmentLibrary;
    }

    public Equipment getEquipment(String equipmentName) {

        for (Equipment equipment : equipmentLibrary) {
            if (equipment.getName().equals(equipmentName) == true) {
                selectedEquipment = equipment;
            }
        }
        return selectedEquipment;
    }
}
