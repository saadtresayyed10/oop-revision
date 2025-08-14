// import single.level.Dog;

//import multi.level.Child;
//import multi.level.Parent;

import hierarchical.level.Eagle;
import hierarchical.level.Pigeon;

public class Main {
    public static void main(String[] args) {
       /* Dog dog = new Dog();
        dog.setAge(1);
        dog.setName("Tommy");

        System.out.println(dog.getName() + " " + dog.getAge());

        dog.makeSound(); */

        /*
        Child child = new Child();
        Parent parent = new Parent();

        child.setAge(10);
        child.setName("GG");

        System.out.println(child.getAge() + child.getName());

        parent.setAge(40);
        parent.setName("WP");

        System.out.println(parent.getAge() + parent.getName());

        child.setDead(false);
        System.out.println(child.getDead());
         */

        Eagle eagle = new Eagle();
        Pigeon pigeon = new Pigeon();

        eagle.setName("Senu");
        eagle.setColor("Brown");

        pigeon.setName("Slim");
        pigeon.setColor("White");

        System.out.println(eagle.getName() + eagle.getColor());
        System.out.println(pigeon.getName() + pigeon.getColor());

    }
}