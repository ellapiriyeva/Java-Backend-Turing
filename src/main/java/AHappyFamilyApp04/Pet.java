package AHappyFamilyApp04;

public abstract class Pet {

    private String nickname;
    private int age;
    private int trickLevel;

    public Pet(String nickname, int age, int trickLevel) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public void eat() {
        System.out.println(nickname + " is eating.");
    }

    public abstract void respond();

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
}
