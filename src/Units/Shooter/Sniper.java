package Units.Shooter;

public class Sniper extends Shooter {

    public Sniper(String name) {
        super(30, 50, 30, 0, 1, 5, 80, name);
    }

    @Override
    public String toString() {
        return "Снайпер";
    }
}