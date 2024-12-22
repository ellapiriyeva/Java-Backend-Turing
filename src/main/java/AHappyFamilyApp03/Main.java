package AHappyFamilyApp03;

public class Main {

    public static void main(String[] args) {

        Family family = new Family(5);
        Human child1 = new Human("Alice");
        Human child2 = new Human("Bob");
        Pet pet = new Pet("Buddy", Species.DOG);

        family.addChild(child1);
        family.addChild(child2);

        System.out.println(family);

        family.deleteChild(child1);
        System.out.println(family);

        if (!family.deleteChild(5)) {
            System.out.println("Invalid index, no child deleted.");
        }

        Human child3 = new Human("Charlie");
        family.addChild(child3);
        System.out.println(family);

        System.out.println("Number of children: " + family.countFamily());

        System.out.println(pet);
    }
}
