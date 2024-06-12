package Effects;

import Main.ClientHandler;
import Objects.Character;

public class Effect implements Usable{
    private String name;
    private Character source;
    private Character target;
    private int power;

    public Effect(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void useEffect() {

    }

    public void setSource(Character source, ClientHandler clientHandler) {
        this.source = source;
    }

    public void setTarget(Character target, ClientHandler clientHandler) {
        this.target = target;
    }

    public Character getSource() {
        return source;
    }

    public Character getTarget() {
        return target;
    }

    public int getPower() {
        return power;
    }
}
