package Units.Warrior;

public class Bandit extends Warrior {

    protected String name;

    public Bandit(String name) {
        super(30, 80, 15, 5, 50, 1, 5, 25);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (Бандит)";
    }
}