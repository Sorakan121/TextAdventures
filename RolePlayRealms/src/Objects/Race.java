package Objects;


import java.util.ArrayList;

public class Race {
    private String name, description;
    private ArrayList<Trait> traits = new ArrayList<>();
    private int strengthBonus, dexterityBonus, constitutionBonus, intelligenceBonus, wisdomBonus, charismaBonus, speed;

    public Race(String name,String description, int strengthBonus, int dexterityBonus, int constitutionBonus,
                int intelligenceBonus, int wisdomBonus, int charismaBonus, int speed) {
        this.name = name;
        this.description = description;
        this.strengthBonus = strengthBonus;
        this.dexterityBonus = dexterityBonus;
        this.constitutionBonus = constitutionBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.wisdomBonus = wisdomBonus;
        this.charismaBonus = charismaBonus;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public int getDexterityBonus() {
        return dexterityBonus;
    }

    public int getConstitutionBonus() {
        return constitutionBonus;
    }

    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public int getWisdomBonus() {
        return wisdomBonus;
    }

    public int getCharismaBonus() {
        return charismaBonus;
    }

    public String getDescription() {
        return description;
    }

    public void addTrait(Trait trait) {
        traits.add(trait);
    }
}