package AHappyFamilyApp01;

class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq; // 1 to 100
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;


    public Human() {}

    public String[][] getSchedule() {
        return schedule;
    }

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, String surname, int yearOfBirth, Human father, Human mother) {
        this(name, surname, yearOfBirth);
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, yearOfBirth, father, mother);
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }


    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.toString());
        } else {
            System.out.println("No pet to greet.");
        }
    }

    public void describePet() {
        if (pet != null) {
            String slyness = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.getSpecies() + " who is " + pet.getAge() + " years old, and he is " + slyness + ".");
        } else {
            System.out.println("No pet to describe.");
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', yearOfBirth=" + yearOfBirth +
                ", iq=" + iq + ", pet=" + (pet != null ? pet.toString() : "no pet") +
                ", mother=" + (mother != null ? mother.name : "unknown") +
                ", father=" + (father != null ? father.name : "unknown") + "}";
    }
}