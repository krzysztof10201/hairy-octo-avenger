public class HistoryEntry
{
    public Position position;
    //public double velocity;
    //public int encounters;

    public Agent agent;

    public HistoryEntry(Agent agent, Position position)
    {
        this.agent = agent;
        this.position = position;
    }
}
