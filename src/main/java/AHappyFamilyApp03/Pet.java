package AHappyFamilyApp03;

class Pet {

    private String name;
    private Species species;

    public Pet(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + ", species=" + species + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet pet = (Pet) obj;
        return name.equals(pet.name) && species == pet.species;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + species.hashCode();
    }
}

