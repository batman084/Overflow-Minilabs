package sanvi.src.InheritanceWithAbstract;

// Triangle.java

public class Triangle extends Shape //extends tells us that inheritance is happening
{
    private int base;
    private int height;

    public Triangle (int b, int h, String shapeName)
    {
        super(shapeName);
        base = b;
        height = h;
    }

    public int area(int b, int h) //method almost same as abstract method header
    {
        return b * h * 1/2;
    }
}