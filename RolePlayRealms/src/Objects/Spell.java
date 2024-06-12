package Objects;

import Effects.Effect;
import Effects.Usable;
import Library.CommandLibrary;
import Library.MainLibrary;
import Main.ClientHandler;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Spell implements Usable {
    private String name, description;
    private ArrayList<Effect> effects;
    private MainLibrary mainLibrary;
    private CommandLibrary commandLibrary;
    private ClientHandler clientHandler;

    public Spell(String name, String description, MainLibrary mainLibrary) {
        this.mainLibrary = mainLibrary;
        commandLibrary = mainLibrary.getCommandLibrary();
        effects = new ArrayList<>();

        this.name = name;
        this.description = description;
    }

    @Override
    public void useEffect() {
        for (Effect effect : effects) {
            effect.useEffect();
        }
    }

    public String getName() {
        return name;
    }

    public void setSource(Character source, ClientHandler clientHandler) {
        for (Effect effect : effects) {
            effect.setSource(source, clientHandler);
        }
    }

    public void setTarget(Character target, ClientHandler clientHandler) {
        Scanner scanner = new Scanner(System.in);
        for (Effect effect : effects) {
            if (target != null) {
                System.out.println("Your current target is: " + target.getName() + ". Would you like to keep this target?");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Yes")) {
                    effect.setTarget(target, clientHandler);
                    effect.useEffect();
                } else if (input.equalsIgnoreCase("No")) {
                    System.out.println("Please enter a new target");
                    String userInput = scanner.nextLine();
                    commandLibrary.parseCommand(userInput, clientHandler);
                } else {
                    System.out.println("Invalid Response. Please enter 'Yes' or 'No'.");
                }
            }

            if (target == null) {
                System.out.println("You do not currently have a target, please input one now.");
                String input = scanner.nextLine();
                commandLibrary = mainLibrary.getCommandLibrary();
                commandLibrary.parseCommand(input, clientHandler);
            }
        }
    }

    public void manualSetTarget(Character target, ClientHandler clientHandler) {
        for (Effect effect : effects) {
            effect.setTarget(target, clientHandler);
        }
    }

    public void addEffect(Effect effect) {
        effects.add(effect);
    }

    public String getDescription() {
        return description;
    }
}