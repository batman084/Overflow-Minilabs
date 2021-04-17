package jacob.src.Inheritance;

//Car


class Main {      
      public static void main(String[] args) {
        Truck truck = new Truck(8,25,1); //polymorphism ex w/ method overloading
        Truck differentTruck = new Truck();
        Car car = new Car(4,10);

        System.out.println(truck.getSpeed()); // 10
        System.out.println(car.getSpeed()); // 10

        truck.increaseSpeed(15);
        car.increaseSpeed(10);

        System.out.println(truck.getSpeed()); // 30
        System.out.println(car.getSpeed()); // 20
      }
}
