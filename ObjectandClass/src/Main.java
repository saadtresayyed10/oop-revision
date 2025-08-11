public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "AMG";
        c1.color = "Black";
        c1.topSpeed = 300;

        c1.drive();
        System.out.println("\n"+ c1.color);


    }
}