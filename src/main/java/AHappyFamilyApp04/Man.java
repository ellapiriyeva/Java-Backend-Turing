package AHappyFamilyApp04;

public final class Man extends Human {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey buddy!");
    }

    public void repairCar() {
        System.out.println("Repairing my car.");
    }
}