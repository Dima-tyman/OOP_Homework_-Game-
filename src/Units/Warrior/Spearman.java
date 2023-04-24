package Units.Warrior;

public class Spearman extends Warrior {

    public Spearman(String name) {
        super(60, 120, 10, 15, 1, 20, 30, name);
    }

    @Override
    public String toString() {
        return "Копейщик";
    }
}