package Effects;

import Objects.Job;
import Objects.Spell;

import java.util.ArrayList;

public class Spellcasting extends Effect{
    private int availableCantrips, availableSpells;
    private Job job;

    public Spellcasting(String name, int power, int availableCantrips, int availableSpells, Job job) {
        super(name, power);
        this.availableCantrips = availableCantrips;
        this.availableSpells = availableSpells;
        this.job = job;
    }

    @Override
    public void useEffect() {
        ArrayList<Spell> jobSpells = job.getJobCantrips();
        for(Spell spell : jobSpells) {
            System.out.println(spell.getDescription());
        }
    }

    public int getAvailableCantrips() {
        return availableCantrips;
    }

    public int getAvailableSpells() {
        return availableSpells;
    }

}
