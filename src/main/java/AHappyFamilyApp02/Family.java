package AHappyFamilyApp02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        mother.setFamily(this);
        father.setFamily(this);
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public boolean deleteChild(Human child) {
        boolean removed = children.remove(child);
        if (removed) {
            child.setFamily(null);
        }
        return removed;
    }

    public int countFamily() {
        return 2 + children.size();
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pet);
    }
}
