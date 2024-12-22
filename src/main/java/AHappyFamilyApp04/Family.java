package AHappyFamilyApp04;

import java.util.Random;

public class Family implements HumanCreator {

    private Human father;
    private Human mother;
    private Random random = new Random();
    private String[] names = {"Alex", "Jamie", "Taylor", "Jordan", "Casey"};

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }

    @Override
    public Human bornChild() {
        String name = names[random.nextInt(names.length)];
        boolean isBoy = random.nextBoolean();
        int iq = (father.getAge() + mother.getAge()) / 2;
        return isBoy ? new Man(name, iq) : new Woman(name, iq);
    }
}
