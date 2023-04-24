package Units.Shooter;

public class Crossbowman extends Shooter {

    public Crossbowman(String name) {
        super(40, 60, 20, 5, 1, 15, 60, name);
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }
}