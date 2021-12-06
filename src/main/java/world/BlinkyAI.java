package world;

public class BlinkyAI extends GhostAI{

    public BlinkyAI(Creature creature) {
        super(creature);
        up = 187;
        down = 186;
        left = 184;
        right = 185;
        router = new BlinkyChaseRouter(creature);
    }


}
