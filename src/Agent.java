import java.util.ArrayList;
import java.util.List;

public abstract class Agent
{
    public List<HistoryEntry> history = new ArrayList<HistoryEntry>();

    protected Environment environment;

    // Simple IDs for more legible console output
    private static int lastId = 0;
    private int id;

    public Agent(Environment environment, Position position)
    {
        id = ++lastId;

        this.environment = environment;
        setPosition(position);

        System.out.println(this + ": I am alive!");
    }

    public String toString()
    {
        return String.format("%s%03d@%s", "Agent", id, getPosition());
    }

    public Position getPosition()
    {
        return history.get(history.size()-1).position;
    }

    public void setPosition(Position position)
    {
        if (position.x < environment.getMinX()
        ||  position.x > environment.getMaxX()
        ||  position.y < environment.getMinY()
        ||  position.y > environment.getMaxY())
            System.err.println("WARNING: Agent position out of bounds");

        history.add(new HistoryEntry(this, position));

        System.out.println(this + ": I have moved.");
    }

    public abstract void step();
}
