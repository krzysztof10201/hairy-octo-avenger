public class TestAgent extends Agent
{
    public TestAgent(Environment environment, Position position)
    {
        super(environment, position);
    }

    public void step()
    {
        setPosition(new Position(Math.random() * environment.getSizeX() + environment.getMinX(),
                                 Math.random() * environment.getSizeY() + environment.getMinY(),
                                 0));
    }
}
