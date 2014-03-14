public class Position
{
    public double x;
    public double y;
    public double d;

    public Position(double x, double y, double d)
    {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public String toString()
    {
        return String.format("(%.2f, %.2f, %.2f)", x, y, d);
    }
}
