package AHappyFamilyApp03;

enum Species {
    CAT(true, 4, true),
    DOG(true, 4, true),
    BIRD(false, 2, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return name() + " [canFly=" + canFly + ", numberOfLegs=" + numberOfLegs + ", hasFur=" + hasFur + "]";
    }
}
