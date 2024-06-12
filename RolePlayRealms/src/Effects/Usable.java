package Effects;

import Main.ClientHandler;
import Objects.Character;

public interface Usable {
    public void useEffect();

    void setSource(Character source, ClientHandler clientHandler);

    void setTarget(Character target, ClientHandler clientHandler);
}
