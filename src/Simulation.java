import java.util.ArrayList;
import java.util.List;

public class Simulation
{
    public Environment environment;
    public List<Agent> agents = new ArrayList<Agent>();

    public void load()
    {
        // TODO: Actually load the values from an external source

        System.out.println("Loading simulation");

        final int numAgents = 3;
        final int mapSize = 10;

        environment = new Environment(mapSize);

        for (int i = 0; i < numAgents; i++)
            agents.add(new TestAgent(environment, new Position(0, 0, 0)));
    }

    public void step()
    {
        System.out.println("Performing one simulation step");

        for (Agent agent : agents)
            agent.step();
    }
}
