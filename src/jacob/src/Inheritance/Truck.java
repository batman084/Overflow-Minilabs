package jacob.src.Inheritance;

// Truck.java

public class Truck extends Car //identifies that we will be inheriting components from the Car class
{
    private int trailer; //this instance variable is not part of the Car class

    public Truck()
    {
        super(); //accesses constructor of Car class
        trailer = 0; //must give trailer value of 0
    }

    public Car(int startGear, int startSpeed, int startHeight)
    {
        super (startGear, startSpeed); //executing a constructor with two args, computer goes to bicycle class and gives gear and speed a specific value; super keyowrd in first line
        // can't say gear = startFear becuase gear instance variable is private, subclass doesn't have direct access
        setGear(startGear); //setter and getter accesses private instance variables implicitly
        seatHeight = startHeight; //seatHeight not a value of super class and must give value
    }

    public int getHeight()
    {
        return seatHeight;
    }

    public void setHeight (int h)
    {
        seatHeight = h;
    }

    public void slowDown(int decrement) //we have exact same methods in superclass, method overrriding, subclass replacing exisitng method in bicycle class
    {
        setSpeed( getSpeed() - (decrement / 2));
    }

    public void speedUp(int increment)
    {
        setSpeed( getSpeed() + (increment / 2 ));
    }
}
