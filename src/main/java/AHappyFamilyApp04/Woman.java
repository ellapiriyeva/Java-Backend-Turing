package AHappyFamilyApp04;

public final class Woman extends Human {

    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello, cutie!");
    }

    public void makeup() {
        System.out.println("Applying makeup.");
    }
}
