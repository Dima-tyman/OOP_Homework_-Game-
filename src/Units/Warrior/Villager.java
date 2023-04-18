package Units.Warrior;

public class Villager extends Warrior {

    protected String name;

    public Villager(String name) {
        super(50, 100, 5, 10, 30, 1, 10, 15);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (Крестьянин)";
    }
}