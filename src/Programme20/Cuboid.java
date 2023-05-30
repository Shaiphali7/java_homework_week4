package Programme20;

public class Cuboid extends Rectangle
{
double height;
    public Cuboid(double length, double height, double width)
    {
        super(width, length);
        this.height=height;

    }

    public double getHeight() {
        return height;
    }
    public double getVolume()
    {
        return (getArea()*height);
    }



}
