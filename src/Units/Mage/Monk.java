package Units.Mage;

public class Monk extends Mage {

    public Monk(String name) {
        super(20, 40, 10, 15, 1, 20, 120, name);
    }

    @Override
    public String toString() {
        return "Монах";
    }
}