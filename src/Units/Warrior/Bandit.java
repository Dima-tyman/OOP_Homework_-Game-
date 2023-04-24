package Units.Warrior;

public class Bandit extends Warrior {

    public Bandit(String name) { super(30, 80, 15, 5, 1, 5, 25, name); }

    @Override
    public String toString() {
        return "Бандит";
    }
}