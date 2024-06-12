package Objects;

import Objects.Spell;

import java.util.ArrayList;
import java.util.Random;

public class Job {
    private String name, description;
    private int hitDie;
    private ArrayList<Spell> jobSpells;
    private ArrayList<Spell> jobCantrips;
    private ArrayList<Spell> jobSkills;
    private ArrayList<Trait> jobTraits;
    private ArrayList<Equipment> availableEquipment;
    //I need to implement something for storing saving throws data

    public Job(String name, String description, int hitDie) {
        jobSpells = new ArrayList<>();
        jobCantrips = new ArrayList<>();
        jobSkills = new ArrayList<>();
        jobTraits = new ArrayList<>();
        availableEquipment = new ArrayList<>();

        this.name = name;
        this.description = description;
        this.hitDie = hitDie;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addSpell(Spell spell) {
        jobSpells.add(spell);
    }

    public void addCantrip(Spell spell) {
        jobCantrips.add(spell);
    }

    public void addSkill(Spell spell) {
        jobSkills.add(spell);
    }

    public void addTrait(Trait trait) {
        jobTraits.add(trait);
    }

    public void addEquipment(Equipment equipment) {
        availableEquipment.add(equipment);
    }

    public int getHitDie() {
        return hitDie;
    }

    public ArrayList<Spell> getJobCantrips() {
        return jobCantrips;
    }

    public ArrayList<Spell> getJobSpells() {
        return jobSpells;
    }

    public ArrayList<Trait> getJobTraits() {
        return jobTraits;
    }

}
