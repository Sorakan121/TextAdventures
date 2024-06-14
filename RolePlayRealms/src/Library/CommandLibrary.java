package Library;

import Effects.Effect;
import Effects.Spellcasting;
import Main.Battle;
import Main.ClientHandler;
import Objects.*;
import Objects.Character;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandLibrary {
    private MainLibrary mainLibrary;
    private ArrayList<Pattern> commandLibrary;
    private RaceLibrary raceLibrary;
    private JobLibrary jobLibrary;
    private SpellLibrary spellLibrary;
    private String spellName;
    private Pattern spellCommandPattern, targetCommandPattern, systemCommandPattern;
    private Battle battle;
    private ClientHandler clientHandler;
    private EquipmentLibrary equipmentLibrary;
    private TraitLibrary traitLibrary;

    public CommandLibrary(MainLibrary mainLibrary, Battle battle, EquipmentLibrary equipmentLibrary,
                          TraitLibrary traitLibrary, SpellLibrary spellLibrary, RaceLibrary raceLibrary, JobLibrary jobLibrary) {
        this.mainLibrary = mainLibrary;
        this.battle = battle;this.equipmentLibrary = equipmentLibrary;
        this.traitLibrary = traitLibrary;
        this.spellLibrary = spellLibrary;
        this.raceLibrary = raceLibrary;
        this.jobLibrary = jobLibrary;
        commandLibrary = new ArrayList<>();
        this.spellLibrary = mainLibrary.getSpellLibrary();

        spellCommandPattern = Pattern.compile("#(.*?)#");
        commandLibrary.add(spellCommandPattern);

        targetCommandPattern = Pattern.compile("@(.*?)@");
        commandLibrary.add(targetCommandPattern);

        systemCommandPattern = Pattern.compile("!(.*?)!");
        commandLibrary.add(systemCommandPattern);
    }

    public void parseCommand(String commandInput, ClientHandler clientHandler) {
        System.out.println("Parsing command: " + commandInput);
        for (Pattern pattern : commandLibrary) {

            Matcher matcher = pattern.matcher(commandInput);
            if (matcher.find()) {

                if (pattern == targetCommandPattern) {
                    System.out.println("target command pattern");
                    String targetName = matcher.group(1);
                    battle.getTarget(targetName);
                }

                if (pattern == spellCommandPattern) {
                    System.out.println("Spell command pattern");
                    String spellName = matcher.group(1);
                    Spell spell = spellLibrary.getSpell(spellName);
                    clientHandler.broadcastMessage(spell.getName());
                    clientHandler.broadcastMessage(spell.getDescription());
                }

                if (pattern == systemCommandPattern) {
                    System.out.println("System Command Pattern");
                    String systemCommand = matcher.group(1);
                    Random random = new Random();

                    if (systemCommand.equals("d2")) {
                        int d2 = random.nextInt(2);
                        clientHandler.broadcastMessage(String.valueOf(d2));
                        System.out.println(d2);
                    }

                    if (systemCommand.equals("d4")) {
                        int d4 = random.nextInt(4);
                        clientHandler.broadcastMessage(String.valueOf(d4));
                    }
                    if (systemCommand.equals("d6")) {
                        int d6 = random.nextInt(6);
                        clientHandler.broadcastMessage(String.valueOf(d6));
                    }
                    if (systemCommand.equals("d8")) {
                        int d8 = random.nextInt(8);
                        clientHandler.broadcastMessage(String.valueOf(d8));
                    }
                    if (systemCommand.equals("d10")) {
                        int d10 = random.nextInt(10);
                        clientHandler.broadcastMessage(String.valueOf(d10));
                    }
                    if (systemCommand.equals("d12")) {
                        int d12 = random.nextInt(12);
                        clientHandler.broadcastMessage(String.valueOf(d12));
                    }
                    if (systemCommand.equals("d20")) {
                        int d20 = random.nextInt(20);
                        clientHandler.broadcastMessage(String.valueOf(d20));
                        System.out.println(d20);
                    }

                    if (systemCommand.equals("CreateCharacter")) {
                        System.out.println("character creation");
                        clientHandler.privateMessage("Please input a character name.");
                        String characterName = clientHandler.listenForClientResponse();
                        System.out.println(characterName);

                        clientHandler.privateMessage("Please Select a Race.");
                        for (Race race : raceLibrary.getRaceLibrary()) {
                            clientHandler.privateMessage(race.getName());
                            clientHandler.privateMessage(race.getDescription());
                            clientHandler.privateMessage("");
                        }
                        String raceName = clientHandler.listenForClientResponse();
                        System.out.println(raceName);
                        Race selectedRace = raceLibrary.getRace(raceName);
                        System.out.println(selectedRace);

                        clientHandler.privateMessage("Nice Choice!");
                        clientHandler.privateMessage("Next, we need you to select a desired Job for your character.");

                        for (Job job : jobLibrary.getJobLibrary()) {
                            clientHandler.privateMessage(job.getName());
                            clientHandler.privateMessage(job.getDescription());
                            clientHandler.privateMessage("");
                        }
                        String jobName = clientHandler.listenForClientResponse();
                        System.out.println(jobName);
                        Job selectedJob = jobLibrary.getJob(jobName.trim());
                        System.out.println(selectedJob);

                        clientHandler.privateMessage("Another Excellent Choice!");
                        clientHandler.privateMessage("Now we will proceed with creating your character!");

                        Character character = new Character(characterName, selectedRace, selectedJob);
                        character.generateStats();
                        clientHandler.privateMessage("Here are your new character's details!");
                        clientHandler.privateMessage("Name: " + character.getName());
                        clientHandler.privateMessage("Race: " + character.getSelectedRace().getName());
                        clientHandler.privateMessage("Job: " + character.getSelectedJob().getName());
                        clientHandler.privateMessage("Strength: " + Integer.toString(character.getStrength()));
                        clientHandler.privateMessage("Dexterity: " + Integer.toString(character.getDexterity()));
                        clientHandler.privateMessage("Constitution: " + Integer.toString(character.getConstitution()));
                        clientHandler.privateMessage("Intelligence: " + Integer.toString(character.getIntelligence()));
                        clientHandler.privateMessage("Wisdom: " + Integer.toString(character.getWisdom()));
                        clientHandler.privateMessage("Charisma: " + Integer.toString(character.getCharisma()));

                        clientHandler.setSelectedCharacter(character);

                        for (Trait trait :character.getTraits()) {
                            for (Effect effect : trait.getEffects()) {
                                if (effect instanceof Spellcasting) {
                                    clientHandler.privateMessage("Your chosen Class allows for the selection" +
                                            " of " + ((Spellcasting) effect).getAvailableCantrips() + " Cantrips and "
                                    + ((Spellcasting) effect).getAvailableSpells() + " Spells.\nPlease select your desired" +
                                            " Cantrips: \n");

                                    int x = 0;
                                    while (x < ((Spellcasting) effect).getAvailableCantrips()) {
                                        for (Spell spell : selectedJob.getJobCantrips()) {
                                            clientHandler.privateMessage(spell.getName() + "\n");
                                            clientHandler.privateMessage(spell.getDescription() + "\n");
                                        }

                                        String cantripName = clientHandler.listenForClientResponse();
                                        Spell newCantrip = spellLibrary.getSpell(cantripName);
                                        character.addCantrip(newCantrip);
                                        x++;
                                    }

                                    x = 0;
                                    while ( (x < ((Spellcasting) effect).getAvailableSpells())) {
                                        for (Spell spell : selectedJob.getJobSpells()) {
                                            clientHandler.privateMessage(spell.getName() + "\n");
                                            clientHandler.privateMessage(spell.getDescription() + "\n");
                                        }

                                        String spellName = clientHandler.listenForClientResponse();
                                        Spell newSpell = spellLibrary.getSpell(spellName);
                                        character.addSpell(newSpell);
                                        x++;
                                    }
                                }
                            }
                        }
                    }

                    if (systemCommand.equals("DealDamage")) {
                        clientHandler.privateMessage("How much damage will you deal?");
                        int damageDealt = Integer.parseInt(clientHandler.listenForClientResponse());
                        clientHandler.privateMessage("Who would you like to deal damage to?");
                        String characterName = clientHandler.listenForClientResponse();
                        Character target = battle.getTarget(characterName);
                        clientHandler.broadcastMessage(target.getName() + " damage " + target.getCurrentHealth() +
                                " - " + damageDealt + " = " + (target.getCurrentHealth()-damageDealt));
                        target.takeDamage(damageDealt);
                    }

                    if (systemCommand.equals("HealDamage")) {
                        clientHandler.privateMessage("How much health will you recover?");
                        int damageDealt = Integer.parseInt(clientHandler.listenForClientResponse());
                        clientHandler.privateMessage("Who would you like to have recover health?");
                        String characterName = clientHandler.listenForClientResponse();
                        Character target = battle.getTarget(characterName);
                        clientHandler.broadcastMessage(target.getName() + " health recovered " + target.getCurrentHealth() +
                                " + " + damageDealt + " = " + (target.getCurrentHealth()+damageDealt));
                        target.takeDamage(damageDealt);
                    }
                }
            }
        }
    }

}
