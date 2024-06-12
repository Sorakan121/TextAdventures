package Objects;

import Library.MainLibrary;
import Library.RaceLibrary;

import java.util.ArrayList;
import java.util.Random;

public class Character {
    private final String name;
    private int currentHealth, maxHealth, initiative;
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;
    private MainLibrary mainLibrary;
    private final Race selectedRace;
    private final Job selectedJob;

    public Character(String name, Race selectedRace, Job selectedJob) {
        this.name = name;
        this.selectedRace = selectedRace;
        this.selectedJob = selectedJob;
    }

    public String getName() {
        return name;
    }

    public void addHealth(int lifeRecovered) {
        this.currentHealth = currentHealth + lifeRecovered;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void takeDamage(int damageTaken) {
        this.currentHealth = currentHealth - damageTaken;
    }

    public void recoverHealth(int recovery) {
        this.currentHealth = currentHealth + recovery;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void generateStats() {
        this.maxHealth = selectedJob.getHitDie() + constitution;
        this.strength = rollStat() + selectedRace.getStrengthBonus();
        this.dexterity = rollStat() + selectedRace.getDexterityBonus();
        this.constitution = rollStat() + selectedRace.getConstitutionBonus();
        this.intelligence = rollStat() + selectedRace.getIntelligenceBonus();
        this.wisdom = rollStat() + selectedRace.getWisdomBonus();
        this.charisma = rollStat() + selectedRace.getCharismaBonus();
    }

    private int rollStat() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int randomInt;
        int lowestValue = Integer.MAX_VALUE;
        int statTotal = 0;
        int i;

        for (i = 0; i < 4; i++) {
            randomInt = random.nextInt(20+1);
            numbers.add(randomInt);
        }

        for (int number : numbers) {
            if (number < lowestValue) {
                lowestValue = number;
            }

            if (number < lowestValue) {
                lowestValue = number;
            }
        }

        for (int number : numbers) {
            statTotal += number;
        }

        statTotal -= lowestValue;

        return statTotal;
    }

    public Race getSelectedRace() {
        return selectedRace;
    }

    public Job getSelectedJob() {
        return selectedJob;
    }

}