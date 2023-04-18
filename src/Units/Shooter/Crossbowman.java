package Units.Shooter;

public class Crossbowman extends Shooter {

    protected String name;

    public Crossbowman(String name) {
        super(40, 60, 20, 5, 30, 1, 15, 60);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (Арбалетчик)";
    }
}