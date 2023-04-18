package Units.Mage;

public class Warlock extends Mage {

    protected String name;

    public Warlock(String name) {
        super(30, 60, 20, 5, 50, 1, 50, 100);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (Колдун)";
    }
}