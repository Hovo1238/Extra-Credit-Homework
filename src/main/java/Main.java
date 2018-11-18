public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Rex",true);
        Car car = new Car("BMW", 4);
        Plane plane = new Plane("Boeing 747",420);

        System.out.println(FMath.Factorial(5)); // 120
        System.out.println(FMath.Factorial(0)); // 1
        System.out.println(FMath.Factorial(1)); // 1

        // System.out.println(FMath.Factorial(-8)); Generates an error


    }
}
