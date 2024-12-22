package AHappyFamilyApp04;

public class Main {

    public static void main(String[] args) {

        Man father = new Man("John", 40);
        Woman mother = new Woman("Jane", 38);

        Family family = new Family(father, mother);

        Dog dog = new Dog("Buddy", 3, 70);
        dog.eat();
        dog.respond();
        dog.foul();

        father.greetPet();
        father.repairCar();

        mother.greetPet();
        mother.makeup();

        Human child = family.bornChild();
        System.out.println("A new child is born!");
        System.out.println("Name: " + child.getName());
        System.out.println("Age: " + child.getAge());
    }
}
