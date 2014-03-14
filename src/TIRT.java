public class TIRT
{
    public static void main(String[] args)
    {
        final int numSteps = 2;

        Simulation simulation = new Simulation();
        simulation.load();

        for (int i = 0; i < numSteps; i++)
            simulation.step();
    }
}
