package Units.Mage;

public class Monk extends Mage {

    protected String name;

    public Monk(String name) {
        super(20, 40, 10, 15, 60, 1, 20, 120);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (Монах)";
    }
}