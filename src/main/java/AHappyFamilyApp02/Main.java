package AHappyFamilyApp02;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Pet Creation ===");

        Pet cat = new Pet("cat", "Cato", 3, 80);
        Pet dog = new Pet("dog", "Buddy", 5, 70);
        System.out.println("Created Pet 1: " + cat);
        System.out.println("Created Pet 2: " + dog);

        System.out.println("\n=== Testing Human Creation ===");

        String[][] motherSchedule = {{"Monday", "Work"}, {"Tuesday", "Yoga"}};
        Human mother = new Human("Dee", "Devlin", 1987, 100, motherSchedule);

        String[][] fatherSchedule = {{"Wednesday", "Gym"}, {"Thursday", "Golf"}};
        Human father = new Human("Conor", "McGregor", 1988, 110, fatherSchedule);

        String[][] child1Schedule = {{"Friday", "Soccer"}, {"Saturday", "Games"}};
        Human child1 = new Human("Rian", "McGregor", 2021, 105, child1Schedule);

        String[][] child2Schedule = {{"Monday", "Dance"}, {"Sunday", "Reading"}};
        Human child2 = new Human("Mack", "McGregor", 2023, 100, child2Schedule);

        System.out.println("Mother: " + mother);
        System.out.println("Father: " + father);
        System.out.println("Child 1: " + child1);
        System.out.println("Child 2: " + child2);

        System.out.println("\n=== Testing Family Creation ===");

        Family McGregorFamily = new Family(mother, father);
        System.out.println("Family created: " + McGregorFamily);

        System.out.println("\n=== Adding Pets to Family ===");

        McGregorFamily.setPet(cat);
        System.out.println("Added Pet: " + McGregorFamily);

        System.out.println("\n=== Adding Children to Family ===");

        McGregorFamily.addChild(child1);
        McGregorFamily.addChild(child2);
        System.out.println("Family after adding children: " + McGregorFamily);

        System.out.println("\n=== Counting Family Members ===");

        int familyMembers = McGregorFamily.countFamily();
        System.out.println("Total family members: " + familyMembers);

        System.out.println("\n=== Removing a Child from Family ===");

        boolean removed = McGregorFamily.deleteChild(child1);
        System.out.println("Child removed: " + removed);
        System.out.println("Family after removing child: " + McGregorFamily);

        System.out.println("\n=== Testing Equality and HashCode ===");

        Pet anotherCat = new Pet("cat", "Cato", 3, 80);
        System.out.println("Is the first cat equal to the second? " + cat.equals(anotherCat));
        System.out.println("HashCode of first cat: " + cat.hashCode());
        System.out.println("HashCode of second cat: " + anotherCat.hashCode());


        Family anotherMcGregorFamily = new Family(mother, father);
        System.out.println("Is the first family equal to the second? " + McGregorFamily.equals(anotherMcGregorFamily));
        System.out.println("HashCode of first family: " + McGregorFamily.hashCode());
        System.out.println("HashCode of second family: " + anotherMcGregorFamily.hashCode());
    }
}
