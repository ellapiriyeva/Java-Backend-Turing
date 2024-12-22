package AHappyFamilyApp04;

public class Dog extends Pet implements Foulable {

    public Dog(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
    }

    @Override
    public void respond() {
        System.out.println("Woof! I am " + getNickname() + ". Let's play!");
    }

    @Override
    public void foul() {
        System.out.println("Oops! I made a mess!");
    }
}
