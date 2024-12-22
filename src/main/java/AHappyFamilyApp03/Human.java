package AHappyFamilyApp03;

class Human {

    private String name;
    private DayOfWeek[] schedule = new DayOfWeek[7];

    public Human(String name) {
        this.name = name;
    }

    public void setSchedule(DayOfWeek[] schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human[name=" + name + "]";
    }
}
