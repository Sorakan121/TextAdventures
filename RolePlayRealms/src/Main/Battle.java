package Main;

import java.util.ArrayList;
import Objects.Character;

public class Battle {
    private ArrayList<Character> targets;

    public Battle() {
        targets = new ArrayList<>();
    }

    public ArrayList<Character> getTargets() {
        return targets;
    }

    public Character getTarget(String target) {
        Character selectedCharacter = null;
        for (Character character : targets) {
            String name = character.getName();
            if(target.equalsIgnoreCase(name)) {
                selectedCharacter = character;
            }
        }

        return selectedCharacter;
    }

}
