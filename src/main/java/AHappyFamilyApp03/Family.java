package AHappyFamilyApp03;

class Family {

    private Human[] children;
    private int size = 0;

    public Family(int maxChildren) {
        children = new Human[maxChildren];
    }

    public void addChild(Human child) {
        if (size < children.length) {
            children[size] = child;
            size++;
        } else {
            System.out.println("Cannot add more children, array is full.");
        }
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < size; i++) {
            if (children[i].equals(child)) {
                for (int j = i; j < size - 1; j++) {
                    children[j] = children[j + 1];
                }
                children[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                children[i] = children[i + 1];
            }
            children[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }

    public int countFamily() {
        return size;
    }

    @Override
    public String toString() {
        return "Family with " + size + " children.";
    }
}

