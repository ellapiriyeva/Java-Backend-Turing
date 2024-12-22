package AHappyFamilyApp01;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "play", "sleep"});

        Human mother = new Human("Pauline", "Einstein", 1858);
        Human father = new Human("Hermann", "Einstein", 1847);
        Human child = new Human("Albert", "Einstein", 1879, 160, dog, mother, father, null);

        System.out.println(child);

        child.greetPet();
        child.describePet();
        dog.eat();
        dog.respond();
        dog.foul();
    }
}