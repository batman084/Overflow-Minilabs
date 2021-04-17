package src.jacob.Inheritance;

//Car.java


public class Car
{
    private int wheels; //private instance variable of int type
    private int speed;

    public Car() //constructor so that when it is invoked the object is created
    {
        wheels = 0;
        speed = 0;
    }

    public Car(int initialWheels, int initialSpeed) //constructor of set type
    {
        this.wheels = initialWheels;  //values are given to private instance variable
        this.speed = initialSpeed;
    }

    public int getWheels() //public so that way when I create a subclass, other classes can access that way they can return the value through this accessor method
    {
        return this.wheels;
    }

    public void setWheels(int wheels) //mutator or setter method
    {
        this.wheels = wheels;
    }

    public int getSpeed() //another accesor
    {
        return this.speed;
    }

    public void setSpeed(int speed) //another setter
    {
        this.speed = speed;
    }

    public void decreaseSpeed(int value) //custom methods
    {
        this.speed -= value; //decreases value of speed
    }

    public void increaseSpeed(int increment)
    {
        this.speed += value; //increases value of speed
    }
}
