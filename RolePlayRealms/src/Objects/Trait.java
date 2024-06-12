package Objects;

import Effects.Effect;
import Library.CommandLibrary;
import Library.MainLibrary;

import java.util.ArrayList;

public class Trait {
    private ArrayList<Effect> effects;
    private String name, description;
    private MainLibrary mainLibrary;
    private CommandLibrary commandLibrary;

    public Trait(String name, String description, MainLibrary mainLibrary) {
        effects = new ArrayList<>();
        this.name = name;
        this.description = description;
        commandLibrary = mainLibrary.getCommandLibrary();
    }

    public ArrayList<Effect> getEffects() {
        return effects;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}