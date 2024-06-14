package Library;

import Main.Battle;
import Main.ClientHandler;

public class MainLibrary {
    private CommandLibrary commandLibrary;
    private RaceLibrary raceLibrary;
    private JobLibrary jobLibrary;
    private SpellLibrary spellLibrary;
    private TraitLibrary traitLibrary;
    private EquipmentLibrary equipmentLibrary;

    public MainLibrary(ClientHandler clientHandler) {
        Battle battle = new Battle();
        this.equipmentLibrary = new EquipmentLibrary();
        this.traitLibrary = new TraitLibrary(this, battle);
        this.spellLibrary = new SpellLibrary(this, battle);
        this.raceLibrary = new RaceLibrary(this, traitLibrary, spellLibrary);
        this.jobLibrary = new JobLibrary(this, equipmentLibrary, traitLibrary, spellLibrary);
        this.commandLibrary = new CommandLibrary(this, battle, equipmentLibrary, traitLibrary, spellLibrary,
                raceLibrary, jobLibrary);
    }

    public CommandLibrary getCommandLibrary() {
        return commandLibrary;
    }

    public RaceLibrary getRaceLibrary() {
        return raceLibrary;
    }

    public SpellLibrary getSpellLibrary() {
        return spellLibrary;
    }

    public JobLibrary getJobLibrary() {
        return jobLibrary;
    }

    public TraitLibrary getTraitLibrary() {
        return traitLibrary;
    }

    public EquipmentLibrary getEquipmentLibrary() {
        return equipmentLibrary;
    }
}
