package Units.Warrior;

public class Spearman extends Warrior {

    protected String name;

    public Spearman(String name) {
        super(60, 120, 10, 15, 20, 1, 20, 30);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (Копейщик)";
    }
}