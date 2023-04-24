package Units.Mage;

public class Warlock extends Mage {

    public Warlock(String name) { super(30, 60, 20, 5, 1, 50, 100, name); }

    @Override
    public String toString() {
        return "Колдун";
    }
}