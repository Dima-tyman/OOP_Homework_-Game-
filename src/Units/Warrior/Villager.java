package Units.Warrior;

public class Villager extends Warrior {

    public Villager(String name) {
        super(50, 100, 5, 10, 1, 10, 15, name);
    }

    @Override
    public String toString() {
        return "Крестьянин";
    }
}