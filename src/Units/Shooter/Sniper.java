package Units.Shooter;

public class Sniper extends Shooter {

    protected String name;

    public Sniper(String name) {
        super(30, 50, 30, 0, 20, 1, 5, 80);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (Снайпер)";
    }
}