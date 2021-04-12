package sanvi.src.InheritanceWithAbstract;

public class Main {
    public static void main(String[] args) {
        Circle circ = new Circle(3, "Circle");
        System.out.println("Area of Circle" + circ.area(3,3));

        Cylinder cyl = new Cylinder(3,4);
        System.out.println("Area of Cylinder" + cyl.findVolume());

        Square sq = new Square(4, "Square");
        System.out.println("Area of Square" + sq.area(4,4));

        Triangle tri = new Triangle(3,2,"Triangle");
        System.out.println("Area of Triangle" + tri.area(3,2));

    }
}